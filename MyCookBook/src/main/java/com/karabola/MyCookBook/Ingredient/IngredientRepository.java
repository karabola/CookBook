package com.karabola.MyCookBook.Ingredient;

import com.karabola.MyCookBook.Ingredient.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {

}
