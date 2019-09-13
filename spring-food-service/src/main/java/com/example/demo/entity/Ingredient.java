package com.example.demo.entity;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class Ingredient {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String amount,name;
	private String description;
	
	
	@ManyToMany(mappedBy="ingredient")
	
	
	private Set<Recipe> recipe =new HashSet<>();


	public Ingredient(String amount, String description, Set<Recipe> recipe) {
		super();
		this.amount = amount;
		this.description = description;
		this.recipe = recipe;
	}


	public Ingredient(String amount, String name, String description) {
		super();
		this.amount = amount;
		this.name = name;
		this.description = description;
	}


	public Ingredient(String amount, String description) {
		super();
		this.amount = amount;
		this.description = description;
	}


	public Ingredient() {
		super();
	}


	public String getAmount() {
		return amount;
	}


	public void setAmount(String amount) {
		this.amount = amount;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Set<Recipe> getRecipe() {
		return recipe;
	}


	public void setRecipie(Set<Recipe> recipe) {
		this.recipe = recipe;
	}

	
	
	
}
