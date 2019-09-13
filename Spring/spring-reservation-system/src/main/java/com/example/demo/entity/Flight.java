package com.example.demo.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity

public class Flight {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Fid;
	private String source;
	private String destination;
	
	@OneToOne
     private Reservation reservation;
	
	
	@ManyToMany(mappedBy = "flight")
	private Set<Passenger> passenger = new HashSet<>();

	

	public Flight(String source, String destination, Reservation reservation) {
		super();
		this.source = source;
		this.destination = destination;
		this.reservation = reservation;
		
	}

	
	public Flight(String source, String destination) {
		super();
		this.source = source;
		this.destination = destination;
	}


	public Flight() {
		super();
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public Long getFid() {
		return Fid;
	}

	public void setFid(Long fid) {
		Fid = fid;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Set<Passenger> getPassenger() {
		return passenger;
	}

	public void setPassenger(Set<Passenger> passenger) {
		this.passenger = passenger;
	}

}
