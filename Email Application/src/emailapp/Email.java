package emailapp;

import java.util.Scanner;

public class Email {
	
	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private String alteremail;
	private String companysuffix = "sweta.com";
	private int defaultpasswordlength = 10;
	
	// Constructor to receive the firstname and lastname
	
	public Email(String firstname, String lastname){
		this.firstname = firstname;
		this.lastname = lastname;
		
		System.out.println("Email Created for:" + this.firstname+" "+this.lastname);
		
		// Call a method asking for department - return the department
		this.department = setDepartment();
		
		//Call a method to return a random password
		this.password = randPassword(defaultpasswordlength);
		System.out.println("Your Password is:"+this.password);
		
		//Generate the email syntax
		email = firstname + "."+ lastname +"@"+ department +"."+ companysuffix;
				
	}
	
	// Ask for department
	
	private String setDepartment(){
		
		System.out.println("DEPARTMENT CODES\n1 for Sale\n2 for Development\n3 for Accounting\n0 for none\n Enter the Department:");
		Scanner in = new Scanner(System.in);
		int deptChoice = in.nextInt();
		
		switch(deptChoice){
		
			case 1:
				return "Sale";
			case 2:
				return "Dvelopment";
			case 3:
				return "Accounting";
			default:
				return "None";
			
			}	
		}
	
	// Generate a Random Password
	
	private String randPassword(int length){
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456790!@$%&";
		char[] password = new char[length];
		
		for(int i=0; i<length; i++){
			
			int rand =(int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	//set the mailbox capacity
	public void setMailboxCapacity(int capacity){
		this.mailboxCapacity = capacity;
	}
	
	//set an alternate Email
	
	public void alternateEmail(String altEmail){
		this.alteremail = altEmail;
	}
	
	//Change the password
	public void setPassword(String password){
		this.password = password;
	}
	
	//get methods for MailboxCapacity , Alternate Email, New Password
	public int getMailboxCapacity() { return mailboxCapacity; }
	public String getAlterEmail() { return alteremail; }
	public String getPassword() { return password; }
	
	// Final Show Method 
	
	public String showInfo(){
		
		return "Name:"+ firstname + " " + lastname +
				"\nEmail:" + email +
				"\nMailbox Capacity:" + mailboxCapacity;
	}
	

}
