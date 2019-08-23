package emailapp;

import java.util.Scanner;

public class Email {
     private String firstName;
     private String lastName;
     private String password;
     private String department;
     private int mailboxcapacity;
     private String email;
     private int defaultPasswordLength;
     private String alteranteemail;
     private String companysuffix = "Amazon.com";
      
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email Craeted : "+this.firstName+" "+this.lastName);
		
		this.department = setDepartment();
		System.out.println("Department: "+this.department);
		this.password = randomPassword(8);
		System.out.println("Your Password: "+this.password);
		email = firstName.toLowerCase() + "."+lastName.toLowerCase()+ "@"+department+"."+companysuffix;
		System.out.println("Your Email is: "+email);
	}
	private String setDepartment() {
		System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter Department Code");
		Scanner in  = new Scanner(System.in);
		int depch = in.nextInt();
		if (depch == 1) {return "Sales"; }
		else if (depch == 2) {return "Development";}
		else if (depch == 3) {return "Account";}
		else {return "";}
	}
	private String randomPassword(int length) {
		String passwordset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567689@$%&";
		char[] password = new char[length];
        for (int i = 0; i<length; i ++)	{	
        int rand = (int) (Math.random() * passwordset.length());
        password[i] = passwordset.charAt(rand);
        
        }
        return new String(password);
	}
}
