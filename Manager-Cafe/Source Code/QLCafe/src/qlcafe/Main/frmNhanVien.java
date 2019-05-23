package qlcafe.Main;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import qlcafe.db.dbqlCafe;

public class frmNhanVien extends javax.swing.JFrame {
    
    private dbqlCafe cnSQL;
    private String user;
    private DefaultTableModel tblNhanVien;
    private JOptionPane msg;
    private boolean isInsert, isUpdate;
    private String fileName;
    private Vector col;
    
    public frmNhanVien(dbqlCafe cn, String user) {
        this.cnSQL = cn;
        this.user = user;        
        initComponents();      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        txtTenNV = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        radNam = new javax.swing.JRadioButton();
        radNu = new javax.swing.JRadioButton();
        PnlAnh = new javax.swing.JPanel();
        btnHinh = new javax.swing.JButton();
        anh = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNV = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnReload = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnKLuu = new javax.swing.JButton();
        txtNgaySinh = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Số Điện Thoại");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("QUẢN LÝ NHÂN VIÊN");

        jLabel3.setText("Tên Nhân Viên");

        jLabel4.setText("Giới Tính");

        jLabel5.setText("Địa Chỉ");

        jLabel6.setText("Ngày Sinh");

        txtMaNV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMaNVKeyTyped(evt);
            }
        });

        txtTenNV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTenNVKeyTyped(evt);
            }
        });

        txtSDT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSDTKeyTyped(evt);
            }
        });

        buttonGroup1.add(radNam);
        radNam.setText("Nam");

        buttonGroup1.add(radNu);
        radNu.setText("Nữ");

        PnlAnh.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnHinh.setText("Chọn Hình");
        btnHinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHinhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlAnhLayout = new javax.swing.GroupLayout(PnlAnh);
        PnlAnh.setLayout(PnlAnhLayout);
        PnlAnhLayout.setHorizontalGroup(
            PnlAnhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnHinh, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
            .addComponent(anh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PnlAnhLayout.setVerticalGroup(
            PnlAnhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlAnhLayout.createSequentialGroup()
                .addComponent(anh, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tblNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Nhân Viên", "Tên Nhân Viên", "Giới Tính", "Ngày Sinh", "SĐT", "Địa Chỉ", "Hình"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNV);

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlcafe/Image/them.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlcafe/Image/Sua.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlcafe/Image/xoa.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlcafe/Image/thoat.png"))); // NOI18N
        btnThoat.setText("Thoat");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlcafe/Image/lammoi.png"))); // NOI18N
        btnReload.setText("Reload");
        btnReload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReloadActionPerformed(evt);
            }
        });

        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlcafe/Image/save_1.png"))); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        jLabel7.setText("Mã Nhân Viên");

        btnKLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlcafe/Image/Not Save.png"))); // NOI18N
        btnKLuu.setText("Không lưu");
        btnKLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKLuuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radNam)
                                .addGap(18, 18, 18)
                                .addComponent(radNu))
                            .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)))
                .addComponent(PnlAnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(btnReload, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(radNam)
                                        .addComponent(radNu)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(28, 28, 28))
                                            .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(8, 8, 8)
                                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(2, 2, 2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(PnlAnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReload, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        txtMaNV.setEnabled(false);
        txtTenNV.setEnabled(false);
        txtNgaySinh.setEnabled(false);
        txtDiaChi.setEnabled(false);
        txtSDT.setEnabled(false);
        btnLuu.setEnabled(false);
        btnKLuu.setEnabled(false);
        
        col = new Vector();
        col.addElement("Mã Nhân Viên");
        col.addElement("Tên Nhân Viên");
        col.addElement("Giới Tính");
        col.addElement("Ngày Sinh");
        col.addElement("SĐT");
        col.addElement("Địa Chỉ");
        col.addElement("Hình");
       
        
        msg = new JOptionPane();
        tblNhanVien = (DefaultTableModel) tblNV.getModel();
        String strSQL = "Select * From NhanVien";
        ResultSet result = cnSQL.dbQuery(strSQL, "TenNV");
        if(result != null){
            try {
                while(result.next()){
                    tblNhanVien.addRow(new Object[] { result.getString(1).trim(),
                                                      result.getString(2).trim(),
                                                      result.getString(3).trim(),
                                                      result.getDate(4),
                                                      result.getString(5).trim(),
                                                      result.getString(6).trim(),
                                                      result.getObject(7)
                                                    });
                }
            } catch (SQLException ex) {
                Logger.getLogger(frmNhanVien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            formWindowClosing(null);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        formWindowClosing(null);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();
        frmMenu menu = new frmMenu(cnSQL, user);
        menu.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void tblNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNVMouseClicked
        try{
            int index = tblNV.getSelectedRow();
            if(index != -1){
                txtMaNV.setText((String)tblNV.getValueAt(index, 0));
                txtTenNV.setText((String)tblNV.getValueAt(index, 1));
                if(tblNV.getValueAt(index, 2).equals("Nam"))
                    radNam.setSelected(true);
                else
                    radNu.setSelected(true);

                txtNgaySinh.setText(String.valueOf(tblNV.getValueAt(index, 3)));
                txtSDT.setText((String)tblNV.getValueAt(index, 4));
                txtDiaChi.setText((String)tblNV.getValueAt(index, 5)); 
                Object pathImg = tblNV.getValueAt(index, 6);
                if(pathImg == null)
                    setImage("");
                else
                    setImage((String)pathImg);
            }
        }catch(Exception ex){
            ex.getMessage();
        }
                    

    }//GEN-LAST:event_tblNVMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed

        isInsert = true;
        isUpdate = false;
        txtMaNV.setText("");
        txtTenNV.setText("");
        txtDiaChi.setText("");
        txtNgaySinh.setText("");
        txtSDT.setText("");
        radNam.setSelected(true);
        
        txtMaNV.setEnabled(true);
        txtTenNV.setEnabled(true);
        txtNgaySinh.setEnabled(true);
        txtDiaChi.setEnabled(true);
        txtSDT.setEnabled(true);
        btnLuu.setEnabled(true);
        btnKLuu.setEnabled(true);
        btnThem.setEnabled(false);
        btnSua.setEnabled(false);
        btnXoa.setEnabled(false);
        
       
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int index = tblNV.getSelectedRow();
        if(index != -1){
            int i = JOptionPane.showConfirmDialog(null,"Bạn Có Muốn Xóa Không ?","Xóa Hồ Sơ",JOptionPane.YES_NO_OPTION);
            if(i==JOptionPane.YES_OPTION){
                String ma = (String)tblNV.getValueAt(index,0);
                int rs = cnSQL.dbQueryDelete("NhanVien","MaNV='"+ma+"'");
                if(rs!=0){
                    JOptionPane.showMessageDialog(null,"Bạn Đã Xoá Nhân Viên Thành Công");
                    Loaddata();
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Bạn Chưa Chọn Dòng Xoá !");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnKLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKLuuActionPerformed
        txtMaNV.setEnabled(false);
        txtTenNV.setEnabled(false);
        txtNgaySinh.setEnabled(false);
        txtDiaChi.setEnabled(false);
        txtSDT.setEnabled(false);
        btnLuu.setEnabled(false);
        btnKLuu.setEnabled(false);
        btnThem.setEnabled(true);
        btnSua.setEnabled(true);
        btnXoa.setEnabled(true);
    }//GEN-LAST:event_btnKLuuActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        int index = tblNV.getSelectedRow();
        if(index == -1){
            JOptionPane.showMessageDialog(null, "Vui lòng chọn nhân viên !");
            Loaddata();
        }else{
            isUpdate=true;
            isInsert=false;
            txtMaNV.setEnabled(false);
            txtTenNV.setEnabled(true);
            txtNgaySinh.setEnabled(true);
            txtDiaChi.setEnabled(true);
            txtSDT.setEnabled(true);
            btnLuu.setEnabled(true);
            btnKLuu.setEnabled(true);
            btnThem.setEnabled(false);
            btnSua.setEnabled(false);
            btnXoa.setEnabled(false);            
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        if(isInsert){
            try{ 
                if(!txtMaNV.getText().trim().equals("") && !txtTenNV.getText().trim().equals("") && !txtDiaChi.getText().trim().equals("")
                        && !txtSDT.getText().trim().equals("") && !txtNgaySinh.getText().trim().equals("")){
                    if(!CheckMaSo(txtMaNV.getText())){
                        int rs = cnSQL.dbQueryInsert("NhanVien", new Object[]{
                                                                    "N'"+txtMaNV.getText()+"'",
                                                                    "N'"+txtTenNV.getText()+"'",
                                                                    (radNam.isSelected()?"N'Nam'":"N'Nữ'"),
                                                                    "'"+txtNgaySinh.getText()+"'",
                                                                    "'"+txtSDT.getText()+"'",
                                                                    "N'"+txtDiaChi.getText()+"'",
                                                                    "'"+fileName+"'"
                        });
                        if(rs != 0){
                            JOptionPane.showMessageDialog(null,"Thêm Nhân Viên Thành Công","Thông Báo",JOptionPane.INFORMATION_MESSAGE);
                            Loaddata();

                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Thêm Nhân Viên Thất bại","Thông Báo",JOptionPane.INFORMATION_MESSAGE);
                        }    
                    }else{
                        JOptionPane.showMessageDialog(null,"Mã nhân viên đã tồn tại","Thông Báo",JOptionPane.INFORMATION_MESSAGE);
                        txtMaNV.requestFocus();
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Vui Lòng Nhập Đầy Đủ Thông Tin","Thông Báo",JOptionPane.INFORMATION_MESSAGE);
                    txtMaNV.requestFocus();
                    Loaddata();
                }                         
            }catch(Exception ex){
                System.out.print("Error "+ex.getMessage());
            }
        }
        if(isUpdate){
            try{
                if(!txtTenNV.getText().trim().equals("") && !txtDiaChi.getText().trim().equals("")
                        && !txtSDT.getText().trim().equals("") && !txtNgaySinh.getText().trim().equals("")){
                    if(!CheckMaSo(txtMaNV.getText())){
                        
                    }
                int rs = cnSQL.dbQueryUpdate("NhanVien",
                                            new Object[]{   "MaNV=N'"+txtMaNV.getText()+"'",
                                                            "TenNV=N'"+txtTenNV.getText()+"'",
                                                            "GioiTinh="+(radNam.isSelected()?"N'Nam'":"N'Nữ'"),
                                                            "NgaySinh='"+txtNgaySinh.getText()+"'",
                                                            "SDT='"+txtSDT.getText()+"'",
                                                            "DiaChi=N'"+txtDiaChi.getText()+"'",
                                                            "Hinh='"+fileName+"'"},
                                            "MaNV='"+(txtMaNV.getText())+"'");
                    if(rs!=0){                     
                        JOptionPane.showMessageDialog(null,"Sửa Nhân Viên Thành Công","Thông Báo",JOptionPane.INFORMATION_MESSAGE);
                        btnReloadActionPerformed(null);
                    }else{
                        JOptionPane.showMessageDialog(null,"Sửa Nhân Viên Thất bại","Thông Báo",JOptionPane.INFORMATION_MESSAGE);
                    }    
                }else{
                    JOptionPane.showMessageDialog(null,"Vui Lòng Nhập Đầy Đủ Thông Tin","Thông Báo",JOptionPane.INFORMATION_MESSAGE);
                }         
            }catch(Exception ex){
                System.out.print("Error "+ex.getMessage());
            }          
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnHinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHinhActionPerformed

        JFileChooser fileChooser = new JFileChooser();//hien bang chon file
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Images","jpg","png");//loc anh chi lay anh duoi png and jpg
                fileChooser.setFileFilter(filter);
                int i=fileChooser.showOpenDialog(null);
                //neu ta da lay 1 hinh anh thi no se thuc hien tiep
                if(i==JFileChooser.APPROVE_OPTION){
                    //lay file da chon
                    File file = fileChooser.getSelectedFile();
                    fileName = file.getAbsolutePath();//luu dg dan file dung de truy van sau nay
                    setImage(fileName);
                }
    }//GEN-LAST:event_btnHinhActionPerformed

    private void btnReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReloadActionPerformed
        Loaddata();
    }//GEN-LAST:event_btnReloadActionPerformed

    private void txtMaNVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaNVKeyTyped
        char vchar = evt.getKeyChar();
        if(!(Character.isDigit(vchar)) || 
            (vchar == KeyEvent.VK_BACK_SPACE) || 
            (vchar == KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_txtMaNVKeyTyped

    private void txtSDTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSDTKeyTyped
        char vchar = evt.getKeyChar();
        if(!(Character.isDigit(vchar)) || 
            (vchar == KeyEvent.VK_BACK_SPACE) || 
            (vchar == KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_txtSDTKeyTyped

    private void txtTenNVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenNVKeyTyped
        char vchar = evt.getKeyChar();
        if((Character.isDigit(vchar)) || 
            (vchar == KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_txtTenNVKeyTyped
    
    private boolean CheckMaSo(String MSNV){        
        String sql ="SELECT MaNV FROM NhanVien";
        ResultSet rs = cnSQL.dbQuery(sql,"MaNV");
        try{
            while(rs.next()){
                if(rs.getString(1).trim().equals(MSNV))
                    return true;
            }
        }catch(Exception ex){
            System.out.println("Error "+ex.getMessage());
        }
        return false;
    }
    private void setImage(String path){
        if(path.equals("")) {
            anh.setIcon(null);
            return;
        };
        File file = new File(path);
        try{
            BufferedImage bi = ImageIO.read(file);
            ImageIcon icon = new ImageIcon(new ImageIcon(bi).getImage().getScaledInstance(anh.getWidth(),anh.getHeight()-15,Image.SCALE_DEFAULT));
            anh.setIcon(icon);
        }catch (IOException e1){}
    }
    private void Loaddata(){
            txtMaNV.setText("");
            txtTenNV.setText("");
            txtDiaChi.setText("");
            txtSDT.setText("");
            txtNgaySinh.setText("");
            radNam.setSelected(true);//cai radio chon nam mac dinh
            //
            txtMaNV.disable();
            txtDiaChi.disable();
            txtNgaySinh.setEnabled(false);
            txtTenNV.disable();;
            txtSDT.disable();
            btnSua.setEnabled(true);
            btnThem.setEnabled(true);
            btnXoa.setEnabled(true);
            btnLuu.setEnabled(false);
            btnKLuu.setEnabled(false);
            isInsert= false;
            isUpdate=false;
      
            //StackOverFlow
            //Basically, it depends on the TableModel that you are using for your JTable. 
            //If you are using the DefaultTableModel then you can do it in two way
            DefaultTableModel dm = (DefaultTableModel)tblNV.getModel();
            dm.getDataVector().removeAllElements();
            dm.fireTableDataChanged();//// notifies the JTable that the model has changed
            String strSQL = "Select * From NhanVien";
            ResultSet result = cnSQL.dbQuery(strSQL, "TenNV");
            if(result != null){
                
                try {
                    int index = 0;
                    while(result.next()){
                        tblNhanVien.addRow(new Object[] { result.getString(1).trim(),
                                                          result.getString(2).trim(),
                                                          result.getString(3).trim(),
                                                          result.getDate(4),
                                                          result.getString(5).trim(),
                                                          result.getString(6).trim(),
                                                          result.getObject(7)
                                                        });
                        index++;
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(frmNhanVien.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                formWindowClosing(null);
            }
        }
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new frmNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlAnh;
    private javax.swing.JLabel anh;
    private javax.swing.JButton btnHinh;
    private javax.swing.JButton btnKLuu;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnReload;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radNam;
    private javax.swing.JRadioButton radNu;
    private javax.swing.JTable tblNV;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenNV;
    // End of variables declaration//GEN-END:variables
}
