import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Payment {
	JLabel lblNewLabel;
	public double totalCharge;
	public JFrame frame7;
	private JTextField cardtxt;
	private JTextField cvvtxt;
	private JTextField cnametxt;

	
	public Payment() {
		
		
		initialize();
		
	}

	
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame7 = new JFrame();
		frame7.getContentPane().setFont(new Font("Times New Roman", Font.BOLD, 18));
		frame7.setBounds(100, 100, 805, 495);
		frame7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame7.getContentPane().setLayout(null);
		
		
		JLabel l2 = new JLabel("");
		Image photo1 = new ImageIcon(this.getClass().getResource("/card.jpg")).getImage();
		l2.setIcon(new ImageIcon(photo1));
		l2.setBounds(10, 10, 353, 418);
		frame7.getContentPane().add(l2);
		
		JLabel cardnola = new JLabel("CARD NUMBER");
		cardnola.setFont(new Font("Times New Roman", Font.BOLD, 18));
		cardnola.setBounds(391, 83, 147, 36);
		frame7.getContentPane().add(cardnola);
		
		cardtxt = new JTextField();
		cardtxt.setBounds(391, 139, 173, 28);
		frame7.getContentPane().add(cardtxt);
		cardtxt.setColumns(10);
		
		JLabel cvvla = new JLabel("CVV");
		cvvla.setFont(new Font("Times New Roman", Font.BOLD, 18));
		cvvla.setBounds(657, 95, 72, 13);
		frame7.getContentPane().add(cvvla);
		
		cvvtxt = new JTextField();
		cvvtxt.setBounds(657, 139, 72, 23);
		frame7.getContentPane().add(cvvtxt);
		cvvtxt.setColumns(10);
		
		JLabel cnamela = new JLabel("CARD HOLDER NAME");
		cnamela.setFont(new Font("Times New Roman", Font.BOLD, 18));
		cnamela.setBounds(391, 209, 228, 23);
		frame7.getContentPane().add(cnamela);
		
		cnametxt = new JTextField();
		cnametxt.setBounds(391, 251, 272, 28);
		frame7.getContentPane().add(cnametxt);
		cnametxt.setColumns(10);
		
		JLabel expdla = new JLabel("EXPIRATION DATE");
		expdla.setFont(new Font("Times New Roman", Font.BOLD, 18));
		expdla.setBounds(391, 301, 228, 28);
		frame7.getContentPane().add(expdla);
		
		JComboBox expmonth = new JComboBox();
		expmonth.setBounds(391, 350, 93, 21);
		frame7.getContentPane().add(expmonth);
		expmonth.addItem("Month");
		expmonth.addItem("01");
		expmonth.addItem("02");
		expmonth.addItem("03");
		expmonth.addItem("04");
		expmonth.addItem("05");
		expmonth.addItem("06");
		expmonth.addItem("07");
		expmonth.addItem("08");
		expmonth.addItem("09");
		expmonth.addItem("10");
		expmonth.addItem("11");
		expmonth.addItem("12");
		
		JComboBox expyear = new JComboBox();
		expyear.setBounds(519, 350, 85, 21);
		frame7.getContentPane().add(expyear);
		expyear.addItem("year");
		expyear.addItem("2022");
		expyear.addItem("2023");
		expyear.addItem("2024");
		expyear.addItem("2025");
		expyear.addItem("2026");
		expyear.addItem("2027");
		expyear.addItem("2028");
		expyear.addItem("2029");
		
		
		JLabel lblNewLabel_4 = new JLabel("PAYMENT");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_4.setBounds(391, 19, 126, 38);
		frame7.getContentPane().add(lblNewLabel_4);
		
		JButton paybt = new JButton("PAY NOW");
		paybt.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String card_no=cardtxt.getText();
				String cvv_no=cvvtxt.getText();
				String c_name=cnametxt.getText();
				Validation val =new Validation();
		        int return_val=val.card(card_no,cvv_no,c_name);
		        if(return_val==0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							paymentsuccessfull window = new paymentsuccessfull();
							window.frame8.setVisible(true);
							frame7.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				
				});
		       }
			}
		});
		paybt.setFont(new Font("Times New Roman", Font.BOLD, 18));
		paybt.setBounds(451, 400, 132, 28);
		frame7.getContentPane().add(paybt);
		
		lblNewLabel = new JLabel("Total Charge: ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(577, 30, 182, 23);
		frame7.getContentPane().add(lblNewLabel);
	}

}