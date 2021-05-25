package QLGiangDay;

import java.util.Objects;

/**
 *
 * @author SBoySV
 */
public class Lich {
    String maMon, maNhanVien,Ngay,Tiet,diadiem="";

    public Lich() {
    }

    public Lich(String maMon, String maNhanVien, String Ngay, String Tiet,String diaDiem) {
        this.maMon = maMon;
        this.maNhanVien = maNhanVien;
        this.Ngay = Ngay;
        this.Tiet = Tiet;
        this.diadiem=diaDiem;
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getNgay() {
        return Ngay;
    }

    public void setNgay(String Ngay) {
        this.Ngay = Ngay;
    }

    public String getTiet() {
        return Tiet;
    }

    public void setTiet(String Tiet) {
        this.Tiet = Tiet;
    }

    public String getDiadiem() {
        return diadiem;
    }

    public void setDiadiem(String diadiem) {
        this.diadiem = diadiem;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.maMon);
        hash = 67 * hash + Objects.hashCode(this.maNhanVien);
        hash = 67 * hash + Objects.hashCode(this.Ngay);
        hash = 67 * hash + Objects.hashCode(this.Tiet);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Lich other = (Lich) obj;
        if (!Objects.equals(this.maMon.trim(), other.maMon.trim())) {
            return false;
        }
        if (!Objects.equals(this.maNhanVien.trim(), other.maNhanVien.trim())) {
            return false;
        }
        if (!Objects.equals(this.Ngay.trim(), other.Ngay.trim())) {
            return false;
        }
        if (!Objects.equals(this.Tiet.trim(), other.Tiet.trim())) {
            return false;
        }
        return true;
    }

    
    
}
