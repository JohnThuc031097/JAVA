package autogetlikeimg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class frmMain extends javax.swing.JFrame {
    
    private int iTotal1 = 0;
    private int iTotal2 = 0;
    private int iTotal = 0;
    private int iTotalDone = 0;
    private int iError = 0;
    private static HttpURLConnection con;
    private ArrayList<String> dsLink1 = null;
    private ArrayList<String> dsLink2 = null;
    private ArrayList<String> dsLinkInfo = null;
    private String folder = System.getProperty("user.dir") + "/FileOut/";
    
    public frmMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSelect = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblFilePath = new javax.swing.JLabel();
        lblTotal1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblTotal2 = new javax.swing.JLabel();
        btnGet = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lblProgress = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();
        lblDone = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("File Path:");

        btnSelect.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnSelect.setText("Select");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("SpreadShirt:");

        lblFilePath.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblFilePath.setForeground(new java.awt.Color(51, 51, 255));
        lblFilePath.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFilePath.setText("?? file ??");

        lblTotal1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblTotal1.setForeground(new java.awt.Color(51, 102, 255));
        lblTotal1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal1.setText("0");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Etsy:");

        lblTotal2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblTotal2.setForeground(new java.awt.Color(51, 102, 255));
        lblTotal2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal2.setText("0");

        btnGet.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnGet.setForeground(new java.awt.Color(255, 51, 51));
        btnGet.setText("GET");
        btnGet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetActionPerformed(evt);
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTotal2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnSelect)
                    .addComponent(lblFilePath))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblTotal1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lblTotal2))
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addComponent(btnGet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("Done");

        lblProgress.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblProgress.setForeground(new java.awt.Color(0, 153, 153));
        lblProgress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProgress.setText("0");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setText("Error:");

        lblError.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 102, 102));
        lblError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblError.setText("0");

        lblDone.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblDone.setForeground(new java.awt.Color(51, 0, 204));
        lblDone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDone.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProgress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDone, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblProgress)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(lblError)
                        .addComponent(lblDone)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 153));
        jLabel11.setText("Coder by ThucNobita");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel11)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
       JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new java.io.File("."));
        fc.setFileSelectionMode(JFileChooser.OPEN_DIALOG);
        fc.addChoosableFileFilter(new FileNameExtensionFilter("TXT File Text", "txt") );
        int returnVal = fc.showOpenDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            File yourFolder = fc.getSelectedFile();
            lblFilePath.setText(yourFolder.getName());
            iTotal1 = 0;
            iTotal2 = 0;
            dsLink1 = new ArrayList<>();
            dsLink2 = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader(yourFolder))) {
                String line;
                while ((line = br.readLine()) != null) {
                    if(line.split("\\|")[1].contains("www.etsy.com")){
                        dsLink2.add(line);
                        iTotal2++;
                    }else{
                        dsLink1.add(line);
                        iTotal1++;
                    }
                }                
                lblTotal1.setText(String.valueOf(iTotal1));
                lblTotal2.setText(String.valueOf(iTotal2));
            } catch (FileNotFoundException ex) {
                //System.out.println("Error: " + ex.getMessage());
            } catch (IOException ex) {
                //System.out.println("Error: " + ex.getMessage());
            }      
        }
    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnGetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetActionPerformed
        if(iTotal1 > 0 || iTotal2 > 0){
            btnSelect.setEnabled(false);
            btnGet.setEnabled(false);
            iTotal = 0;
            iTotalDone = 0;
            iError = 0;
            dsLinkInfo = new ArrayList<>();
            File theDir = new File(folder);
            try {
                if (!theDir.exists()) {
                    theDir.mkdir();
                }
            } catch (Exception e) {   
                //System.out.println("Error:" + e.getMessage());
            }
            new Thread(new Runnable() {
                public void run() {
                    for(int i=0;i<dsLink1.size();i++){
                        GetPageSiteA(dsLink1.get(i));
                    }
                }
            }).start();
            new Thread(new Runnable() {
                public void run() {
                    for(int i=0;i<dsLink2.size();i++){
                        GetPageSiteB(dsLink2.get(i));
                    }
                }
            }).start();
        }
    }//GEN-LAST:event_btnGetActionPerformed

    private void GetPageSiteA(String link){
        String linkImg = link.split("\\|")[1];
        String[] pages = link.split("\\|")[0].split("\\-");
        if(Integer.valueOf(pages[0]) < Integer.valueOf(pages[1]) || Integer.valueOf(pages[0]) > 0){
            for(int i=Integer.valueOf(pages[0]);i<=Integer.valueOf(pages[1]);i++){
                GetListLinkSiteA(linkImg +"?page="+ i);
                try{
                    Thread.sleep(1000);
                }catch(Exception e){
                    
                }
            }
        }
    }
    
    private void GetPageSiteB(String link){
        String linkImg = link.split("\\|")[1];
        String[] pages = link.split("\\|")[0].split("\\-");
        if(Integer.valueOf(pages[0]) < Integer.valueOf(pages[1]) || Integer.valueOf(pages[0]) > 0){
            for(int i=Integer.valueOf(pages[0]);i<=Integer.valueOf(pages[1]);i++){
                GetListLinkSiteB(linkImg +"&page="+ i);
                try{
                    Thread.sleep(1500);
                }catch(Exception e){
                    
                }
            }
        }
    }
    
    private void GetListLinkSiteA(String link){
        new Thread(new Runnable() {
            public void run() {
                try {
                    URL myurl = new URL(link);
                    con = (HttpURLConnection) myurl.openConnection();
                    con.setRequestMethod("GET");
                    StringBuilder content;
                    try (BufferedReader in = new BufferedReader(
                        new InputStreamReader(con.getInputStream()))) {
                            String line;
                            content = new StringBuilder();
                            while ((line = in.readLine()) != null) {
                                content.append(line);
                                content.append(System.lineSeparator());
                            }
                            Thread.sleep(1500);
                            ArrayList<String> dsLink = MatchRegex(content.toString(), "<a href=\"(.*?)\" id=\"(.*?)\" class=\"Wrapper image squareSize\"");
                            if(dsLink.size() > 0){
                                iTotalDone += dsLink.size()-1;
                                lblDone.setText(iTotalDone+"");
                                for(int i=1;i<dsLink.size();i++){
                                    String linkSplit = dsLink.get(i).split(" ")[1].replace("href=\"", "https:").replace("\"", "");
                                    GetInfoLinkSiteA(linkSplit);
                                    Thread.sleep(500);
                                }
                            }else{
                                iError++;
                                lblError.setText(iError+"");
                            }
                    }
                } catch (Exception e) {
                    iError++;
                    lblError.setText(iError+"");
                }
            }
        }).start();
    }
    
    private void GetListLinkSiteB(String link){
        new Thread(new Runnable() {
            public void run() {
                try {
                    URL myurl = new URL(link);
                    con = (HttpURLConnection) myurl.openConnection();
                    con.setRequestMethod("GET");
                    StringBuilder content;
                    try (BufferedReader in = new BufferedReader(
                        new InputStreamReader(con.getInputStream()))) {
                            String line;
                            content = new StringBuilder();
                            while ((line = in.readLine()) != null) {
                                content.append(line);
                                content.append(System.lineSeparator());
                            }
                            Thread.sleep(1500);
                            ArrayList<String> dsLink = MatchRegex(content.toString(), "data-palette-listing-id=\"([0-9]+)\"");
                            if(dsLink.size() > 0){
                                iTotalDone += dsLink.size()-1;
                                lblDone.setText(iTotalDone+"");
                                for(int i=1;i<dsLink.size();i++){
                                    String dataID = dsLink.get(i).replace("data-palette-listing-id=\"", "").replace("\"", "");
                                    System.out.println(dataID);
                                    GetInfoLinkSiteB(dataID);
                                    Thread.sleep(500);
                                }
                            }else{
                                iError++;
                                lblError.setText(iError+"");                              
                            }
                    }
                } catch (Exception e) {
                    iError++;
                    lblError.setText(iError+"");                    
                }
            }
        }).start();
    }
    
    private void GetInfoLinkSiteA(String link){
        new Thread(new Runnable() {
            public void run() {
                try {
                    URL myurl = new URL(link);
                    con = (HttpURLConnection) myurl.openConnection();
                    con.setRequestMethod("GET");
                    StringBuilder content;
                    try (BufferedReader in = new BufferedReader(
                        new InputStreamReader(con.getInputStream()))) {
                            String line;
                            content = new StringBuilder();
                            while ((line = in.readLine()) != null) {
                                content.append(line);
                                content.append(System.lineSeparator());
                            }
                            ArrayList<String> dsLink = MatchRegex(content.toString(), "\"ratingCount\": \"(.*?)\"");
                            if(dsLink.size() > 0){
                                String linkSplit = dsLink.get(0).replace("\"ratingCount\": \"", "").replace("\"", "");
                                dsLinkInfo.add(linkSplit+"|"+link);
                                iTotal++;
                                lblProgress.setText(iTotal+"");
                            }else{
                                iError++;
                                lblError.setText(iError+"");
                            }
                            if(dsLinkInfo.size() > 0){
                                try {
                                    String data = "";
                                    FileOutputStream fos = new FileOutputStream(folder + "SpreadShirt.txt");
                                    for(int i=0;i<dsLinkInfo.size();i++)
                                    {
                                        data += dsLinkInfo.get(i)+System.lineSeparator();                                          
                                    }
                                    fos.write(data.getBytes()); 
                                    fos.close();                                  
                                } catch (Exception e) {
                                    //System.out.println("Error:" + e.getMessage());
                                }
                            }
                            if((iTotal+iError) == iTotalDone){                              
                                JOptionPane.showMessageDialog(null, "Done !", "Infomation", JOptionPane.INFORMATION_MESSAGE);
                                btnSelect.setEnabled(true);
                                btnGet.setEnabled(true);
                            }
                    }
                } catch (Exception e) {
                    iError++;
                    lblError.setText(iError+"");
                }
            }
        }).start();
    }
    
    private void GetInfoLinkSiteB(String dataID){
        new Thread(new Runnable() {
            public void run() {
                try {
                    boolean checkRegex = false;
                    URL myurl = new URL("https://www.etsy.com/listing/" + dataID);
                    con = (HttpURLConnection) myurl.openConnection();
                    con.setRequestMethod("GET");
                    StringBuilder content;
                    try (BufferedReader in = new BufferedReader(
                        new InputStreamReader(con.getInputStream()))) {
                            String line;
                            content = new StringBuilder();
                            while ((line = in.readLine()) != null) {
                                content.append(line);
                                content.append(System.lineSeparator());
                            }
                            Thread.sleep(1500);
                            String linkSplitA = "0";
                            String linkSplitB = "0";
                            ArrayList<String> dsLink = MatchRegex(content.toString(), "\"ratingCount\": (.*?),");                          
                            if(dsLink.size() > 0){
                                linkSplitA = dsLink.get(0).replace("\"ratingCount\":", "").replace(",", "");  
                                checkRegex = true;
                            }
                            ArrayList<String> dsLinkF = MatchRegex(content.toString(), "Favorited by: (.*?)</a>");
                            if(dsLinkF.size() > 0){
                                linkSplitB = dsLinkF.get(0).replace(dsLinkF.get(0).substring(0, dsLinkF.get(0).indexOf(">")+1), "").replace("</a>", "").split(" ")[0];
                                checkRegex = true;
                            }
                            if(!checkRegex){
                                iError++;
                                lblError.setText(iError+"");
                                System.out.println("Error:" + dataID);
                            }else{
                                dsLinkInfo.add(linkSplitA+"|"+linkSplitB+"|https://www.etsy.com/listing/"+dataID);
                                iTotal++;
                                lblProgress.setText(iTotal+"");
                            }
                            if(dsLinkInfo.size() > 0){
                                try {
                                    String data = "";
                                    FileOutputStream fos = new FileOutputStream(folder + "Etsy.txt");
                                    for(int i=0;i<dsLinkInfo.size();i++)
                                    {
                                        data += dsLinkInfo.get(i)+System.lineSeparator();                                          
                                    }
                                    fos.write(data.getBytes()); 
                                    fos.close();                                  
                                } catch (Exception e) {
                                    //System.out.println("Error:" + e.getMessage());
                                }
                            }
                            if((iTotal+iError) == iTotalDone){                              
                                JOptionPane.showMessageDialog(null, "Done !", "Infomation", JOptionPane.INFORMATION_MESSAGE);
                                btnSelect.setEnabled(true);
                                btnGet.setEnabled(true);
                            }
                    }
                } catch (Exception e) {
                    iError++;
                    lblError.setText(iError+"");
                }
            }
        }).start();
    }
    
    private ArrayList<String> MatchRegex(String str,String pattern){
        ArrayList<String> strFound = new ArrayList<>();      
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(str);
        while(m.find()){
            strFound.add(m.group(0));
        }        
        return strFound;
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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGet;
    private javax.swing.JButton btnSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDone;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblFilePath;
    private javax.swing.JLabel lblProgress;
    private javax.swing.JLabel lblTotal1;
    private javax.swing.JLabel lblTotal2;
    // End of variables declaration//GEN-END:variables
}
