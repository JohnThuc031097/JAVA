package qlcafe.Main;

import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import qlcafe.db.dbqlCafe;

public class frmMenu extends javax.swing.JFrame {
    
    private dbqlCafe cnSQL;
    private String user;
    private JOptionPane msgTT;
    private int maTC = 1;
    private int MaOrder = 1;
    
    public frmMenu(dbqlCafe cn, String user) {
        this.cnSQL = cn;
        this.user = user;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnNhanVien = new javax.swing.JButton();
        btnTTCTDAU = new javax.swing.JButton();
        btnQTC = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaOrder = new javax.swing.JTextField();
        cmbLoai = new javax.swing.JComboBox<>();
        cmbTDA = new javax.swing.JComboBox<>();
        txtSoLuong = new javax.swing.JTextField();
        lblDU = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblGiaBan = new javax.swing.JLabel();
        btnXuatOrder = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuMaTC = new javax.swing.JMenu();
        menuIDangXuat = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Phần mềm quản lí quán cafe");
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

        btnNhanVien.setBackground(new java.awt.Color(255, 255, 255));
        btnNhanVien.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnNhanVien.setText("Nhân Viên");
        btnNhanVien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });

        btnTTCTDAU.setBackground(new java.awt.Color(255, 255, 255));
        btnTTCTDAU.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnTTCTDAU.setText("TTCT đồ ăn uống");
        btnTTCTDAU.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTTCTDAU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTTCTDAUActionPerformed(evt);
            }
        });

        btnQTC.setBackground(new java.awt.Color(255, 255, 255));
        btnQTC.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnQTC.setText("Quyền Truy Cập");
        btnQTC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQTCActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Mã Order");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Order Khách Hàng");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Loại");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Tên đồ uống");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("Số lượng");

        txtMaOrder.setEditable(false);
        txtMaOrder.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtMaOrder.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cmbLoai.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLoaiActionPerformed(evt);
            }
        });

        cmbTDA.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbTDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTDAActionPerformed(evt);
            }
        });

        txtSoLuong.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtSoLuong.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSoLuong.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSoLuongKeyTyped(evt);
            }
        });

        lblDU.setBackground(new java.awt.Color(255, 255, 255));
        lblDU.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblDU.setForeground(new java.awt.Color(0, 0, 51));
        lblDU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDU.setIcon(new javax.swing.ImageIcon("D:\\IT\\15CĐ-TP2\\Project-Java\\QLCafe\\dist\\lobby-cafe.jpg")); // NOI18N
        lblDU.setToolTipText("");
        lblDU.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("Giá");

        lblGiaBan.setBackground(new java.awt.Color(255, 255, 255));
        lblGiaBan.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblGiaBan.setForeground(new java.awt.Color(102, 0, 153));
        lblGiaBan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnXuatOrder.setBackground(new java.awt.Color(255, 255, 255));
        btnXuatOrder.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnXuatOrder.setForeground(new java.awt.Color(51, 0, 204));
        btnXuatOrder.setText("In Order");
        btnXuatOrder.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnXuatOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatOrderActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("VNĐ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDU, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmbLoai, javax.swing.GroupLayout.Alignment.LEADING, 0, 155, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtMaOrder))
                            .addComponent(cmbTDA, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnXuatOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap(149, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(105, 105, 105)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(lblDU, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtMaOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(lblGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cmbLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cmbTDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnXuatOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel2)
                    .addContainerGap(443, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnNhanVien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTTCTDAU, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQTC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTTCTDAU, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQTC, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menuIDangXuat.setText("Đăng xuất");
        menuIDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuIDangXuatActionPerformed(evt);
            }
        });
        menuMaTC.add(menuIDangXuat);

        jMenuBar1.add(menuMaTC);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Load MaTC and MaOrder
        menuMaTC.setText("[ "+this.user+ " ]");
        txtMaOrder.setText(String.valueOf(MaOrder));
        
        // Load MucDoTC
        String strSQL = "Select MucDoTC From QuyenTruyCap Where ";
        ResultSet result = cnSQL.dbQuery(strSQL+"MaTC='"+this.user+"'", "");
        if(result != null){
            try {
                while(result.next()){
                    this.maTC = result.getInt(1);
                }               
            } catch (SQLException ex) {
                Logger.getLogger(frmCapQuyen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        // Load Order [Loai]
        strSQL = "Select TENLOAIDAU From LOAIDAU";
        result = cnSQL.dbQuery(strSQL, "MALOAIDAU");
        if(result != null){
            try {
                while(result.next()){
                    cmbLoai.addItem(result.getString(1));
                }               
            } catch (SQLException ex) {
                Logger.getLogger(frmCapQuyen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cnSQL.dbDisconnect();
        this.dispose();
        frmDangNhap DN = new frmDangNhap();
        DN.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void btnQTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQTCActionPerformed
        if(maTC == 3){       
            this.dispose();
            frmCapQuyen QTC = new frmCapQuyen(this.cnSQL, this.user);
            QTC.setVisible(true);
        }else{
            msgTT.showMessageDialog(null, "Bạn không đủ quyền truy cập úng dụng này", "Cảnh báo", 2);  
        }              
    }//GEN-LAST:event_btnQTCActionPerformed

    private void menuIDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuIDangXuatActionPerformed
        int result = msgTT.showConfirmDialog(null, "Bạn thực sự muốn đăng xuất ?", "Đăng xuất", 0, 3);
        if(result != 1){
            formWindowClosing(null);
        }
    }//GEN-LAST:event_menuIDangXuatActionPerformed

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
        if(maTC == 3){  
            this.dispose();
            frmNhanVien nhanvien = new frmNhanVien(this.cnSQL, this.user); 
            nhanvien.setVisible(true);   
        }else{
            msgTT.showMessageDialog(null, "Bạn không đủ quyền truy cập úng dụng này", "Cảnh báo", 2);  
        }  
    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnTTCTDAUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTTCTDAUActionPerformed
        if(maTC > 1){  
            this.dispose();
            frmDoAU DoAU = new frmDoAU(this.cnSQL, this.user); 
            DoAU.setVisible(true);   
        }else{
            msgTT.showMessageDialog(null, "Bạn không đủ quyền truy cập úng dụng này", "Cảnh báo", 2);  
        }         
    }//GEN-LAST:event_btnTTCTDAUActionPerformed

    private void cmbLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLoaiActionPerformed
        cmbTDA.removeAllItems();
        String strSQL = "Select TENDAU From CHITIETDAU Where ";
        ResultSet result = cnSQL.dbQuery(strSQL +"MALOAIDAU='"+(cmbLoai.getSelectedIndex()+1)+"'", "MADAU");
        if(result != null){
            try {
                while(result.next()){
                    cmbTDA.addItem(result.getString(1));
                }               
            } catch (SQLException ex) {
                Logger.getLogger(frmCapQuyen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_cmbLoaiActionPerformed

    private void cmbTDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTDAActionPerformed
        String strSQL = "Select DONGIA From CHITIETDAU Where ";
        ResultSet result = cnSQL.dbQuery(strSQL +"TENDAU=N'"+(cmbTDA.getSelectedItem())+"'", "");
        if(result != null){
            try {
                while(result.next()){
                    lblGiaBan.setText(result.getString(1));
                }               
            } catch (SQLException ex) {
                Logger.getLogger(frmCapQuyen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_cmbTDAActionPerformed

    private void txtSoLuongKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSoLuongKeyTyped
        char vchar = evt.getKeyChar();
        if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_txtSoLuongKeyTyped

    private void btnXuatOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatOrderActionPerformed
        if(txtSoLuong.getText().length() > 0){
            int sl = Integer.valueOf(txtSoLuong.getText());
            String strSQL = "Select SOLUONGTONKHO From CHITIETDAU Where ";
            ResultSet result = cnSQL.dbQuery(strSQL +"TENDAU=N'"+(cmbTDA.getSelectedItem())+"'", "");
            if(result != null){
                try {
                    while(result.next()){
                        if(result.getInt(1) >= Integer.valueOf(txtSoLuong.getText())){
                            frmHoaDon hoadon = new frmHoaDon(new Object[]{ 
                                            txtMaOrder.getText(),
                                            cmbTDA.getSelectedItem(),
                                            lblGiaBan.getText(),
                                            txtSoLuong.getText()                                           
                                        });
                            hoadon.setVisible(true);
                            int kq = cnSQL.dbQueryUpdate("CHITIETDAU", 
                                                        new Object[]{ "SOLUONGTONKHO="+(result.getInt(1)-sl) },
                                                       "TENDAU=N'"+(cmbTDA.getSelectedItem())+"'"
                                    );
                            if(kq != 0){
                                txtMaOrder.setText(String.valueOf(++MaOrder));
                                txtSoLuong.setText("");
                                cmbLoai.setSelectedIndex(0);
                                cmbTDA.setSelectedIndex(0);
                            }
                        }else{
                            msgTT.showMessageDialog(null, "Số lượng tồn kho không đủ đáp ứng", "Cảnh báo", 2); 
                        }
                    }               
                } catch (SQLException ex) {
                    Logger.getLogger(frmCapQuyen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }    
        }
    }//GEN-LAST:event_btnXuatOrderActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnQTC;
    private javax.swing.JButton btnTTCTDAU;
    private javax.swing.JButton btnXuatOrder;
    private javax.swing.JComboBox<String> cmbLoai;
    private javax.swing.JComboBox<String> cmbTDA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblDU;
    private javax.swing.JLabel lblGiaBan;
    private javax.swing.JMenuItem menuIDangXuat;
    private javax.swing.JMenu menuMaTC;
    private javax.swing.JTextField txtMaOrder;
    private javax.swing.JTextField txtSoLuong;
    // End of variables declaration//GEN-END:variables
}
