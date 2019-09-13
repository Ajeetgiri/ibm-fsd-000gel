package tester.example;
import comm.example.*;

public class EmpDetail {

	public static void main(String[] args) {
	Person p =null;
	p= new Pemployee(50000);
	
	System.out.println(p.getDetail());
	p= new Cemployee(200);
	
System.out.println(p.getDetail());
	}

}
