package com.corejava;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String URL =
            "jdbc:mysql://localhost:3306/sample";

    private static final String USER = "root";

    private static final String PASSWORD = "shashank@1234";

    public static Connection getConnection() throws Exception {

        Class.forName("com.mysql.jdbc.Driver");

        return DriverManager.getConnection(
                URL,
                USER,
                PASSWORD
        );
    }
}