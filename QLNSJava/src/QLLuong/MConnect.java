/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLLuong;

import Util.ConnectDB;
import Util.Luong;
import java.sql.*;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Hud
 */
public class MConnect{
    ConnectDB db = new ConnectDB();
    PreparedStatement pr = null;
    
    public LinkedList<Luong> getALLData(String sql){
        LinkedList<Luong> l = new LinkedList<>();
        ResultSet r = db.getData(sql);
        try {
            while(r.next()){
                Luong a = new Luong();
                a.setMaNV(r.getString(7));
                a.setChucDanh(r.getString(2));
                a.setHeSoLuong(Float.parseFloat(r.getString(3) == null ? "0":r.getString(3)));
                a.setThoiDiem(r.getString(4));
                a.setSotiet(Integer.parseInt(r.getString(5) == null ? "0" : r.getString(5)));
                a.setBac(Integer.parseInt(r.getString(6) == null ? "0" : r.getString(6)));
                a.setHotenNV(r.getString(8));
                a.setNgaySinh(r.getString(9));
                a.setMaKhoa(r.getString(14));
                a.setTrinhDo(r.getString(11));
                l.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return l;
    }
    
    public void add(Luong nv){
        String sql = "insert into LUONG values(?,?,?,?,?,?)";
        try {
            pr = db.getCn().prepareStatement(sql);
            pr.setString(1, nv.getMaNV());
            pr.setString(2, nv.getChucDanh());
            pr.setString(3, ""+nv.getHeSoLuong());
            pr.setString(4, nv.getThoiDiem());
            pr.setString(5, ""+nv.getSotiet());
            pr.setString(6, ""+nv.getBac());
            pr.execute();
        } catch (SQLException ex) {
            Logger.getLogger(MConnect.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public void update(Luong nv){
        String sql = "update LUONG "
                + "set ChucDanh = ?, "
                + "HeSoLuong = ?, "
                + "ThoiDiem = ?, "
                + "SoTiet = ?, "
                + "Bac = ? "
                + "where MaNhanVien = ?";
        try {
            pr = db.getCn().prepareStatement(sql);
            pr.setString(1, nv.getChucDanh());
            pr.setString(2, ""+nv.getHeSoLuong());
            pr.setString(3, nv.getThoiDiem());
            pr.setString(4, ""+nv.getSotiet());
            pr.setString(5, ""+nv.getBac());
            pr.setString(6, nv.getMaNV());
            pr.execute();
        } catch (SQLException ex) {
            Logger.getLogger(MConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void delete(Luong nv){
        String sql= "delete "
                + "from LUONG "
                + "where MaNhanVien = ?";
        try {
            pr = db.getCn().prepareStatement(sql);
            pr.setString(1, nv.getMaNV());
            pr.execute();
        } catch (SQLException ex) {
            Logger.getLogger(MConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
