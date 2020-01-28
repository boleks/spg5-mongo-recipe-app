package com.boleks.spg5MongoRecipeApp.services;

import com.boleks.spg5MongoRecipeApp.commands.RecipeCommand;
import com.boleks.spg5MongoRecipeApp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(String id);

    RecipeCommand findCommandById(String id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(String idToDelete);
}
