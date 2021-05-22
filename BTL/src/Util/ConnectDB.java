package Util;


/**
 *
 * @author 
 */

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
public class ConnectDB {
    Statement stm =null;
    ResultSet rs = null;
    Connection cn =null;
    
    String connectionUrl = "jdbc:sqlserver://PCS-1952:1433;database=btlJava";
    String user="sa";
    String password="123456";  

    public ConnectDB(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn = DriverManager.getConnection(connectionUrl,user,password);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            JOptionPane.showMessageDialog(null,"Không tìm thấy driver","Error", 0, null);
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            JOptionPane.showMessageDialog(null,"Không kết nối được","Error", 0, null);
            e.printStackTrace();
        }

    }

    public void doSql(String sql){
        try {
            stm = cn.createStatement();
            stm.execute(sql);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("Không thực hiện được câu lệnh");
            e.printStackTrace();
        }

    }

    public ResultSet getData(String sql){
        try {
            stm = cn.createStatement();
            rs= stm.executeQuery(sql);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("Không thực hiện được câu lệnh");
            e.printStackTrace();
        }
        return rs;
    }
    public static void main(String[] args) {
            try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://PCS-1952:1433;database=btlJava";
            String user="sa";
            String password="123456";            
            Connection con = DriverManager.getConnection(connectionUrl, user, password);
            
            Statement stmt =con.createStatement();
            String sql = "Select * from TAIKHOAN";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                System.out.println("ID:"+rs.getString(1));
                System.out.println("Ten : "+rs.getString(2));
            }
            rs.close() ;stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getCn() {
        return cn;
    }
    
}
