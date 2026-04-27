package com.manikanta.jdbc;

import java.sql.*;

public class PreparedDemo {

    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root",
                "password"
        );

        String name = "admin";

        PreparedStatement ps = con.prepareStatement(
                "SELECT * FROM users WHERE name = ?"
        );

        ps.setString(1, name);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            System.out.println(rs.getString("name"));
        }

        con.close();
    }
}