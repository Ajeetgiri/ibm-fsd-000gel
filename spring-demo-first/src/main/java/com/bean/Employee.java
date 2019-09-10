package com.bean;

public class Employee {
private int id;
private String firstName,lastName,email;
public Employee() {
	super();
}
public Employee(int id, String firstName, String lastName, String email) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
}

public Employee(String firstName) {
	super();
	this.firstName = firstName;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
@Override
public String toString() {
	return "Employee detail id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
}

public String getDetail() {
	return toString();
}


}
