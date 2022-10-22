package com.coderscampus.Assignment9.Web;


import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.Assignment9.Domain.Recipe;
import com.coderscampus.Assignment9.Repository.RecipeRepository;


@RestController
public class RecipeController {
	
	@Autowired
	private RecipeRepository Repository;
	
	@GetMapping("/gluten-free")
	public List<Recipe> getGlutenFree() throws IOException {
		return Repository.getRecipe()
						 .stream()
						 .filter((recipe) -> recipe.getGlutenFree() == true)
						 .collect(Collectors.toList());
}

	@GetMapping("/vegan")
	public List<Recipe> getVegan() throws IOException {
		return Repository.getRecipe()
						 .stream().filter((recipe) -> recipe.getVegan() == true)
						 .collect(Collectors.toList());
}

	@GetMapping("/vegan-and-gluten-free")
	public List<Recipe> getVeganAndGlutenFree() throws IOException{
		return Repository.getRecipe()
						 .stream().filter((recipe) -> recipe.getVegan() == true && recipe.getGlutenFree() == true)
						 .collect(Collectors.toList());
}

	@GetMapping("/vegetarian")
	public List<Recipe> getVegetarian() throws IOException {
		return Repository.getRecipe()
						 .stream()
						 .filter((recipe) -> recipe.getVegetarian() == true)
						 .collect(Collectors.toList());
}

	@GetMapping("/all-recipes")
	public List<Recipe> getAllRecipes() throws IOException {
		return Repository.getRecipe();
	}
}
