package com.crud.CruddOperation;

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
private String Fname;
@Column(name="last_name")
private String Lname;
@Column(name="email")
private String email;
@Column(name="country")
private String country;
public Employee() {
	super();
}
public Employee(int id, String fname, String lname, String email, String country) {
	super();
	this.id = id;
	Fname = fname;
	Lname = lname;
	this.email = email;
	this.country = country;
}
@Override
public String toString() {
	return " id=" + id + ", Fname=" + Fname + ", Lname=" + Lname + ", email=" + email + ", country=" + country
			+ "";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFname() {
	return Fname;
}
public void setFname(String fname) {
	Fname = fname;
}
public String getLname() {
	return Lname;
}
public void setLname(String lname) {
	Lname = lname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}


}
