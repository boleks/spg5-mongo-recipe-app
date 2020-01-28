package com.boleks.spg5MongoRecipeApp.repositories;

import com.boleks.spg5MongoRecipeApp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, String> {


}
