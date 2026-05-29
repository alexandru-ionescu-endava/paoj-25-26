package org.example.A_Setup;

import org.example.DBConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Ex {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        try (Connection connection =
                     DriverManager.getConnection(DBConfig.URL, DBConfig.USERNAME, DBConfig.PASSWORD)) {
            System.out.println("Connection successful!");

            System.out.println(connection.getMetaData().getDatabaseProductName());
            System.out.println(connection.getMetaData().getDatabaseProductVersion());
            System.out.println(connection.getMetaData().getDriverName());

        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }
}
