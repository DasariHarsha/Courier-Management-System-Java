

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.*;
import java.awt.Font;


public class SignEmployee extends JFrame implements ActionListener{
	
    public JFrame frame13;
    JTextField t1,t2,t3,t4;
    JButton b;
    JLabel l1,l2,l3,l4;
    private JButton sign_back;
    private JLabel lblSignUp;
    
    public SignEmployee(){
         t1= new JTextField(20);
         t1.setBounds(139, 93, 166, 19);
         t2= new JTextField(20);
         t2.setBounds(139, 128, 166, 19);
         t3= new JTextField(20);
         t3.setBounds(139, 169, 166, 19);
         t4= new JTextField(20);
         t4.setBounds(139, 211, 166, 19);
         b=new JButton("signup");
         b.setFont(new Font("Times New Roman", Font.PLAIN, 17));
         b.setBounds(110, 265, 82, 29);
         l1= new JLabel("Name: ");
         l1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
         l1.setBounds(54, 92, 63, 16);
         l2=new JLabel("Email id: ");
         l2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
         l2.setBounds(53, 128, 76, 18);
         l3= new JLabel("Password: ");
         l3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
         l3.setBounds(47, 167, 82, 19);
         l4= new JLabel("Phone number: ");
         l4.setFont(new Font("Times New Roman", Font.PLAIN, 17));
         l4.setBounds(24, 209, 105, 19);
         
         
         
        getContentPane().setLayout(null);
        getContentPane().add(l1);
        getContentPane().add(t1);
        getContentPane().add(l2);
        getContentPane().add(t2);
        getContentPane().add(l3);
        getContentPane().add(t3);
        getContentPane().add(l4);
        getContentPane().add(t4);
        
        getContentPane().add(b);
        
        sign_back = new JButton("Back");
        sign_back.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							AdminOptions window = new AdminOptions();
							window.frame11.setVisible(true);
							dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
        	}
        });
        sign_back.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        sign_back.setBounds(223, 265, 82, 29);
        getContentPane().add(sign_back);
        
        lblSignUp = new JLabel("Sign Up");
        lblSignUp.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        lblSignUp.setBounds(146, 23, 122, 35);
        getContentPane().add(lblSignUp);
        
        b.addActionListener(this);
        setVisible(true);
        setSize(416, 377);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        String name=(t1.getText());
        String eid=(t2.getText());
        String psswd=(t3.getText());
        String ph=(t4.getText()); 
        
        Validation val =new Validation();
        int return_val=val.NotNull(name,eid,psswd,ph);
        if(return_val==0) {
        try {
        	FileWriter out = new FileWriter("SignUp.txt",true);
        	BufferedWriter b=new BufferedWriter(out);
        	b.write(name+"\t");
        	
        	b.write(eid+"\t");
        	
        	b.write(psswd+"\t");
        	
        	b.write(ph+"\t");
        	
        	
        	b.write("Employee");
        	b.newLine();
        	
        	b.close();
        	out.close();
        	JOptionPane.showMessageDialog(frame13, "Account created successfully");
        	AdminOptions window = new AdminOptions();
			window.frame11.setVisible(true);
        	dispose();
        	
        }catch(Exception e) {
        	System.out.println(e);
        }
        
       }  
    }
}
