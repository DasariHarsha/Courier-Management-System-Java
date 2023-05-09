import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import java.awt.Panel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main mainframe = new main();
					mainframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 778, 491);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBounds(0, 0, 764, 456);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel show_image = new JLabel("");
		Image photo1 = new ImageIcon(this.getClass().getResource("/courier.png")).getImage();
		show_image.setIcon(new ImageIcon(photo1));
		show_image.setBounds(23, 63, 712, 385);
		panel.add(show_image);
		
		JLabel lblNewLabel = new JLabel("courier management");
		lblNewLabel.setBounds(455, 319, 142, 13);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("COURIER MANAGEMENT SERVICES");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel_1.setBounds(74, 74, 647, 80);
		panel.add(lblNewLabel_1);
		
		JButton signinbt = new JButton("SIGN IN");
		signinbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Login window = new Login();
							window.frame.setVisible(true);
							dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		signinbt.setFont(new Font("Times New Roman", Font.BOLD, 12));
		signinbt.setBounds(563, 10, 85, 30);
		panel.add(signinbt);
		
		JButton signupbt = new JButton("SIGN UP");
		signupbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUp obj=new SignUp(); 				
				dispose();
			}
		});
		signupbt.setFont(new Font("Times New Roman", Font.BOLD, 12));
		signupbt.setBounds(658, 10, 85, 30);
		panel.add(signupbt);
		
	}

}


