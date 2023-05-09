import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class SeviceForm {

	public JFrame frame4;
	private JTextField send_pin;
	private JTextField rec_pin;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public SeviceForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame4 = new JFrame();
		frame4.setBounds(100, 100, 670, 580);
		frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame4.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Senders Pincode");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(73, 75, 165, 29);
		frame4.getContentPane().add(lblNewLabel);
		
		send_pin = new JTextField();
		send_pin.setBounds(260, 75, 174, 26);
		frame4.getContentPane().add(send_pin);
		send_pin.setColumns(10);
		
		rec_pin = new JTextField();
		rec_pin.setBounds(260, 152, 174, 26);
		frame4.getContentPane().add(rec_pin);
		rec_pin.setColumns(10);
		
		JLabel lblRecieversPincode = new JLabel("Recievers Pincode");
		lblRecieversPincode.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblRecieversPincode.setBounds(73, 152, 165, 29);
		frame4.getContentPane().add(lblRecieversPincode);
		
		JButton find = new JButton("Find");
		
		find.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s_pin=send_pin.getText();
				String r_pin=rec_pin.getText();
				Validation val =new Validation();
		        int return_val=val.pin(s_pin,r_pin);
		        if(return_val==0) {
				File file=new File("Pincode.txt");
				Scanner in;
				try {
					in=new Scanner(file);
					int flag=0;
					int flag1=0;
					 //System.out.println(s_pin);
					 //System.out.println(r_pin);
					while(in.hasNextLine()) {
						String temp=in.nextLine();
						 temp.trim();
						 //System.out.println(temp);
						 
						if(s_pin.equals(temp)) {
							flag=1;
						}
						else if(r_pin.equals(temp)){
							flag1=1;
						}
						
					}
					
					if(flag==1 && flag1==1) {
						JOptionPane.showMessageDialog(frame4, "Sevice Availble");
						
					}
					
					else {
						JOptionPane.showMessageDialog(frame4, "OOPS!!\nSevice Not Availble");
					}
				
					
					
				}catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
		        }
				
			}
		});
		find.setFont(new Font("Times New Roman", Font.BOLD, 20));
		find.setBounds(192, 234, 85, 29);
		frame4.getContentPane().add(find);
		
		JLabel lblNewLabel_1 = new JLabel("SERVICE AVAILABILITY");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(206, 20, 251, 29);
		frame4.getContentPane().add(lblNewLabel_1);
		
		JButton back = new JButton("back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							UserOptions window = new UserOptions();
							window.frame3.setVisible(true);
							frame4.dispose();
							
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		back.setFont(new Font("Times New Roman", Font.BOLD, 20));
		back.setBounds(321, 234, 85, 29);
		frame4.getContentPane().add(back);
	}
}
