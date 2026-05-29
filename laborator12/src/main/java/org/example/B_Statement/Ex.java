package org.example.B_Statement;

import org.example.DBConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class Ex {
    public static void main(String[] args) throws SQLException {

        record Book(int id, String title, String author) {
        }

        try (Connection connection = DriverManager.getConnection(
                DBConfig.URL, DBConfig.USERNAME, DBConfig.PASSWORD)) {

            Statement statement = connection.createStatement();
            // use statement to execute simple SQL query

            // in java """ means text block, it is used to write multi-line string without using \n
            String sql = """
                    select * from books
                    """;

            ResultSet rs = statement.executeQuery(sql);

            List<Book> books = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String author = rs.getString("author_id");

                Book book = new Book(id, title, author);
                System.out.println(book);
                books.add(book);
            }

            System.out.println("Total books: " + books.size());
            System.out.println(books);
            System.out.println("===");
            // if we want to execute another query, we can reuse the same statement
            sql = """
                    select * from books
                    where id > 4
                    """;
            rs = statement.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String author = rs.getString("author_id");

                Book book = new Book(id, title, author);
                System.out.println(book);
            }
        }
    }
}
