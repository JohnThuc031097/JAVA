package com.thuc.reportview.gui;

import javax.swing.JPanel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.AbstractListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Cursor;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;


public class JpnlHoaDon extends JPanel {
		
	private DefaultListModel<String> listModel;
	private DefaultTableModel model;
	
	public JPanel pnlHoaDon;	
	public JTextField txtFillter;
	private JComboBox cbFillter;
	private JButton btnFillter, btnReset;	
	private JTable tblHD;
	
	public JpnlHoaDon() {
		setLayout(null);
		
		pnlHoaDon = new JPanel();
		pnlHoaDon.setLayout(null);
		pnlHoaDon.setBackground(Color.WHITE);
		pnlHoaDon.setBounds(0, 0, 921, 578);
		add(pnlHoaDon);
		
		JPanel pnlHDTop = new JPanel();
		pnlHDTop.setBackground(UIManager.getColor("CheckBox.darkShadow"));
		pnlHDTop.setBounds(0, 0, 921, 63);
		pnlHoaDon.add(pnlHDTop);
		pnlHDTop.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Filtering conditions:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(280, 11, 171, 34);
		pnlHDTop.add(lblNewLabel);
		
		cbFillter = new JComboBox();
		cbFillter.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cbFillter.setModel(new DefaultComboBoxModel(new String[] {"Till", "Cash", "Bill", "Customser", "CKTM", "PMH(0)", "PMH(1)", "Bank", "Unpaid"}));
		cbFillter.setFont(new Font("Times New Roman", Font.BOLD, 14));
		cbFillter.setBounds(461, 17, 144, 25);
		pnlHDTop.add(cbFillter);
		
		txtFillter = new JTextField();
		txtFillter.setForeground(new Color(255, 69, 0));
		txtFillter.setBackground(new Color(255, 250, 205));
		txtFillter.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtFillter.setHorizontalAlignment(SwingConstants.CENTER);
		txtFillter.setBounds(613, 13, 209, 34);
		pnlHDTop.add(txtFillter);
		txtFillter.setColumns(10);
		
		btnFillter = new JButton("Filter");
		btnFillter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnFillterActionPerformed(e);
			}
		});
		btnFillter.setBackground(new Color(255, 255, 255));
		btnFillter.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnFillter.setBounds(835, 11, 76, 36);
		pnlHDTop.add(btnFillter);
		
		btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnReset.setBackground(Color.WHITE);
		btnReset.setBounds(10, 11, 76, 36);
		pnlHDTop.add(btnReset);

		tblHD = new JTable();
		tblHD.setBackground(Color.WHITE);
		tblHD.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tblHD.setBounds(0, 0, 920, 515);
		tblHD.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		
        JScrollPane pnlViewTable = new JScrollPane(tblHD);
        pnlViewTable.setLocation(0, 63);
        pnlViewTable.setSize(920, 515);
        pnlHoaDon.add(pnlViewTable, BorderLayout.CENTER);     
		
        initTableHD();
	}
	
	/// =============== ///
	/// Button Control  ///
	/// ==============  ///
	
	private void btnFillterActionPerformed(ActionEvent evt) {       
    } 
	
	/// =============== ///
	///    Functions    ///
	/// ==============  ///
	
	private void initTableHD(){
		model = (DefaultTableModel) tblHD.getModel();
		model.addColumn("Till");
		model.addColumn("Cash");
		model.addColumn("Bill");
		model.addColumn("Customser");
		model.addColumn("CKTM");
		model.addColumn("PMH(0)");
		model.addColumn("PMH(1)");
		model.addColumn("Bank");
		model.addColumn("Unpaid");
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
