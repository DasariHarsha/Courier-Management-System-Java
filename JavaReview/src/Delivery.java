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

public class Delivery {

	public JFrame frame14;
	private JTextField id_1;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Delivery window = new Delivery();
					window.frame14.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public Delivery() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame14 = new JFrame();
		frame14.setBounds(100, 100, 581, 364);
		frame14.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame14.getContentPane().setLayout(null);
		
		JLabel delivery_id = new JLabel("Order Id:");
		delivery_id.setFont(new Font("Times New Roman", Font.BOLD, 20));
		delivery_id.setBounds(149, 110, 88, 31);
		frame14.getContentPane().add(delivery_id);
		
		id_1 = new JTextField();
		id_1.setBounds(249, 114, 133, 27);
		frame14.getContentPane().add(id_1);
		id_1.setColumns(10);
		
		JLabel delivery_id_1 = new JLabel("Update Order");
		delivery_id_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		delivery_id_1.setBounds(188, 20, 184, 31);
		frame14.getContentPane().add(delivery_id_1);
		
		JButton update_bt = new JButton("Update");
		update_bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                String id=id_1.getText();
                Validation val =new Validation();
                int return_val=val.order(id);
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
					                 
					                 if(dif>=2){
					                	 
									 temp2[2]="Delivered";
									 String sum;
									 sum=temp2[0]+"\t"+temp2[1]+"\t"+temp2[2];
						
									    if(in1.hasNextLine()) {
									     temp1=temp1+sum+"\n";
									    }
									    else {
									    	temp1=temp1+sum;
									    }
									 JOptionPane.showMessageDialog(frame14, "Order Details Updated\n\nThank You ):");
					                 }
					                 
					                  else {
					                	 if(in1.hasNextLine()) {
					                	 temp1=temp1+temp3+"\n";
					                	 JOptionPane.showMessageDialog(frame14, "Order not Updated as it can't be delivered on the same day\n\n): ):");
					                	 }
					                	 else {
						                	 temp1=temp1+temp3;
						                	 JOptionPane.showMessageDialog(frame14, "Order not Updated as it can't be delivered on the same day\n\n): ):");
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
							JOptionPane.showMessageDialog(frame14, "Invalid orderid");
							
						}
					 
					 
					
				}catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Employee window = new Employee();
							window.frame12.setVisible(true);
							frame14.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					
				});
				
                }
				
			}
		});
		update_bt.setFont(new Font("Times New Roman", Font.BOLD, 20));
		update_bt.setBounds(188, 196, 111, 31);
		frame14.getContentPane().add(update_bt);
		
		JButton update_back = new JButton("back");
		update_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Employee window = new Employee();
							window.frame12.setVisible(true);
							frame14.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					
				});
			}
		});
		update_back.setFont(new Font("Times New Roman", Font.BOLD, 20));
		update_back.setBounds(331, 196, 111, 31);
		frame14.getContentPane().add(update_back);
	}
}
