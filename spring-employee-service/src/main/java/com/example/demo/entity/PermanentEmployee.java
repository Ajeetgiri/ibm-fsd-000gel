package com.example.demo.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("permanent_employee")
public class PermanentEmployee extends Employee {

	private int salary;
	private int commision;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getCommision() {
		return commision;
	}

	public void setCommision(int commision) {
		this.commision = commision;
	}

	public PermanentEmployee() {
		super();
	}

	public PermanentEmployee(String fname, String lname, String email, int salary) {
		super( fname, lname,  email);
		this.salary = salary;
		this.commision = salary / 100;
	}

}
