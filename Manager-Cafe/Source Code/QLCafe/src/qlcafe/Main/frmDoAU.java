package qlcafe.Main;

import java.awt.Color;
import java.awt.List;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import qlcafe.db.dbqlCafe;

public class frmDoAU extends javax.swing.JFrame {

    private dbqlCafe cnSQL;
    private String user;
    private int themsua;

    public frmDoAU(dbqlCafe cn, String user) {
        this.cnSQL = cn;
        this.user = user;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlThongTinChiTietDAU = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        pnlChiTietDAU = new java.awt.Panel();
        lblTitleTTCT = new javax.swing.JLabel();
        pnlBnt = new javax.swing.JPanel();
        btnThemCT = new javax.swing.JButton();
        btnXoaCT = new javax.swing.JButton();
        btnSuaCT = new javax.swing.JButton();
        pnlSuaXoa = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblChiTietDAU = new javax.swing.JTable();
        pnlLoaiDAU = new java.awt.Panel();
        lblTitleLoai = new javax.swing.JLabel();
        btnThemLoai = new javax.swing.JButton();
        lblLoai = new javax.swing.JLabel();
        cbbLoai = new javax.swing.JComboBox<>();
        lblLoaiMoi = new javax.swing.JLabel();
        btnXoaLoai = new javax.swing.JButton();
        txtLoaiMoi = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THÔNG TIN CHI TIẾT ĐỒ ĂN UỐNG");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblTitleTTCT.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblTitleTTCT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleTTCT.setText("THÔNG TIN CHI TIẾT ĐỒ ĂN UỐNG");
        lblTitleTTCT.setToolTipText("");

        btnThemCT.setText("THÊM");
        btnThemCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemCTActionPerformed(evt);
            }
        });

        btnXoaCT.setText("XÓA");
        btnXoaCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaCTActionPerformed(evt);
            }
        });

        btnSuaCT.setText("SỮA");
        btnSuaCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaCTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBntLayout = new javax.swing.GroupLayout(pnlBnt);
        pnlBnt.setLayout(pnlBntLayout);
        pnlBntLayout.setHorizontalGroup(
            pnlBntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBntLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnThemCT, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnXoaCT, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSuaCT, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlBntLayout.setVerticalGroup(
            pnlBntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBntLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSuaCT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlBntLayout.createSequentialGroup()
                        .addGroup(pnlBntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnXoaCT)
                            .addComponent(btnThemCT))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tblChiTietDAU.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblChiTietDAU);

        javax.swing.GroupLayout pnlSuaXoaLayout = new javax.swing.GroupLayout(pnlSuaXoa);
        pnlSuaXoa.setLayout(pnlSuaXoaLayout);
        pnlSuaXoaLayout.setHorizontalGroup(
            pnlSuaXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSuaXoaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        pnlSuaXoaLayout.setVerticalGroup(
            pnlSuaXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSuaXoaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlChiTietDAULayout = new javax.swing.GroupLayout(pnlChiTietDAU);
        pnlChiTietDAU.setLayout(pnlChiTietDAULayout);
        pnlChiTietDAULayout.setHorizontalGroup(
            pnlChiTietDAULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChiTietDAULayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlChiTietDAULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlSuaXoa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlBnt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTitleTTCT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlChiTietDAULayout.setVerticalGroup(
            pnlChiTietDAULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlChiTietDAULayout.createSequentialGroup()
                .addComponent(lblTitleTTCT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlBnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlSuaXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblTitleLoai.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblTitleLoai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleLoai.setText("LOẠI ĐỒ ĂN UỐNG");

        btnThemLoai.setText("THÊM LOẠI");
        btnThemLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemLoaiActionPerformed(evt);
            }
        });

        lblLoai.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        lblLoai.setText("LOAI:");

        cbbLoai.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbbLoai.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cbbLoaiPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cbbLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbLoaiActionPerformed(evt);
            }
        });

        lblLoaiMoi.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        lblLoaiMoi.setText("NHẬP LOẠI MỚI");

        btnXoaLoai.setText("XÓA LOẠI");
        btnXoaLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaLoaiActionPerformed(evt);
            }
        });

        txtLoaiMoi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLoaiMoiKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlLoaiDAULayout = new javax.swing.GroupLayout(pnlLoaiDAU);
        pnlLoaiDAU.setLayout(pnlLoaiDAULayout);
        pnlLoaiDAULayout.setHorizontalGroup(
            pnlLoaiDAULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoaiDAULayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLoaiDAULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitleLoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLoaiMoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlLoaiDAULayout.createSequentialGroup()
                        .addGroup(pnlLoaiDAULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlLoaiDAULayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblLoai)
                                .addGap(18, 18, 18)
                                .addComponent(cbbLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlLoaiDAULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnXoaLoai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnThemLoai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
                            .addComponent(txtLoaiMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 17, Short.MAX_VALUE))))
        );
        pnlLoaiDAULayout.setVerticalGroup(
            pnlLoaiDAULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoaiDAULayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitleLoai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlLoaiDAULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLoai)
                    .addComponent(cbbLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblLoaiMoi)
                .addGap(18, 18, 18)
                .addComponent(txtLoaiMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(btnThemLoai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXoaLoai)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlThongTinChiTietDAULayout = new javax.swing.GroupLayout(pnlThongTinChiTietDAU);
        pnlThongTinChiTietDAU.setLayout(pnlThongTinChiTietDAULayout);
        pnlThongTinChiTietDAULayout.setHorizontalGroup(
            pnlThongTinChiTietDAULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlThongTinChiTietDAULayout.createSequentialGroup()
                .addGroup(pnlThongTinChiTietDAULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlThongTinChiTietDAULayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(pnlLoaiDAU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlChiTietDAU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlThongTinChiTietDAULayout.setVerticalGroup(
            pnlThongTinChiTietDAULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinChiTietDAULayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(pnlThongTinChiTietDAULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlChiTietDAU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlLoaiDAU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlThongTinChiTietDAU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlThongTinChiTietDAU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        txtLoaiMoi.setVisible(false);
        lblLoaiMoi.setVisible(false);
        pnlSuaXoa.setVisible(true);
        LoadCmbLoai();
        cbbLoai.setSelectedIndex(0);
        LoadCTDAU(cbbLoai.getSelectedItem().toString());
    }//GEN-LAST:event_formWindowOpened
    
    private boolean CheckMaSo(String MS){        
        String sql ="SELECT TENLOAIDAU FROM LOAIDAU";
        ResultSet rs = cnSQL.dbQuery(sql,"");
        try{
            while(rs.next())    {
                if(rs.getString(1).trim().equals(MS))
                    return true;
            }
        }catch(Exception ex){
            System.out.println("Loi "+ex.getMessage());
        }
        return false;
    }
    
    private void LoadCmbLoai(){
        String strSQL = "Select TENLOAIDAU From LOAIDAU";
        ResultSet tblDAU = cnSQL.dbQuery(strSQL, "MALOAIDAU");
        if (tblDAU != null) {
            try {
                while (tblDAU.next()) {
                    cbbLoai.addItem(tblDAU.getString(1));    
                }              
            } catch (SQLException ex) {
                Logger.getLogger(frmCapQuyen.class.getName()).log(Level.SEVERE, null, ex);
                formWindowClosing(null);
            }
        }
    }
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();
        frmMenu Menu = new frmMenu(cnSQL, user);
        Menu.setVisible(true);
    }//GEN-LAST:event_formWindowClosing
    
    private void LoadCTDAU(String a){
        String strSQL = "SELECT dbo.CHITIETDAU.* FROM dbo.LOAIDAU, dbo.CHITIETDAU WHERE dbo.LOAIDAU.TENLOAIDAU = N'"+a+"' AND dbo.LOAIDAU.MALOAIDAU= dbo.CHITIETDAU.MALOAIDAU";
        ResultSet rs = cnSQL.dbQuery(strSQL, "");
        String[] columns = {"Mã Đồ","Tên Đồ","Đơn Giá","Tồn Kho"};
        Vector rowData;
        DefaultTableModel dtm = new DefaultTableModel(columns, 0);
        if (rs != null)
        {
            dtm.setRowCount(0);
            try
            {
                while (rs.next())
                {
                    rowData = new Vector();
                    rowData.add(rs.getInt("MADAU"));
                    rowData.add(rs.getString("TENDAU"));
                    rowData.add(rs.getFloat("DONGIA"));
                    rowData.add(rs.getInt("SOLUONGTONKHO"));
                    dtm.addRow(rowData);
                }
                tblChiTietDAU.setModel(dtm);
            }

            catch (SQLException e1)
            {
                JOptionPane.showMessageDialog(pnlThongTinChiTietDAU, "Loi");
            }
        }
        this.setVisible(true);
    }
    
    private void cbbLoaiPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbbLoaiPopupMenuWillBecomeInvisible
        LoadCTDAU(cbbLoai.getSelectedItem().toString());
    }//GEN-LAST:event_cbbLoaiPopupMenuWillBecomeInvisible

    private void btnThemLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemLoaiActionPerformed
        lblLoai.setVisible(false);
        cbbLoai.setVisible(false);
        lblLoaiMoi.setVisible(true);
        txtLoaiMoi.setVisible(true);
        if(btnThemLoai.getText().equals("THÊM LOẠI"))
        {
            btnXoaLoai.setText("HỦY");
            btnThemLoai.setText("LƯU");
            lblTitleLoai.setText("THÊM LOẠI ĐỒ ĂN UỐNG");
            lblLoai.setVisible(false);
            cbbLoai.setVisible(false);
            lblLoaiMoi.setVisible(true);
            txtLoaiMoi.setVisible(true);
            pnlChiTietDAU.setEnabled(false);
        }
        else
        {
            if(txtLoaiMoi.getText().equals("")){
                
                JOptionPane msg = new JOptionPane();
                JOptionPane.showMessageDialog(pnlThongTinChiTietDAU,"Vui lòng điền tên loại!","Thông báo",1);
                txtLoaiMoi.setFocusable(true);
            }else
            {
                if(!CheckMaSo(txtLoaiMoi.getText()))
                {
                    btnThemLoai.setText("THÊM LOẠI");
                    btnXoaLoai.setText("XÓA LOẠI");
                    lblTitleLoai.setText("LOẠI ĐỒ ĂN UỐNG");
                    lblLoai.setVisible(true);
                    cbbLoai.setVisible(true);
                    lblLoaiMoi.setVisible(false);
                    txtLoaiMoi.setVisible(false);
                    btnXoaLoai.setVisible(true);
                    pnlChiTietDAU.setEnabled(true);
                
                    int rs=cnSQL.dbQueryInsert("dbo.LOAIDAU", new Object[]{"N'"+txtLoaiMoi.getText()+"'","1"});
                    if(rs!=0)
                    {
                        JOptionPane.showMessageDialog(pnlThongTinChiTietDAU, "Thêm thành công");
                        cbbLoai.removeAllItems();
                        LoadCmbLoai();
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(pnlThongTinChiTietDAU,"Loại này đả đã tồn tại","Thông Báo",JOptionPane.INFORMATION_MESSAGE);
                    txtLoaiMoi.requestFocus();
                }
            }
        }
    }//GEN-LAST:event_btnThemLoaiActionPerformed

    private void btnSuaCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaCTActionPerformed
        if(tblChiTietDAU.getSelectedRowCount()==0)
        {
            JOptionPane.showMessageDialog(pnlThongTinChiTietDAU, "Cần chọn sản phẩm muốn sửa trước.","Thông báo",1);
        }
        else
        {
            themsua = 2;
            int row = -1;
            row = tblChiTietDAU.getSelectedRow();
            if(row != -1)
            {
                String ma = tblChiTietDAU.getModel().getValueAt(row, 0).toString();
                String ten = tblChiTietDAU.getModel().getValueAt(row, 1).toString();
                String dongia = tblChiTietDAU.getModel().getValueAt(row, 2).toString();
                String soluong = tblChiTietDAU.getModel().getValueAt(row, 3).toString();

                this.dispose();      
                frmThemSuaDAU ThemSua = new frmThemSuaDAU(cnSQL, user,themsua,ma,ten,cbbLoai.getSelectedItem(),dongia,soluong);
                ThemSua.setVisible(true);
            }
        }

    }//GEN-LAST:event_btnSuaCTActionPerformed
    
    private void btnThemCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemCTActionPerformed
        themsua = 1;
        this.dispose();      
        frmThemSuaDAU ThemSua = new frmThemSuaDAU(cnSQL, user,themsua,null,null,cbbLoai.getSelectedItem(),null,null);
        ThemSua.setVisible(true); 
    }//GEN-LAST:event_btnThemCTActionPerformed

    private void btnXoaLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaLoaiActionPerformed
        if(btnXoaLoai.getText().equals("XÓA LOẠI"))
        {

            int rs=cnSQL.dbQueryDelete("dbo.LOAIDAU", "TENLOAIDAU='"+cbbLoai.getSelectedItem()+"'");
            if(rs!=0)
            {
                JOptionPane.showMessageDialog(pnlThongTinChiTietDAU, "Xóa thành công");
                cbbLoai.removeAllItems();
                LoadCmbLoai();
            }

            
        }
        else
        {
            btnThemLoai.setText("THÊM LOẠI");
            btnXoaLoai.setText("XÓA LOẠI");
            lblTitleLoai.setText("LOẠI ĐỒ ĂN UỐNG");
            lblLoai.setVisible(true);
            cbbLoai.setVisible(true);
            lblLoaiMoi.setVisible(false);
            txtLoaiMoi.setVisible(false);
            btnXoaLoai.setVisible(true);
            pnlChiTietDAU.setEnabled(true);
        }
    }//GEN-LAST:event_btnXoaLoaiActionPerformed

    private void btnXoaCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaCTActionPerformed
        if(tblChiTietDAU.getSelectedRowCount()==0)
        {
            JOptionPane.showMessageDialog(pnlThongTinChiTietDAU, "Cần chọn sản phẩm muốn xóa trước.","Thông báo",1);
        }
        else
        {
            int row = -1;
            row = tblChiTietDAU.getSelectedRow();
            if(row != -1)
            {
                String ma = tblChiTietDAU.getModel().getValueAt(row, 0).toString();
                int rs=cnSQL.dbQueryDelete("CHITIETDAU", "MADAU='"+ma+"'");
                if(rs!=0)
                {
                    LoadCTDAU(cbbLoai.getSelectedItem().toString());
                    JOptionPane.showMessageDialog(pnlThongTinChiTietDAU, "Xóa thành công");
                }
            }
        }
    }//GEN-LAST:event_btnXoaCTActionPerformed

    private void txtLoaiMoiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoaiMoiKeyTyped
        char vchar = evt.getKeyChar();
        if((Character.isDigit(vchar)) || 
            (vchar == KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_txtLoaiMoiKeyTyped

    private void cbbLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbLoaiActionPerformed
        //LoadCTDAU((String)cbbLoai.getSelectedItem());
    }//GEN-LAST:event_cbbLoaiActionPerformed
       
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new frmDoAU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSuaCT;
    private javax.swing.JButton btnThemCT;
    private javax.swing.JButton btnThemLoai;
    private javax.swing.JButton btnXoaCT;
    private javax.swing.JButton btnXoaLoai;
    private javax.swing.JComboBox<String> cbbLoai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLoai;
    private javax.swing.JLabel lblLoaiMoi;
    private javax.swing.JLabel lblTitleLoai;
    private javax.swing.JLabel lblTitleTTCT;
    private javax.swing.JPanel pnlBnt;
    private java.awt.Panel pnlChiTietDAU;
    private java.awt.Panel pnlLoaiDAU;
    private javax.swing.JPanel pnlSuaXoa;
    private java.awt.Panel pnlThongTinChiTietDAU;
    private javax.swing.JTable tblChiTietDAU;
    private javax.swing.JTextField txtLoaiMoi;
    // End of variables declaration//GEN-END:variables
}
