import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ButtonGroup;

public class Login {

	public JFrame frame;
	private JTextField email_txt;
	private JTextField pass_txt;
	private final Action action = new SwingAction();
	private JRadioButton User;
	private JRadioButton Admin;

	
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 582, 469);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel.setBounds(191, 39, 207, 42);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel email_la = new JLabel("EMAIL ID:");
		email_la.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		email_la.setBounds(102, 117, 152, 31);
		frame.getContentPane().add(email_la);
		
		JLabel pswd_la = new JLabel("PASSWORD:");
		pswd_la.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		pswd_la.setBounds(102, 195, 144, 31);
		frame.getContentPane().add(pswd_la);
		
		email_txt = new JTextField();
		email_txt.setBounds(276, 119, 133, 31);
		frame.getContentPane().add(email_txt);
		email_txt.setColumns(10);
		
		pass_txt = new JTextField();
		pass_txt.setBounds(276, 197, 133, 31);
		frame.getContentPane().add(pass_txt);
		pass_txt.setColumns(10);
		
		
		
		
		
		User = new JRadioButton("User");
		User.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(User.isSelected()) {
				Admin.setSelected(false);
			}
			}
		});
		User.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		User.setBounds(276, 257, 103, 21);
		frame.getContentPane().add(User);
		
		JRadioButton rdbtnEmployee = new JRadioButton("Employee");
		rdbtnEmployee.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		rdbtnEmployee.setBounds(381, 257, 126, 21);
		frame.getContentPane().add(rdbtnEmployee);
		
		JButton submit_bt = new JButton("SUBMIT");
		submit_bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String eid=email_txt.getText();
				String psswd=pass_txt.getText();
				String type=null;
				
				
				if(User.isSelected()) {
					type="User";
				}
				
				if(Admin.isSelected()) {
					type="Admin";
				}
				
				if(rdbtnEmployee.isSelected()) {
					type="Employee";
				}
				File file=new File("SignUp.txt");
				Scanner in;
				int flag=0;
				Validation val =new Validation();
		        int return_val=val.NotNull(eid,psswd,type);
		        if(return_val==0) {
				try {
					in = new Scanner(file);

						while(in.hasNextLine()) {
							String temp=in.nextLine();
							String[] line=temp.split("\t");
							if(line[1].equals(eid) && line[2].equals(psswd) && line[4].equals(type) ) {
								flag=1;
								break;
								
							}
							
							
						}
						if (flag==1) {
							JOptionPane.showMessageDialog(frame, "Logged in successfully");
							if(type=="User") {
								EventQueue.invokeLater(new Runnable() {
									public void run() {
										try {
											UserOptions window = new UserOptions();
											window.frame3.setVisible(true);
											frame.dispose();
											
										} catch (Exception e) {
											e.printStackTrace();
										}
									}
								});
								
							}
							
							else if(type=="Admin") {
								EventQueue.invokeLater(new Runnable() {
									public void run() {
										try {
											AdminOptions window = new AdminOptions();
											window.frame11.setVisible(true);
											frame.dispose();
										} catch (Exception e) {
											e.printStackTrace();
										}
									}
								});
								
							}
							
							else if(type=="Employee") {
								EventQueue.invokeLater(new Runnable() {
									public void run() {
										try {
											Employee window = new Employee();
											window.frame12.setVisible(true);
											frame.dispose();
										} catch (Exception e) {
											e.printStackTrace();
										}
									}
									
								});
								
							}
							
						}
							
						else {
							JOptionPane.showMessageDialog(frame, "Invalid Credentials");
							
						}
					}
					
				catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
		       }

			}
		});
		submit_bt.setFont(new Font("Times New Roman", Font.BOLD, 20));
		submit_bt.setBounds(151, 313, 119, 31);
		frame.getContentPane().add(submit_bt);
		
		Admin = new JRadioButton("Admin");
		Admin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Admin.isSelected()) {
					User.setSelected(false);
				}
			}
		});
		Admin.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		Admin.setBounds(151, 257, 103, 21);
		frame.getContentPane().add(Admin);
		
		
		ButtonGroup bg=new ButtonGroup();
        bg.add(rdbtnEmployee);
        bg.add(User);
        bg.add(Admin);
        
        JButton login_back = new JButton("back");
        login_back.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		EventQueue.invokeLater(new Runnable() {
        			public void run() {
        				try {
        					main mainframe = new main();
        					mainframe.setVisible(true);
        					frame.dispose();
        				} catch (Exception e) {
        					e.printStackTrace();
        				}
        			}
        		});
        	}
        });
        login_back.setFont(new Font("Times New Roman", Font.BOLD, 20));
        login_back.setBounds(324, 313, 119, 31);
        frame.getContentPane().add(login_back);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			
		}
	}
}