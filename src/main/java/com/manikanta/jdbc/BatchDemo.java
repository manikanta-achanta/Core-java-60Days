package com.manikanta.jdbc;

import java.sql.*;

public class BatchDemo {

    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root",
                "password"
        );

        Statement stmt = con.createStatement();

        stmt.addBatch("INSERT INTO student VALUES(1, 'A')");
        stmt.addBatch("INSERT INTO student VALUES(2, 'B')");
        stmt.addBatch("INSERT INTO student VALUES(3, 'C')");

        stmt.executeBatch();

        con.close();
    }
}