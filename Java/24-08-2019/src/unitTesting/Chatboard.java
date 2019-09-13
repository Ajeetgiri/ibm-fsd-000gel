package unitTesting;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Chatboard {
	public String msg = "";

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chatboard window = new Chatboard();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public Chatboard() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize() throws IOException {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JButton btnSend = new JButton("Send");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int portnumber = 1236;
			       
		        
		        // Create a MulticastSocket
		        MulticastSocket chatMulticastSocket = null;
				try {
					chatMulticastSocket = new MulticastSocket(portnumber);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		        
		        // Determine the IP address of a host, given the host name
		        InetAddress group = null;
				try {
					group = InetAddress.getByName("225.0.0.1");
				} catch (UnknownHostException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		        
		        // Joins a multicast group
		        try {
					chatMulticastSocket.joinGroup(group);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				DatagramPacket data = new
		                DatagramPacket(msg.getBytes(), 0,
		                msg.length(), group, portnumber);
		        try {
					chatMulticastSocket.send(data);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		        
		        // Close the socket
		        chatMulticastSocket.close();
			}
		});
		btnSend.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		btnSend.setBounds(123, 200, 102, 34);
		frame.getContentPane().add(btnSend);
		
		textField = new JTextField();
		textField.setBounds(73, 76, 232, 90);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
        System.out.println("Type a message for the server:");
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        msg = br.readLine();
       msg= textField.getText();
	}
}
