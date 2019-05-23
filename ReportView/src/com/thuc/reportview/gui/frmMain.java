package com.thuc.reportview.gui;

import com.thuc.reportview.gui.*;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import datechooser.beans.DateChooserCombo;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Color;

public class frmMain extends javax.swing.JFrame {
    
	private String folderDir = System.getProperty("user.dir");
	private String nameXMLConfig = "config.xml";
	private String pathDataSrc = "";
	private Boolean checkDataSrc = true;
	
	// Variables declaration - do not modify       
    private JpnlHoaDon clsHoaDon;
    private JButton btnSetting;
    private JButton btnExit;
    private JButton btnOkChoose;
    private DateChooserCombo cbDBegin;
    private DateChooserCombo cbDEnd;
    private JComboBox<String> cbMenuL;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel7;
    private JPanel pnlMain;
    private JPanel jpnlDateCondition;
    private JPanel jpnlLogo;
    private JPanel pnlMainL;
    private JPanel pnlMainR;
    private JPanel jpnlMenu;
    private JPanel pnlShowBottom;
    private JPanel pnlShowTop;    
    
    public frmMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        pnlMain = new JPanel();
        pnlMainL = new JPanel();
        jpnlLogo = new JPanel();
        jpnlDateCondition = new JPanel();
        cbDEnd = new datechooser.beans.DateChooserCombo();
        cbDBegin = new datechooser.beans.DateChooserCombo();
        jpnlMenu = new JPanel();
        jLabel7 = new javax.swing.JLabel();
        cbMenuL = new javax.swing.JComboBox<>();
        btnOkChoose = new javax.swing.JButton();
        pnlShowBottom = new JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pnlShowTop = new JPanel();
        btnSetting = new javax.swing.JButton();
        btnSetting.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		btnSettingActionPerformed(e);
        	}
        });
        btnExit = new javax.swing.JButton();
        btnExit.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		btnExitActionPerformed(e);
        	}
        });
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlMainR = new JPanel();

        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 102));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        pnlMain.setBackground(new java.awt.Color(0, 51, 102));
        pnlMain.setToolTipText("");

        pnlMainL.setBackground(new java.awt.Color(0, 51, 102));

        jpnlLogo.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout jpnlLogoLayout = new javax.swing.GroupLayout(jpnlLogo);
        jpnlLogo.setLayout(jpnlLogoLayout);
        jpnlLogoLayout.setHorizontalGroup(
            jpnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpnlLogoLayout.setVerticalGroup(
            jpnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 146, Short.MAX_VALUE)
        );

        jpnlDateCondition.setBackground(new java.awt.Color(0, 51, 102));
        jpnlDateCondition.setFocusCycleRoot(true);
        cbDEnd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cbDEnd.setCalendarPreferredSize(new java.awt.Dimension(500, 300));
        cbDEnd.setNothingAllowed(false);
        cbDEnd.setLocale(new java.util.Locale("vi", "", ""));
        cbDEnd.setCurrentNavigateIndex(0);

        cbDBegin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cbDBegin.setCalendarPreferredSize(new java.awt.Dimension(500, 300));
        cbDBegin.setNothingAllowed(false);
        cbDBegin.setLocale(new java.util.Locale("vi", "", ""));
        cbDBegin.setCurrentNavigateIndex(0);
        javax.swing.GroupLayout jpnlDateConditionLayout = new javax.swing.GroupLayout(jpnlDateCondition);
        jpnlDateCondition.setLayout(jpnlDateConditionLayout);
        jpnlDateConditionLayout.setHorizontalGroup(
            jpnlDateConditionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlDateConditionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlDateConditionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbDBegin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jpnlDateConditionLayout.setVerticalGroup(
            jpnlDateConditionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlDateConditionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbDBegin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbDEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnlMenu.setBackground(new java.awt.Color(0, 51, 102));
        jpnlMenu.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Choose:");

        cbMenuL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hóa đơn" }));

        btnOkChoose.setText("OK");
        btnOkChoose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnOkChooseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnlMenuLayout = new javax.swing.GroupLayout(jpnlMenu);
        jpnlMenu.setLayout(jpnlMenuLayout);
        jpnlMenuLayout.setHorizontalGroup(
            jpnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlMenuLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cbMenuL, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlMenuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnOkChoose)))
                .addContainerGap())
        );
        jpnlMenuLayout.setVerticalGroup(
            jpnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbMenuL, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOkChoose)
                .addContainerGap(308, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout gl_pnlMainL = new javax.swing.GroupLayout(pnlMainL);
        pnlMainL.setLayout(gl_pnlMainL);
        gl_pnlMainL.setHorizontalGroup(
            gl_pnlMainL.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnlDateCondition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        gl_pnlMainL.setVerticalGroup(
            gl_pnlMainL.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gl_pnlMainL.createSequentialGroup()
                .addComponent(jpnlLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnlDateCondition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlShowBottom.setBackground(new java.awt.Color(0, 51, 102));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("dd/MM/yyy");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("hh:mm:ss");

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Coder by SkyNer");

        javax.swing.GroupLayout gl_pnlShowBottom = new javax.swing.GroupLayout(pnlShowBottom);
        pnlShowBottom.setLayout(gl_pnlShowBottom);
        gl_pnlShowBottom.setHorizontalGroup(
            gl_pnlShowBottom.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gl_pnlShowBottom.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        gl_pnlShowBottom.setVerticalGroup(
            gl_pnlShowBottom.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gl_pnlShowBottom.createSequentialGroup()
                .addContainerGap()
                .addGroup(gl_pnlShowBottom.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pnlShowTop.setBackground(new java.awt.Color(0, 51, 102));

        btnSetting.setText("SETTING");

        btnExit.setText("EXIT");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("Nguyen Van A");

        javax.swing.GroupLayout gl_pnlShowTop = new javax.swing.GroupLayout(pnlShowTop);
        pnlShowTop.setLayout(gl_pnlShowTop);
        gl_pnlShowTop.setHorizontalGroup(
            gl_pnlShowTop.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gl_pnlShowTop.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 557, Short.MAX_VALUE)
                .addComponent(btnSetting)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        gl_pnlShowTop.setVerticalGroup(
            gl_pnlShowTop.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gl_pnlShowTop.createSequentialGroup()
                .addGroup(gl_pnlShowTop.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(gl_pnlShowTop.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSetting, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlMainR.setBackground(Color.WHITE);

        javax.swing.GroupLayout gl_pnlMain = new javax.swing.GroupLayout(pnlMain);
        gl_pnlMain.setHorizontalGroup(
        	gl_pnlMain.createParallelGroup(Alignment.TRAILING)
        		.addGroup(gl_pnlMain.createSequentialGroup()
        			.addComponent(pnlMainL, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(gl_pnlMain.createParallelGroup(Alignment.LEADING)
        				.addComponent(pnlMainR, GroupLayout.DEFAULT_SIZE, 904, Short.MAX_VALUE)
        				.addComponent(pnlShowBottom, GroupLayout.DEFAULT_SIZE, 904, Short.MAX_VALUE)
        				.addComponent(pnlShowTop, GroupLayout.DEFAULT_SIZE, 904, Short.MAX_VALUE))
        			.addContainerGap())
        );
        gl_pnlMain.setVerticalGroup(
        	gl_pnlMain.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_pnlMain.createSequentialGroup()
        			.addComponent(pnlShowTop, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(pnlMainR, GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(pnlShowBottom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        		.addComponent(pnlMainL, GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
        );
        pnlMainR.setLayout(null);
        pnlMain.setLayout(gl_pnlMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(pnlMain, GroupLayout.DEFAULT_SIZE, 1101, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(pnlMain, GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
        );
        getContentPane().setLayout(layout);

        pack();
        setLocationRelativeTo(null);
    }                       
    
    /// ============== ///
    /// Button Control ///
    /// ============== ///
    
    private void btnOkChooseActionPerformed(ActionEvent evt) {
    	try{
    		// Check data source
    		String pathFile = folderDir +"\\"+ nameXMLConfig;
    		File f = new File(pathFile);
    		if(f.exists()){ 			
    			//checkDataSource(pathFile);
    			if(checkDataSrc){
            		//createFormHoaDon();
            		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            		String dateSelect = dateFormat.format(cbDBegin.getSelectedDate().getTime());
    			}
    		}  		  		
    		
    	}catch (Exception e) {
			JOptionPane op = new JOptionPane();
			op.showMessageDialog(pnlMain, e.getMessage());
		}
    }    
   
    private void btnSettingActionPerformed(ActionEvent evt){
    	MfrmSetting clsSetting = new MfrmSetting();
    	clsSetting.setVisible(true);
    }
    
    private void btnExitActionPerformed(ActionEvent evt) {   
    	this.dispose();
    	System.exit(0);
    } 
    
    /// ============== ///
    ///   Form HoaDon  ///
    /// ============== ///
    
    private void checkDataSource(String pathFile){
    	new Thread(new Runnable() {			
			@Override
			public void run() {
				try{
					int a = 0;
					int b = 0;
					pathDataSrc = "";
					// First, create a new XMLInputFactory
	    	        XMLInputFactory inputFactory = XMLInputFactory.newInstance();
	    	        // Setup a new eventReader
	    	        InputStream in = new FileInputStream(pathFile);
	    	        XMLEventReader eventReader = inputFactory.createXMLEventReader(in);
	    	        while(eventReader.hasNext()){
	    	        	XMLEvent event = eventReader.nextEvent();
	    	        	if(event.isStartElement()){
	    	        		StartElement startElement = event.asStartElement();
	    	        		if (startElement.getName().getLocalPart().equals("FolderData")){
	    	        			event = eventReader.nextEvent();
	    	        			pathDataSrc = event.asCharacters().getData();
	    	        			continue;
	    	        		}
	    	        		if (startElement.getName().getLocalPart().equals("ServBegin")){
	    	        			event = eventReader.nextEvent();
	    	        			a = Integer.valueOf(event.asCharacters().getData());
	    	        			continue;
	    	        		}
	    	        		if (startElement.getName().getLocalPart().equals("ServEnd")){
	    	        			event = eventReader.nextEvent();
	    	        			b = Integer.valueOf(event.asCharacters().getData());
	    	        			break;
	    	        		}
	    	        	}
	    	        }
	    	        String[] nameFileCheck = {"COMTSERV", "CSHTSERV", "INVTSERV", "RSNTSERV", "TRANSERV"};
	    	        for(int i=a;i<=b;i++){
	    	        	for(int j=0;j<=5;j++){
	    	        		//File f = new File(pathDataSrc + "\\")
	    	        	}
	    	        }
				}catch(Exception e){
					System.out.println(e.getMessage());
				}				
			}
		});
    }
    
    private void createFormHoaDon(){		
    	clsHoaDon = new JpnlHoaDon();   	
		pnlMainR.removeAll();
		pnlMainR.add( clsHoaDon.pnlHoaDon );
		pnlMainR.repaint();
		pnlMainR.revalidate();
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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }                
}
