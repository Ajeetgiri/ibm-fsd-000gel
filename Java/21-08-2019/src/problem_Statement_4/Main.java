package problem_Statement_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of contacts: ");
		ArrayList<Contact> list = new ArrayList<Contact>();
		String name;
		String email;
		long mobile;
		String address;
		
		int num =sc.nextInt();
		for(int i=1;i<=num;i++) {
			System.out.println("enter contact "+i+" detail:");
			System.out.println("Enter name:");
			name = sc.next();
			System.out.println("Enter email:");
			email = sc.next();
			System.out.println("Enter mobile:");
			mobile = sc.nextLong();
			System.out.println("Enter address:");
			address = sc.next();
			list.add(new Contact(name, email, mobile, address));
			
		}
		Collections.sort(list);
		System.out.println("Contact list after sort by mobile number in descending order: ");
		for(Contact c: list) {
			System.out.println(c.getName()+"-"+c.getMobile());
		}
	}
	}


