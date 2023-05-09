import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class CancelForm {

	public JFrame frame9;
	private JTextField name_cancel;
	private JTextField id_cancel;
	private JTextField reason_cancel;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CancelForm window = new CancelForm();
					window.frame9.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}*/

	/**
	 * Create the application.
	 */
	public CancelForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame9 = new JFrame();
		frame9.setBounds(100, 100, 680, 441);
		frame9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame9.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cancellation Request");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(195, 26, 277, 35);
		frame9.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(138, 114, 67, 24);
		frame9.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Order Id");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(120, 175, 85, 24);
		frame9.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Reason (Optional)");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(85, 236, 162, 24);
		frame9.getContentPane().add(lblNewLabel_1_2);
		
		name_cancel = new JTextField();
		name_cancel.setBounds(282, 114, 237, 24);
		frame9.getContentPane().add(name_cancel);
		name_cancel.setColumns(10);
		
		id_cancel = new JTextField();
		id_cancel.setColumns(10);
		id_cancel.setBounds(282, 178, 237, 24);
		frame9.getContentPane().add(id_cancel);
		
		reason_cancel = new JTextField();
		reason_cancel.setColumns(10);
		reason_cancel.setBounds(282, 236, 237, 24);
		frame9.getContentPane().add(reason_cancel);
		
		JButton cancel_bt = new JButton("Submit");
		cancel_bt.setFont(new Font("Times New Roman", Font.BOLD, 20));
		cancel_bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id=id_cancel.getText();
				String name_return=name_cancel.getText();
				Validation val =new Validation();
                int return_val=val.order(id,name_return);
                
                if(return_val==0) {
				File file=new File("OrderId.txt");
				Scanner in,in1;
				try {
					in=new Scanner(file);
					int flag=0;
					
					 //System.out.println(s_pin);
					 //System.out.println(r_pin);
					while(in.hasNextLine()) {
						String temp[]=in.nextLine().split("\t");
						String str="Procesing";
						
						 if(temp[0].equals(id+"")&&temp[2].equals(str))
						 {
							 flag=1;
							 break;
						 }
					}
					 if(flag==1) {
						 
					 String temp1="";
					 in1=new Scanner(file);
						 while(in1.hasNextLine()) {
							    String temp3=in1.nextLine();
								String temp2[]=temp3.split("\t");
								//System.out.println(temp3);
								
								 if(temp2[0].equals(id+""))
								 {
									 Calendar cal=new GregorianCalendar();
					                 int day=cal.get(Calendar.DAY_OF_MONTH);
					                 String var=temp2[1];
					                 String day_booked[]=var.split(":");
					                 int dif=Integer.parseInt(day_booked[0])>=day?(Integer.parseInt(day_booked[0])-day):(day-Integer.parseInt(day_booked[0]));
					                 
					                 if(dif<=1){
					                	 
									 temp2[2]="Cancelled";
									 String sum;
									 sum=temp2[0]+"\t"+temp2[1]+"\t"+temp2[2];
						
									    if(in1.hasNextLine()) {
									     temp1=temp1+sum+"\n";
									    }
									    else {
									    	temp1=temp1+sum;
									    }
									 JOptionPane.showMessageDialog(frame9, "Order Cancelled\n\nThank You ):");
					                 }
					                 
					                  else {
					                	 if(in1.hasNextLine()) {
					                	 temp1=temp1+temp3+"\n";
					                	 JOptionPane.showMessageDialog(frame9, "Order cannot be cancelled as it reached shipping process(>24hrs)");
					                	 }
					                	 else {
						                	 temp1=temp1+temp3;
						                	 JOptionPane.showMessageDialog(frame9, "Order cannot be cancelled as it reached shipping process(>24hrs)");
						                	 }
					                 }
									 
								 }
								 else {
									 
								     if(in1.hasNextLine()) {
								         temp1=temp1+temp3+"\n";
								      }
								
								     else {
					                	 temp1=temp1+temp3;
								     }
								 }
								 
	
					 }
				
						 PrintWriter fout = new PrintWriter("OrderId.txt"); 
						 fout.println(temp1);
						 fout.close();
			
					}
					
					
					 
				
					 else if(flag==0){
							JOptionPane.showMessageDialog(frame9, "Invalid orderid");
							
						}
					
				}catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
               }
			}
		});
		cancel_bt.setBounds(215, 339, 111, 33);
		frame9.getContentPane().add(cancel_bt);
		
		JButton cancel_bt_1 = new JButton("Back");
		cancel_bt_1.addActionListener(new ActionListener() {
			
				public void actionPerformed(ActionEvent e9) {
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								UserOptions window = new UserOptions();
								window.frame3.setVisible(true);
								frame9.dispose();
								
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
			}
			
		});
		cancel_bt_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		cancel_bt_1.setBounds(382, 339, 111, 33);
		frame9.getContentPane().add(cancel_bt_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Note:");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(195, 292, 56, 24);
		frame9.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Order cannot be cancelled after 24 hrs.");
		lblNewLabel_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_2_1.setBounds(261, 293, 271, 24);
		frame9.getContentPane().add(lblNewLabel_1_2_1);
	}
}
