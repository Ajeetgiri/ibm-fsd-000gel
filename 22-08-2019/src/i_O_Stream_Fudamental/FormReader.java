package i_O_Stream_Fudamental;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class FormReader {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormReader window = new FormReader();
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
	public FormReader() {
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
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(22, 11, 383, 199);
		frame.getContentPane().add(textArea);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String s = textArea.getText();
				File outputFile =new File("Giri.txt");
				
				FileOutputStream out = null;
				String s1 =textArea.getText();
				int c=0;
				textArea.setText("");
				 try {
					out = new FileOutputStream(outputFile);
				} catch (FileNotFoundException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				for(int i=0;i<s.length();i++) {
					c= s.charAt(i);
					try {
						out.write(c);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}}
				
				
			try {
				out.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
					
		});
		btnSave.setBounds(32, 221, 103, 29);
		frame.getContentPane().add(btnSave);
		
		JButton btnReadData = new JButton("Read Data");
		btnReadData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileReader in = null;
				try {
					in = new FileReader("Giri.txt");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				int c;
				String text ="";
				try {
					while ((c=in.read())!=-1){
						text = text+(char)c;
						textArea.setText(text);
						
						
						
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					in.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnReadData.setBounds(260, 221, 103, 29);
		frame.getContentPane().add(btnReadData);
	}
}
