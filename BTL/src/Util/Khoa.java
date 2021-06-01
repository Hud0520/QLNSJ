/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 *
 * @author SBoySV
 */
public class Khoa {
    String MaKhoa, TenKhoa, TruongKhoa, NgayThanhLap, DiaChi, DienThoai, Email, Website;

    public Khoa() {
    }

    public Khoa(String MaKhoa) {
        this.MaKhoa = MaKhoa;
    }

    public Khoa(String MaKhoa, String TenKhoa, String TruongKhoa, String NgayThanhLap, String DiaChi, String DienThoai, String Email, String Website) {
        this.MaKhoa = MaKhoa;
        this.TenKhoa = TenKhoa;
        this.TruongKhoa = TruongKhoa;
        this.NgayThanhLap = NgayThanhLap;
        this.DiaChi = DiaChi;
        this.DienThoai = DienThoai;
        this.Email = Email;
        this.Website = Website;
    }

    public String getMaKhoa() {
        return MaKhoa;
    }

    public void setMaKhoa(String MaKhoa) {
        this.MaKhoa = MaKhoa;
    }

    public String getTenKhoa() {
        return TenKhoa;
    }

    public void setTenKhoa(String TenKhoa) {
        this.TenKhoa = TenKhoa;
    }

    public String getTruongKhoa() {
        return TruongKhoa;
    }

    public void setTruongKhoa(String TruongKhoa) {
        this.TruongKhoa = TruongKhoa;
    }

    public String getNgayThanhLap() {
        return NgayThanhLap;
    }

    public void setNgayThanhLap(String NgayThanhLap) {
        this.NgayThanhLap = NgayThanhLap;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getDienThoai() {
        return DienThoai;
    }

    public void setDienThoai(String DienThoai) {
        this.DienThoai = DienThoai;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getWebsite() {
        return Website;
    }

    public void setWebsite(String Website) {
        this.Website = Website;
    }
    
}
