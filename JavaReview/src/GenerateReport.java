import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class GenerateReport {

	public JFrame frame15;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GenerateReport window = new GenerateReport();
					window.frame15.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public GenerateReport() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame15 = new JFrame();
		frame15.setBounds(100, 100, 720, 413);
		frame15.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame15.getContentPane().setLayout(null);
		
		JButton orderdetailsbt = new JButton("");
		Image photo20 = new ImageIcon(this.getClass().getResource("/orderdetails.jpg")).getImage();
		orderdetailsbt.setIcon(new ImageIcon(photo20));
		orderdetailsbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try  
				{  
				//constructor of file class having file as argument  
				File file = new File("OrderId.txt");   
				if(!Desktop.isDesktopSupported())//check if Desktop is supported by Platform or not  
				{  
				System.out.println("not supported");  
				return;  
				}  
				Desktop desktop = Desktop.getDesktop();  
				if(file.exists())         //checks file exists or not  
				desktop.open(file);
				//opens the specified file  
				}  
				catch(Exception e3)  
				{  
				e3.printStackTrace();  
				}  
			}
		});
		orderdetailsbt.setBounds(86, 71, 202, 182);
		frame15.getContentPane().add(orderdetailsbt);
		
		JButton listofusersbt = new JButton("");
		listofusersbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try  
				{  
				//constructor of file class having file as argument  
				File file = new File("SignUp.txt");   
				if(!Desktop.isDesktopSupported())//check if Desktop is supported by Platform or not  
				{  
				System.out.println("not supported");  
				return;  
				}  
				Desktop desktop = Desktop.getDesktop();  
				if(file.exists())         //checks file exists or not  
				desktop.open(file);
				//opens the specified file  
				}  
				catch(Exception e3)  
				{  
				e3.printStackTrace();  
				}  
			}
			
		});
		Image photo21 = new ImageIcon(this.getClass().getResource("/listofusers.jpg")).getImage();
		listofusersbt.setIcon(new ImageIcon(photo21));
		listofusersbt.setBounds(399, 71, 202, 182);
		frame15.getContentPane().add(listofusersbt);
		
		JLabel lblOrderDetails = new JLabel("Order Details");
		lblOrderDetails.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblOrderDetails.setBounds(151, 263, 137, 25);
		frame15.getContentPane().add(lblOrderDetails);
		
		JLabel lblL = new JLabel("List Of Users");
		lblL.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblL.setBounds(436, 263, 137, 25);
		frame15.getContentPane().add(lblL);
		
		JButton report_back = new JButton("Back");
		report_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							AdminOptions window = new AdminOptions();
							window.frame11.setVisible(true);
							frame15.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		report_back.setFont(new Font("Times New Roman", Font.BOLD, 20));
		report_back.setBounds(338, 310, 82, 25);
		frame15.getContentPane().add(report_back);
	}

}