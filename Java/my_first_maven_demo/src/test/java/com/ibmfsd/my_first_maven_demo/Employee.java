package com.ibmfsd.my_first_maven_demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name = "employee1")
@Data

public class Employee {
	@Id
	@Column(name ="id")
	@ GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lasttName;
	@Column(name="email")
	private String email;
	@Column(name="country")
	private String country;
	
	
	public Employee() {
		super();
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lasttName=" + lasttName + ", email=" + email
				+ ", country=" + country + "]";
	}


	public Employee( String firstName, String lasttName, String email,String country) {
		super();
		
		this.firstName = firstName;
		this.lasttName = lasttName;
		this.email = email;
		this.country =country;
	}

}
