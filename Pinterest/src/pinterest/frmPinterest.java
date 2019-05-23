package pinterest;

import HTTPRequest.HttpRequest;
import pinterest.clsPinterest;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.JSONArray;

public class frmPinterest extends javax.swing.JFrame {

    public frmPinterest() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbType = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnGet = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPinteresst = new javax.swing.JTable();
        txtLimit = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tool Get Followers Pinterest");
        setBackground(java.awt.SystemColor.window);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("frmMain"); // NOI18N
        setResizable(false);

        pnlMain.setBackground(java.awt.SystemColor.window);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Search");

        txtSearch.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(51, 0, 255));
        txtSearch.setCaretColor(new java.awt.Color(50, 20, 168));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Type");

        cbType.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        cbType.setForeground(new java.awt.Color(153, 0, 153));
        cbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "User/Board" }));
        cbType.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cbType.setName(""); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Name");

        txtName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(51, 0, 255));
        txtName.setCaretColor(new java.awt.Color(50, 20, 168));

        btnGet.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnGet.setText("Get");
        btnGet.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnGet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetActionPerformed(evt);
            }
        });

        jScrollPane2.setAutoscrolls(true);

        tblPinteresst.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tblPinteresst.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Keyword Search", "Limit Get", "Save", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPinteresst.setGridColor(java.awt.SystemColor.window);
        tblPinteresst.setShowHorizontalLines(false);
        tblPinteresst.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tblPinteresst);

        jScrollPane2.setViewportView(jScrollPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtLimit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtLimit.setForeground(new java.awt.Color(51, 0, 255));
        txtLimit.setCaretColor(new java.awt.Color(50, 20, 168));

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlMainLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlMainLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(cbType, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLimit)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGet, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLimit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnGet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(571, 336));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RunPinterest(int type,String keyword,int index){
        HttpRequest HTTP = new HttpRequest();
        clsPinterest pin = new clsPinterest();
        String srcJSon, srcPage, idBoard, bookmark = "null";
        JSONArray username;
        int pagesize = 250, total = 0, totalLoop = 0, totalMod = 0, count = 0;
        int limit = (int)tblPinteresst.getValueAt(index, 1);
        
        srcPage = pin.getPageFollowers(HTTP, keyword);
        try {
            String path = Paths.get(".").toAbsolutePath().normalize().toString()+"\\"+txtName.getText()+".xls";
            File pFile = new File(path);
            pFile.delete();
            pFile.createNewFile();
            BufferedWriter bw = null;
            FileWriter fw = null;
            try {
                fw = new FileWriter(path);
                bw = new BufferedWriter(fw);
                if(type==1){
                    idBoard = pin.getIDByUserBoard(srcPage);
                    total = Integer.valueOf(pin.getTotalFollowersByUserBoard(srcPage));
                    totalLoop = total/pagesize;
                    totalMod = total-(totalLoop*pagesize);
                    for(int i=0;i<(totalLoop+1);i++){                      
                        if(i==totalLoop)                  
                            pagesize = totalMod;                       
                        srcJSon = pin.getJSonFollowersByUserBoard(HTTP, keyword, idBoard, String.valueOf(pagesize), bookmark);
                        bookmark = pin.getBookmark(srcJSon);
                        username = pin.getListUser(srcJSon);
                        
                        for(int j=0;j<username.length();j++){
                            if(count >= limit)
                                break;
                            bw.write(username.getJSONObject(j).getString("username")+"\n");
                            count++;
                        }
                        tblPinteresst.setValueAt(count+"/"+total, index, 3);
                        if(count >= limit)
                                break;
                    }
                }else{
                    total = Integer.valueOf(pin.getTotalFollowersByUser(srcPage));
                    totalLoop = total/pagesize;
                    totalMod = total-(totalLoop*pagesize);                   
                    for(int i=0;i<(totalLoop+1);i++){                      
                        if(i==totalLoop)                  
                            pagesize = totalMod;                       
                        srcJSon = pin.getJSonFollowersByUser(HTTP, keyword, String.valueOf(pagesize), bookmark);
                        bookmark = pin.getBookmark(srcJSon);
                        username = pin.getListUser(srcJSon);
                                                              
                        for(int j=0;j<username.length();j++){
                            if(count >= limit)
                                break;
                            bw.write(username.getJSONObject(j).getString("username")+"\n");
                            count++;
                        }
                        tblPinteresst.setValueAt(count+"/"+total, index, 3);
                        if(count >= limit)
                                break;
                    }                   
                }   
            } catch (IOException e) { e.printStackTrace();}
            finally{
                try {
                    if (bw != null)
                        bw.close();
                    if (fw != null)
                        fw.close();
                } catch (IOException e) { e.printStackTrace();}
            }
        } catch (Exception e) { e.printStackTrace();}          
    }
    
    private void btnGetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetActionPerformed
        if(txtSearch.getText().length() > 1){
            if(txtName.getText().length() > 0){
                DefaultTableModel model = (DefaultTableModel)tblPinteresst.getModel();
                model.addRow(new Object[] { txtSearch.getText(), Integer.valueOf(txtLimit.getText()), txtName.getText()});
                
                int typeGet = cbType.getSelectedIndex();
                String keyword = txtSearch.getText();
                int index = tblPinteresst.getRowCount()-1;
                
                Thread runGet = new Thread(()->RunPinterest(typeGet, keyword, index));
                runGet.setName(keyword+index);
                runGet.start();              
            }else
                JOptionPane.showMessageDialog(pnlMain, "Please fill name", "Warning", 2);
        }else
            JOptionPane.showMessageDialog(pnlMain, "Please fill keyword search", "Warning", 2);
    }//GEN-LAST:event_btnGetActionPerformed

    public static void main(String args[]) {      
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPinterest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPinterest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPinterest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPinterest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPinterest().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGet;
    private javax.swing.JComboBox<String> cbType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JTable tblPinteresst;
    private javax.swing.JTextField txtLimit;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
