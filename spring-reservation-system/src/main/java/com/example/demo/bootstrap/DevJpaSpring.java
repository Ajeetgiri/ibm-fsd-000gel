package com.example.demo.bootstrap;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Flight;
import com.example.demo.entity.Passenger;
import com.example.demo.entity.Reservation;
import com.example.demo.repository.FlightRepository;
import com.example.demo.repository.PassengerRepository;
import com.example.demo.repository.ReservationRepository;


@Component
public class DevJpaSpring {
	private FlightRepository flightRepository;
	private PassengerRepository passengerRepository;
	private ReservationRepository reservationRepository;

	

	public DevJpaSpring(FlightRepository flightRepository, PassengerRepository passengerRepository,
			ReservationRepository reservationRepository) {
		super();
		this.flightRepository = flightRepository;
		this.passengerRepository = passengerRepository;
		this.reservationRepository = reservationRepository;
	}

	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		init();
	}

	private void init() {
		// TODO Auto-generated method stub
		Reservation reservation = new Reservation();
		reservation.setAmount("500");
		reservation.setDate("20-09-2019");
		reservationRepository.save(reservation);

		
		Passenger ajeet = new Passenger("Ajeet", "GIRI");
		Flight ddd = new Flight("Bangalore", "Delhi", reservation);
		ajeet.getFlight().add(ddd);
		ddd.getPassenger().add(ajeet);

          passengerRepository.save(ajeet);
		flightRepository.save(ddd);

		
		Passenger rod = new Passenger("Rod", "Johnson");
		Flight noEJB = new Flight("Delhi", "Kolkata", reservation);
		rod.getFlight().add(noEJB);
		noEJB.getPassenger().add(rod);

		passengerRepository.save(rod);
		flightRepository.save(noEJB);


}
}