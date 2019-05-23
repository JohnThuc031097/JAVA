package qlcafe.Main;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import qlcafe.db.dbqlCafe;


public class frmCapQuyen extends javax.swing.JFrame {
    
    private dbqlCafe cnSQL;
    private JOptionPane msgTT;
    private String user;
    private JFrame frmM;
    
    public frmCapQuyen(dbqlCafe cnSQL, String user) {
        this.cnSQL = cnSQL;
        this.user = user;
        msgTT = new JOptionPane();  
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbMucDTC = new javax.swing.JComboBox<>();
        cmbMaNV = new javax.swing.JComboBox<>();
        txtMatKhau = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTenNV = new javax.swing.JTextField();
        txtMaTC = new javax.swing.JTextField();
        btnHuyQuyen = new javax.swing.JButton();
        btnCapQuyen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Cấp Quyền Truy Cập");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel2.setText("Mã nhân viên");

        jLabel3.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel3.setText("Mức độ truy cập");

        jLabel4.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel4.setText("Mật khẩu");

        cmbMucDTC.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cmbMucDTC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        cmbMucDTC.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cmbMaNV.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cmbMaNV.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cmbMaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMaNVActionPerformed(evt);
            }
        });

        txtMatKhau.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel5.setText("Mã truy cập");

        jLabel6.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel6.setText("Tên nhân viên");

        txtTenNV.setEditable(false);
        txtTenNV.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N

        txtMaTC.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N

        btnHuyQuyen.setBackground(new java.awt.Color(255, 255, 255));
        btnHuyQuyen.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        btnHuyQuyen.setForeground(new java.awt.Color(255, 51, 51));
        btnHuyQuyen.setText("Hủy quyền");
        btnHuyQuyen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        btnHuyQuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyQuyenActionPerformed(evt);
            }
        });

        btnCapQuyen.setBackground(new java.awt.Color(255, 255, 255));
        btnCapQuyen.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        btnCapQuyen.setForeground(new java.awt.Color(204, 20, 240));
        btnCapQuyen.setText("Cấp quyền");
        btnCapQuyen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        btnCapQuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapQuyenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(cmbMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtTenNV))
                            .addComponent(jLabel6))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbMucDTC, 0, 110, Short.MAX_VALUE)
                            .addComponent(txtMaTC)
                            .addComponent(txtMatKhau))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnHuyQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCapQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtMaTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cmbMucDTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHuyQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();
        frmMenu Menu = new frmMenu(cnSQL, user);
        Menu.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        String strSQL = "Select MaNV From NhanVien";
        ResultSet tblNhanVien = cnSQL.dbQuery(strSQL, "MaNV");
        if(tblNhanVien != null){
            try {
                while(tblNhanVien.next()){
                    cmbMaNV.addItem(tblNhanVien.getString(1));
                }
            } catch (SQLException ex) {
                Logger.getLogger(frmCapQuyen.class.getName()).log(Level.SEVERE, null, ex);
                formWindowClosing(null);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void cmbMaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMaNVActionPerformed
        // Duyệt table Nhân Viên
        String strSQL = "Select TenNV From NhanVien Where MaNV=";
        ResultSet tblNhanVien = cnSQL.dbQuery(strSQL +"'"+ cmbMaNV.getSelectedItem() +"'", "");
        if(tblNhanVien != null){
            try {                
                while(tblNhanVien.next()){
                    txtTenNV.setText(tblNhanVien.getString(1).trim());
                }
            } catch (SQLException ex) {
                Logger.getLogger(frmCapQuyen.class.getName()).log(Level.SEVERE, null, ex);
                formWindowClosing(null);
            }
        }
        
        // Duyệt table QuyenTruyCap
        txtMaTC.setText("");
        txtMatKhau.setText("");
        cmbMucDTC.setSelectedIndex(0);
        strSQL = "Select MaTC, MucDoTC, MatKhau From QuyenTruyCap Where MaNV=";
        ResultSet tblQTC = cnSQL.dbQuery(strSQL +"'"+ cmbMaNV.getSelectedItem() +"'", "");
        if(tblQTC != null){
            try {                
                while(tblQTC.next()){
                    txtMaTC.setText(tblQTC.getString(1).trim());
                    cmbMucDTC.setSelectedItem(tblQTC.getString(2).trim());
                    txtMatKhau.setText(tblQTC.getString(3).trim());
                }
            } catch (SQLException ex) {
                Logger.getLogger(frmCapQuyen.class.getName()).log(Level.SEVERE, null, ex);
                formWindowClosing(null);
            }
        }
    }//GEN-LAST:event_cmbMaNVActionPerformed

    private void btnCapQuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapQuyenActionPerformed
        if(!txtMaTC.getText().trim().equals("") && !txtMatKhau.getText().trim().equals("")){
            Object[] data = new Object[] { "MaTC='"+txtMaTC.getText()+"'",
                                           "MaNV='"+cmbMaNV.getSelectedItem()+"'",
                                           "MucDoTC='"+cmbMucDTC.getSelectedItem()+"'",
                                           "MatKhau='"+txtMatKhau.getText()+"'"};
            if(cnSQL.dbQueryUpdate("QuyenTruyCap", data, "MaNV='"+cmbMaNV.getSelectedItem()+"'") != 0){
                msgTT.showMessageDialog(null, "Cấp quyền thành công", "Thông báo", 1);
            }else{
                data = new Object[] { "'"+txtMaTC.getText()+"'",
                                      "'"+cmbMaNV.getSelectedItem()+"'",                                     
                                      "'"+cmbMucDTC.getSelectedItem()+"'",
                                      "'"+txtMatKhau.getText()+"'"};
                if(cnSQL.dbQueryInsert("QuyenTruyCap", data) != 0){               
                    msgTT.showMessageDialog(null, "Cấp quyền thành công", "Thông báo", 1);
                }else{
                    msgTT.showMessageDialog(null, "Cấp quyền thất bại", "Thông báo", 0);
                }              
            }           
        }
    }//GEN-LAST:event_btnCapQuyenActionPerformed

    private void btnHuyQuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyQuyenActionPerformed
        if(cnSQL.dbQueryDelete("QuyenTruyCap", "MaNV='"+cmbMaNV.getSelectedItem()+"'") != 0){
            msgTT.showMessageDialog(null, "Hủy quyền thành công", "Thông báo", 1);
            txtMaTC.setText("");
            txtMatKhau.setText("");
        }else{
            msgTT.showMessageDialog(null, "Hủy quyền thất bại", "Thông báo", 0);
        }
    }//GEN-LAST:event_btnHuyQuyenActionPerformed
  
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmCapQuyen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCapQuyen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCapQuyen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCapQuyen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new frmCapQuyen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapQuyen;
    private javax.swing.JButton btnHuyQuyen;
    private javax.swing.JComboBox<String> cmbMaNV;
    private javax.swing.JComboBox<String> cmbMucDTC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtMaTC;
    private javax.swing.JTextField txtMatKhau;
    private javax.swing.JTextField txtTenNV;
    // End of variables declaration//GEN-END:variables
}
