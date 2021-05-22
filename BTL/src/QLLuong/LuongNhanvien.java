/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLLuong;

import java.util.Date;

/**
 *
 * @author Hud
 */
public class LuongNhanvien {
    private String manv;
    private String hoTen;
    private Date ngaySinh;
    private String donVi;
    private String trinhDo;
    private String chucDanh;
    private int bac;
    private float hsLuong;
    private Date thoiDiem;

    public LuongNhanvien() {
    }

    public LuongNhanvien(String manv, String hoTen, Date ngaySinh, String donVi, String trinhDo, String chucDanh, int bac, float hsLuong, Date thoiDiem) {
        this.manv = manv;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.donVi = donVi;
        this.trinhDo = trinhDo;
        this.chucDanh = chucDanh;
        this.bac = bac;
        this.hsLuong = hsLuong;
        this.thoiDiem = thoiDiem;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getChucDanh() {
        return chucDanh;
    }

    public void setChucDanh(String chucDanh) {
        this.chucDanh = chucDanh;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    public float getHsLuong() {
        return hsLuong;
    }

    public void setHsLuong(float hsLuong) {
        this.hsLuong = hsLuong;
    }

    public Date getThoiDiem() {
        return thoiDiem;
    }

    public void setThoiDiem(Date thoiDiem) {
        this.thoiDiem = thoiDiem;
    }
    
    
}
