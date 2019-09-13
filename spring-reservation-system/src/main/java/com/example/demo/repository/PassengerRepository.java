package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Passenger;

public interface PassengerRepository extends CrudRepository<Passenger, Long> {

}
