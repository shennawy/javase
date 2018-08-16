package javase.oop.oe.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;

import javase.oop.oe.db.DBConnectionFactory;

public class CompanyHandler {

    public static void insertCompany(Company company) {
        PreparedStatement pstmt = null;
        Connection conn = DBConnectionFactory.initConn();
        String sql =
            "INSERT INTO CUSTOMERS " +
            " (CUSTOMER_NAME, CUSTOMER_ADDRESS, CUSTOMER_PHONE, CUSTOMER_TYPE_ID, CUSTOMER_DISCOUNT, CUSTOMER_CONTACT) " +
            "VALUES (?, ?, ?, ?, ?, ?)";

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, company.getCustomerName());
            pstmt.setString(2, company.getCustomerAddress());
            pstmt.setString(3, company.getCustomerPhone());
            pstmt.setInt(4, 2);
            pstmt.setInt(5, company.getCompanyDiscount());
            pstmt.setString(6, company.getCompanyContact());

            pstmt.executeUpdate(); //Generic for any CRUD operation

            // conn.commit(); //Commits chenges to DB

        } catch (SQLException e) {
            System.out.println("Error In CompanyHandler.insertCompany");
            e.printStackTrace();
        } finally {
            DBConnectionFactory.closePreparedStatment(pstmt);
            DBConnectionFactory.closeConn();
        }

    }

    public static Company getCompanyById(int companyId) {
        Company c = null;
        PreparedStatement pstmt = null;
        Connection conn = DBConnectionFactory.initConn();
        String sql = "";
        ResultSet rs;
        try {
            sql =
                "SELECT CUSTOMER_NAME, CUSTOMER_ADDRESS, CUSTOMER_PHONE, CUSTOMER_DISCOUNT, CUSTOMER_CONTACT " +
                " FROM CUSTOMERS" + " WHERE CUSTOMER_ID  = " + companyId;

            pstmt = conn.prepareStatement(sql);

            rs = pstmt.executeQuery(); //Result set is a table in memory, need to loop it
            while (rs.next()) {
                //String address, int customerId, String customerName, String customerPhone, String companyContact,
                //int companyDiscount
                c = new Company(rs.getString("CUSTOMER_ADDRESS"), companyId, rs.getString("CUSTOMER_NAME"),
                                rs.getString("CUSTOMER_PHONE"), rs.getString("CUSTOMER_CONTACT"),
                                rs.getInt("CUSTOMER_DISCOUNT"));
            }
        } catch (SQLException e) {
            System.out.println("Error in CompanyHandler.getCompanyByID()");
            e.printStackTrace();
        } finally {
            DBConnectionFactory.closePreparedStatment(pstmt);
            DBConnectionFactory.closeConn();
        }

        return c;
    }

}
