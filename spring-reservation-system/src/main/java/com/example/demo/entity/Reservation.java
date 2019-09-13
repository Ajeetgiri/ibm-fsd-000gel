package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Reservation {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long Rid;
private String date;
private String amount;
public Reservation(String date, String amount) {
	super();
	this.date = date;
	this.amount = amount;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getAmount() {
	return amount;
}
public void setAmount(String amount) {
	this.amount = amount;
}
public Reservation() {
	super();
}



}
