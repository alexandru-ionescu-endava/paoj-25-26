package org.example.D_SqlInjection;

import org.example.DBConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex {
    //    private static final String MALICIOUS_INPUT = "anything' OR '1'='1";
    public static String input = "test_title'; DELETE FROM books; --";
    public static String sql = "select * from books where title = '" + input + "'";

    public static void main(String[] args) throws SQLException {
        try (Connection connection = DriverManager.getConnection(
                DBConfig.URL, DBConfig.USERNAME, DBConfig.PASSWORD)) {

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while(rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
            }

        }
    }

}
