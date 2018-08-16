package javase.oop.oe.customer;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;

import javase.oop.oe.db.DBConnectionFactory;

public class CustomerHandler {

    public static void insertCustomer(Customer customer) {

        PreparedStatement pstmt = null;
        Connection conn = DBConnectionFactory.initConn();
        String sql =
            "INSERT INTO CUSTOMERS " + " (CUSTOMER_NAME, CUSTOMER_ADDRESS, CUSTOMER_PHONE, CUSTOMER_TYPE_ID) " +
            "VALUES (?, ?, ?, ?)";
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, customer.getCustomerName());
            pstmt.setString(2, customer.getCustomerAddress());
            pstmt.setString(3, customer.getCustomerPhone());
            pstmt.setInt(4, 0);
            pstmt.executeUpdate(); //Generic for any CRUD operation

            // conn.commit(); //Commits chenges to DB


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBConnectionFactory.closePreparedStatment(pstmt);
            DBConnectionFactory.closeConn();
        }
    }


    public static ArrayList<Customer> getAllCustomers() {

        PreparedStatement pstmt = null;
        Connection conn = DBConnectionFactory.initConn();
        String sql = "";
        ArrayList<Customer> customerList = new ArrayList<Customer>();
        ResultSet rs;
        try {


            sql =
                "SELECT CUSTOMER_ID, CUSTOMER_NAME, CUSTOMER_ADDRESS, CUSTOMER_PHONE" + " FROM CUSTOMERS" +
                " WHERE CUSTOMER_TYPE_ID = 0";
            pstmt = conn.prepareStatement(sql);

            rs = pstmt.executeQuery(); //Result set is a table in memory, need to loop it

            while (rs.next()) {
                Customer c =
                    new Customer(rs.getString("CUSTOMER_ADDRESS"), rs.getInt("CUSTOMER_ID"),
                                 rs.getString("CUSTOMER_NAME"), rs.getString("CUSTOMER_PHONE"));
                customerList.add(c);

            }
        } catch (SQLException e) {
            System.out.println("Error in CustomerHandler.getAllCustomers()");
            e.printStackTrace();
        } finally {
            DBConnectionFactory.closePreparedStatment(pstmt);
            DBConnectionFactory.closeConn();
        }

        return customerList;
    }

    public static Customer getCustomerById(int customerId) {
        Customer c = null;
        PreparedStatement pstmt = null;
        Connection conn = DBConnectionFactory.initConn();
        String sql = "";
        ResultSet rs;

        try {
            sql =
                "SELECT CUSTOMER_NAME, CUSTOMER_ADDRESS, CUSTOMER_PHONE" + " FROM CUSTOMERS" +
                " WHERE CUSTOMER_ID  = " + customerId;

            pstmt = conn.prepareStatement(sql);

            rs = pstmt.executeQuery(); //Result set is a table in memory, need to loop it
            while (rs.next()) {
                c = new Customer(rs.getString("CUSTOMER_ADDRESS"), customerId, rs.getString("CUSTOMER_NAME"),
                                 rs.getString("CUSTOMER_PHONE"));
            }
        } catch (SQLException e) {
            System.out.println("Error in CustomerHandler.getCustomerByID()");
            e.printStackTrace();
        } finally {
            DBConnectionFactory.closePreparedStatment(pstmt);
            DBConnectionFactory.closeConn();
        }
        return c;
    }

    public static int removeCustomer(Customer customer) {
        PreparedStatement pstmt = null;
        Connection conn = DBConnectionFactory.initConn();
        String sql = "";
        int affectedRows = 0;
        try {
            sql = "DELETE FROM CUSTOMERS WHERE CUSTOMER_ID LIKE " + customer.getCustomerId();

            pstmt = conn.prepareStatement(sql);

            affectedRows = pstmt.executeUpdate(sql);

        } catch (SQLException e) {
            System.out.println("Error in CustomerHandler.removeCustomer");
            e.printStackTrace();
        } finally {
            DBConnectionFactory.closePreparedStatment(pstmt);
            DBConnectionFactory.closeConn();
        }
        return affectedRows;
    }

    public static int updateCustomer(Customer customer) {
        PreparedStatement pstmt = null;
        Connection conn = DBConnectionFactory.initConn();

        String sql =
            "UPDATE CUSTOMERS SET CUSTOMER_NAME = ?, CUSTOMER_ADDRESS = ?, CUSTOMER_PHONE = ? " +
            " WHERE CUSTOMER_ID = " + customer.getCustomerId();
        int affectedRows = 0;
        try {

            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, customer.getCustomerName());
            pstmt.setString(2, customer.getCustomerAddress());
            pstmt.setString(3, customer.getCustomerPhone());
           // pstmt.setInt(4, customer.getCustomerId());
            affectedRows = pstmt.executeUpdate(); //Generic for any CRUD operation

            // conn.commit(); //Commits chenges to DB
        } catch (SQLException e) {
            System.out.println("Error in CustomerHandler.updateCustomer");
            e.printStackTrace();
        }
        return affectedRows;
    }


}
