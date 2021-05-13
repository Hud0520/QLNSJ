package Util;


/**
 *
 * @author 
 */

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import org.apache.derby.iapi.jdbc.Driver42;
public class ConnectDB {
    Statement stm =null;
    ResultSet rs = null;
    Connection cn =null;
    
    String url ="jdbc:derby:QLNS;create=true";
    String uname ="root";
    String pword ="root";

    public ConnectDB(){
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            cn = DriverManager.getConnection(url,uname,pword);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            JOptionPane.showMessageDialog(null,"Không tìm thấy driver","Error", 0, null);
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            JOptionPane.showMessageDialog(null,"Không kết nối được","Error", 0, null);
            e.printStackTrace();
        } catch (InstantiationException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
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
        derby.doSql("Create table gia(ten varchar(10))");
    }
}
