package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Note {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String Recipe_note;
	
	
	@OneToOne(mappedBy = "note")
	private Recipe Recipe;
	
	
	
	public Note(String Recipe_note, Recipe Recipe) {
		super();
		this.Recipe_note = Recipe_note;
		this.Recipe = Recipe;
	}

	public Recipe getRecipe() {
		return Recipe;
	}

	public void setRecipe(Recipe Recipe) {
		this.Recipe = Recipe;
	}

	public Note() {
		super();
	}

	public Note(String Recipe_note) {
		super();
		this.Recipe_note = Recipe_note;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRecipe_note() {
		return Recipe_note;
	}

	public void setRecipe_note(String Recipe_note) {
		this.Recipe_note = Recipe_note;
	}



	
	
	
	

}
