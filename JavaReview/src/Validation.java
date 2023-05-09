import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Validation {
	
  public int NotNull(String name,String mail,String pass,String ph) {
	 
	  if(name.equals(""))
	  {
		  JOptionPane.showMessageDialog(null, "Please Enter Your Name");
		  return 1;
	  }
	  
	  else if(!name.matches("[a-zA-Z]+")) {
		  JOptionPane.showMessageDialog(null, "Name Should contain only alphabets");
		  return 1;
	  }
	  else if(mail.equals("")) {
			JOptionPane.showMessageDialog(null, "Please Enter Email");
			return 1;
		}
	  else if(!mail.equals("")) {
		  if(!isValid(mail))
		  {
			  JOptionPane.showMessageDialog(null, "Please enter the correct mail");
			  return 1;
		  }
		  
		  else if(pass.equals("")){
			  JOptionPane.showMessageDialog(null, "Please Enter Password");
				return 1;
		  }
		  
		  else if(ph.equals("")) {
				JOptionPane.showMessageDialog(null, "Please Enter Phone number");	
				return 1;
			}
		  
		  else if(!ph.equals("")) {
					
			  if(!isPh(ph))
			  {
				  JOptionPane.showMessageDialog(null, "Please enter 10 digit Phone number");
				  return 1;
			  }
				
			}
	    }
	  

	  return 0;
		 
  }
  
  public boolean isValid(String email)
  {
      String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                          "[a-zA-Z0-9_+&*-]+)*@" +
                          "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                          "A-Z]{2,7}$";
                            
      Pattern pat = Pattern.compile(emailRegex);
      
      return pat.matcher(email).matches();
  }
  
  public boolean isPh(String p) {
	  String regex = "\\d{10}";
      //Creating a pattern object
      Pattern pattern = Pattern.compile(regex);
      //Creating a Matcher object
      Matcher matcher = pattern.matcher(p);
      //Verifying whether given phone number is valid
      if(matcher.matches()) {
         return true;
      } 
      
      return false;
  }
  
  public int NotNull(String mail,String pass,String typ) { //login page
	  if(mail.equals("")) {
			JOptionPane.showMessageDialog(null, "Please Enter Email");
			return 1;
		}
	  else if(pass.equals("")){
		  JOptionPane.showMessageDialog(null, "Please Enter Password");
			return 1;
	  }
	  else if(typ==null){
		  JOptionPane.showMessageDialog(null, "Please select type of user");
			return 1;
	  }
	  return 0;
  }
  
  public int order(String id_order){
	  if(id_order.equals("")) {
		  JOptionPane.showMessageDialog(null, "Please Enter Order no"); 
		  return 1;
	  }
	  
	  else if(!id_order.equals("")){
		  if(!isOrder(id_order))
		  {
			  JOptionPane.showMessageDialog(null, "Order Id should contain only digits");
			  return 1;
		  }
		  
	  }
	  
	  return 0;
  }
  
  public boolean isOrder(String p) {
	  String regex =  "[0-9]+";
      //Creating a pattern object
      Pattern pattern = Pattern.compile(regex);
      
      Matcher matcher = pattern.matcher(p);
      
      if(matcher.matches()) {
         return true;
      } 
      
      return false;
  }
  
  
  public int pin(String pin1,String pin2){
	  if(pin1.equals("")) {
		  JOptionPane.showMessageDialog(null, "Please Enter Senders Pincode "); 
		  return 1;
	  }
	  
	  else if(!pin1.equals("")){
		  if(!isPin(pin1))
		  {
			  JOptionPane.showMessageDialog(null, "Please Enter the correct 6 digit Senders pin code");
			  return 1;
		  }
		  
		  else if(pin2.equals("")) {
			  JOptionPane.showMessageDialog(null, "Please Enter Revcievers Pincode "); 
			  return 1;
		  }
		  else if(!pin2.equals("")) {
			  if(!isPin(pin2))
			  {
				  JOptionPane.showMessageDialog(null, "Please Enter the correct 6 digit Recievers pin code");
				  return 1;
			  }
		  }
		  
	  }
	  
	  
	  
	  
	  
	  return 0;
  }
 
  public boolean isPin(String p) { 
	  String regex =  "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";
      
      Pattern pattern = Pattern.compile(regex);
      
      Matcher matcher = pattern.matcher(p);
      
      if(matcher.matches()) {
         return true;
      } 
      
      return false;
  }
  
  
  
  public int order(String id_order,String name){//cancel form
	   if(name.equals(""))
	  {
		  JOptionPane.showMessageDialog(null, "Please Enter Your Name");
		  return 1;
		  
	  }
	   else if(!name.matches("[a-zA-Z]+")) {
			  JOptionPane.showMessageDialog(null, "Name Should contain only alphabets");
			  return 1;
		  }
	   else if(id_order.equals("")) {
		  JOptionPane.showMessageDialog(null, "Please Enter Order no"); 
		  return 1;
	  }
	  
	 
	  else if(!id_order.equals("")){
		  if(!isOrder(id_order))
		  {
			  JOptionPane.showMessageDialog(null, "Order Id should contain only digits");
			  return 1;
		  }
		  
	  }
	  
	  return 0;
  }
  
  public int complaint(String name,String mail,String type){//complaint form
	   if(name.equals(""))
	  {
		  JOptionPane.showMessageDialog(null, "Please Enter Your Name");
		  return 1;		  
	  }
	   else if(!name.matches("[a-zA-Z]+")) {
			  JOptionPane.showMessageDialog(null, "Name Should contain only alphabets");
			  return 1;
		  }
       else if(mail.equals("")) {
				JOptionPane.showMessageDialog(null, "Please Enter Email");
				return 1;
			}
	   else if(!mail.equals("")) {
			if(!isValid(mail))
			  {
				  JOptionPane.showMessageDialog(null, "Please enter the correct mail");
				  return 1;
			  }
			 else if(type.equals("")) {
				   JOptionPane.showMessageDialog(null, "Please Enter Complaint Type");
				   return 1;
			   }
	   }
  
	  return 0;
 }
  
  public int card(String cardNo,String cvvNo,String cName){//complaint form
	   if(cardNo.equals(""))
	  {
		  JOptionPane.showMessageDialog(null, "Please Enter Card Number");
		  return 1;		  
	  }
	  else if(!cardNo.equals("")) {
		  
			  if(!iscard(cardNo)) {
				  JOptionPane.showMessageDialog(null, "Please Enter the correct 12 digit Card number");
				  return 1;
			  }
			  
			  
			  else if(cvvNo.equals("")) {
					JOptionPane.showMessageDialog(null, "Please Enter CVV");
					return 1;
				}
			  
			  else if(!cvvNo.equals("")) {
					if(!iscvv(cvvNo)) {
					JOptionPane.showMessageDialog(null, "Please Enter the correct 3 digit CVV Number");
					  return 1;	
					}
					
					else if(cName.equals(""))
					  {
						  JOptionPane.showMessageDialog(null, "Please Enter Your Name printed on card");
						  return 1;	
					  }
					else if(!cName.matches("[a-zA-Z]+")) {
						  JOptionPane.showMessageDialog(null, "Name Should contain only alphabets");
						  return 1;
					  }
	
				}
 
	   }
 
	  return 0;
}
  
 public boolean iscard(String c) {
	 
	 String regex = "[0-9]{3}[0-9]{1}[0-9]{3}[0-9]{1}[0-9]{4}";
    
     Pattern pattern = Pattern.compile(regex);
    
     Matcher matcher = pattern.matcher(c);
     
     if(matcher.matches()) {
        return true;
     } 
     
     return false;
	 
 }
 public boolean iscvv(String c) {
	 
	 String regex = "\\d{3}";
    
     Pattern pattern = Pattern.compile(regex);
    
     Matcher matcher = pattern.matcher(c);
     
     if(matcher.matches()) {
        return true;
     } 
     
     return false;
	 
 }
 
 public int book_order(String o_pin,String d_pin,String pick_add,String del_add,String s_ph,String r_ph,String wt,String dist,String l,String b,String h,String type) {
	 if(o_pin.equals("")) {
		  JOptionPane.showMessageDialog(null, "Please Enter Senders Pincode "); 
		  return 1;
	  }
	  
	  else if(!o_pin.equals("")){
		  if(!isPin(o_pin))
		  {
			  JOptionPane.showMessageDialog(null, "Please Enter the correct 6 digit Senders pin code");
			  return 1;
		  }
		  
		  else if(d_pin.equals("")) {
			  JOptionPane.showMessageDialog(null, "Please Enter Revcievers Pincode "); 
			  return 1;
		  }
		  else if(!d_pin.equals("")) {
			  if(!isPin(d_pin))
			  {
				  JOptionPane.showMessageDialog(null, "Please Enter the correct 6 digit Recievers pin code");
				  return 1;
			  }
			  else if(pick_add.equals("")) {
				  JOptionPane.showMessageDialog(null, "Please Enter Pick Up address"); 
				  return 1;
				  
			  }
			  
			  else if(del_add.equals("")) {
				  JOptionPane.showMessageDialog(null, "Please Enter Destination address"); 
				  return 1;
				  
			  }
			  
			  else if(s_ph.equals("")) {
					JOptionPane.showMessageDialog(null, "Please Enter Senders Phone number");	
					return 1;
				}
			  
			  else if(!s_ph.equals("")) {
						
				  if(!isPh(s_ph))
				  {
					  JOptionPane.showMessageDialog(null, "Please enter 10 digit Senders Phone number");
					  return 1;
				  }
					
				  else if(r_ph.equals("")) {
						JOptionPane.showMessageDialog(null, "Please Enter Recievers Phone number");	
						return 1;
					}
				  
				  else if(!r_ph.equals("")) {
							
					  if(!isPh(r_ph))
					  {
						  JOptionPane.showMessageDialog(null, "Please enter 10 digit Recievers Phone number");
						  return 1;
					  }
					  else if(wt.equals("")) {
						  JOptionPane.showMessageDialog(null, "Please enter Weight of the package for estimation");
						  return 1;
					  }
					  else if(!wt.equals("")) {
						  if(!isdigit(wt)) {
						  JOptionPane.showMessageDialog(null, "Please enter a valid weight");
						  return 1;
						  }
						  else if(dist.equals("")) {
							  JOptionPane.showMessageDialog(null, "Please enter the distance");
							  return 1;
						  }
						  else if(!dist.equals("")) {
							  if(!isdigit(dist)) {
								  JOptionPane.showMessageDialog(null, "Please enter distance in digits only");
								  return 1;							  
							  }
							  else if(l.equals("")) {
								  JOptionPane.showMessageDialog(null, "Please enter length of package");
								  return 1;
							  }
							  else if(!l.equals("")) {
								  if(!isdigit(l)) {
									  JOptionPane.showMessageDialog(null, "Please enter length in digits only");
									  return 1;
								  }
								  else if(b.equals("")) {
									  JOptionPane.showMessageDialog(null, "Please enter Breadth of package");
									  return 1;
								  }
								  else if(!b.equals("")) {
									  if(!isdigit(b)) {
										  JOptionPane.showMessageDialog(null, "Please enter Breadth in digits only");
										  return 1;
									  }
									  else if(h.equals("")) {
										  JOptionPane.showMessageDialog(null, "Please enter height of package");
										  return 1;
									  }
									  else if(!h.equals("")) {
										  if(!isdigit(h)) {
											  JOptionPane.showMessageDialog(null, "Please enter height in digits only");
											  return 1;
										  }
										  else if(type==null) {
											  JOptionPane.showMessageDialog(null, "Please select plan from the radio buttons");
											  return 1;
										  }
										  
										  
									  }
									  
									  
								  }
								  
							  }
						  }
					  }
						
					}
				}
		  }
		  
       }
	 
	 return 0;
 }
 
public boolean isdigit(String c) {
	 
	String regex = "[+]?[0-9]*\\.?[0-9]+";
    
     Pattern pattern = Pattern.compile(regex);
    
     Matcher matcher = pattern.matcher(c);
     
     if(matcher.matches()) {
        return true;
     } 
     
     return false;
	 
 }



}
