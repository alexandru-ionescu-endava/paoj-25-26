package org.example.C_PreparedStatement;

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

            String sql = """
                        select a.name, n.name
                            from authors a
                            join nationalities n
                            on a.nationality_id = n.id
                        where a.id = ?
                    """;

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, 5); // set the value of the first parameter to 1

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String authorName = rs.getString(1); // or rs.getString("name")
                String nationalityName = rs.getString(2); // or rs.getString("name")
                System.out.println(authorName + " - " + nationalityName);
            }

            sql = """
                    insert into nationalities (name) values (?)
                    """;
            ps = connection.prepareStatement(sql);
            ps.setString(1, "Romanian");
            int rowsAffected = ps.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected);

            enum Genre {
                Novel, Poetry, Drama
            }

            sql = """
                    insert into books(title, author_id, published_date, genre) values (?, ?, ?, ?)
                    """;

            ps = connection.prepareStatement(sql);
            ps.setString(1, "The Great Gatsby");
            ps.setInt(2, 1); // assuming author with id=1 exists
            ps.setDate(3, java.sql.Date.valueOf("1925-04-10"));
            ps.setString(4, Genre.Novel.name());
            rowsAffected = ps.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected);

            sql = """
                    select a.name, n.name, b.title
                        from authors a
                        join nationalities n
                        on a.nationality_id = n.id
                        join books b
                        on a.id = b.author_id
                    where a.id = ? and b.genre = ?;
                    """;

            ps = connection.prepareStatement(sql);
            ps.setInt(1, 1); // author id
            ps.setString(2, "Novel"); // genre

            rs = ps.executeQuery();
            while (rs.next()) {
                String authorName = rs.getString(1); // or rs.getString("name")
                String nationalityName = rs.getString(2); // or rs.getString("name")
                String bookName = rs.getString(3); // or rs.getString("name")
                System.out.println(authorName + " - " + nationalityName + " - " + bookName);
            }


        }
    }
}
