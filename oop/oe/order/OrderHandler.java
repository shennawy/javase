package javase.oop.oe.order;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;

import javase.oop.oe.db.DBConnectionFactory;
import javase.oop.oe.product.HardwareHandler;
import javase.oop.oe.product.SoftwareHandler;

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
            }

            conn.commit();
        } catch (SQLException e) {
            System.out.println("Error in OrderHandler.insertOrder");
            e.printStackTrace();
        }

    }

    public static Order getOrderById(int orderId) {
        Order order = null;
        OrderItem oi = null;
        String sqlOrder = "SELECT ORDER_DATE, ORDER_TOTAL, CUSTOMER_ID FROM ORDERS WHERE ORDER_ID LIKE " + orderId;
        String sqlOrderItems = "SELECT ORDER_ITEM_QTY, PRODUCT_ID FROM ORDER_ITEMS WHERE ORDER_ID LIKE " + orderId;
        PreparedStatement pstmtOrder = null;
        PreparedStatement pstmtOrderItems = null;
        ResultSet rsOrder = null;
        ResultSet rsOrderItems = null;
        Connection conn = DBConnectionFactory.initConn();
        int productId;
        int orderItemQTY;

        try {
            pstmtOrder = conn.prepareStatement(sqlOrder);
            rsOrder = pstmtOrder.executeQuery();

            pstmtOrderItems = conn.prepareStatement(sqlOrderItems);
            rsOrderItems = pstmtOrderItems.executeQuery();

            int lineNbr = 0;
            while (rsOrder.next()) {
                order = new Order(orderId, rsOrder.getDate("ORDER_DATE"));
                while (rsOrderItems.next()) {
                    productId = rsOrderItems.getInt("PRODUCT_ID");
                    orderItemQTY = rsOrderItems.getInt("ORDER_ITEM_QTY");

                    if (HardwareHandler.getHardwareById(productId) != null) {

                        oi = new OrderItem(lineNbr, HardwareHandler.getHardwareById(productId), orderItemQTY);
                        order.addOrderItems(HardwareHandler.getHardwareById(productId));
                    } else if (SoftwareHandler.getSoftwareById(productId) != null) {

                        oi = new OrderItem(lineNbr, SoftwareHandler.getSoftwareById(productId), orderItemQTY);
                        order.addOrderItems(SoftwareHandler.getSoftwareById(productId));
                    }
                    // order.addOrderItems(product);
                    lineNbr++;
                    System.out.println("Product ID: " + productId);
                }

            }
        } catch (SQLException e) {
            System.out.println("Error in OrderHandler.getOrderById");
            e.printStackTrace();
        }

        return order;
    }

}
