package com.manikanta.jdbc;

import java.sql.*;

public class TransactionDemo {

    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root",
                "password"
        );

        try {
            con.setAutoCommit(false);

            PreparedStatement ps1 = con.prepareStatement(
                    "UPDATE account SET balance = balance - 100 WHERE id = 1"
            );

            PreparedStatement ps2 = con.prepareStatement(
                    "UPDATE account SET balance = balance + 100 WHERE id = 2"
            );

            ps1.executeUpdate();
            ps2.executeUpdate();

            con.commit(); // ✅ success

        } catch (Exception e) {

            con.rollback(); // ❌ undo changes

        }

        con.close();
    }
}