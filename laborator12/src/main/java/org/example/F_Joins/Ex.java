package org.example.F_Joins;


import org.example.DBConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Ex {
    public static void main(String[] args) throws SQLException {
        try (Connection connection = DriverManager.getConnection(
                DBConfig.URL, DBConfig.USERNAME, DBConfig.PASSWORD)) {

            printBooksByAuthor(connection, "Jane Austen");
            System.out.println();
            printNationalityBookCounts(connection);
        }
    }

    private static void printBooksByAuthor(Connection connection, String authorName) throws SQLException {
        String sql = """
                SELECT a.name  AS author,
                       n.name  AS nationality,
                       b.title AS title,
                       b.published_date
                FROM books b
                JOIN authors a ON a.id = b.author_id
                JOIN nationalities n ON n.id = a.nationality_id
                WHERE a.name = ?
                ORDER BY b.published_date
                """;

        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, authorName);
            try (ResultSet rs = ps.executeQuery()) {
                System.out.println("Books by " + authorName + ":");
                System.out.printf("  %-24s %-16s %-36s %s%n", "author", "nationality", "title", "published_date");
                while (rs.next()) {
                    System.out.printf("  %-24s %-16s %-36s %s%n",
                            rs.getString("author"),
                            rs.getString("nationality"),
                            rs.getString("title"),
                            rs.getDate("published_date"));
                }
            }
        }
    }

    private static void printNationalityBookCounts(Connection connection) throws SQLException {
        String sql = """
                SELECT n.name AS nationality,
                       COUNT(b.id) AS books_count
                FROM nationalities n
                LEFT JOIN authors a ON a.nationality_id = n.id
                LEFT JOIN books b ON b.author_id = a.id
                GROUP BY n.name
                ORDER BY n.name
                """;

        try (PreparedStatement ps = connection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            System.out.println("Book count by nationality:");
            System.out.printf("  %-16s %s%n", "nationality", "books_count");
            while (rs.next()) {
                System.out.printf("  %-16s %d%n",
                        rs.getString("nationality"),
                        rs.getInt("books_count"));
            }
        }
    }
}
