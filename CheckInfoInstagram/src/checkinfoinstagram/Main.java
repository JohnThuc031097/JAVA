package checkinfoinstagram;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import HTTPRequest.HttpRequest;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ins.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPath = new javax.swing.JTextField();
        btnBrowse = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblOk = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnCheck = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Check Info Instagram");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Path");

        txtPath.setEditable(false);
        txtPath.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPath.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnBrowse.setText("Browse");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Total");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Ok");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Error");

        lblOk.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblOk.setForeground(new java.awt.Color(51, 51, 255));
        lblOk.setText("0");

        lblError.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblError.setForeground(new java.awt.Color(51, 51, 255));
        lblError.setText("0");

        lblTotal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(0, 0, 255));
        lblTotal.setText("0");

        btnCheck.setBackground(new java.awt.Color(255, 255, 255));
        btnCheck.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnCheck.setForeground(new java.awt.Color(255, 51, 51));
        btnCheck.setText("Check");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
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
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPath, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(26, 26, 26)
                            .addComponent(lblOk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBrowse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBrowse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblTotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblOk))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblError)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(416, 172));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private String pathFile = "";
    private String nameFile = "";
    private List<String> dataUsers;
       
    private String outFileOK(){
        String pathOK = pathFile +"\\[OK]"+ nameFile;
        File pFile;     
        try {
            pFile = new File(pathOK);
            if(pFile.exists())
                pFile.delete();
            else
                pFile.createNewFile();
            return pathOK;
        } catch (IOException e) {
            System.out.println("[Error] outFileOK:\n"+e.getMessage());
        }
        return null;
    }
    
    private String outFileError(){
        String pathError = pathFile +"\\[Error]"+ nameFile;
        File pFile;
        
        try {
            pFile = new File(pathError);
            if(pFile.exists())
                pFile.delete();
            else
                pFile.createNewFile();
            return pathError;
        } catch (IOException e) {
            System.out.println("[Error] outFileError:\n"+e.getMessage());
        }
        return null;
    }
      
    private void CheckUser(){     
        String outOK = outFileOK();
        String outError = outFileError();
        int cOk = 0;
        int cError = 0;
    
        if(outOK != null && outError != null){
            FileWriter fwOK = null;
            BufferedWriter bwOK = null;
            FileWriter fwError = null;
            BufferedWriter bwError = null;           
            try {
                fwOK = new FileWriter(outOK);
                bwOK = new BufferedWriter(fwOK);
                try {
                    fwError = new FileWriter(outError);
                    bwError = new BufferedWriter(fwError);
                    
                    //========= Code Main ============
                    HttpRequest HTTP = new HttpRequest();
                    for(String data:dataUsers){
                        HTTP.Connect("https://www.instagram.com/" + data);
                        HTTP.GetHttp(true);
                        int stateCode = HTTP.getStateCode();
                        if(stateCode == 404){
                            lblError.setText(String.valueOf(++cError));                             
                            bwError.write(data);
                            bwError.flush();
                            bwError.newLine();
                            
                        }else{
                            lblOk.setText(String.valueOf(++cOk));                           
                            bwOK.write(data);
                            bwOK.flush();
                            bwOK.newLine();
                        }
                    }                
                    // ==================================
                    
                } catch (IOException e) {
                    System.out.println("[Error] outError[2]:\n" + e.getMessage());
                }finally{
                    try {
                        if(bwError != null){                           
                            bwError.close();
                        }
                        if(fwError != null){
                            fwError.close();
                        }
                    } catch (IOException e) {
                        System.out.println("[Error] outError[1]:\n" + e.getMessage());
                    }                         
                }                   
            } catch (IOException e) {
                System.out.println("[Error] outOK[2]:\n" + e.getMessage());
            }finally{
                try {
                    if(bwOK != null){
                        bwOK.close();
                    }
                    if(fwOK != null){
                        fwOK.close();
                    }
                } catch (IOException e) {
                    System.out.println("[Error] outOK[1]:\n" + e.getMessage());
                }                         
            }      
        }
        btnCheck.setEnabled(true);
        JOptionPane.showMessageDialog(null, "Done !", "Message", 1);
    }
    
    private List<String> getAllUserInFile(String path){
        List<String> data = new ArrayList<>();
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
                data.add(line);
            }
            return data;
        } catch (IOException e) {
            System.out.println("[Error] getAllUserInFile[2]:\n" + e.getMessage());
        }finally{
            try {
                if(br != null){
                    br.close();
                }
                if(fr != null){
                    fr.close();
                }
            } catch (IOException e) {
                System.out.println("[Error] getAllUserInFile[1]:\n" + e.getMessage());
            }                         
        }
        return null;
    }
    
    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        JFileChooser pFile = new JFileChooser();
        pFile.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter pFilter = new FileNameExtensionFilter("File Text", "txt");
        pFile.addChoosableFileFilter(pFilter);
        if(pFile.showDialog(null, "Open") == JFileChooser.APPROVE_OPTION){
            pathFile = pFile.getSelectedFile().getParent();
            nameFile = pFile.getSelectedFile().getName();
            txtPath.setText(pathFile +"\\"+ nameFile);
            dataUsers = getAllUserInFile(pathFile+"\\"+nameFile);
            lblTotal.setText(String.valueOf(dataUsers.size()));
        }
        
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        Thread runCheck =  new Thread(()-> CheckUser());
        runCheck.start();
        btnCheck.setEnabled(false);
    }//GEN-LAST:event_btnCheckActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnCheck;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblOk;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextField txtPath;
    // End of variables declaration//GEN-END:variables
}
