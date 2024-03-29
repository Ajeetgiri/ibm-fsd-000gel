package Problem_statement_Employee;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Employee implements Comparable<Object> {
	Scanner sc = new Scanner(System.in);
	Set<Employee> emp = new TreeSet<Employee>();
	private int id;
	private String name;
	private String department;
	private String date;
	private int age;
	private int salary;

	@Override
	public String toString() {
		return " \n id=" + id + ", name=" + name + ", department=" + department + ", date=" + date + ", age=" + age
				+ ", salary=" + salary + "";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public Employee() {
		super();
	}

	public Employee(int id, String name, String department, String date, int age, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.date = date;
		this.age = age;
		this.salary = salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Object o) {
		Employee e = (Employee) o;
		if (this.getSalary() == (e.getSalary())) {
			return 0;
		} else if (this.getSalary() > (e.getSalary())) {
			return 1;
		} else
			return -1;
	}

	public void addEmployee(int id, String name, String department, String date, int salary, int age) {
		System.out.println("Enter name of Employee " + id);
		name = sc.next();
		System.out.println("Enter Department of Employee");
		department = sc.next();
		System.out.println("Enter Date of Joining");
		date = sc.next();
		System.out.println("Enter Salary of Employee");
		salary = sc.nextInt();
		System.out.println("Enter Age of Employee");
		age = sc.nextInt();
		emp.add(new Employee(id, name, department, date, salary, age));

	}

	public void viewDetail() {
		System.out.println(emp.toString());
	}
}
