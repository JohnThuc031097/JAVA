package downloadimgshirt;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class frmMain extends javax.swing.JFrame {
    
    private int iTotal = 0;
    private int iCheck = 0;
    private int iError = 0;
    private int iDone = 0;
    private ArrayList<String> dsLink = null;
    private String folder = System.getProperty("user.dir") + "/OutImage/";
    private static HttpURLConnection con;
    
    public frmMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblPathFile = new javax.swing.JLabel();
        btnBrowser = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblTotalLink = new javax.swing.JLabel();
        btnGet = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblCheck = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblDone = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("File list:");

        lblPathFile.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblPathFile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPathFile.setText("?? file ??");

        btnBrowser.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnBrowser.setText("Browser");
        btnBrowser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowserActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Total link:");

        lblTotalLink.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblTotalLink.setForeground(new java.awt.Color(51, 51, 255));
        lblTotalLink.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalLink.setText("0");

        btnGet.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnGet.setForeground(new java.awt.Color(255, 0, 51));
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTotalLink, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPathFile, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBrowser)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblPathFile)
                    .addComponent(btnBrowser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblTotalLink)
                    .addComponent(btnGet))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblPathFile.getAccessibleContext().setAccessibleName("?? file ??");
        lblTotalLink.getAccessibleContext().setAccessibleName("0");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblCheck.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblCheck.setForeground(new java.awt.Color(51, 51, 255));
        lblCheck.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCheck.setText("0");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Error:");

        lblError.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblError.setForeground(new java.awt.Color(51, 51, 255));
        lblError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblError.setText("0");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Check:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Done:");

        lblDone.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblDone.setForeground(new java.awt.Color(51, 51, 255));
        lblDone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDone.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDone, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCheck)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(lblError)
                        .addComponent(jLabel5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lblDone))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Coder by ThucNobita");

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
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(41, 41, 41))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBrowserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowserActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new java.io.File("."));
        fc.setFileSelectionMode(JFileChooser.OPEN_DIALOG);
        fc.addChoosableFileFilter(new FileNameExtensionFilter("TXT File Text", "txt") );
        int returnVal = fc.showOpenDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            File yourFolder = fc.getSelectedFile();
            lblPathFile.setText(yourFolder.getName());
            iTotal = 0;
            dsLink = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader(yourFolder))) {
                String line;
                while ((line = br.readLine()) != null) {
                    dsLink.add(line);
                    iTotal++;
                }                
                lblTotalLink.setText(String.valueOf(iTotal));
            } catch (FileNotFoundException ex) {
                //System.out.println("Error: " + ex.getMessage());
            } catch (IOException ex) {
                //System.out.println("Error: " + ex.getMessage());
            }      
        }
    }//GEN-LAST:event_btnBrowserActionPerformed

    private void btnGetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetActionPerformed
        if(iTotal > 0){
            btnBrowser.setEnabled(false);
            btnGet.setEnabled(false);
            iCheck = 0;
            iError = 0;
            iDone = 0;
            File theDir = new File(folder);
            try {
                if (!theDir.exists()) {
                    theDir.mkdir();
                }
            } catch (Exception e) {               
            }
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i=0;i<dsLink.size();i++){
                        RunGetID(dsLink.get(i));
                    }
                }
            }).start();
        }
    }//GEN-LAST:event_btnGetActionPerformed

    private void RunGetID(String link){
        try{
            String linkURL = link;
            //System.out.println("link:" + link);
            URL myurl = new URL(linkURL);
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
                    ArrayList<String> degsinID = MatchRegex(content.toString(), "\"https://image.spreadshirtmedia.com/image-server/v1/mp/(.*?)\"");
                    //System.out.println("Count: " + degsinID.size());
                    //System.out.println("Link img:" + degsinID.get(0).replace("\"", ""));
                    if(degsinID.size() > 0){
                        iCheck++;
                        lblCheck.setText(iCheck+"");
                        String getLinkImg = degsinID.get(0).replace("\"", "").split("/")[7];
                        //System.out.println("Code ID:" + getLinkImg);
                        RunDownloadImg(SplitID(getLinkImg));
                    }else{
                        iError++;
                        lblError.setText(iError+"");
                    }
            }
        }catch(Exception ex){
            iError++;
            lblError.setText(iError+"");
        }
    }
    
    private void RunDownloadImg(String degsinID){
        new Thread(new Runnable() {
            @Override
            public void run() {
                String linkURL = "https://image.spreadshirtmedia.com/image-server/v1/designs/"+ degsinID +",width=1200,height=1200";
                URL url = null;
                //System.out.println("link img: " + linkURL);
                try{
                    url = new URL(linkURL);
                    InputStream in = new BufferedInputStream(url.openStream());
                    ByteArrayOutputStream out = new ByteArrayOutputStream();
                    byte[] buf = new byte[1024];
                    int n = 0;
                    while (-1!=(n=in.read(buf)))
                    {
                        out.write(buf, 0, n);
                    }
                    out.close();
                    in.close();
                    
                    byte[] response = out.toByteArray();
                    FileOutputStream fos = new FileOutputStream(folder + degsinID + ".png");
                    fos.write(response);
                    fos.close();
                    iDone++;
                    lblDone.setText(iDone+"");
                    if((iDone + iError) == iTotal){
                        btnBrowser.setEnabled(true);
                        btnGet.setEnabled(true);
                    }
                    
                }catch(Exception ex){
                    iError++;
                    lblError.setText(iError+"");
                }
        }
        }){}.start();
    }
    
    private String SplitID(String str){
        char[] result1 = str.substring(str.indexOf('D')+1,(str.indexOf('D')+1)+10).toCharArray();
        String result2 = "";
            for(int i = 0; i < result1.length; i++)
            {
                if (!Character.isDigit(result1[i]))
                {
                    break;
                }
                result2 += result1[i];
            }
        return result2;
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
    private javax.swing.JButton btnBrowser;
    private javax.swing.JButton btnGet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCheck;
    private javax.swing.JLabel lblDone;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblPathFile;
    private javax.swing.JLabel lblTotalLink;
    // End of variables declaration//GEN-END:variables
}
