import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Desktop;  
import java.io.*;  

public class AdminOptions {

	public JFrame frame11;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminOptions window = new AdminOptions();
					window.frame11.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public AdminOptions() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame11 = new JFrame();
		 
		frame11.setBounds(100, 100, 758, 470);
		frame11.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame11.getContentPane().setLayout(null);
		
		JButton addbt = new JButton("");
		Image photo10 = new ImageIcon(this.getClass().getResource("/addemployee.jpg")).getImage();
		addbt.setIcon(new ImageIcon(photo10));
		addbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignEmployee obj=new SignEmployee(); 				
				frame11.dispose();
				
			}
		});
		addbt.setBounds(36, 76, 181, 158);
		frame11.getContentPane().add(addbt);
		
		
		
		JButton reportbt = new JButton("");
		reportbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							GenerateReport window = new GenerateReport();
							window.frame15.setVisible(true);
							frame11.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
			}
		});
		Image photo12 = new ImageIcon(this.getClass().getResource("/report.png")).getImage();
		reportbt.setIcon(new ImageIcon(photo12));
		reportbt.setBounds(293, 76, 181, 158);
		frame11.getContentPane().add(reportbt);
		
		JButton adminlogoutbt = new JButton("");
		adminlogoutbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Login window = new Login();
							window.frame.setVisible(true);
							frame11.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		Image photo13 = new ImageIcon(this.getClass().getResource("/logout.jpg")).getImage();
		adminlogoutbt.setIcon(new ImageIcon(photo13));
		adminlogoutbt.setBounds(535, 76, 181, 175);
		frame11.getContentPane().add(adminlogoutbt);
		
		JLabel addemployeela = new JLabel("Add Employee");
		addemployeela.setFont(new Font("Times New Roman", Font.BOLD, 18));
		addemployeela.setBounds(49, 261, 137, 25);
		frame11.getContentPane().add(addemployeela);
		
		JLabel lblNewLabel_1_1 = new JLabel("Generate Report");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(315, 261, 137, 25);
		frame11.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("LogOut");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(597, 261, 96, 25);
		frame11.getContentPane().add(lblNewLabel_1_2);
		
	}

}