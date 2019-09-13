package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Ingredient;
@Repository
public interface IngredientRepository extends CrudRepository<Ingredient, Long> {

}
