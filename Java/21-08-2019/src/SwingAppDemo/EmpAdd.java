package SwingAppDemo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

import Swing.MyFrame2;
import jdbc.Employee;
import jdbc.EmployeeService;
import jdbc.EmployeeServiceImpl;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class EmpAdd {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmpAdd window = new EmpAdd();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EmpAdd() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblEmployeeId = new JLabel("Employee Id");
		lblEmployeeId.setBounds(40, 11, 70, 23);
		frame.getContentPane().add(lblEmployeeId);

		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setHorizontalAlignment(SwingConstants.CENTER);
		lblFirstName.setBounds(26, 45, 84, 23);
		frame.getContentPane().add(lblFirstName);

		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(40, 79, 63, 23);
		frame.getContentPane().add(lblLastName);

		textField = new JTextField();
		textField.setBounds(132, 12, 182, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(132, 46, 182, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(132, 80, 182, 22);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		JButton btnAddEmployee = new JButton("Add Employee");
		btnAddEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					EmployeeService emp = new EmployeeServiceImpl();
					emp.createEmployee(new Employee(Integer.parseInt(textField.getText().toString()),
							textField_1.getText(), textField_2.getText(), textField_3.getText()));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnAddEmployee.setBounds(40, 172, 113, 31);
		frame.getContentPane().add(btnAddEmployee);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(40, 122, 63, 23);
		frame.getContentPane().add(lblEmail);

		textField_3 = new JTextField();
		textField_3.setBounds(132, 113, 182, 23);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);

		JButton btnSearchById = new JButton("Search By ID");
		btnSearchById.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					EmployeeService emp = new EmployeeServiceImpl();
					Employee obj = emp.getEmployeeById(Integer.parseInt(textField.getText().toString()));
					textField.setText("" + obj.getId() + "");
					textField_1.setText(obj.getFname());
					textField_2.setText(obj.getLname());
					textField_3.setText(obj.getEmail());
				} catch (SQLException e1) {

					e1.printStackTrace();
				}

			}
		});
		btnSearchById.setBounds(219, 168, 95, 31);
		frame.getContentPane().add(btnSearchById);

		JButton btnLoadAllData = new JButton("Load All Data");
		btnLoadAllData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					new MyFrame2();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnLoadAllData.setBounds(117, 214, 89, 23);
		frame.getContentPane().add(btnLoadAllData);
	}

}
