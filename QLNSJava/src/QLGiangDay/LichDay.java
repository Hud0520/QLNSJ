/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLGiangDay;

import QLKhoa.QLKhoa;
import Util.Lich;
import Util.ConnectDB;
import java.awt.HeadlessException;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;

public class LichDay extends javax.swing.JFrame {

    Connection con = new ConnectDB().getCn();

    public LichDay() {
        initComponents();
        loadToTableHocPhan();
        loadToTableLich();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLich = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHocPhan = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtMaNhanVien = new javax.swing.JTextField();
        txtTenNhanVien = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cbxTiet = new javax.swing.JComboBox<>();
        txtTenMon = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lblSoTiet = new javax.swing.JLabel();
        btnTim = new javax.swing.JButton();
        btnInfile = new javax.swing.JButton();
        btnRefesh = new javax.swing.JButton();
        lblMaMon = new javax.swing.JLabel();
        txtMaMon = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbxNgay = new javax.swing.JComboBox<>();
        cbxThang = new javax.swing.JComboBox<>();
        cbxNam = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 753, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 304, Short.MAX_VALUE)
        );

        tblLich.setAutoCreateRowSorter(true);
        tblLich.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tblLich.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "null", "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLich.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLichMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLich);

        jTabbedPane1.addTab("Lịch giảng dạy", jScrollPane1);

        tblHocPhan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblHocPhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHocPhanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblHocPhan);

        jTabbedPane1.addTab("Danh sách lớp", jScrollPane2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Phân công giảng dạy");

        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Họ tên");

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon("D:\\New folder\\New folder (3)\\QLNSJ-main\\BTL\\src\\Util\\Icon\\Add.png")); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Môn học");

        cbxTiet.setEditable(true);
        cbxTiet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1,2", "1,2,3", "1,2,3,4", "1,2,3,4,5", "1,2,3,4,5,6", "10,11", "10,11,12", "11,12", "13,14", "13,14,15", "13,14,15,16", "15,16", "2,3", "3,4", "4,5", "4,5,6", "7,8", "7,8,9", "7,8,9,10", "7,8,9,10,11", "7,8,9,10,11,12", "8,9", "9,10", " ", " ", " ", " ", " " }));
        cbxTiet.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Mã nhân sự");

        lblSoTiet.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSoTiet.setText("Tiết");

        btnTim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTim.setIcon(new javax.swing.ImageIcon("D:\\New folder\\New folder (3)\\QLNSJ-main\\BTL\\src\\Util\\Icon\\Search.png")); // NOI18N
        btnTim.setText("Tìm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        btnInfile.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnInfile.setIcon(new javax.swing.ImageIcon("D:\\New folder\\New folder (3)\\QLNSJ-main\\BTL\\src\\Util\\Icon\\file.png")); // NOI18N
        btnInfile.setText("In File");
        btnInfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfileActionPerformed(evt);
            }
        });

        btnRefesh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRefesh.setIcon(new javax.swing.ImageIcon("D:\\New folder\\New folder (3)\\QLNSJ-main\\BTL\\src\\Util\\Icon\\Refresh.png")); // NOI18N
        btnRefesh.setText("Refesh");
        btnRefesh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefeshActionPerformed(evt);
            }
        });

        lblMaMon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMaMon.setText("Mã Môn");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Ngày học");

        cbxNgay.setEditable(true);
        cbxNgay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));

        cbxThang.setEditable(true);
        cbxThang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        cbxNam.setEditable(true);
        cbxNam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2000", "2021", "2022", "2023" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaMon)
                            .addComponent(jLabel3)
                            .addComponent(lblSoTiet))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenMon, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaMon, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(cbxNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxThang, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxNam, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnInfile, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnRefesh, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(txtTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel6)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaMon)
                            .addComponent(txtMaMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTenMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxTiet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSoTiet))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnTim)
                    .addComponent(btnInfile)
                    .addComponent(btnRefesh))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 933, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(300, 300, 300))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(169, 169, 169)))))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 109, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel4.getAccessibleContext().setAccessibleParent(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 986, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblHocPhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHocPhanMouseClicked
        int row = tblHocPhan.getSelectedRow();
        txtMaMon.setText(tblHocPhan.getValueAt(row, 0).toString());
        txtTenMon.setText(tblHocPhan.getValueAt(row, 1).toString());
        cbxTiet.setEditable(true);
        cbxTiet.setSelectedItem(tblHocPhan.getValueAt(row, 3));

    }//GEN-LAST:event_tblHocPhanMouseClicked

    private void tblLichMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLichMouseClicked
        int row = tblLich.getSelectedRow();
        String date = tblLich.getValueAt(row, 2).toString();
        String[] split = date.split("-");
        cbxNgay.setSelectedItem(split[2]);
        cbxThang.setSelectedItem(split[1]);
        cbxNam.setSelectedItem(split[0]);
        reactGiangDay react = new reactGiangDay();
        try {
            String maHP = react.timMaHocPhan(tblLich.getValueAt(row, 1).toString().trim());
            txtMaMon.setText(maHP.trim());
        } catch (Exception ex) {
            Logger.getLogger(LichDay.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            String maNV = react.timMaNhanVien(date, tblLich.getValueAt(row, 3).toString().trim(), tblLich.getValueAt(row, 4).toString().trim());
            txtMaNhanVien.setText(maNV.trim());
        } catch (Exception ex) {
            Logger.getLogger(LichDay.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtTenMon.setText(tblLich.getValueAt(row, 1).toString().trim());
        cbxTiet.setSelectedItem(tblLich.getValueAt(row, 3).toString().trim());

        txtTenNhanVien.setText(tblLich.getValueAt(row, 0).toString());

    }//GEN-LAST:event_tblLichMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        themLich();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        timLichTheoMaMon(txtMaMon.getText().toString());
    }//GEN-LAST:event_btnTimActionPerformed

    private void btnInfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfileActionPerformed
        try {
            exportExcel(tblLich);
        } catch (IOException ex) {
            Logger.getLogger(LichDay.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnInfileActionPerformed


    private void btnRefeshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefeshActionPerformed
        Refesh();
        loadToTableLich();

    }//GEN-LAST:event_btnRefeshActionPerformed
    private boolean checkNull() throws HeadlessException {
        if (txtMaMon.getText().trim().equals("")) {
            JOptionPane.showConfirmDialog(this, "Mã học phần không được để trống", "Warning!", JOptionPane.CLOSED_OPTION);
            return true;
        }

        if (txtMaNhanVien.getText().trim().equals("")) {
            JOptionPane.showConfirmDialog(this, "Mã nhân sự không được để trống", "Warning!", JOptionPane.CLOSED_OPTION);
            return true;
        }

        return false;
    }

    private void themLich() {
        if (checkNull()) {
            return;
        }
        if (!Pattern.matches("[Mm][Oo][Nn]\\d{2,}", txtMaMon.getText())) {
            JOptionPane.showMessageDialog(this, " Mã môn không hợp lệ ^.^");
            return;
        };
        if (!Pattern.matches("[Nn][Vv]\\d{3,}", txtMaNhanVien.getText())) {
            JOptionPane.showMessageDialog(this, " Mã nhân viên không hợp lệ ^.^");
            return;
        };
        try {
            Lich lich = new Lich();
            lich.setMaMon(txtMaMon.getText().trim());
            lich.setMaNhanVien(txtMaNhanVien.getText().trim());
            lich.setTiet(cbxTiet.getSelectedItem().toString().trim());
            String ngay = cbxNgay.getSelectedItem().toString().trim();
            String thang = cbxThang.getSelectedItem().toString().trim();
            String nam = cbxNam.getSelectedItem().toString().trim();
            String date = nam + "-" + thang + "-" + ngay;
            lich.setNgay(date.trim());

            reactGiangDay react = new reactGiangDay();
            if (!react.checkMaMon(txtMaMon.getText())) {
                JOptionPane.showMessageDialog(this, "Mã Môn không tồn tại ^.^");
                return;
            }
            if (JOptionPane.showConfirmDialog(this, "Lịch dạy sẽ được thêm vào", "Warning!", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
                return;
            }
            for (Lich l : react.danhSachLich()) {
                if (lich.equals(l)) {
                    JOptionPane.showMessageDialog(this, "Đã tồn tại lịch ^.^");
                    return;
                }
                if ((react.timDiaDiemHocPhan(txtMaMon.getText().toString()).equals(l.getDiadiem())) && (lich.getNgay().equals(l.getNgay()) && ((lich.getTiet().contains(l.getTiet())) || (l.getTiet().contains(lich.getTiet()))))) {
                    JOptionPane.showMessageDialog(this, "Địa điểm đã được đăng ký, hãy nhập lại ^.^");
                    return;
                }
            }
            String tiet = cbxTiet.getSelectedItem().toString();
            int sotiet = (tiet.length() / 2) + 1;

            react.insert(lich);
            JOptionPane.showMessageDialog(this, "Đã thêm Lịch dạy vào cơ sở dữ liệu ^.^");
            react.capNhatLuong(sotiet, txtMaNhanVien.getText().toString().trim());
            loadToTableLich();
            Refesh();

        } catch (SQLException s) {
            if (s.getMessage().contains("The INSERT statement conflicted with the FOREIGN KEY constraint \"FK_LICH_HOCPHAN\"")) {
                JOptionPane.showMessageDialog(this, "Học phần không tồn tại, hãy nhập chính xác ^.^ ");
            }
            if (s.getMessage().contains("The INSERT statement conflicted with the FOREIGN KEY constraint \"FK_LICH_NHANVIEN\"")) {
                JOptionPane.showMessageDialog(this, "Nhân sự không tồn tại, hãy nhập chính xác ^.^ ");
            }
            if (s.getMessage().contains("Conversion failed when converting date")) {
                JOptionPane.showMessageDialog(this, "Ngày không tồn tại, vui lòng nhập lại!");
            }
            s.printStackTrace();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void timLichTheoMaMon(String maHocPhan) {
        try {
            String[] title = {"Tên giảng viên", "Tên học phần", "Ngày học", "Tiết học", "Địa điểm",};
            DefaultTableModel tblModel = new DefaultTableModel(title, 0);
            tblLich.setModel(tblModel);
            Connection con = new ConnectDB().getCn();
            String sql = "select NgayHoc,TenMon,TenNhanVien,hocphan.TietHoc,HOCPHAN.DiaDiem from lich inner join hocphan on lich.MaMon = hocphan.MaMon \n"
                    + "inner join nhanvien on lich.manhanvien = nhanvien.manhanvien where hocphan.mamon=?";

            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, maHocPhan);
            ResultSet rs = pstm.executeQuery();

            tblModel.setRowCount(0);
            while (rs.next()) {
                String[] row = new String[]{rs.getString("tennhanvien").trim(), rs.getString("tenMon").trim(), rs.getString("ngayhoc").trim(), rs.getString("tiethoc"), rs.getString("diadiem")};
                tblModel.addRow(row);
            }
            if (tblModel.getRowCount() == 0) {
                if (!txtTenMon.getText().equals("")) {
                    timLichTheoTenMon(txtTenMon.getText().toString());
                } else {
                    timLichTheoMaNhanVien(txtMaNhanVien.getText().toString());
                }
            }
            tblModel.fireTableDataChanged();
            tblLich.setAutoCreateRowSorter(true);
            //tblHocPhan.getColumnModel().getColumn(0).setPreferredWidth(20);
            rs.close();
            pstm.close();
            con.close();
        } catch (Exception e) {
            Logger.getLogger(QLKhoa.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    private void timLichTheoTenMon(String tenCanTim) {
        try {
            String[] title = {"Tên giảng viên", "Tên học phần", "Ngày học", "Tiết học", "Địa điểm",};
            DefaultTableModel tblModel = new DefaultTableModel(title, 0);
            tblLich.setModel(tblModel);
            Connection con = new ConnectDB().getCn();
            String sql = "select NgayHoc,TenMon,TenNhanVien,hocphan.TietHoc,HOCPHAN.DiaDiem from lich inner join hocphan on lich.MaMon = hocphan.MaMon inner join nhanvien on lich.manhanvien = nhanvien.manhanvien where hocphan.tenmon LIKE N'%" + tenCanTim + "%%'";

            PreparedStatement pstm = con.prepareStatement(sql);

            ResultSet rs = pstm.executeQuery();
            tblModel.setRowCount(0);
            while (rs.next()) {
                String[] row = new String[]{rs.getString("tennhanvien").trim(), rs.getString("tenMon").trim(), rs.getString("ngayhoc").trim(), rs.getString("tiethoc"), rs.getString("diadiem")};
                tblModel.addRow(row);
            }
            if (tblModel.getRowCount() == 0) {
                timLichTheoMaNhanVien(txtMaNhanVien.getText().toString());
            }
            tblModel.fireTableDataChanged();
            tblLich.setAutoCreateRowSorter(true);
            //tblHocPhan.getColumnModel().getColumn(0).setPreferredWidth(20);
            rs.close();
            pstm.close();
        } catch (Exception e) {
            Logger.getLogger(QLKhoa.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    private void timLichTheoMaNhanVien(String maNhanvien) {
        try {
            String[] title = {"Tên giảng viên", "Tên học phần", "Ngày học", "Tiết học", "Địa điểm",};
            DefaultTableModel tblModel = new DefaultTableModel(title, 0);
            tblLich.setModel(tblModel);
            String sql = "select NgayHoc,TenMon,TenNhanVien,hocphan.TietHoc,HOCPHAN.DiaDiem from lich inner join hocphan on lich.MaMon = hocphan.MaMon \n"
                    + "inner join nhanvien on lich.manhanvien = nhanvien.manhanvien where nhanvien.manhanvien=?";

            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, maNhanvien);
            ResultSet rs = pstm.executeQuery();

            tblModel.setRowCount(0);
            while (rs.next()) {
                String[] row = new String[]{rs.getString("tennhanvien").trim(), rs.getString("tenMon").trim(), rs.getString("ngayhoc").trim(), rs.getString("tiethoc"), rs.getString("diadiem")};
                tblModel.addRow(row);
            }
            if (tblModel.getRowCount() == 0) {
                if (txtTenNhanVien.getText().equals("")) {
                    timLichTheoNgay(cbxNam.getSelectedItem().toString() + "-" + cbxThang.getSelectedItem().toString() + "-" + cbxNgay.getSelectedItem().toString());
                } else {
                    timLichTheoTenNhanVien(txtTenNhanVien.getText().toString());
                }
            }
            tblModel.fireTableDataChanged();
            tblLich.setAutoCreateRowSorter(true);
            //tblHocPhan.getColumnModel().getColumn(0).setPreferredWidth(20);
            rs.close();
            pstm.close();
        } catch (Exception e) {
            Logger.getLogger(QLKhoa.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    private void timLichTheoTenNhanVien(String tenNVCanTim) {
        try {

            String[] title = {"Tên giảng viên", "Tên học phần", "Ngày học", "Tiết học", "Địa điểm",};
            DefaultTableModel tblModel = new DefaultTableModel(title, 0);
            tblLich.setModel(tblModel);

            String sql = "select NgayHoc,TenMon,TenNhanVien,hocphan.TietHoc,HOCPHAN.DiaDiem from lich inner join hocphan on lich.MaMon = hocphan.MaMon inner join nhanvien on lich.manhanvien = nhanvien.manhanvien where nhanvien.tennhanvien LIKE N'%" + tenNVCanTim + "%%' ";

            PreparedStatement pstm = con.prepareStatement(sql);

            ResultSet rs = pstm.executeQuery();

            tblModel.setRowCount(0);

            while (rs.next()) {
                String[] row = new String[]{rs.getString("tennhanvien").trim(), rs.getString("tenMon").trim(), rs.getString("ngayhoc").trim(), rs.getString("tiethoc"), rs.getString("diadiem")};
                tblModel.addRow(row);
            }
            if (tblModel.getRowCount() == 0) {
                if (!txtTenNhanVien.getText().equals("")) {
                    timLichTheoNgay(cbxNam.getSelectedItem().toString() + "-" + cbxThang.getSelectedItem().toString() + "-" + cbxNgay.getSelectedItem().toString());
                } else {
                    JOptionPane.showMessageDialog(this, "Không tìm thấy lịch tương ứng");
                }
            }
            tblModel.fireTableDataChanged();
            tblLich.setAutoCreateRowSorter(true);
            //tblHocPhan.getColumnModel().getColumn(0).setPreferredWidth(20);
            rs.close();
            pstm.close();
        } catch (Exception e) {
            Logger.getLogger(QLKhoa.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    private void timLichTheoNgay(String timNgay) {
        try {
            String[] title = {"Tên giảng viên", "Tên học phần", "Ngày học", "Tiết học", "Địa điểm",};
            DefaultTableModel tblModel = new DefaultTableModel(title, 0);
            tblLich.setModel(tblModel);
            String sql = "select NgayHoc,TenMon,TenNhanVien,hocphan.TietHoc,HOCPHAN.DiaDiem from lich inner join hocphan on lich.MaMon = hocphan.MaMon inner join nhanvien on lich.manhanvien = nhanvien.manhanvien where lich.ngayhoc LIKE '%" + timNgay + "%%' ";

            PreparedStatement pstm = con.prepareStatement(sql);

            ResultSet rs = pstm.executeQuery();

            tblModel.setRowCount(0);
            while (rs.next()) {
                String[] row = new String[]{rs.getString("tennhanvien").trim(), rs.getString("tenMon").trim(), rs.getString("ngayhoc").trim(), rs.getString("tiethoc"), rs.getString("diadiem")};
                tblModel.addRow(row);
            }
            if (tblModel.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy lịch tương ứng");
            }
            tblModel.fireTableDataChanged();
            tblLich.setAutoCreateRowSorter(true);
            //tblHocPhan.getColumnModel().getColumn(0).setPreferredWidth(20);
            rs.close();
            pstm.close();
        } catch (Exception e) {
            Logger.getLogger(QLKhoa.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    public void exportExcel(JTable table) throws IOException {
        try {
            HSSFWorkbook wb = new HSSFWorkbook();

            HSSFSheet sheet = wb.createSheet("sheet1");

            DefaultTableModel model = (DefaultTableModel) table.getModel();
            int rowNum = 0;
            Row row = sheet.createRow(rowNum);
            Cell cell;

            HSSFFont font = wb.createFont();
            font.setBold(true);

            CellStyle cs = wb.createCellStyle();
            cs.setFont(font);

            row = sheet.createRow(2);
            for (int j = 0; j < table.getColumnCount(); j++) {

                cell = row.createCell(j + 5);
                cell.setCellValue(model.getColumnName(j));
                sheet.autoSizeColumn(j + 5);
                cell.setCellStyle(cs);
            }
            for (int j = 0; j < table.getRowCount(); j++) {
                row = sheet.createRow(j + 3);
                for (int k = 0; k < table.getColumnCount(); k++) {
                    cell = row.createCell(k + 5);
                    cell.setCellValue((String) model.getValueAt(j, k));
                }
            }

            JFileChooser chooser = new JFileChooser();
            int i = chooser.showSaveDialog(chooser);
            if (i == JFileChooser.APPROVE_OPTION) {
                File file = chooser.getSelectedFile();
                OutputStream fileOut = new FileOutputStream(file + ".xls");
                wb.write(fileOut);
                fileOut.close();
                wb.close();
                JOptionPane.showConfirmDialog(this, "Đã ưu file thành công!","Thành công",JOptionPane.CLOSED_OPTION);
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(this, "Thất bài", "Lỗi!", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void Refesh() {
        txtMaMon.setText("");
        txtTenMon.setText("");
        txtMaNhanVien.setText("");
        txtTenNhanVien.setText("");
        cbxTiet.setSelectedIndex(0);
//        cbxNgay.setSelectedItem("25");
//        cbxThang.setSelectedItem("06");
//        cbxNam.setSelectedItem("2000");
    }

    private void loadToTableHocPhan() {
        try {
            String[] title = {"Mã học phần", "Tên học phần", "Thứ", "Tiết học", "Ngày bắt đầu", "Ngày kết thúc", "Địa điểm"};
            DefaultTableModel tblModel = new DefaultTableModel(title, 0);
            tblHocPhan.setModel(tblModel);
            Connection con = new ConnectDB().getCn();
            String sql = "select * from HOCPHAN";
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            tblModel.setRowCount(0);
            while (rs.next()) {
                String[] row = new String[]{rs.getString("MaMon").trim(), rs.getString("TenMon").trim(), rs.getString("Thu"), rs.getString("TietHoc"), rs.getString("NgayBatDau"), rs.getString("NgayKetThuc"), rs.getString("DiaDiem")};
                tblModel.addRow(row);
            }
            tblModel.fireTableDataChanged();
            tblHocPhan.setAutoCreateRowSorter(true);
            //tblHocPhan.getColumnModel().getColumn(0).setPreferredWidth(20);
            rs.close();
            pstm.close();
            con.close();
        } catch (Exception e) {
            Logger.getLogger(QLKhoa.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void loadToTableLich() {
        try {
            String[] title = {"Tên giảng viên", "Tên học phần", "Ngày học", "Tiết học", "Địa điểm",};
            DefaultTableModel tblModel = new DefaultTableModel(title, 0);
            tblLich.setModel(tblModel);
            Connection con = new ConnectDB().getCn();
            String sql = "select NgayHoc,TenMon,TenNhanVien,hocphan.TietHoc,HOCPHAN.DiaDiem from lich inner join hocphan on lich.MaMon = hocphan.MaMon \n"
                    + "inner join nhanvien on lich.manhanvien = nhanvien.manhanvien";
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();

            tblModel.setRowCount(0);
            while (rs.next()) {
                String[] row = new String[]{rs.getString("tennhanvien").trim(), rs.getString("tenMon").trim(), rs.getString("ngayhoc").trim(), rs.getString("tiethoc"), rs.getString("diadiem")};
                tblModel.addRow(row);
            }
            tblModel.fireTableDataChanged();
            tblLich.setAutoCreateRowSorter(true);
            //tblHocPhan.getColumnModel().getColumn(0).setPreferredWidth(20);
            rs.close();
            pstm.close();
            con.close();
        } catch (Exception e) {
            Logger.getLogger(QLKhoa.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LichDay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInfile;
    private javax.swing.JButton btnRefesh;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JComboBox<String> cbxNam;
    private javax.swing.JComboBox<String> cbxNgay;
    private javax.swing.JComboBox<String> cbxThang;
    private javax.swing.JComboBox<String> cbxTiet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblMaMon;
    private javax.swing.JLabel lblSoTiet;
    private javax.swing.JTable tblHocPhan;
    private javax.swing.JTable tblLich;
    private javax.swing.JTextField txtMaMon;
    private javax.swing.JTextField txtMaNhanVien;
    private javax.swing.JTextField txtTenMon;
    private javax.swing.JTextField txtTenNhanVien;
    // End of variables declaration//GEN-END:variables
}
