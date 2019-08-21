package Swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class MyFrame2 {

	private JFrame frame;
private RS2XMLCConfig config;
private JTable table;
	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the application.
	 * @throws SQLException 
	 */
	public MyFrame2() throws SQLException {
		config=new RS2XMLCConfig();
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnLoadData = new JButton("Load Data");
		btnLoadData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ResultSet rs=config.getAllEmployee();
                  table.setModel(DbUtils.resultSetToTableModel(rs));
					// TODO Auto-generated catch block
				
				}catch(SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnLoadData.setBounds(61, 195, 96, 32);
		frame.getContentPane().add(btnLoadData);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(47, 40, 342, 118);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		frame.setVisible(true);
	}
}
