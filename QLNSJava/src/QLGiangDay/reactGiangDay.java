package QLGiangDay;

import Util.ConnectDB;
import Util.Lich;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class reactGiangDay {
    Connection con = new ConnectDB().getCn();
    public boolean insert(Lich lich) throws Exception {

        String sql = "insert into LICH(NgayHoc,MaMon,MaNhanVien,Tiet) values(?,?,?,?)";
        try (
                  PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1, lich.getNgay());
            pstm.setString(2, lich.getMaMon());
            pstm.setString(3, lich.getMaNhanVien());
            pstm.setString(4, lich.getTiet());

            return pstm.execute();
        }
    }
    public ArrayList<Lich> danhSachLich() throws Exception {
        ArrayList<Lich> listLich = new ArrayList<>();
        String sql = "select lich.MaMon,lich.MaNhanVien,lich.NgayHoc,lich.Tiet,HOCPHAN.DiaDiem from lich inner join HOCPHAN on lich.MaMon=HOCPHAN.MaMon";
        try(
                
                PreparedStatement pstm = con.prepareStatement(sql);
                ){
            
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                Lich lich = new Lich();
                lich.setMaMon(rs.getString("MaMon".trim()));
                lich.setMaNhanVien(rs.getString("MaNhanVien".trim()));
                lich.setNgay(rs.getString("NgayHoc".toString().trim()));
                lich.setTiet(rs.getString("Tiet").toString().trim());
                lich.setDiadiem(rs.getString("DiaDiem").toString().trim());
                listLich.add(lich);               
            }
            return listLich;
        }
    }

    public ArrayList<Lich> timLichTheoMa() throws Exception {
        ArrayList<Lich> listLich = new ArrayList<>();
        String sql = "select * from lich";
        try(
                
                PreparedStatement pstm = con.prepareStatement(sql);
                ){
            
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                Lich lich = new Lich();
                lich.setMaMon(rs.getString("MaMon".trim()));
                lich.setMaNhanVien(rs.getString("MaNhanVien".trim()));
                lich.setNgay(rs.getString("NgayHoc".toString().trim()));
                lich.setTiet(rs.getString("Tiet".toString().trim()));
                listLich.add(lich);               
            }
            return listLich;
        }
    }
    public String timMaHocPhan(String tenHocPhan) throws Exception {
        String sql = "select * from HocPhan where TenMon=?";
        try (
                   PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1, tenHocPhan);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                String maMon = rs.getString("MaMon");
                return maMon;
            }
            return null;
        }
    }
        public String timMaNhanVien(String nngay, String ttiet, String ddiadiem) throws Exception {
        String sql = "select nhanvien.MaNhanVien,diadiem  from lich inner join hocphan on lich.MaMon=hocphan.MaMon inner join nhanvien on lich.MaNhanVien=nhanvien.MaNhanVien where NgayHoc='"+nngay+"' and tiet='"+ttiet+"' and DiaDiem='"+ddiadiem+"'";
        try (
                   PreparedStatement pstm = con.prepareStatement(sql);) {
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                String maMon = rs.getString("MaNhanVien");
                return maMon;
            }
            return null;
        }
    }
    public String timDiaDiemHocPhan(String maHocPhan) throws Exception {
        String sql = "select * from HocPhan where maMon=?";
        try (
                  PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1, maHocPhan);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                String diaDiem = rs.getString("DiaDiem");
                return diaDiem;
            }
            return null;
        }
    }
    public boolean checkMaMon(String maHocPhan) throws Exception {
        String sql = "select * from HocPhan where maMon=?";
        try (
                  PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1, maHocPhan);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                return true;
            }
            return false;
        }
    }
    
    public boolean capNhatLuong(int soTiet,String nhanVien) throws Exception {

        String sql = "update luong set sotiet = sotiet +? where MaNhanVien=?";
        try (
                  PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setInt(1, soTiet);   
            pstm.setString(2, nhanVien); 
            return pstm.executeUpdate() > 0;
        }
    }     


}
