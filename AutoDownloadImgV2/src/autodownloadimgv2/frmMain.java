
package autodownloadimgv2;

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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


public class frmMain extends javax.swing.JFrame {
    
    private int iCrr = 0;
    private int iTotal = 0;
    private int iTotalImg = 0;
    private int iTotalPage = 0;
    private ArrayList<String> dsLink = null;
    private static HttpURLConnection con;
    
    public frmMain() {
        initComponents();
        txtFileList.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFileList = new javax.swing.JTextField();
        btnSelect = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblTFile = new javax.swing.JLabel();
        btnGet = new javax.swing.JButton();
        pnl2 = new javax.swing.JPanel();
        lblCrrGet = new javax.swing.JLabel();
        lblTotalPage = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tool Auto Download Image v2");

        pnl1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("File list:");

        txtFileList.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtFileList.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnSelect.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSelect.setText("Select");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Total file:");

        lblTFile.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblTFile.setForeground(new java.awt.Color(51, 51, 255));
        lblTFile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTFile.setText("0");

        btnGet.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGet.setForeground(new java.awt.Color(255, 51, 51));
        btnGet.setText("GET");
        btnGet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl1Layout = new javax.swing.GroupLayout(pnl1);
        pnl1.setLayout(pnl1Layout);
        pnl1Layout.setHorizontalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtFileList, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTFile, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl1Layout.setVerticalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFileList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelect))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblTFile)
                    .addComponent(btnGet))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl2.setBackground(new java.awt.Color(255, 255, 255));

        lblCrrGet.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblCrrGet.setForeground(new java.awt.Color(0, 153, 153));
        lblCrrGet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCrrGet.setText("0/0");

        lblTotalPage.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblTotalPage.setForeground(new java.awt.Color(204, 0, 204));
        lblTotalPage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalPage.setText("0");

        javax.swing.GroupLayout pnl2Layout = new javax.swing.GroupLayout(pnl2);
        pnl2.setLayout(pnl2Layout);
        pnl2Layout.setHorizontalGroup(
            pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCrrGet, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTotalPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl2Layout.setVerticalGroup(
            pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCrrGet)
                    .addComponent(lblTotalPage))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Code by ThucNobita");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new java.io.File(".")); // start at application current directory
        fc.setFileSelectionMode(JFileChooser.OPEN_DIALOG);
        fc.addChoosableFileFilter(new FileNameExtensionFilter("TXT File Text", "txt") );
        int returnVal = fc.showOpenDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            File yourFolder = fc.getSelectedFile();
            txtFileList.setText(yourFolder.getPath());
            iTotal = 0;
            dsLink = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader(yourFolder))) {
                String line;
                while ((line = br.readLine()) != null) {
                    dsLink.add(line);
                    iTotal++;
                }                
                lblTFile.setText(String.valueOf(iTotal));
            } catch (FileNotFoundException ex) {
                //System.out.println("Error: " + ex.getMessage());
            } catch (IOException ex) {
                //System.out.println("Error: " + ex.getMessage());
            }      
        }
    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnGetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetActionPerformed
        btnSelect.setEnabled(false);
        btnGet.setEnabled(false);
        iCrr = 0;
        iTotalImg = 0;
        iTotalPage = 0;
        new Thread(new Runnable() {
            public void run() {
                for (String dataLink : dsLink) {
                    String[] parrentURL = dataLink.split("\\|");
                    String content = "";                    
                    //System.out.println("[Title]: " + SplitFolder(parrentURL[1]));
                    RunAutoDownload(parrentURL[0],parrentURL[1]);
                }
            }
        }).start();
    }//GEN-LAST:event_btnGetActionPerformed
     
    private void RunAutoDownload(String pages,String link){      
        new Thread(new Runnable() {
            public void run() {
                String[] page = pages.split("\\-");
                if(Integer.valueOf(page[0]) <= Integer.valueOf(page[1]) && Integer.valueOf(page[0]) > 0){
                    for(int i = Integer.valueOf(page[0]);i<=Integer.valueOf(page[1]);i++){
                        try {
                            iTotalPage++;
                            lblTotalPage.setText(iTotalPage+"");
                            String linkURL = "";
                            if(link.contains("search?type=product"))
                                linkURL =  link + "&page=" + i;
                            else
                                linkURL = link + "?page=" + i;
                            System.out.println("link current: " + linkURL);
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
                                String folder = System.getProperty("user.dir") + "/" + SplitFolder(link);
                                File theDir = new File(folder);
                                if (!theDir.exists()) {
                                    try{
                                        theDir.mkdir();
                                        System.out.println("creating directory: " + theDir.getName());
                                    } 
                                    catch(SecurityException se){
                                        System.out.println("Error: create folder");
                                    }
                                }
                                ArrayList<Object> dsImg = MatchRegex(content.toString(), "data-src=\"//cdn.shopify.com/s/files/1/2036/4101/products/(.*?)\"");
                                int countImg = dsImg.size();
                                iTotalImg += countImg;
                                System.out.println("Total short: " + countImg);                                
                                for(int j = 0;j<dsImg.size();j++){
                                    RunDownImage(dsImg.get(j).toString(),folder);
                                }                       
                            }
                        }catch(Exception ex){
                            //System.out.println("[RunAutoDownload]: " + ex.getMessage());
                            iTotalPage--;
                            lblTotalPage.setText(iTotalPage+"");
                        }
                    }
                }else{
                    System.out.println("[RunAutoDownload]: page A > page B");
                    iTotalPage--;
                    lblTotalPage.setText(iTotalPage+"");
                }
            }
        }).start();
    }
    
    private void RunDownImage(String link,String folder){
        new Thread(new Runnable() {
            public void run() {
                URL url = null;
                String linkCrr = link.replace("{width}x", "1000x1000").replace("data-src=\"", "https:").replace("\"", "");
                try {
                    url = new URL(linkCrr);
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
                    String[] tmp = linkCrr.split("\\/");
                    String[] name = tmp[tmp.length-1].split("\\?");
                    FileOutputStream fos = new FileOutputStream(folder + "/" + name[0]);
                    fos.write(response);
                    fos.close();
                    iCrr++;
                    lblCrrGet.setText(iCrr +"/"+ iTotalImg);
                    Thread.sleep(1000);
                    if(iCrr == iTotalImg){
                        btnSelect.setEnabled(true);
                        btnGet.setEnabled(true);
                    }
                } catch (Exception ex) {
                    //System.out.println("[RunDownImage]: " + ex.getMessage());
                    iTotalImg--;
                }             
            }
        }).start();
    }
    
    private ArrayList<Object> MatchRegex(String str,String pattern){
        ArrayList<Object> strFound = new ArrayList<>();      
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(str);
        while(m.find()){
            strFound.add(m.group(0));
        }        
        return strFound;
    }
    
    private String SplitFolder(String str){
        String[] tmp = str.split("\\/");
        return tmp[tmp.length-1].replace("search?type=product&q=", "");
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblCrrGet;
    private javax.swing.JLabel lblTFile;
    private javax.swing.JLabel lblTotalPage;
    private javax.swing.JPanel pnl1;
    private javax.swing.JPanel pnl2;
    private javax.swing.JTextField txtFileList;
    // End of variables declaration//GEN-END:variables
}
