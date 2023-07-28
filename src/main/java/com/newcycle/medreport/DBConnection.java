package com.newcycle.medreport;

import java.sql.*;
import javax.swing.*;
import org.sqlite.SQLiteConfig;

public class DBConnection {

    final static String URL = "jdbc:sqlite:patients.db";
    final static String DRIVER = "org.sqlite.JDBC";

    public static Connection connectDB() throws ClassNotFoundException {
        Class.forName(DRIVER);
        Connection conn = null;
        try {
            SQLiteConfig config = new SQLiteConfig();
            config.enforceForeignKeys(true);
            conn = DriverManager.getConnection(URL, config.toProperties());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        return conn;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        DBConnection test = new DBConnection();
        test.connectDB();
    }
}
