import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Employee {

	public JFrame frame12;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee window = new Employee();
					window.frame12.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
	}*/

	/**
	 * Create the application.
	 */
	public Employee() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame12 = new JFrame();
		
		frame12.setBounds(100, 100, 778, 434);
		frame12.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame12.getContentPane().setLayout(null);
		
		JButton deliverybt = new JButton("");
		Image photo17 = new ImageIcon(this.getClass().getResource("/delivery.jpg")).getImage();
		deliverybt.setIcon(new ImageIcon(photo17));
		deliverybt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Delivery window = new Delivery();
							window.frame14.setVisible(true);
							frame12.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		deliverybt.setBounds(128, 72, 202, 182);
		frame12.getContentPane().add(deliverybt);
		
		JButton elogoutbt = new JButton("");
		Image photo16 = new ImageIcon(this.getClass().getResource("/logout.jpg")).getImage();
		elogoutbt.setIcon(new ImageIcon(photo16));
		elogoutbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Login window = new Login();
							window.frame.setVisible(true);
							frame12.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		elogoutbt.setBounds(407, 72, 194, 182);
		frame12.getContentPane().add(elogoutbt);
		
		JLabel edeliveryla = new JLabel("Delivery");
		edeliveryla.setFont(new Font("Times New Roman", Font.BOLD, 18));
		edeliveryla.setBounds(168, 264, 137, 25);
		frame12.getContentPane().add(edeliveryla);
		
		JLabel logoutlb = new JLabel("Logout");
		logoutlb.setFont(new Font("Times New Roman", Font.BOLD, 18));
		logoutlb.setBounds(481, 264, 137, 25);
		frame12.getContentPane().add(logoutlb);
		
		
	}
}