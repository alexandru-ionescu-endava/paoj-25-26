package org.example.G_CallableStatement;

import org.example.DBConfig;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

/**
 * G_CallableStatement: invoke a database function with input and return value.
 *
 * Function used here:
 *   books_for_author(p_author_id INT) RETURNS INT
 */
public class Ex {
    public static void main(String[] args) throws SQLException {
        try (Connection connection = DriverManager.getConnection(
                DBConfig.URL, DBConfig.USERNAME, DBConfig.PASSWORD)) {

            ensureFunctionExists(connection);

            for (int authorId : new int[] {1, 2, 3, 99}) {
                int booksCount = callBooksForAuthor(connection, authorId);
                System.out.printf("author #%d book count = %d%n", authorId, booksCount);
            }
        }
    }

    private static void ensureFunctionExists(Connection connection) throws SQLException {
        String ddl = """
                CREATE OR REPLACE FUNCTION books_for_author(p_author_id INT)
                RETURNS INT
                LANGUAGE plpgsql
                AS $$
                DECLARE
                    v_book_count INT;
                BEGIN
                    SELECT COUNT(*)
                    INTO v_book_count
                    FROM books b
                    WHERE b.author_id = p_author_id;

                    RETURN v_book_count;
                END;
                $$;
                """;

        try (Statement statement = connection.createStatement()) {
            statement.execute(ddl);
        }
    }

    private static int callBooksForAuthor(Connection connection, int authorId) throws SQLException {
        String call = "{ ? = call books_for_author(?) }";
        // first ? means return value, second ? means input parameter

        try (CallableStatement cs = connection.prepareCall(call)) {
            cs.registerOutParameter(1, Types.INTEGER);
            cs.setInt(2, authorId);
            cs.execute();
            return cs.getInt(1);
        }
    }
}
