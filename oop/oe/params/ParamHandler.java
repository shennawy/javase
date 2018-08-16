package javase.oop.oe.params;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

import javase.oop.oe.db.DBConnectionFactory;

public class ParamHandler {

    public static Params getParamByName(String paramName) {
        Params param = null;
        String sql =
            "SELECT PARAM_ID, PARAM_NAME, PARAM_VALUE FROM PARAMETERS WHERE PARAM_NAME LIKE " + "'" + paramName + "'";

        PreparedStatement pstmt = null;
        Connection conn = DBConnectionFactory.initConn();
        ResultSet rs = null;


        try {
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                param = new Params(rs.getInt("PARAM_ID"), rs.getString("PARAM_NAME"), rs.getDouble("PARAM_VALUE"));
            }
        } catch (SQLException e) {
            System.out.println("Error In ParamHandler.getParamsByName");
            e.printStackTrace();
        }

        return param;
    }

}
