package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Flight;

public interface FlightRepository extends CrudRepository<Flight, Long> {

}
