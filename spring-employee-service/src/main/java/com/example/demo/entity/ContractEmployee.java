package com.example.demo.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue( value = "contract_employee")
public class ContractEmployee extends Employee{
	
	private int paidPerHour;
	private int contract_year;
	public int getPaidPerHour() {
		return paidPerHour;
	}
	public void setPaidPerHour(int paidPerHour) {
		this.paidPerHour = paidPerHour;
	}
	public int getContract_year() {
		return contract_year;
	}
	public void setContract_year(int contract_year) {
		this.contract_year = contract_year;
	}
	public ContractEmployee(String fname, String lname, String email,int paidPerHour, int contract_year) {
		super( fname,lname,email);
		this.paidPerHour = paidPerHour;
		this.contract_year = contract_year;
	}
	public ContractEmployee() {
		super();
	}
	
	
 
	
	
}
