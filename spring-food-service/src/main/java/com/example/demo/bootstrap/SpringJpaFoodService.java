package com.example.demo.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Controller;

import com.example.demo.repository.NoteRepository;
import com.example.demo.entity.Ingredient;
import com.example.demo.entity.Note;
import com.example.demo.entity.Recipe;
import com.example.demo.repository.IngredientRepository;
import com.example.demo.repository.RecipeRepository;

public class SpringJpaFoodService implements ApplicationListener<ContextRefreshedEvent>{
	private NoteRepository noteRepository;
	private IngredientRepository ingredientRepository;
	private RecipeRepository recipeRepository;

	

	public SpringJpaFoodService(NoteRepository noteRepository, IngredientRepository ingredientRepository,
			RecipeRepository recipeRepository) {
		super();
		this.noteRepository = noteRepository;
		this.ingredientRepository = ingredientRepository;
		this.recipeRepository = recipeRepository;
	}

	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		init();
	}

	private void init() {
		// TODO Auto-generated method stub
		
	}

	public void intit() {
	Note note = new Note();
	note.setRecipe_note("this taste of the dish will be very decilicious if you eat it hot.");
	noteRepository.save(note);
	
	Ingredient ingredient =new Ingredient("chicken","2pieces");
	Recipe recipe = new Recipe("butter chicken Masal","20mins","Medium",4,note);
	ingredient.getRecipe().add(recipe);
	recipe.getIngredient().add(ingredient);
	
	recipeRepository.save(recipe);
	ingredientRepository.save(ingredient);
	
}
}
