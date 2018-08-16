package javase.oop.oe.product;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;

import javase.oop.oe.db.DBConnectionFactory;

public class SoftwareHandler {

    public static void insertSoftware(Software software) {

        PreparedStatement pstmtProduct = null;
        PreparedStatement pstmtSoftware = null;
        Connection conn = DBConnectionFactory.initConn();
        String sqlProduct =
            "INSERT INTO PRODUCTS(PRODUCT_NAME, PRODUCT_RETAIL_PRICE, PRODUCT_DESC)" + " VALUES(?, ?, ?)";
        String sqlSoftware = "INSERT INTO SOFTWARE(SOFTWARE_LICENCE, PRODUCT_ID)" + " VALUES( ?, PRODUCTS_SEQ.CURRVAL)";

        try {
            pstmtProduct = conn.prepareStatement(sqlProduct);
            pstmtProduct.setString(1, software.getProductName());
            pstmtProduct.setDouble(2, software.getRetailPrice());
            pstmtProduct.setString(3, software.getDescription());

            pstmtProduct.executeUpdate();

            pstmtSoftware = conn.prepareStatement(sqlSoftware);
            pstmtSoftware.setString(1, software.getLicense());

            pstmtSoftware.executeUpdate();
            
            conn.commit();
            
        } catch (SQLException e) {
            System.out.println("Error in SoftwareHandler.insertSoftware");
            e.printStackTrace();
        } finally {
            DBConnectionFactory.closePreparedStatment(pstmtProduct);
            DBConnectionFactory.closePreparedStatment(pstmtSoftware);
            DBConnectionFactory.closeConn();
        }

    }

    public static Software getSoftwareById(int productId) {
        Software sw = null;
        String sql =
            "Select SOFTWARE_ID, PRODUCTS.PRODUCT_ID, SOFTWARE_LICENCE, PRODUCT_NAME, PRODUCT_RETAIL_PRICE, PRODUCT_DESC " +
            " FROM SOFTWARE, PRODUCTS " + " WHERE PRODUCTS.PRODUCT_ID LIKE " + productId +
            " AND SOFTWARE.PRODUCT_ID LIKE PRODUCTS.PRODUCT_ID";

        PreparedStatement pstmt = null;
        Connection conn = DBConnectionFactory.initConn();
        ResultSet rs = null;

        try {

            //SOFTWARE_LICENCE, PRODUCT_ID, SOFTWARE_ID
            //PRODUCT_ID, PRODUCT_NAME, PRODUCT_RETAIL_PRICE, PRODUCT_DESC
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                //String description, int productId, String productName, double retailPrice, String license
                sw =
                    new Software(rs.getString("PRODUCT_DESC"), rs.getInt("PRODUCT_ID"), rs.getString("PRODUCT_NAME"),
                                 rs.getDouble("PRODUCT_RETAIL_PRICE"), rs.getString("SOFTWARE_LICENCE"));
            }
        } catch (SQLException e) {
            System.out.println("Error In SoftwareHandler.getSoftwareById");
            e.printStackTrace();
        } finally {
            DBConnectionFactory.closePreparedStatment(pstmt);
            DBConnectionFactory.closeConn();
        }
        return sw;
    }

}
