package com.manikanta.jdbc;

import java.sql.*;

public class JDBCExample {

    public static void main(String[] args) throws Exception {

        // 1. Connect
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root",
                "password"
        );

        // 2. Create statement
        Statement stmt = con.createStatement();

        // 3. Execute query
        ResultSet rs = stmt.executeQuery("SELECT * FROM student");

        // 4. Process result
        while (rs.next()) {
            System.out.println(
                    rs.getInt("id") + " " +
                            rs.getString("name")
            );
        }

        // 5. Close
        con.close();
    }
}