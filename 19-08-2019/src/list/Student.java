package list;

import java.util.Set;
import java.util.TreeSet;

public class Student implements Comparable<Object> {

	private String firstName;
	private String lastName;
	private Double GPA;

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", GPA=" + GPA + "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Double getGPA() {
		return GPA;
	}

	public void setGPA(Double gPA) {
		GPA = gPA;
	}

	public Student() {
		super();
	}

	public Student(String firstName, String lastName, Double gPA) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		GPA = gPA;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Student student = (Student) o;
		if (this.getGPA() == (student.getGPA())) {
			return 0;
		} else if (this.getGPA() > (student.getGPA())) {
			return -1;
		} else
			return 1;
	}

	public static void main(String[] args) {
		Set <Student> set = new TreeSet<Student>();
		set.add(new Student("ajeet","giri",10.0));
		set.add(new Student("ram","murti",8.0));
		set.add(new Student("saket","saxena",5.0));
		Object [] obj =set.toArray();
		Student s =null;
		for (Object o: obj) {
			s = (Student)o;
			System.out.println(s);
			
		}
		
	}
}
