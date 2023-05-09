import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class ComplaintForm {

	public JFrame frame5;
	private JTextField name_co;
	private JTextField type_co;
	private JTextField des_co;
	private JTextField co_email;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public ComplaintForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame5 = new JFrame();
		frame5.setBounds(100, 100, 660, 496);
		frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame5.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Register Complaint");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(236, 29, 171, 30);
		frame5.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(187, 106, 58, 24);
		frame5.getContentPane().add(lblNewLabel_1);
		
		name_co = new JTextField();
		name_co.setBounds(267, 109, 157, 24);
		frame5.getContentPane().add(name_co);
		name_co.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Complaint type");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(116, 188, 130, 24);
		frame5.getContentPane().add(lblNewLabel_1_1);
		
		type_co = new JTextField();
		type_co.setColumns(10);
		type_co.setBounds(267, 191, 157, 24);
		frame5.getContentPane().add(type_co);
		
		JLabel lblNewLabel_1_2 = new JLabel("Description");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(280, 240, 99, 24);
		frame5.getContentPane().add(lblNewLabel_1_2);
		
		des_co = new JTextField();
		des_co.setBounds(169, 277, 352, 96);
		frame5.getContentPane().add(des_co);
		des_co.setColumns(10);
		
		JButton submit_co = new JButton("Submit");
		submit_co.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=(name_co.getText());
		        String c_type=(type_co.getText());
		        String c_desc=(des_co.getText());
		        String c_eid=(co_email.getText());
		        Validation val =new Validation();
		        int return_val=val.complaint(name,c_eid,c_type);
		        if(return_val==0)
		        {
		        try {
		        	FileWriter out = new FileWriter("Complaint.txt",true);
		        	BufferedWriter b=new BufferedWriter(out);
		        	b.write(name+"\t");
		        	
		        	b.write(c_eid+"\t");
		        	
		        	b.write(c_type+"\t");
		        	
		        	b.write(c_desc+"\t");
		        	
		        	b.newLine();
		        	
		        	
		        	b.close();
		        	out.close();
		        	JOptionPane.showMessageDialog(frame5, "Complaint Registered Successfully!!");
		        	
		        	
		        	
		        }catch(Exception ea) {
		        	System.out.println(ea);
		        }
		       }
			}
		});
		submit_co.setFont(new Font("Times New Roman", Font.BOLD, 20));
		submit_co.setBounds(225, 395, 103, 24);
		frame5.getContentPane().add(submit_co);
		
		JButton back_co = new JButton("Back");
		back_co.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							UserOptions window = new UserOptions();
							window.frame3.setVisible(true);
							frame5.dispose();
							
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		back_co.setFont(new Font("Times New Roman", Font.BOLD, 20));
		back_co.setBounds(373, 395, 103, 24);
		frame5.getContentPane().add(back_co);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Email");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(187, 151, 58, 24);
		frame5.getContentPane().add(lblNewLabel_1_1_1);
		
		co_email = new JTextField();
		co_email.setColumns(10);
		co_email.setBounds(267, 154, 157, 24);
		frame5.getContentPane().add(co_email);
	}

}
