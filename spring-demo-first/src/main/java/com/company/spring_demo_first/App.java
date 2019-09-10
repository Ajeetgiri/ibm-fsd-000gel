package com.company.spring_demo_first;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.BasketballCoach;
import com.bean.Coach;
import com.bean.Employee;
import com.bean.EmployeeDao;

public class App {
	public static void main(String[] args) throws SQLException {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDao dao = context.getBean("eDao", EmployeeDao.class);
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.println("enter your choice\n"
					+ "1: to Create new detail\n"
					+ "2: to delete detail\n"
					+ "3: to update detail\n"
					+ "4 to view detail ");
			int i;
			i = s.nextInt();
			switch (i) {
			case 1:
				dao.createEmployee(new Employee("Saket"));
				break;
			case 2:
				dao.DeleteData(5);
				break;
			case 3:
				dao.UpdateData("Giri", 4);
				break;
			case 4:
				dao.ViewEmployee();
				break;
			}
			System.out.println("Press 0 to continue");
		} while (s.nextInt() == 0);

	}
}
