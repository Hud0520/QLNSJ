package QLKhoa;

import Util.ConnectDB;
import Util.Khoa;
import java.awt.HeadlessException;
import java.sql.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class QLKhoa extends javax.swing.JFrame {
    Connection con = new ConnectDB().getCn();
    public QLKhoa() {
        initComponents();
        loadToTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnlThongTinKhoa = new javax.swing.JPanel();
        lblMaKhoa = new javax.swing.JLabel();
        ltlTenKhoa = new javax.swing.JLabel();
        ltlTruongKhoa = new javax.swing.JLabel();
        lblNgayThanhLap = new javax.swing.JLabel();
        txtTenKhoa = new javax.swing.JTextField();
        txtMaKhoa = new javax.swing.JTextField();
        txtTruongKhoa = new javax.swing.JTextField();
        txtNgayThanhLap = new javax.swing.JTextField();
        lblDiaChi = new javax.swing.JLabel();
        txtWebsite = new javax.swing.JTextField();
        lblDienThoai = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblWebsite = new javax.swing.JLabel();
        txtDienThoai = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        cbxDiaChi = new javax.swing.JComboBox<>();
        pblChucNang = new javax.swing.JPanel();
        btnRefesh = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDanhSachKhoa = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlThongTinKhoa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Th??ng tin khoa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        lblMaKhoa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMaKhoa.setText("M?? Khoa");

        ltlTenKhoa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ltlTenKhoa.setText("T??n Khoa");

        ltlTruongKhoa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ltlTruongKhoa.setText("Tr?????ng Khoa");

        lblNgayThanhLap.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNgayThanhLap.setText("Ng??y th??nh l???p");

        txtTenKhoa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtMaKhoa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtTruongKhoa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtNgayThanhLap.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblDiaChi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDiaChi.setText("?????a ch???");

        txtWebsite.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblDienThoai.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDienThoai.setText("??i???n tho???i");

        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEmail.setText("Email");

        lblWebsite.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblWebsite.setText("Website");
        lblWebsite.setToolTipText("");

        txtDienThoai.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtEmail.setToolTipText("");

        cbxDiaChi.setEditable(true);
        cbxDiaChi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "T???ng 4, Nh?? A1", "T???ng 7, Nh?? A1", "T???ng 10, Nh?? A1", "T???ng 11, Nh?? A1", "T???ng 12, Nh?? A1", "T???ng 13, Nh?? A1", "T???ng 14, Nh?? A1", "T???ng 15, Nh?? A1", "T???ng 16, Nh?? A1", "T???ng 1, Nh?? A10", "T???ng 2, Nh?? A10", "T???ng 3, Nh?? A10", "T???ng 1, Nh?? A10", "T???ng 10, Nh?? A1" }));

        javax.swing.GroupLayout pnlThongTinKhoaLayout = new javax.swing.GroupLayout(pnlThongTinKhoa);
        pnlThongTinKhoa.setLayout(pnlThongTinKhoaLayout);
        pnlThongTinKhoaLayout.setHorizontalGroup(
            pnlThongTinKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinKhoaLayout.createSequentialGroup()
                .addGroup(pnlThongTinKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlThongTinKhoaLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(pnlThongTinKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ltlTenKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMaKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlThongTinKhoaLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(pnlThongTinKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNgayThanhLap)
                            .addComponent(ltlTruongKhoa))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlThongTinKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTenKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTruongKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgayThanhLap, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(pnlThongTinKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblWebsite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlThongTinKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtWebsite, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnlThongTinKhoaLayout.setVerticalGroup(
            pnlThongTinKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinKhoaLayout.createSequentialGroup()
                .addGroup(pnlThongTinKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlThongTinKhoaLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(pnlThongTinKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaKhoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMaKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlThongTinKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ltlTenKhoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTenKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlThongTinKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ltlTruongKhoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTruongKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlThongTinKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNgayThanhLap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNgayThanhLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlThongTinKhoaLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlThongTinKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblWebsite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtWebsite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40))
        );

        lblMaKhoa.getAccessibleContext().setAccessibleDescription("");

        pblChucNang.setBorder(javax.swing.BorderFactory.createTitledBorder("Ch???c n??ng"));

        btnRefesh.setBackground(new java.awt.Color(255, 255, 255));
        btnRefesh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRefesh.setIcon(new javax.swing.ImageIcon("D:\\New folder\\New folder (3)\\QLNSJ-main\\BTL\\src\\Util\\Icon\\Refresh.png")); // NOI18N
        btnRefesh.setText("Refesh");
        btnRefesh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefeshActionPerformed(evt);
            }
        });

        btnThem.setBackground(new java.awt.Color(255, 255, 255));
        btnThem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon("D:\\New folder\\New folder (3)\\QLNSJ-main\\BTL\\src\\Util\\Icon\\Add.png")); // NOI18N
        btnThem.setText("Th??m");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(255, 255, 255));
        btnXoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon("D:\\New folder\\New folder (3)\\QLNSJ-main\\BTL\\src\\Util\\Icon\\Delete.png")); // NOI18N
        btnXoa.setText("Xo??");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnTimKiem.setBackground(new java.awt.Color(255, 255, 255));
        btnTimKiem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTimKiem.setIcon(new javax.swing.ImageIcon("D:\\New folder\\New folder (3)\\QLNSJ-main\\BTL\\src\\Util\\Icon\\Search.png")); // NOI18N
        btnTimKiem.setText("T??m ki???m");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(255, 255, 255));
        btnSua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon("D:\\New folder\\New folder (3)\\QLNSJ-main\\BTL\\src\\Util\\Icon\\Edit.png")); // NOI18N
        btnSua.setText("S???a");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pblChucNangLayout = new javax.swing.GroupLayout(pblChucNang);
        pblChucNang.setLayout(pblChucNangLayout);
        pblChucNangLayout.setHorizontalGroup(
            pblChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pblChucNangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pblChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pblChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                .addGap(10, 10, 10))
            .addGroup(pblChucNangLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(btnRefesh, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pblChucNangLayout.setVerticalGroup(
            pblChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pblChucNangLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(pblChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua))
                .addGap(18, 18, 18)
                .addGroup(pblChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa)
                    .addComponent(btnTimKiem))
                .addGap(18, 18, 18)
                .addComponent(btnRefesh)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh s??ch khoa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        tblDanhSachKhoa.setAutoCreateRowSorter(true);
        tblDanhSachKhoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "M?? Khoa", "T??n Khoa", "Tr?????ng Khoa", "Ng??y th??nh l???p", "?????a ch???", "??i???n Tho???i", "Email", "Website"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDanhSachKhoa.setPreferredSize(new java.awt.Dimension(300, 600));
        tblDanhSachKhoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cellKhoaClick(evt);
            }
        });
        jScrollPane2.setViewportView(tblDanhSachKhoa);
        if (tblDanhSachKhoa.getColumnModel().getColumnCount() > 0) {
            tblDanhSachKhoa.getColumnModel().getColumn(0).setResizable(false);
            tblDanhSachKhoa.getColumnModel().getColumn(1).setResizable(false);
            tblDanhSachKhoa.getColumnModel().getColumn(2).setResizable(false);
            tblDanhSachKhoa.getColumnModel().getColumn(3).setResizable(false);
            tblDanhSachKhoa.getColumnModel().getColumn(4).setResizable(false);
            tblDanhSachKhoa.getColumnModel().getColumn(5).setResizable(false);
            tblDanhSachKhoa.getColumnModel().getColumn(6).setResizable(false);
            tblDanhSachKhoa.getColumnModel().getColumn(7).setResizable(false);
        }

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 911, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Qu???n l?? khoa");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 366, 0, 304);
        jPanel1.add(jLabel1, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 962, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(pnlThongTinKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pblChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlThongTinKhoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pblChucNang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        themKhoa();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        timKhoa();
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        suaKhoa();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        xoaKhoa();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnRefeshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefeshActionPerformed
        xoaTrang();
        loadToTable();
    }//GEN-LAST:event_btnRefeshActionPerformed

    private void cellKhoaClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cellKhoaClick
        int row = tblDanhSachKhoa.getSelectedRow();
        txtMaKhoa.setText(tblDanhSachKhoa.getValueAt(row, 0).toString());
        txtTenKhoa.setText(tblDanhSachKhoa.getValueAt(row, 1).toString());
        txtTruongKhoa.setText(tblDanhSachKhoa.getValueAt(row, 2).toString());
        txtNgayThanhLap.setText(tblDanhSachKhoa.getValueAt(row, 3).toString());
        txtDienThoai.setText(tblDanhSachKhoa.getValueAt(row, 5).toString().trim());
        txtEmail.setText(tblDanhSachKhoa.getValueAt(row, 6).toString().trim());
        txtWebsite.setText(tblDanhSachKhoa.getValueAt(row, 7).toString().trim());
        //cbxDiaChi.setEditable(true);
        String diachi= tblDanhSachKhoa.getValueAt(row, 4).toString().trim();
        cbxDiaChi.setSelectedItem(diachi);
        
    }//GEN-LAST:event_cellKhoaClick

    private boolean checkInput() throws HeadlessException {
        if (!Pattern.matches("[K][H]\\d{2,}", txtMaKhoa.getText())) {
            JOptionPane.showMessageDialog(this, " M?? khoa kh??ng h???p l??? ^.^");
            return true;
        } else if (!Pattern.matches("\\d{4}[-]\\d{2}[-]\\d{2}", txtNgayThanhLap.getText())) {
            JOptionPane.showMessageDialog(this, "Vui l??ng nh???p ng??y th??ng n??m theo ?????nh dang yyyy-mm-dd ^.^");
            return true;
        } else if (!Pattern.matches("[0]\\d{9}", txtDienThoai.getText())) {
            JOptionPane.showMessageDialog(this, "??i???n tho???i kh??ng h???p l??? ^.^");
            return true;
        } else if (!Pattern.matches("\\w{1,}[@][g][m][a][i][l][.][c][o][m]", txtEmail.getText())) {
            JOptionPane.showMessageDialog(this, "Email kh??ng h???p l??? ^.^");
            return true;
        }
        return false;
    }
    private boolean checkNull() throws HeadlessException {
        if (txtMaKhoa.getText().trim().equals("")) {
            JOptionPane.showConfirmDialog(this, "M?? khoa kh??ng ???????c ????? tr???ng", "Warning!", JOptionPane.CLOSED_OPTION);
            return true;
        }
        if (txtTenKhoa.getText().trim().equals("")) {
            JOptionPane.showConfirmDialog(this, "T??n khoa kh??ng ???????c ????? tr???ng", "Warning!", JOptionPane.CLOSED_OPTION);
            return true;
        }
        if (txtTruongKhoa.getText().trim().equals("")) {
            JOptionPane.showConfirmDialog(this, "Tr?????ng khoa kh??ng ???????c ????? tr???ng", "Warning!", JOptionPane.CLOSED_OPTION);
            return true;
        }
        if (txtNgayThanhLap.getText().trim().equals("")) {
            JOptionPane.showConfirmDialog(this, "Ng??y th??nh l???p kh??ng ???????c ????? tr???ng", "Warning!", JOptionPane.CLOSED_OPTION);
            return true;
        }
        return false;
    }

    public boolean checkTenKhoa(String tenKhoa) {
        try {
            
            String sql = "select tenkhoa from KHOA";
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                if (rs.getString("TenKhoa").equals(tenKhoa)) {
                    JOptionPane.showMessageDialog(this, "T??n khoa ???? t???n t???i!");
                    return true;
                }
            }
        } catch (Exception e) {
            Logger.getLogger(QLKhoa.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    public boolean checkMaKhoa(String ma) {
        try {
            
            String sql = "select makhoa from KHOA";
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                if (rs.getString("MaKhoa").contains(ma)) {
                    JOptionPane.showMessageDialog(this, "M?? khoa ???? t???n t???i!");
                    return true;
                }
            }
        } catch (Exception e) {
            Logger.getLogger(QLKhoa.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }
    public void themKhoa() {
        if (checkNull()) {
            return;
        }
        if (checkInput()) return;        
        try {
            Khoa khoa = new Khoa();
            khoa.setMaKhoa(txtMaKhoa.getText().trim());
            khoa.setTenKhoa(txtTenKhoa.getText());
            khoa.setTruongKhoa(txtTruongKhoa.getText().trim());
            khoa.setNgayThanhLap(txtNgayThanhLap.getText());            
            khoa.setDiaChi(cbxDiaChi.getSelectedItem().toString());
            khoa.setDienThoai(txtDienThoai.getText());
            khoa.setEmail(txtEmail.getText());
            khoa.setWebsite(txtWebsite.getText());
            if (checkMaKhoa(txtMaKhoa.getText().trim())) {
                return;
            }
            if (checkTenKhoa(txtTenKhoa.getText().trim())) {
                return;
            }
            if (JOptionPane.showConfirmDialog(this, "Khoa s??? ???????c th??m v??o!", "Warning!", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
                return;
            }
            reactKhoa react = new reactKhoa();
            react.insert(khoa);
            loadToTable();
            xoaTrang();
            JOptionPane.showMessageDialog(this, "???? th??m khoa v??o c?? s??? d??? li???u ^.^");
        } catch (SQLException s) {
            if (s.getMessage().contains("Violation of PRIMARY KEY constraint 'PK_KHOA'")) {
                JOptionPane.showMessageDialog(this, "M?? Khoa ???? t???n t???i trong c?? s??? d??? li???u");
            }
            if (s.getMessage().contains("Conversion failed when converting date")) {
                JOptionPane.showMessageDialog(this, "Sai ?????nh d???ng ng??y: m???i nh???p n??m-th??ng-ng??y");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void xoaKhoa() {
        if (txtMaKhoa.getText().trim().equals("")) {
            JOptionPane.showConfirmDialog(this, "M?? khoa kh??ng ???????c ????? tr???ng", "Warning!", JOptionPane.CLOSED_OPTION);
            return;
        }
        try {
            Khoa khoa = new Khoa();
            khoa.setMaKhoa((txtMaKhoa.getText().trim()));
            if (JOptionPane.showConfirmDialog(this, "Khoa s??? xo??, kh??ng th??? ho??n t??c?", "Warning!", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
                return;
            }
            reactKhoa react = new reactKhoa();
            react.xoa(khoa);
            xoaTrang();
            loadToTable();
            JOptionPane.showMessageDialog(this, "Khoa ???? ???????c xo?? ^.^");
        } catch (SQLException s) {
            if (s.getMessage().contains("The DELETE statement conflicted with the REFERENCE constraint")) {
                JOptionPane.showMessageDialog(this, "Kh??ng th??? xo?? khoa, h??y xo?? h???t nh??n vi??n trong khoa tr?????c khi xo?? khoa!");
            }          
        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void suaKhoa() {
        if (checkNull()) {
            return;
        }
        try {
            Khoa khoa = new Khoa();
            khoa.setMaKhoa((txtMaKhoa.getText()));
            khoa.setTenKhoa(txtTenKhoa.getText());
            khoa.setTruongKhoa(txtTruongKhoa.getText());
            khoa.setNgayThanhLap(txtNgayThanhLap.getText());
            khoa.setDiaChi(cbxDiaChi.getSelectedItem().toString());
            khoa.setDienThoai(txtDienThoai.getText());
            khoa.setEmail(txtEmail.getText());
            khoa.setWebsite(txtWebsite.getText());

            if (JOptionPane.showConfirmDialog(this, "Khoa s??? ???????c c???p nh???t!", "Warning!", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
                return;
            }
            reactKhoa react = new reactKhoa();
            react.sua(khoa);
            loadToTable();
            JOptionPane.showMessageDialog(this, "Khoa ???? ???????c c???p nh???t ^.^");

        } catch (SQLException s) {
            if (s.getMessage().contains("Conversion failed when converting date")) {
                JOptionPane.showMessageDialog(this, "Sai ?????nh d???ng ng??y: m???i nh???p n??m-th??ng-ng??y");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void timKhoa() {
        if ((txtMaKhoa.getText().equals("")) && (txtTenKhoa.getText().equals(""))) {
            JOptionPane.showMessageDialog(this, "Nh???p m?? khoa ho???c t??n khoa c???n t??m?");
            return;
        }
        try {
            reactKhoa react = new reactKhoa();
            Khoa khoa = react.timKhoaTheoMa(txtMaKhoa.getText());
            Khoa khoa1 = react.timKhoaTheoTen(txtTenKhoa.getText());
            if (khoa != null) {
                txtTenKhoa.setText(khoa.getTenKhoa());
                txtTruongKhoa.setText(khoa.getTruongKhoa());
                txtNgayThanhLap.setText(khoa.getNgayThanhLap());
                txtDienThoai.setText(khoa.getDienThoai().trim());
                txtEmail.setText(khoa.getEmail().trim());
                txtWebsite.setText(khoa.getWebsite().trim());
                cbxDiaChi.setEditable(true);
                cbxDiaChi.getEditor().setItem(khoa.getDiaChi());

                tblDanhSachKhoa.removeAll();
                String[] title = {"M?? khoa", "T??n khoa", "Tr?????ng khoa", "Ng??y th??nh l???p", "?????a ch???", "??i???n tho???i", "Email", "Website"};
                DefaultTableModel tblModel = new DefaultTableModel(title, 0);
                tblDanhSachKhoa.setModel(tblModel);
                String[] row = new String[]{khoa.getMaKhoa().trim(), khoa.getTenKhoa().trim(), khoa.getTruongKhoa(), khoa.getNgayThanhLap(), khoa.getDiaChi().trim(), khoa.getDienThoai().trim(), khoa.getEmail().trim(), khoa.getWebsite().trim()};
                tblModel.addRow(row);
                tblDanhSachKhoa.getColumnModel().getColumn(0).setPreferredWidth(20);
                tblModel.fireTableDataChanged();

            } else if (khoa1 != null) {
                txtTenKhoa.setText(khoa1.getTenKhoa());
                txtTruongKhoa.setText(khoa1.getTruongKhoa());
                txtNgayThanhLap.setText(khoa1.getNgayThanhLap());
                txtDienThoai.setText(khoa1.getDienThoai().trim());
                txtEmail.setText(khoa1.getEmail().trim());
                txtWebsite.setText(khoa1.getWebsite().trim());
                cbxDiaChi.setEditable(true);
                cbxDiaChi.getEditor().setItem(khoa1.getDiaChi());

                tblDanhSachKhoa.removeAll();
                String[] title = {"M?? khoa", "T??n khoa", "Tr?????ng khoa", "Ng??y th??nh l???p", "?????a ch???", "??i???n tho???i", "Email", "Website"};
                DefaultTableModel tblModel = new DefaultTableModel(title, 0);
                tblDanhSachKhoa.setModel(tblModel);
                String[] row = new String[]{khoa1.getMaKhoa().trim(), khoa1.getTenKhoa().trim(), khoa1.getTruongKhoa(), khoa1.getNgayThanhLap(), khoa1.getDiaChi().trim(), khoa1.getDienThoai().trim(), khoa1.getEmail().trim(), khoa1.getWebsite().trim()};
                tblModel.addRow(row);
                tblDanhSachKhoa.getColumnModel().getColumn(0).setPreferredWidth(20);
                tblModel.fireTableDataChanged();
                
            } else {
                JOptionPane.showMessageDialog(this, "Kh??ng t??m th???y khoa!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            e.printStackTrace();
        }
        tblDanhSachKhoa.getSelectedRow();
    }

    public void xoaTrang() {
        txtMaKhoa.setText("");
        txtTenKhoa.setText("");
        txtTruongKhoa.setText("");
        txtNgayThanhLap.setText("");
        cbxDiaChi.setSelectedIndex(0);
        txtDienThoai.setText("");
        txtEmail.setText("");
        txtWebsite.setText("");
        txtMaKhoa.requestFocus();
    }

    

    private void loadToTable() {
        try {
            String[] title = {"M?? khoa", "T??n khoa", "Tr?????ng khoa", "Ng??y th??nh l???p", "?????a ch???", "??i???n tho???i", "Email", "Website"};
            DefaultTableModel tblModel = new DefaultTableModel(title, 0);
            tblDanhSachKhoa.setModel(tblModel);
            //tblDanhSachKhoa.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer());
            Connection con = new ConnectDB().getCn();
            String sql = "select * from KHOA";
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            tblModel.setRowCount(0);
            while (rs.next()) {
                String[] row = new String[]{rs.getString("MaKhoa").trim(), rs.getString("TenKhoa").trim(), rs.getString("TruongKhoa"), rs.getString("NgayThanhLap"), rs.getString("DiaChi"), rs.getString("DienThoai"), rs.getString("Email"), rs.getString("Website")};
                tblModel.addRow(row);
            }
            tblModel.fireTableDataChanged();
            tblDanhSachKhoa.setAutoCreateRowSorter(true);
            tblDanhSachKhoa.getColumnModel().getColumn(0).setPreferredWidth(20);
            rs.close();
            pstm.close();
            con.close();
        } catch (Exception e) {
            Logger.getLogger(QLKhoa.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QLKhoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLKhoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLKhoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLKhoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLKhoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefesh;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbxDiaChi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblDienThoai;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblMaKhoa;
    private javax.swing.JLabel lblNgayThanhLap;
    private javax.swing.JLabel lblWebsite;
    private javax.swing.JLabel ltlTenKhoa;
    private javax.swing.JLabel ltlTruongKhoa;
    private javax.swing.JPanel pblChucNang;
    private javax.swing.JPanel pnlThongTinKhoa;
    private javax.swing.JTable tblDanhSachKhoa;
    private javax.swing.JTextField txtDienThoai;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaKhoa;
    private javax.swing.JTextField txtNgayThanhLap;
    private javax.swing.JTextField txtTenKhoa;
    private javax.swing.JTextField txtTruongKhoa;
    private javax.swing.JTextField txtWebsite;
    // End of variables declaration//GEN-END:variables
}
