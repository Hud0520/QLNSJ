package Util;


/**
 *
 * @author 
 */

import java.sql.*;

import javax.swing.JOptionPane;
public class ConnectDB {
    Statement stm =null;
    ResultSet rs = null;
    Connection cn =null;
    
    String url ="jdbc:derby://localhost:1527/QLNS";
    String uname ="root";
    String pword ="root";

    public ConnectDB(){
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            cn = DriverManager.getConnection(url, uname, pword);
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
        ConnectDB derby= new ConnectDB();
    }
}
