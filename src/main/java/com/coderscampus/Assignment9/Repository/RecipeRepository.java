package com.coderscampus.Assignment9.Repository;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.coderscampus.Assignment9.Domain.Recipe;

@Repository
public class RecipeRepository {
	private List<Recipe> recipes = new ArrayList<>(100);

	public List<Recipe> getRecipes() {
		return recipes;
	}

}