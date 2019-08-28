package unitTesting;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ChatboardServer {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatboardServer window = new ChatboardServer();
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
	public ChatboardServer() {
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
		
		JButton btnSend = new JButton("Create Server");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int portnumber = 1236;
			      
		        
		        // Create a MulticastSocket
		        MulticastSocket serverMulticastSocket = null;
				try {
					serverMulticastSocket = new MulticastSocket(portnumber);
				} catch (IOException e3) {
					// TODO Auto-generated catch block
					e3.printStackTrace();
				}
		        System.out.println("MulticastSocket is created...");
		        
		        // Determine the IP address of a host, given the host name
		        InetAddress group = null;
				try {
					group = InetAddress.getByName("225.0.0.1");
				} catch (UnknownHostException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
		        
		        // getByName- returns IP address of given host
		        try {
					serverMulticastSocket.joinGroup(group);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		        System.out.println("joinGroup method is called...");
		        boolean infinite = true;
		        
		        // Continually receives data and prints them 
		        while(infinite) {
		            byte buf[] = new byte[1024];
		            DatagramPacket data =
		                    new DatagramPacket(buf, buf.length);
		            try {
		        		serverMulticastSocket.receive(data);
		        	} catch (IOException e) {
		        		// TODO Auto-generated catch block
		        		e.printStackTrace();
		        	}
		            String msg =
		                    new String(data.getData()).trim();
		            JTextField textField;
		            System.out.println("Message received from client =" + msg);
		        }
		        serverMulticastSocket.close();

		        }
			
		});
		btnSend.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		btnSend.setBounds(138, 177, 151, 54);
		frame.getContentPane().add(btnSend);
		
		textField = new JTextField();
		textField.setBounds(62, 60, 270, 106);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
	}

}
