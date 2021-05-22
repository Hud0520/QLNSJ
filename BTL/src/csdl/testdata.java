package csdl;

import java.sql.*;

/**
 *
 * @author SBoySV
 */
public class testdata {

    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://localhost:1433;database=btlJava";
            String user="sa";
            String password="123";            
            Connection con = DriverManager.getConnection(connectionUrl, user, password);
            
            Statement stmt =con.createStatement();
            String sql = "Select * from TAIKHOAN";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                System.out.println("ID:"+rs.getString(1));
                System.out.println("Ten: "+rs.getString(2));
            }
            rs.close() ;stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

