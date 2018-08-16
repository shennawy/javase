package javase.oop.oe.order;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import java.sql.SQLException;

import javase.oop.oe.db.DBConnectionFactory;

public class OrderHandler {

    public static void insertOrder(Order order) {
        String sqlOrder = "INSERT INTO ORDERS(ORDER_DATE, ORDER_TOTAL, CUSTOMER_ID) VALUES (?, ?, ?)";
        String sqlOrderItems =
            "INSERT INTO ORDER_ITEMS(ORDER_ITEM_QTY, ORDER_ID, PRODUCT_ID) VALUES(?, ORDERS_SEQ.CURRVAL, ?)";

        PreparedStatement pstmtOrder = null;
        PreparedStatement pstmtOrderItems = null;
        Connection conn = DBConnectionFactory.initConn();
        java.sql.Date sqlDate = new java.sql.Date(order.getOrderDate().getTime());

        try {
            pstmtOrder = conn.prepareStatement(sqlOrder);
            pstmtOrder.setDate(1, sqlDate);
            pstmtOrder.setDouble(2, order.getOrderTotal());
            pstmtOrder.setInt(3, order.getCustomer().getCustomerId());

            pstmtOrder.executeUpdate();

            pstmtOrderItems = conn.prepareStatement(sqlOrderItems);

            for (OrderItem oi : order.getOrderItems()) {
                pstmtOrderItems.setInt(1, oi.getQuantity());
                pstmtOrderItems.setInt(2, oi.getProduct().getProductId());
                pstmtOrderItems.executeUpdate();
                
                System.out.println("Debug: "+ oi.getQuantity() + oi.getProduct().getProductId());
            }

            conn.commit();
        } catch (SQLException e) {
            System.out.println("Error in OrderHandler.insertOrder");
            e.printStackTrace();
        }

    }

}
