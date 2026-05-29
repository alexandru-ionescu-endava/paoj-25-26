package org.example.E_ResultSet;

import org.example.DBConfig;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * E_ResultSet: working with ResultSet in more depth.
 *
 *   1. Insert a row in books and read back the auto-generated primary key.
 *   2. Iterate a joined result set using metadata so we don't hard-code output.
 *   3. Use typed getters for DATE columns.
 */
public class Ex {
    public static void main(String[] args) throws SQLException {
        try (Connection connection = DriverManager.getConnection(
                DBConfig.URL, DBConfig.USERNAME, DBConfig.PASSWORD)) {

            int authorId = findAuthorId(connection, "Mark Twain");
            int newBookId = insertBook(connection,
                    "ResultSet Demo " + System.currentTimeMillis(),
                    authorId,
                    Date.valueOf("2024-01-01"),
                    "Educational");
            System.out.println("Inserted book with generated id = " + newBookId);

            System.out.println();
            System.out.println("All books with authors (driven by ResultSetMetaData):");
            dumpAllBooks(connection);
        }
    }

    private static int findAuthorId(Connection connection, String authorName) throws SQLException {
        String sql = "SELECT id FROM authors WHERE name = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, authorName);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("id");
                }
                throw new SQLException("Author not found: " + authorName);
            }
        }
    }

    private static int insertBook(Connection connection, String title, int authorId, Date publishedDate, String genre)
            throws SQLException {
        String sql = "INSERT INTO books (title, author_id, published_date, genre) VALUES (?, ?, ?, ?)";

        try (PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, title);
            ps.setInt(2, authorId);
            ps.setDate(3, publishedDate);
            ps.setString(4, genre);

            int affected = ps.executeUpdate();
            System.out.println("Rows inserted: " + affected);

            try (ResultSet keys = ps.getGeneratedKeys()) {
                if (keys.next()) {
                    return keys.getInt(1);
                }
                throw new SQLException("No generated key returned");
            }
        }
    }

    private static void dumpAllBooks(Connection connection) throws SQLException {
        String sql = """
                SELECT b.id,
                       b.title,
                       a.name AS author,
                       b.published_date,
                       b.genre
                FROM books b
                JOIN authors a ON a.id = b.author_id
                ORDER BY b.id
                """;

        try (Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery(sql)) {

            ResultSetMetaData md = rs.getMetaData();
            int columns = md.getColumnCount();

            for (int i = 1; i <= columns; i++) {
                System.out.printf("%-28s", md.getColumnLabel(i));
            }
            System.out.println();

            while (rs.next()) {
                for (int i = 1; i <= columns; i++) {
                    Object value = i == 4 ? rs.getDate(i) : rs.getObject(i);
                    System.out.printf("%-28s", value);
                }
                System.out.println();
            }
        }
    }
}
