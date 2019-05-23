package qlcafe.Main;

import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import qlcafe.db.dbqlCafe;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class frmThemSuaDAU extends javax.swing.JFrame {
    private dbqlCafe cnSQL;
    private String user,madau,dongia,soluongtonkho,tendau;
    private int themsua;
    private Object loaidau;
    
    JOptionPane msg = new JOptionPane();
    
    public frmThemSuaDAU(dbqlCafe cn, String user,int themsua,String madau,String tendau, Object loaidau, String dongia, String soluongtonkho) {
        this.cnSQL = cn;
        this.user = user;
        this.themsua=themsua;
        this.madau = madau;
        this.tendau = tendau;
        this.loaidau=loaidau;
        this.dongia=dongia;
        this.soluongtonkho=soluongtonkho;
        initComponents();
    }

    private void LoadCmbLoai()
    {
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlThemSua = new javax.swing.JPanel();
        lblLoaiMoi = new javax.swing.JLabel();
        lblLoaiMoi1 = new javax.swing.JLabel();
        lblLoaiMoi2 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        txtDonGia = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        lblThemSua = new javax.swing.JLabel();
        lblLoai = new javax.swing.JLabel();
        cbbLoai = new javax.swing.JComboBox<>();
        btnThoat = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblLoaiMoi.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        lblLoaiMoi.setText("SỐ LƯỢNG TỒN KHO:");

        lblLoaiMoi1.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        lblLoaiMoi1.setText("ĐƠN GIÁ:");

        lblLoaiMoi2.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        lblLoaiMoi2.setText("TÊN ĐỒ ĂN, UỐNG:");

        txtTen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTenKeyTyped(evt);
            }
        });

        txtDonGia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDonGiaKeyTyped(evt);
            }
        });

        txtSoLuong.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSoLuongKeyTyped(evt);
            }
        });

        lblThemSua.setFont(new java.awt.Font("Courier New", 1, 30)); // NOI18N
        lblThemSua.setForeground(new java.awt.Color(51, 51, 255));
        lblThemSua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThemSua.setText("Thêm sửa đồ ăn, uống");
        lblThemSua.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblLoai.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        lblLoai.setText("LOẠI:");

        btnThoat.setText("THOÁT");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnThem.setText("THÊM");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlThemSuaLayout = new javax.swing.GroupLayout(pnlThemSua);
        pnlThemSua.setLayout(pnlThemSuaLayout);
        pnlThemSuaLayout.setHorizontalGroup(
            pnlThemSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThemSuaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlThemSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblThemSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlThemSuaLayout.createSequentialGroup()
                        .addGroup(pnlThemSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblLoai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblLoaiMoi2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblLoaiMoi1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblLoaiMoi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                        .addGap(51, 51, 51)
                        .addGroup(pnlThemSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTen)
                            .addComponent(txtSoLuong)
                            .addComponent(txtDonGia)
                            .addComponent(cbbLoai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlThemSuaLayout.createSequentialGroup()
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlThemSuaLayout.setVerticalGroup(
            pnlThemSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThemSuaLayout.createSequentialGroup()
                .addComponent(lblThemSua, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlThemSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLoaiMoi2)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(pnlThemSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLoaiMoi)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(pnlThemSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLoaiMoi1)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlThemSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLoai)
                    .addComponent(cbbLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlThemSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThoat)
                    .addComponent(btnThem))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlThemSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlThemSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private boolean CheckMaSo(String ms){        
        String sql ="SELECT TENDAU FROM CHITIETDAU";
        ResultSet rs = cnSQL.dbQuery(sql,"");
        try{
            while(rs.next()){
                if(rs.getString(1).trim().equals(ms))
                    return true;
            }
        }catch(Exception ex){
            System.out.println("Error "+ex.getMessage());
        }
        return false;
    }
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();
        frmDoAU frm = new frmDoAU(cnSQL, user);
        frm.setVisible(true);
    }//GEN-LAST:event_formWindowClosing
    int KiemTra()
{
        if(txtTen.getText().equals(""))
        {
            msg.showMessageDialog(pnlThemSua,"Vui lòng điền tên!");
            return -1;
        }
        else if (txtSoLuong.getText().equals(""))
        {
            msg.showMessageDialog(pnlThemSua,"Vui lòng điền số lượng!");
            return -1;
        }
        else if (txtDonGia.getText().equals(""))
        {
            msg.showMessageDialog(pnlThemSua,"Vui lòng điền số giá!");
            return -1;
        }
        else
            return 1;
        
    }
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if(btnThem.getText().equals("THÊM"))
        {
            if(KiemTra()==1)
            {
                if(!CheckMaSo(txtTen.getText()))
                {
                    String loai = "";
                    String strSQL = "Select MALOAIDAU From LOAIDAU where TENLOAIDAU = N'"+cbbLoai.getSelectedItem()+"'";
                    ResultSet tblCTDAU = cnSQL.dbQuery(strSQL, "");

                    if(tblCTDAU != null){
                        try {
                            while(tblCTDAU.next()){
                                loai = tblCTDAU.getString(1).trim();
                            }
                        } catch (SQLException ex) {
                            msg.showMessageDialog(pnlThemSua, "Gán loại thất bại", "Thông báo", 1);
                        }
                    }else{
                        msg.showMessageDialog(pnlThemSua, "Không kết nối", "Thóng báo", 1);
                    }
                    String strSQLa = "INSERT INTO dbo.CHITIETDAU (TENDAU ,MALOAIDAU ,DONGIA ,SOLUONGTONKHO, HIEN) VALUES"+ "("
                            + "N'"+txtTen.getText()+"',"+loai+","+txtDonGia.getText()+","+txtSoLuong.getText()+","+"'1')";
                    try
                    {
                        ResultSet rs = cnSQL.dbQuery(strSQLa, "");
                        msg.showMessageDialog(pnlThemSua, "Thêm thanh cong", "Thóng báo", 1);
                        this.dispose();      
                        frmDoAU DAU = new frmDoAU(cnSQL, user);
                        DAU.setVisible(true);
                    }
                    catch(Exception e)
                    {
                        msg.showMessageDialog(pnlThemSua, "Thêm thất bại", "Thóng báo", 1);
                    }  
                }
                else
                {
                    JOptionPane.showMessageDialog(pnlThemSua,"Sản phẩm này đã tồn tại","Thông Báo",1);
                    txtTen.requestFocus();
                }
            }  
        }
        else//sua
        {
            if(KiemTra()==1)
            {
                txtTen.setEditable(false);
                    String loai = "";
                    String strSQL = "Select MALOAIDAU From LOAIDAU where TENLOAIDAU = N'"+cbbLoai.getSelectedItem()+"'";
                    ResultSet tblCTDAU = cnSQL.dbQuery(strSQL, "");
                    if(tblCTDAU != null){
                        try {
                            while(tblCTDAU.next()){
                                loai = tblCTDAU.getString(1).trim();
                            }
                        } catch (SQLException ex) {
                            msg.showMessageDialog(pnlThemSua, "Gán loại thất bại", "Thông báo", 1);
                        }
                    }else{
                        msg.showMessageDialog(pnlThemSua, "Không kết nối", "Thóng báo", 0);
                    }
                    String strSQLa = " UPDATE dbo.CHITIETDAU SET TENDAU = N'"+txtTen.getText()+"',MALOAIDAU ="+loai+",DONGIA="+txtDonGia.getText()+",SOLUONGTONKHO="+txtSoLuong.getText()+",HIEN=1 WHERE MADAU ="+madau;

                    try
                    {
                        ResultSet rs = cnSQL.dbQuery(strSQLa, "");
                        msg.showMessageDialog(pnlThemSua, "Sửa thành công", "Thóng báo", 1);
                        this.dispose();      
                        frmDoAU DAU = new frmDoAU(cnSQL, user);
                        DAU.setVisible(true);
                    }
                    catch(Exception e)
                    {
                        msg.showMessageDialog(pnlThemSua, "Sửa thất bại", "Thóng báo", 1);
                    }  

            }
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        LoadCmbLoai();
        if(themsua==1)
        {
            btnThem.setText("THÊM");
            lblThemSua.setText("Thêm đồ ăn uống");
            cbbLoai.setSelectedItem(loaidau);
        }
        else
        {
            btnThem.setText("SỬA");
            lblThemSua.setText("Sửa đồ ăn uống");
            txtTen.setText(tendau);
            txtDonGia.setText(dongia);
            txtSoLuong.setText(soluongtonkho);
            cbbLoai.setSelectedItem(loaidau);
        }
        lblLoai.setVisible(true);
        cbbLoai.setVisible(true);
        
    }//GEN-LAST:event_formWindowOpened

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        this.dispose();      
        frmDoAU DAU = new frmDoAU(cnSQL, user);
        DAU.setVisible(true);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void txtTenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenKeyTyped
        char vchar = evt.getKeyChar();
        if((Character.isDigit(vchar)) || 
            (vchar == KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_txtTenKeyTyped

    private void txtSoLuongKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSoLuongKeyTyped
        char vchar = evt.getKeyChar();
        if(!(Character.isDigit(vchar)) || 
            (vchar == KeyEvent.VK_BACK_SPACE) || 
            (vchar == KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_txtSoLuongKeyTyped

    private void txtDonGiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDonGiaKeyTyped
        char vchar = evt.getKeyChar();
        if(!(Character.isDigit(vchar)) || 
            (vchar == KeyEvent.VK_BACK_SPACE) || 
            (vchar == KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_txtDonGiaKeyTyped

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new frmThemSuaDAU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JComboBox<String> cbbLoai;
    private javax.swing.JLabel lblLoai;
    private javax.swing.JLabel lblLoaiMoi;
    private javax.swing.JLabel lblLoaiMoi1;
    private javax.swing.JLabel lblLoaiMoi2;
    private javax.swing.JLabel lblThemSua;
    private javax.swing.JPanel pnlThemSua;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
