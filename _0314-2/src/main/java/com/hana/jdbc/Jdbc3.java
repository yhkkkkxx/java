package com.hana.jdbc;

import java.sql.*;

public class Jdbc3 {
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
        String selectSql = "c";
        PreparedStatement pstmt = null;
        ResultSet rset = null;
        try {
            pstmt = con.prepareStatement(selectSql);
            pstmt.setString(1, "id02");
            // 4. 전송
            rset = pstmt.executeQuery();
            rset.next();String custId = rset.getString("id");
            String custPwd = rset.getString("pwd");
            String custName = rset.getString("name");
            System.out.printf("%s %s %s %n", custId, custPwd, custName);
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
