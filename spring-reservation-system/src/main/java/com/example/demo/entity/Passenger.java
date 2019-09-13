package com.example.demo.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class Passenger {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Pid;
	
	private String firstName;
	private String lastName;
	
	@ManyToMany
	@JoinTable(name="passenger_flight", joinColumns=@JoinColumn(name="passenger_id"),
	inverseJoinColumns = @JoinColumn(name="flight_id"))
	private Set<Flight> flight = new HashSet<>();

	public Passenger() {
		super();
	}

	public Passenger(String firstName, String lastName, Set<Flight> flight) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.flight = flight;
	}

	public Passenger(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Long getPid() {
		return Pid;
	}

	public void setPid(Long pid) {
		Pid = pid;
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

	public Set<Flight> getFlight() {
		return flight;
	}

	public void setFlight(Set<Flight> flight) {
		this.flight = flight;
	}

	

}
