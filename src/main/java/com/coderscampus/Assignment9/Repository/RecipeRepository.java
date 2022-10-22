package com.coderscampus.Assignment9.Repository;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coderscampus.Assignment9.Domain.Recipe;
import com.coderscampus.Assignment9.Service.FileService;

@Repository
public class RecipeRepository {
	List<Recipe> recipes = new ArrayList<Recipe>();
	
	@Autowired
	private FileService FileService;
	
	public List<Recipe> getRecipe() throws IOException{
		recipes = FileService.readFile();
		return recipes;
	}

}