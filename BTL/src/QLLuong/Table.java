/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLLuong;

import java.util.Date;
import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Hud
 */
public class Table extends AbstractTableModel{
    String [] name={
                "TT", "Họ tên", "Ngày sinh", "Đơn vị", "Trình độ", "Chức danh", "Bậc", "Hệ số lương", "Thời điểm"
            };
    Class [] classes = {Integer.class,String.class,Date.class,String.class,String.class,String.class,Integer.class,Float.class,Date.class};
    
    LinkedList<LuongNhanvien> list = new LinkedList<>();

    public Table() {
    }
    
    public Table(LinkedList<LuongNhanvien> list){
        this.list = list;
    }
    
    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return list.size();
    }

    @Override
    public int getColumnCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        switch(columnIndex){
            case 0: return rowIndex;
            case 1: return list.get(rowIndex).getHoTen();
            case 2: return list.get(rowIndex).getNgaySinh();
            case 3: return list.get(rowIndex).getDonVi();
            case 4: return list.get(rowIndex).getTrinhDo();
            case 5: return list.get(rowIndex).getChucDanh();
            case 6: return list.get(rowIndex).getBac();
            case 7: return list.get(rowIndex).getHsLuong();
            case 8: return list.get(rowIndex).getThoiDiem();
            default:return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return name[column]; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}