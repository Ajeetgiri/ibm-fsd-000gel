package Problem_Statement_Password;

import java.util.Scanner;

public class PasswordTester {

	public static void main(String[] args) {
		PasswordValidator w= new PasswordValidator();
	Scanner sc = new Scanner(System.in);
	String password;
	boolean p;
	System.out.println("enter password");
	password=sc.next();
	
	p = PasswordValidator.PasswordMatcher(password);
	
if(p==true
) {
	System.out.println("valid password");
}else{
	System.out.println("invalid password");
}
	}

}
