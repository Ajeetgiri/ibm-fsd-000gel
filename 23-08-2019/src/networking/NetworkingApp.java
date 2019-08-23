package networking;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.awt.event.ActionEvent;

public class NetworkingApp {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NetworkingApp window = new NetworkingApp();
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
	public NetworkingApp() {
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
		
		JButton btnCalculateFact = new JButton("Calculate Fact");
		btnCalculateFact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Socket client = null;
		        
		        // Default port number we are going to use
		        int portnumber = 1234;
		        
		        
		        
		            try {
		                String msg = "";
		                
		                // Create a client socket
		                
		                client = new Socket(InetAddress.getLocalHost(), portnumber);
		                System.out.println("Client socket is created " + client);
		                
		                // Create an output stream of the client socket
		                OutputStream clientOut = client.getOutputStream();
		                PrintWriter pw = new PrintWriter(clientOut, true);
		                
		                // Create an input stream of the client socket
		                InputStream clientIn = client.getInputStream();
		                BufferedReader br = new BufferedReader(new
		                        InputStreamReader(clientIn));
		                
		                // Create BufferedReader for a standard input
		                BufferedReader stdIn = new BufferedReader(new
		                        InputStreamReader(System.in));
		                
		                //System.out.println("Enter your name. Type Bye to exit. ");
		                
		                // Read data from standard input device and write it
		                // to the output stream of the client socket.
		               
		                pw.println(textField.getText());
		                
		                // Read data from the input stream of the client socket.
		               // System.out.println("Message returned from the server = " + br.readLine());
		                textField_1.setText(br.readLine());
		                pw.close();
		                br.close();
		                client.close();
		                
		                // Stop the operation
		                
		                
		            } catch (IOException ie) {
		                System.out.println("I/O error - Start server and turn off Firewall" + ie);
		            }
		        }
			
		});
		btnCalculateFact.setBounds(80, 146, 111, 34);
		frame.getContentPane().add(btnCalculateFact);
		
		textField = new JTextField();
		textField.setBounds(156, 23, 95, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(156, 83, 96, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEnterNum = new JLabel("Enter Num");
		lblEnterNum.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblEnterNum.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterNum.setBounds(26, 22, 66, 26);
		frame.getContentPane().add(lblEnterNum);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblResult.setBounds(27, 83, 65, 26);
		frame.getContentPane().add(lblResult);
	}

}
