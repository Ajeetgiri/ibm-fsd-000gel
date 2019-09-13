package Problem_statement_Employee;

import java.util.Scanner;

public class EmployeeBO {
	
	static Employee e = new Employee();
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main (String[] args) {
		 String name = null;
		String department = null;
		 String date = null;
		 int view;
		 int age = 0;
		 int salary = 0;
		int option;
		int id=1;
		System.out.println("Enter number of Employee Detail you want to enter");
		option = sc.nextInt();
		
		for(int i=1; i <= option;i++) {
			
			
			e.addEmployee(id++,name, department, date, salary, age);
		}
		
		System.out.println("ENTER 1 TO SEE THE LIST SORTED BY SALARY");
		view =sc.nextInt();
		if (view==1) {
	e.viewDetail();
		}
	
}
}
