package javase.oop.oe.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnectionFactory {

    private static final String USER = "oe";
    private static final String PASSWORD = "oe";

    //Default connection string format
    private static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
    private static Connection conn = null;

    public static Connection initConn() {
        try {
            System.out.println("Trying DB Connection");
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            conn.setAutoCommit(false);
            System.out.println("Success");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void setAutoCommit(boolean flag){
        try {
            conn.setAutoCommit(flag);
        } catch (SQLException e) {
            System.out.println("Unable to switch flag");
        }
    }

    public static void closeConn() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println("Failed to close connection");
                e.printStackTrace();
            }
        }

    }
    
    public static void closePreparedStatment(PreparedStatement pstmt) {
        try {
            pstmt.close();
        } catch (SQLException e) {
            System.out.println("Can't close prepared statment");
            e.printStackTrace();
        }
    }
}
