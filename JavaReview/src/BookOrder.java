import java.awt.EventQueue;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;

public class BookOrder {
	public double totalCharge=0;
	public long  orderid;
	public JFrame frame6;
	private JTextField orgintxt;
	private JTextField destinationtxt;
	private JTextField weighttxt;
	private JTextField lengthtxt;
	private JTextField breadthtxt;
	private JTextField heigthtxt;
	private JTextField distancetxt;
	private JTextField pick;
	private JTextField del;
	private JTextField send_ph;
	private JTextField rec_ph;
	

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public BookOrder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame6 = new JFrame();
		frame6.setBounds(100, 100, 742, 710);
		frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame6.getContentPane().setLayout(null);
		
		JLabel orginla = new JLabel("Orgin Pin");
		orginla.setFont(new Font("Times New Roman", Font.BOLD, 15));
		orginla.setBounds(93, 66, 81, 26);
		frame6.getContentPane().add(orginla);
		
		JLabel shipmenttypela = new JLabel("Shipment Type");
		shipmenttypela.setFont(new Font("Times New Roman", Font.BOLD, 15));
		shipmenttypela.setBounds(93, 305, 122, 26);
		frame6.getContentPane().add(shipmenttypela);
		
		orgintxt = new JTextField();
		orgintxt.setBounds(93, 95, 150, 32);
		frame6.getContentPane().add(orgintxt);
		orgintxt.setColumns(10);
		
		JLabel destinationla = new JLabel("Destination Pin");
		destinationla.setFont(new Font("Times New Roman", Font.BOLD, 15));
		destinationla.setBounds(402, 66, 111, 26);
		frame6.getContentPane().add(destinationla);
		
		destinationtxt = new JTextField();
		destinationtxt.setBounds(402, 95, 150, 32);
		frame6.getContentPane().add(destinationtxt);
		destinationtxt.setColumns(10);
		
		JComboBox shipmentty = new JComboBox();
		shipmentty.setFont(new Font("Times New Roman", Font.BOLD, 15));
		shipmentty.setBounds(93, 341, 150, 32);
		frame6.getContentPane().add(shipmentty);
		
		shipmentty.addItem("Non-Document");
		shipmentty.addItem("Document");
		
		JLabel weightla = new JLabel("Weight (Kg)");
		weightla.setFont(new Font("Times New Roman", Font.BOLD, 15));
		weightla.setBounds(402, 304, 81, 28);
		frame6.getContentPane().add(weightla);
		
		weighttxt = new JTextField();
		weighttxt.setBounds(402, 343, 96, 32);
		frame6.getContentPane().add(weighttxt);
		weighttxt.setColumns(10);
		
		JLabel contentla = new JLabel("Content");
		contentla.setFont(new Font("Times New Roman", Font.BOLD, 15));
		contentla.setBounds(93, 395, 74, 13);
		frame6.getContentPane().add(contentla);
		
		JComboBox contentty = new JComboBox();
		contentty.setFont(new Font("Times New Roman", Font.BOLD, 15));
		contentty.setBounds(93, 418, 150, 32);
		frame6.getContentPane().add(contentty);
		
		contentty.addItem("Artifical Items");
		contentty.addItem("Electronic Items");
		contentty.addItem("Food Items");
		contentty.addItem("Gift Items");
		contentty.addItem("Garments Cloths");
		contentty.addItem("Greeting Card");
		contentty.addItem("Furniture");
		
		JLabel lengthla = new JLabel("Length(cm)");
		lengthla.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lengthla.setBounds(402, 392, 81, 18);
		frame6.getContentPane().add(lengthla);
		
		JLabel breadthla = new JLabel("Breadth(cm)");
		breadthla.setFont(new Font("Times New Roman", Font.BOLD, 15));
		breadthla.setBounds(402, 437, 96, 18);
		frame6.getContentPane().add(breadthla);
		
		JLabel heightla = new JLabel("Height(cm)");
		heightla.setFont(new Font("Times New Roman", Font.BOLD, 15));
		heightla.setBounds(402, 479, 81, 18);
		frame6.getContentPane().add(heightla);
		
		
		
		lengthtxt = new JTextField();
		lengthtxt.setBounds(507, 387, 57, 32);
		frame6.getContentPane().add(lengthtxt);
		lengthtxt.setColumns(10);
		
		breadthtxt = new JTextField();
		breadthtxt.setColumns(10);
		breadthtxt.setBounds(507, 432, 57, 32);
		frame6.getContentPane().add(breadthtxt);
		
		heigthtxt = new JTextField();
		heigthtxt.setColumns(10);
		heigthtxt.setBounds(507, 474, 57, 32);
		frame6.getContentPane().add(heigthtxt);
		
		JLabel lblNewLabel_6 = new JLabel("BOOK ORDER");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6.setBounds(239, 26, 159, 26);
		frame6.getContentPane().add(lblNewLabel_6);
		
		JRadioButton diamound = new JRadioButton("Diamound");
		diamound.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		diamound.setFont(new Font("Times New Roman", Font.BOLD, 15));
		diamound.setBounds(246, 562, 93, 21);
		frame6.getContentPane().add(diamound);
		
		JRadioButton silver = new JRadioButton("Silver");
		silver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		silver.setFont(new Font("Times New Roman", Font.BOLD, 15));
		silver.setBounds(381, 562, 103, 21);
		frame6.getContentPane().add(silver);
		ButtonGroup bg=new ButtonGroup();
        bg.add(diamound);
        bg.add(silver);
        
		JLabel lblNewLabel = new JLabel("Choose plans");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(310, 533, 111, 23);
		frame6.getContentPane().add(lblNewLabel);
		
		JLabel lblDistancekm = new JLabel("Distance (Km)");
		lblDistancekm.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblDistancekm.setBounds(93, 463, 103, 26);
		frame6.getContentPane().add(lblDistancekm);
		
		distancetxt = new JTextField();
		distancetxt.setColumns(10);
		distancetxt.setBounds(93, 499, 96, 32);
		frame6.getContentPane().add(distancetxt);
		
		
		JButton quotebt = new JButton("GET QUOTE");
		quotebt.addActionListener(new ActionListener() {
			
			//add another frame
			
			public void actionPerformed(ActionEvent e) {
				String s_pin=orgintxt.getText();
				String r_pin=destinationtxt.getText();
				String pickUp=pick.getText();
				String destAdd=del.getText();
				String sendPh=send_ph.getText();
				String recPh=rec_ph.getText();
				String wght=weighttxt.getText();
				String dstnc=distancetxt.getText();
				String ln=lengthtxt.getText();
				String br=breadthtxt.getText();
				String ht=heigthtxt.getText();
				String typ=null;
				if(diamound.isSelected()) {
					typ="diamound";
				}
				else if(silver.isSelected()) {
					typ="silver";
				}
				Validation val =new Validation();
		        int return_val=val.book_order(s_pin,r_pin,pickUp,destAdd,sendPh,recPh,wght,dstnc,ln,br,ht,typ);
		        if(return_val==0) {
				 
				double wt=(Double.parseDouble(weighttxt.getText()));
				
		        double dst=(Double.parseDouble(distancetxt.getText()));
		        double charge=0;
		        String type=null;
		        if (wt<=0)
		            charge = 0;
		        else if (wt <= 0.1 && diamound.isSelected())
		            charge = 100;
		        else if (wt <= 0.1 && silver.isSelected())
		            charge = 80;
		        else if (wt <= 0.5 && diamound.isSelected())
		            charge = 200;
		        else if (wt <= 0.5 && silver.isSelected())
		            charge = 150;
		        else if (wt <= 1 && diamound.isSelected())
		            charge = 250;
		        else if (wt <= 1 && silver.isSelected())
		            charge = 210;
		        else if (wt > 1 && diamound.isSelected())
		            charge = 600;
		        else if (wt > 1 && silver.isSelected())
		            charge = 500;
		        if(dst<=50)
		            charge = charge +100;
		         else
		         {
		            charge=charge+200;
		         }
				totalCharge=charge;
		        JOptionPane.showMessageDialog(frame6, "Total Charge: "+charge);
		        
                
		        } 
		        
			}
		});
		quotebt.setFont(new Font("Times New Roman", Font.BOLD, 15));
		quotebt.setBounds(132, 606, 137, 32);
		frame6.getContentPane().add(quotebt);
		
		JButton btnContinue = new JButton("Continue");
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s_pin=orgintxt.getText();
				String r_pin=destinationtxt.getText();
				String pickUp=pick.getText();
				String destAdd=del.getText();
				String sendPh=send_ph.getText();
				String recPh=rec_ph.getText();
				String wght=weighttxt.getText();
				String dstnc=distancetxt.getText();
				String ln=lengthtxt.getText();
				String br=breadthtxt.getText();
				String ht=heigthtxt.getText();
				String typ=null;
				if(diamound.isSelected()) {
					typ="diamound";
				}
				else if(silver.isSelected()) {
					typ="silver";
				}
				Validation val =new Validation();
		        int return_val=val.book_order(s_pin,r_pin,pickUp,destAdd,sendPh,recPh,wght,dstnc,ln,br,ht,typ);
		        if(return_val==0) {
				File file=new File("Pincode.txt");
				Scanner in;
				try {
					in=new Scanner(file);
					int flag=0;
					int flag1=0;
					 //System.out.println(s_pin);
					 //System.out.println(r_pin);
					while(in.hasNextLine()) {
						String temp=in.nextLine();
						 temp.trim();
						 //System.out.println(temp);
						 
						if(s_pin.equals(temp)) {
							flag=1;
						}
						else if(r_pin.equals(temp)){
							flag1=1;
						}
						
					}
					
					if(flag==1 && flag1==1) {
						
						double wt=(Double.parseDouble(weighttxt.getText()));
						
				        double dst=(Double.parseDouble(distancetxt.getText()));
				        double charge=0;
				        String type=null;
				        if (wt<=0)
				            charge = 0;
				        else if (wt <= 0.1 && diamound.isSelected())
				            charge = 100;
				        else if (wt <= 0.1 && silver.isSelected())
				            charge = 80;
				        else if (wt <= 0.5 && diamound.isSelected())
				            charge = 200;
				        else if (wt <= 0.5 && silver.isSelected())
				            charge = 150;
				        else if (wt <= 1 && diamound.isSelected())
				            charge = 250;
				        else if (wt <= 1 && silver.isSelected())
				            charge = 210;
				        else if (wt > 1 && diamound.isSelected())
				            charge = 600;
				        else if (wt > 1 && silver.isSelected())
				            charge = 500;
				        if(dst<=50)
				            charge = charge +100;
				         else
				         {
				            charge=charge+200;
				         }
						totalCharge=charge;
				        //JOptionPane.showMessageDialog(frame6, "Total Charge: "+charge);
				        
		                
						
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									Payment window = new Payment();
									window.frame7.setVisible(true);
									frame6.dispose();
									window.lblNewLabel.setText("Total Charge: "+totalCharge);
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						});
						
					}
					
					else {
						JOptionPane.showMessageDialog(frame6, "OOPS!!\nSevice Not Availble");
					}
				
					
					
				}catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
		        }
		        //Random rand = new Random( ); // a pseudo-random number generator
				//rand.setSeed(System.currentTimeMillis( )); // use current time as a seed
                //orderid=rand.nextInt(1000000000);
                
                
				
			}
		});
		btnContinue.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnContinue.setBounds(310, 606, 137, 32);
		frame6.getContentPane().add(btnContinue);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							UserOptions window = new UserOptions();
							window.frame3.setVisible(true);
							frame6.dispose();
							
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnBack.setBounds(494, 606, 137, 32);
		frame6.getContentPane().add(btnBack);
		
		pick = new JTextField();
		pick.setColumns(10);
		pick.setBounds(93, 186, 150, 32);
		frame6.getContentPane().add(pick);
		
		JLabel lblRecieversAddress = new JLabel("Pick Up address");
		lblRecieversAddress.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblRecieversAddress.setBounds(93, 150, 137, 26);
		frame6.getContentPane().add(lblRecieversAddress);
		
		del = new JTextField();
		del.setColumns(10);
		del.setBounds(402, 186, 150, 32);
		frame6.getContentPane().add(del);
		
		JLabel orginla_1_1 = new JLabel("Delivery Address");
		orginla_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		orginla_1_1.setBounds(402, 150, 122, 26);
		frame6.getContentPane().add(orginla_1_1);
		
		send_ph = new JTextField();
		send_ph.setColumns(10);
		send_ph.setBounds(93, 263, 150, 32);
		frame6.getContentPane().add(send_ph);
		
		rec_ph = new JTextField();
		rec_ph.setColumns(10);
		rec_ph.setBounds(402, 262, 150, 32);
		frame6.getContentPane().add(rec_ph);
		
		JLabel lblSendersPh = new JLabel("Senders Ph:");
		lblSendersPh.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblSendersPh.setBounds(93, 227, 137, 26);
		frame6.getContentPane().add(lblSendersPh);
		
		JLabel lblRecieversAddress_1_1 = new JLabel("Recievers Ph:");
		lblRecieversAddress_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblRecieversAddress_1_1.setBounds(402, 228, 137, 26);
		frame6.getContentPane().add(lblRecieversAddress_1_1);
		
		
	}
}