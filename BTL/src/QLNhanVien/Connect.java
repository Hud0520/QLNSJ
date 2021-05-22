/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLNhanVien;

import Util.ConnectDB;
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
        con = new ConnectDB().getCn();
        
    }
    public ResultSet GetDataNV(String jtable) throws SQLException
    {
        ResultSet kq=null;
        Statement st=con.createStatement();
        kq=st.executeQuery("select * from NHANVIEN");
        return kq;
    }
        public ResultSet findNV(String maNV) throws SQLException
    {
        ResultSet kq=null;
        Statement st=con.createStatement();
        kq=st.executeQuery("select * from NHANVIEN WHERE MaNhanVien ='"+maNV+"'");
        return kq;
    }
    public int addNV(String maNV, String tenNV, String ngaySinh, String gioiTinh, String trinhDo, String sdt, String diaChi, String maKhoa) throws Exception 
    {
        int t=0;
        t=getStatement().executeUpdate("insert into NHANVIEN values('"+ maNV+"',N'"+tenNV+"','"+ngaySinh+"',N'"+gioiTinh+"',N'"+trinhDo+"','"+sdt+"',N'"+diaChi+"','"+maKhoa+"') ");
        return t;
    }
    protected  Statement getStatement()throws Exception
    {
        if(this.sta==null || this.sta.isClosed())
        {
            //khoi tao statement moi
            this.sta=this.con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
        }
        return this.sta;
    }
    public void closeConnect() throws SQLException
    {
        //dong tu nho den lon
        if(this.res!=null&&!this.res.isClosed())
        try{
            this.res.close();
            this.res=null;
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Loi dong ket qua");
        }
        
        if(this.sta!=null&&!this.sta.isClosed())
        try{
            this.sta.close();
            this.sta=null;
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Loi dong lenh thuc thi");
        }
        
        if(this.con!=null&&!this.con.isClosed())
        try{
            this.con.close();
            this.con=null;
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Loi dong ket noi");
        }
        
    }
    public int removeNV(String maNhanVien)throws Exception
    {
        int t;
        t= getStatement().executeUpdate("delete from NHANVIEN where MaNhanVien='"+maNhanVien+"'");
        return t;
    }
    public int updateNV(String maNV, String tenNV, String ngaySinh, String gioiTinh, String trinhDo, String sdt, String diaChi, String maKhoa) throws Exception
    {
        int t;
        t=getStatement().executeUpdate("update NHANVIEN set TenNhanVien=N'"+tenNV+"',NgaySinh='"+ngaySinh+"',GioiTinh=N'"+gioiTinh+"',TrinhDo=N'"+trinhDo+"',SoDienThoai='"+sdt+"',MaKhoa='"+maKhoa+"'where MaNhanVien='"+maNV+"'");
        return   t;
    }
    public boolean checkStudent(String maNV) throws SQLException, ClassNotFoundException {
	// Kiểm tra nv có trong database hay chưa
        ResultSet kq=null;
        Statement st=con.createStatement();
        kq=st.executeQuery("select * from NHANVIEN WHERE MaNhanVien ='"+maNV+"'");
	// Trả về kết quả
	if (!kq.next()) {
	    return false;
	}
	return true;
    }
    public boolean checkKhoa(String maKhoa) throws SQLException, ClassNotFoundException {
	// Kiểm tra makhoa có trong database hay chưa
        ResultSet kq=null;
        Statement st=con.createStatement();
        kq=st.executeQuery("select * from KHOA WHERE MaKhoa ='"+maKhoa+"'");
	// Trả về kết quả
	if (!kq.next()) {
	    con.close();
	    return false;
	}
	con.close();
	return true;
    }
    public boolean checkSdt(String sdt) throws SQLException, ClassNotFoundException {
        ResultSet kq=null;
        Statement st=con.createStatement();
        kq=st.executeQuery("select * from NHANVIEN WHERE SoDienThoai ='"+sdt+"'");
	if (!kq.next()) {
	    return false;
	}
	return true;
    }
    public boolean checkTenDangNhap(String tenDN) throws SQLException, ClassNotFoundException {
        ResultSet kq=null;
        Statement st=con.createStatement();
        kq=st.executeQuery("select * from TAIKHOAN WHERE TenDangNhap ='"+tenDN+"'");
	if (!kq.next()) {
	    return false;
	}
	return true;
    }
    public boolean checkMatKhau(String matKhau) throws SQLException, ClassNotFoundException {
        ResultSet kq=null;
        Statement st=con.createStatement();
        kq=st.executeQuery("select * from TAIKHOAN WHERE MatKhau ='"+matKhau+"'");
	if (!kq.next()) {
	    con.close();
	    return false;
	}
	con.close();
	return true;
    }
}
