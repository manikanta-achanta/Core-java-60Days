package com.manikanta.jdbc;

import java.sql.*;

public class JDBCDemo {

    public static void main(String[] args) throws Exception {

        // 1. Load driver (optional in modern Java)
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. Create connection
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root",
                "password"
        );

        // 3. Create statement
        Statement stmt = con.createStatement();

        // 4. Execute query
        ResultSet rs = stmt.executeQuery("SELECT * FROM student");

        // 5. Process result
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2));
        }

        // 6. Close connection
        con.close();
    }
}