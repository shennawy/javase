package javase.oop.oe.product;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;

import javase.oop.oe.db.DBConnectionFactory;

public class HardwareHandler {

    public static void insertHardware(Hardware hardware) {

        PreparedStatement pstmtHardware = null;
        PreparedStatement pstmtProduct = null;
        Connection conn = DBConnectionFactory.initConn();

        String sqlProduct =
            "INSERT INTO PRODUCTS(PRODUCT_NAME, PRODUCT_RETAIL_PRICE, PRODUCT_DESC)" + " VALUES(?, ?, ?)";
        String sqlHardware =
            "INSERT INTO HARDWARE(HARDWARE_ID, HARDWARE_WARRANTY_PRD, PRODUCT_ID) VALUES(?, ?, PRODUCTS_SEQ.CURRVAL)";

        try {
            pstmtProduct = conn.prepareStatement(sqlProduct);
            pstmtProduct.setString(1, hardware.getProductName());
            pstmtProduct.setDouble(2, hardware.getRetailPrice());
            pstmtProduct.setString(3, hardware.getDescription());

            pstmtProduct.executeUpdate();

            pstmtHardware = conn.prepareStatement(sqlHardware);
            pstmtHardware.setInt(1, hardware.getProductId());
            pstmtHardware.setInt(2, hardware.getWarrantyPeriod());

            pstmtHardware.executeUpdate();

            conn.commit();
        } catch (SQLException e) {
            System.out.println("Error In HardwareHandler.insertHardware");
            e.printStackTrace();
        }


    }

    public static Hardware getHardwareById(int hardwareId) {
        Hardware hardware = null;
        PreparedStatement pstmt = null;
        Connection conn = DBConnectionFactory.initConn();
        ResultSet rs = null;
        String sql =
            "SELECT HARDWARE_ID, HARDWARE.PRODUCT_ID, HARDWARE_WARRANTY_PRD, PRODUCT_DESC, PRODUCT_NAME, PRODUCT_RETAIL_PRICE FROM HARDWARE, PRODUCTS WHERE " +
            " HARDWARE.PRODUCT_ID LIKE " + hardwareId + " AND PRODUCTS.PRODUCT_ID = HARDWARE.PRODUCT_ID";

        try {
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                //String description, int productId, String productName, double retailPrice, int warrantyPeriod
                hardware =
                    new Hardware(rs.getString("PRODUCT_DESC"), hardwareId, rs.getString("PRODUCT_NAME"),
                                 rs.getDouble("PRODUCT_RETAIL_PRICE"), rs.getInt("HARDWARE_WARRANTY_PRD"));
            }

        } catch (SQLException e) {
            System.out.println("Error in HardwareHandler.getHardwareById()");
            e.printStackTrace();
        } finally {
            DBConnectionFactory.closePreparedStatment(pstmt);
            DBConnectionFactory.closeConn();
        }

        return hardware;
    }

}
