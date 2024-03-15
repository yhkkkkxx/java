package com.hana.jdbc;

import java.sql.*;

public class Jdbc5 {
    public static void main(String[] args) {
        // 1. Driver Loading
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("OK...");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver Not Found....");
        }

        // 2. Connection
        String url = "jdbc:mysql://localhost:3306/shopdb";
        String id = "user01";
        String pwd = "111111";

        Connection con = null;
        try {
            con = DriverManager.getConnection(url, id, pwd);
            System.out.println("ㅎㅎ추카추카");
        } catch (SQLException e) {
            System.out.println("접속 실패 !!");
            e.printStackTrace();
        }

        // 3. SQL 구문 생성
        String updateSql = "UPDATE db_cust SET pwd = ? , name = ? WHERE id = ?";
        PreparedStatement pstmt = null;
        ResultSet rset = null;
        try {
            pstmt = con.prepareStatement(updateSql);
            pstmt.setString(1, "pwd03");
            pstmt.setString(2, "이말숙");
            pstmt.setString(3, "id03");

            // 4. 전송
            pstmt.executeUpdate();
            System.out.println("Updated Data...");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("SQL Error");
        } finally {
            if(pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(con != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(rset != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
