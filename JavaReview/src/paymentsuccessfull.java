import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class paymentsuccessfull {

	public JFrame frame8;
	public long orderid;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public paymentsuccessfull() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame8 = new JFrame();
		frame8.setBounds(100, 100, 739, 480);
		frame8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame8.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Payment Successfull");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(248, 127, 273, 53);
		frame8.getContentPane().add(lblNewLabel);
		
		JButton order_idbt = new JButton("Generate OrderId");
		order_idbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random rand = new Random(); // a pseudo-random number generator
				rand.setSeed(System.currentTimeMillis( )); // use current time as a seed
                orderid=rand.nextInt(1000000000);
                File file=new File("OrderId.txt");
				Scanner in;
				
				
				try {
					in = new Scanner(file);

						while(in.hasNextLine()) {
							String temp=in.nextLine();
							String temp1=orderid+"";
							
							if(temp.equals(temp1)){
								
								orderid=rand.nextInt(1000000000);
								
							}

						}

					}
					
				catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
                
                
                try {
                	FileWriter out = new FileWriter("OrderId.txt",true);
                	BufferedWriter b=new BufferedWriter(out);
                	b.write(orderid+"\t");
                	Calendar cal=new GregorianCalendar();
                	int day=cal.get(Calendar.DAY_OF_MONTH);
                	int month=cal.get(Calendar.MONTH);
                	month=month+1;
                	b.write(day+":"+month+"\t");
                	b.write("Procesing");
                	b.newLine();
                	b.close();
                	out.close();
                	JOptionPane.showMessageDialog(frame8, "Order Id: "+orderid+"\n\nNote: Please take a note of OrderId");
                	UserOptions window = new UserOptions();
					window.frame3.setVisible(true);
					frame8.dispose();
                	
                }catch(Exception eb) {
                	System.out.println(eb);
                }
			}
			
		});
		order_idbt.setFont(new Font("Times New Roman", Font.BOLD, 15));
		order_idbt.setBounds(303, 225, 166, 41);
		frame8.getContentPane().add(order_idbt);
	}
}
