package com.boleks.spg5MongoRecipeApp.repositories;

import com.boleks.spg5MongoRecipeApp.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, String> {

    Optional<Category> findByDescription(String description);

}
