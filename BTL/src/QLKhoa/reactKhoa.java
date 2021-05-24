
package QLKhoa;

import Util.Khoa;
import Util.ConnectDB;
import java.sql.*;
import java.sql.PreparedStatement;

public class reactKhoa {
    Connection con = new ConnectDB().getCn();
    public boolean insert(Khoa khoa) throws Exception {
        
        String sql = "insert into Khoa(MaKhoa, TenKhoa, TruongKhoa, NgayThanhLap, DiaChi, DienThoai, Email, Website) values(?,?,?,?,?,?,?,?)";
        try (
                PreparedStatement pstm = con.prepareStatement(sql);
            ){
            pstm.setString(1, khoa.getMaKhoa());
            pstm.setString(2, khoa.getTenKhoa());
            pstm.setString(3, khoa.getTruongKhoa().trim());
            pstm.setString(4, khoa.getNgayThanhLap());
            pstm.setString(5, khoa.getDiaChi());
            pstm.setString(6, khoa.getDienThoai());
            pstm.setString(7, khoa.getEmail());
            pstm.setString(8, khoa.getWebsite());

            return pstm.executeUpdate() > 0;
        }
    } 
    public Khoa timKhoaTheoMa(String maKhoa) throws Exception {
        String sql = "select * from KHOA where MaKhoa=?";
        try(
                PreparedStatement pstm = con.prepareStatement(sql);
                ){
            pstm.setString(1, maKhoa);
            ResultSet rs = pstm.executeQuery();
            if(rs.next()){
                Khoa khoa = new Khoa();
                khoa.setMaKhoa(rs.getString("MaKhoa"));
                khoa.setTenKhoa(rs.getString("TenKhoa"));
                khoa.setTruongKhoa(rs.getString("TruongKhoa"));
                khoa.setNgayThanhLap(rs.getString("NgayThanhLap"));
                khoa.setDiaChi(rs.getString("DiaChi"));
                khoa.setDienThoai(rs.getString("DienThoai"));
                khoa.setEmail(rs.getString("Email"));
                khoa.setWebsite(rs.getString("Website"));
                return khoa;
            }
            return null;
        }
    }
    public Khoa timKhoaTheoTen(String tenKhoa) throws Exception {
        String sql = "select * from KHOA where TenKhoa=?";
        try(
                PreparedStatement pstm = con.prepareStatement(sql);
                ){
            pstm.setString(1, tenKhoa);
            ResultSet rs = pstm.executeQuery();
            if(rs.next()){
                Khoa khoa = new Khoa();
                khoa.setMaKhoa(rs.getString("MaKhoa"));
                khoa.setTenKhoa(rs.getString("TenKhoa"));
                khoa.setTruongKhoa(rs.getString("TruongKhoa"));
                khoa.setNgayThanhLap(rs.getString("NgayThanhLap"));
                khoa.setDiaChi(rs.getString("DiaChi"));
                khoa.setDienThoai(rs.getString("DienThoai"));
                khoa.setEmail(rs.getString("Email"));
                khoa.setWebsite(rs.getString("Website"));
                return khoa;
            }
            return null;
        }
    }
    public boolean sua(Khoa khoa) throws Exception{
        String sql = "update Khoa set TenKhoa=?, TruongKhoa=?, NgayThanhLap=?, DiaChi=?, DienThoai=?, Email=?, Website=? where MaKhoa=?"; 
        try ( 
                PreparedStatement pstm = con.prepareStatement(sql);
            ){
            pstm.setString(8, khoa.getMaKhoa());
            pstm.setString(1, khoa.getTenKhoa());
            pstm.setString(2, khoa.getTruongKhoa());
            pstm.setString(3, khoa.getNgayThanhLap());
            pstm.setString(4, khoa.getDiaChi());
            pstm.setString(5, khoa.getDienThoai());
            pstm.setString(6, khoa.getEmail());
            pstm.setString(7, khoa.getWebsite());

            return pstm.executeUpdate() > 0;
        }
    }
    public boolean xoa(Khoa khoa) throws Exception{
        String sql = "delete from KHOA where MaKhoa=?"; 
        try ( 
                PreparedStatement pstm = con.prepareStatement(sql);
            ){
            pstm.setString(1, khoa.getMaKhoa());          
            return pstm.executeUpdate() > 0;
        }
    }
}
