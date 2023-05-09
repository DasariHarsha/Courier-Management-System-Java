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
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class TrackForm {

	public JFrame frame10;
	private JTextField id_track;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public TrackForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame10 = new JFrame();
		frame10.setBounds(100, 100, 651, 379);
		frame10.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame10.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Track Status");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(227, 25, 168, 51);
		frame10.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Order Id");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(165, 112, 88, 24);
		frame10.getContentPane().add(lblNewLabel_1);
		
		id_track = new JTextField();
		id_track.setBounds(260, 112, 184, 24);
		frame10.getContentPane().add(id_track);
		id_track.setColumns(10);
		
		JButton btnNewButton = new JButton("Track");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=id_track.getText();
				
				int flag=0;
				File file=new File("OrderId.txt");
				Scanner in;
				Validation val =new Validation();
                int return_val=val.order(id);
                if(return_val==0) {
				try {
					in=new Scanner(file);
					
					 
					while(in.hasNextLine()) {
						String temp[]=in.nextLine().split("\t");
						
						 if(temp[0].equals(id+""))
						 {
							
							 JOptionPane.showMessageDialog(frame10, "Order "+temp[2]);
							 flag=1;
							 break;
						 }
					}
					
				if(flag==0) {
					JOptionPane.showMessageDialog(frame10, "OOPS!!\nInvalid Order Id");
				}
				}catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
               }
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(243, 195, 85, 24);
		frame10.getContentPane().add(btnNewButton);
		
		JButton track_back = new JButton("Back");
		track_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							UserOptions window = new UserOptions();
							window.frame3.setVisible(true);
							frame10.dispose();
							
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		track_back.setFont(new Font("Times New Roman", Font.BOLD, 20));
		track_back.setBounds(369, 195, 85, 24);
		frame10.getContentPane().add(track_back);
	}

}
