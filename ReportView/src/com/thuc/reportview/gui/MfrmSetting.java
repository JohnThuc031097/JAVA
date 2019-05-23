package com.thuc.reportview.gui;
import com.thuc.reportview.function.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.FileAlreadyExistsException;
import java.awt.event.ActionEvent;

public class MfrmSetting extends JFrame {
	private JPanel contentPane;
	private JPanel pnlSetting;
	private JTextField txtPathSrc;
	private JTextField txtServBegin;
	private JTextField txtServEnd;
	
	private String folderDir = System.getProperty("user.dir");
	private String nameXMLConfig = "config.xml";

	
	public MfrmSetting(){
		initComponents();
		loadXMLSetting();
	}
	
	public static void main(String[] args) {
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
                new MfrmSetting().setVisible(false);
            }
        });
	}

	@SuppressWarnings("unchecked")
    private void initComponents() {
		setResizable(false);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 336, 160);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		pnlSetting = new JPanel();
		pnlSetting.setBackground(Color.WHITE);
		pnlSetting.setBounds(0, 0, 330, 136);
		contentPane.add(pnlSetting);
		pnlSetting.setLayout(null);
		
		JLabel lblPathSource = new JLabel("Path source:");
		lblPathSource.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblPathSource.setBounds(10, 11, 65, 20);
		pnlSetting.add(lblPathSource);
		
		txtPathSrc = new JTextField();
		txtPathSrc.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtPathSrc.setBounds(82, 11, 136, 20);
		pnlSetting.add(txtPathSrc);
		txtPathSrc.setColumns(10);
		
		JButton btnBrowser = new JButton("Browses");
		btnBrowser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnBrowserActionPerformed(e);
			}
		});
		btnBrowser.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnBrowser.setBounds(228, 10, 89, 23);
		pnlSetting.add(btnBrowser);
		
		JLabel lblServ = new JLabel("Server:");
		lblServ.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblServ.setBounds(10, 43, 65, 20);
		pnlSetting.add(lblServ);
		
		txtServBegin = new JTextField();
		txtServBegin.setText("1");
		txtServBegin.setHorizontalAlignment(SwingConstants.CENTER);
		txtServBegin.setBounds(82, 42, 53, 20);
		pnlSetting.add(txtServBegin);
		txtServBegin.setColumns(10);
		
		JLabel lblFrom = new JLabel("to");
		lblFrom.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblFrom.setBounds(145, 43, 10, 20);
		pnlSetting.add(lblFrom);
		
		txtServEnd = new JTextField();
		txtServEnd.setText("14");
		txtServEnd.setHorizontalAlignment(SwingConstants.CENTER);
		txtServEnd.setColumns(10);
		txtServEnd.setBounds(165, 42, 53, 20);
		pnlSetting.add(txtServEnd);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSaveActionPerformed(e);
			}
		});
		btnSave.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnSave.setBounds(61, 102, 89, 23);
		pnlSetting.add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCancelActionPerformed(e);
			}
		});
		btnCancel.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnCancel.setBounds(165, 102, 89, 23);
		pnlSetting.add(btnCancel);
		
		//pack();
        setLocationRelativeTo(null);
	}
	
	//// ============== ////
	//// Button Control ////
	//// ============== ////
	
	private void btnBrowserActionPerformed(ActionEvent e){
		JFileChooser folderOpen = new JFileChooser(folderDir);
		folderOpen.setFileSelectionMode( JFileChooser.DIRECTORIES_ONLY);
		if(folderOpen.showDialog(pnlSetting, "Select") == 0){
			txtPathSrc.setText(folderOpen.getSelectedFile().getPath());
		}	
	}
	
	private void btnSaveActionPerformed(ActionEvent e){
		String pathFolder = txtPathSrc.getText();
		JOptionPane op = new JOptionPane();
		File f = new File(pathFolder);
		if(f.isDirectory()){			
			String ServA = txtServBegin.getText().trim();
			String ServB = txtServEnd.getText().trim();
			if(isInteger(ServA)){
				if(isInteger(ServB)){
					if(Integer.valueOf(ServA) <= Integer.valueOf(ServB)){
						saveConfig(folderDir +"\\"+ nameXMLConfig);
						op.showMessageDialog(pnlSetting, "Save Config Success !", "Infomation", JOptionPane.INFORMATION_MESSAGE);
					}else{
						op.showMessageDialog(pnlSetting, "ServBegin > ServEnd ??", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}else{
					op.showMessageDialog(pnlSetting, "Input data is not number-type !", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}else{
				op.showMessageDialog(pnlSetting, "Input data is not number-type !", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}else{
			op.showMessageDialog(pnlSetting, "Non-formatted folder type !", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void btnCancelActionPerformed(ActionEvent e){
		this.dispose();
	}
	
	//// ============== ////
	//// 	Function    ////
	//// ============== ////
	
	private void loadXMLSetting(){		
		try{
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();		
		    factory.setValidating(true);
		    String path = folderDir + "\\" + nameXMLConfig;		    
			File f = new File(path);
			if(!f.exists()){
				f.createNewFile();
				saveConfig(path);
			}else{
				initConfig(path);
			}
	
		}catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	private void saveConfig(String pathFile){
		try {
			XMLReadWrite xmlRW = new XMLReadWrite();
			xmlRW.setFile(pathFile);
			// create an XMLOutputFactory
	        XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
	        // create XMLEventWriter
	        XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(pathFile));
	        // create an EventFactory
	        XMLEventFactory eventFactory = XMLEventFactory.newInstance();
	        XMLEvent end = eventFactory.createDTD("\n");
	        // create and write Start Tag
	        StartDocument startDocument = eventFactory.createStartDocument();
	        eventWriter.add(startDocument);

	        // create config open tag
	        StartElement configStartElement = eventFactory.createStartElement("",
	                "", "Config");
	        eventWriter.add(end);
	        eventWriter.add(configStartElement);
	        eventWriter.add(end);
	        
	        xmlRW.createNode(eventWriter, "FolderData", txtPathSrc.getText().trim());
	        xmlRW.createNode(eventWriter, "ServBegin", txtServBegin.getText().trim());
	        xmlRW.createNode(eventWriter, "ServEnd", txtServEnd.getText().trim());
	        
	        eventWriter.add(eventFactory.createEndElement("", "", "Config"));
	        eventWriter.add(end);
	        eventWriter.add(eventFactory.createEndDocument());
	        eventWriter.close();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	private void initConfig(String pathFile){
		try {
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
	        			txtPathSrc.setText(event.asCharacters().getData());
	        			continue;
	        		}
	        		if (startElement.getName().getLocalPart().equals("ServBegin")){
	        			event = eventReader.nextEvent();
	        			txtServBegin.setText(event.asCharacters().getData());
	        			continue;
	        		}
	        		if (startElement.getName().getLocalPart().equals("ServEnd")){
	        			event = eventReader.nextEvent();
	        			txtServEnd.setText(event.asCharacters().getData());
	        			break;
	        		}
	        	}
	        }
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	private boolean isInteger(String input)
	{
	   try
	   {
	      Integer.parseInt( input );
	      return true;
	   }
	   catch(Exception ex)
	   {
	      return false;
	   }
	}
}
