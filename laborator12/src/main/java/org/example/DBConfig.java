package org.example;

public class DBConfig {

    public static final String URL =
            "jdbc:postgresql://localhost:5432/postgres?currentSchema=test_schema";
    public static final String USERNAME = "alexionescu";
    public static final String PASSWORD = "";

    // Private constructor to prevent instantiation
    // it is a utility class that only contains static members, so we don't want anyone to create an instance of it.
    private DBConfig() {
    }
}