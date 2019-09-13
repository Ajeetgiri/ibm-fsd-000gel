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
import javax.persistence.OneToOne;

@Entity
public class Recipe {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String cook_time, difficulty, name;
	private int Serving;

	@OneToOne

	private Note note;

	@ManyToMany
	@JoinTable(name = "recipe_ingredient", joinColumns = @JoinColumn(name = "recipe_id"), inverseJoinColumns = @JoinColumn(name = "indredient_id"))

	private Set<Ingredient> ingredient = new HashSet<Ingredient>();

	public Recipe(String cook_time, String difficulty, int serving, Set<Ingredient> ingredient) {
		super();
		this.cook_time = cook_time;
		this.difficulty = difficulty;
		Serving = serving;
		this.ingredient = ingredient;
	}

	public Set<Ingredient> getIngredient() {
		return ingredient;
	}

	public void setIngredient(Set<Ingredient> ingredient) {
		this.ingredient = ingredient;
	}

	public Recipe(String name, String cook_time, String difficulty, int serving, Note note) {
		super();
		this.cook_time = cook_time;
		this.difficulty = difficulty;
		Serving = serving;
		this.name = name;
		this.note = note;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Recipe() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCook_time() {
		return cook_time;
	}

	public void setCook_time(String cook_time) {
		this.cook_time = cook_time;
	}

	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}

	public int getServing() {
		return Serving;
	}

	public void setServing(int serving) {
		Serving = serving;
	}

}
