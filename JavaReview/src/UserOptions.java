
import java.awt.EventQueue;
import java.awt.*;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class UserOptions extends javax.swing.JFrame{

	public JFrame frame3;

	/**
	 * Launch the application.
	 */
	
	
	/**
	 * Create the application.
	 */
	public UserOptions() {
		initialize();
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame3 = new JFrame();
		
		frame3.setBounds(1000, 500, 806, 527);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3.getContentPane().setLayout(null);
		
		JButton orderbt = new JButton("");
		Image photo = new ImageIcon(this.getClass().getResource("/bo1.jpg")).getImage();
		orderbt.setIcon(new ImageIcon(photo));
		orderbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							BookOrder window = new BookOrder();
							window.frame6.setVisible(true);
							frame3.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		orderbt.setBounds(10, 10, 242, 182);
		frame3.getContentPane().add(orderbt);
		
		JButton servicebt = new JButton("");
		Image photo1 = new ImageIcon(this.getClass().getResource("/service.png")).getImage();
		servicebt.setIcon(new ImageIcon(photo1));
		servicebt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							SeviceForm window = new SeviceForm();
							window.frame4.setVisible(true);
							frame3.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
			}
		});
		servicebt.setBounds(291, 10, 242, 182);
		frame3.getContentPane().add(servicebt);
		
		JButton Registerbt = new JButton("");
		Image photo2 = new ImageIcon(this.getClass().getResource("/complaint.png")).getImage();
		Registerbt.setIcon(new ImageIcon(photo2));
		Registerbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							ComplaintForm window = new ComplaintForm();
							window.frame5.setVisible(true);
							frame3.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		Registerbt.setBounds(10, 256, 212, 160);
		frame3.getContentPane().add(Registerbt);
		
		JButton tracksbt = new JButton("");
		tracksbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							TrackForm window = new TrackForm();
							window.frame10.setVisible(true);
							frame3.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		Image photo3 = new ImageIcon(this.getClass().getResource("/track.jpg")).getImage();
		tracksbt.setIcon(new ImageIcon(photo3));
		tracksbt.setBounds(268, 256, 242, 160);
		frame3.getContentPane().add(tracksbt);
		
		JButton cancelbt = new JButton("");
		Image photo4 = new ImageIcon(this.getClass().getResource("/cancel.png")).getImage();
		cancelbt.setIcon(new ImageIcon(photo4));
		cancelbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							CancelForm window = new CancelForm();
							window.frame9.setVisible(true);
							frame3.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
				
				
			}
		});
		cancelbt.setBounds(574, 10, 190, 182);
		frame3.getContentPane().add(cancelbt);
		
		JLabel lblNewLabel = new JLabel("BOOK ORDER");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(54, 184, 254, 80);
		frame3.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Service Availability");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(318, 202, 212, 44);
		frame3.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Register Complaint");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2.setBounds(35, 438, 187, 32);
		frame3.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Track Order");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_3.setBounds(328, 438, 140, 32);
		frame3.getContentPane().add(lblNewLabel_3);
		
		JButton logoutbt = new JButton("");
		Image photo5 = new ImageIcon(this.getClass().getResource("/logout.jpg")).getImage();
		logoutbt.setIcon(new ImageIcon(photo5));
		logoutbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Login window = new Login();
							window.frame.setVisible(true);
							frame3.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		logoutbt.setBounds(559, 256, 202, 157);
		frame3.getContentPane().add(logoutbt);
		
		JLabel lblNewLabel_1_1 = new JLabel("Cancel Order");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(614, 202, 212, 44);
		frame3.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Log out");
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_3_1.setBounds(624, 438, 140, 32);
		frame3.getContentPane().add(lblNewLabel_3_1);
		
	}

}



