package comm.example;

import java.util.Scanner;

public class ValidityTest {

	public static void main(String[] args) {
		Person11 p11 = new Person11();
		Scanner sc = new Scanner(System.in);

		for (int i = 0;; i++) {
			System.out.println("enter the first name");
			String fname = sc.next();
			System.out.println("enter the last name");
			String lname = sc.next();

			try {

				p11.checkName(fname, lname);
				System.out.println(p11.getFname() + " " + p11.getLname());
			} catch (NameValidity e) {

				System.out.println(e.getMessage());
			}

		}

	}
}
