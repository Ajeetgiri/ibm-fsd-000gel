
package list;

import java.util.Scanner;

public class StudTest {
	public static void main(String[] args) {

		Sdetail s = new Sdetail();

		do {
			System.out.println("enter your option :" +"\n"+ " 1-Add" +"\n"+ " 2-Delete" +"\n"+ " 3-View" +"\n"+  " 4-Update");
			Scanner sc = new Scanner(System.in);
			int option = sc.nextInt();

			switch (option) {
			case 1:

				System.out.println("enter the id");
				 int 
				 id = sc.nextInt();
				System.out.println("enter the name");
				String name = sc.next();
				System.out.println("enter the address");
				String address = sc.next();
				s.addDetail(id, name, address);
				break;
				
			case 2:
				System.out.println("enter the id");
				id = sc.nextInt();
				s.deleteDetail(id);
				System.out.println("record deleted");
				break;
			case 3:
				s.viewDetail();
				break;
			case 4:
				System.out.println("enter the id");
				id = sc.nextInt();
				s.updateDetail(id);
				break;

			}
		} while (true);
	}
}
