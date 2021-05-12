/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Xiaomi
 */
public class Connect {
    Connection con=null;    //khoi tao Connection bang null
    Statement sta=null;     //khoi tao Statement de thuc thi
    ResultSet res=null;     //khoi tao ResultSet de chua du lieu
    
    //ket noi den database
   
    public void getConnect() 
    {
        try{
            String url="jdbc:derby://localhost:1527/QLNHANVIEN";
            String user="nhom13";
            String pass="123456";
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con=(Connection)DriverManager.getConnection(url, user, pass);
        }
        catch (ClassNotFoundException|SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Khong the ket noi voi database \n"+e);
        }
        
    }
    public ResultSet GetData(String jtable) throws SQLException
    {
        ResultSet kq=null;
        Statement st=con.createStatement();
        kq=st.executeQuery("select * from NHANVIEN");
        return kq;
    }
}
