package com.karabola.MyCookBook.controller;

import com.karabola.MyCookBook.Ingredient.Ingredient;
import com.karabola.MyCookBook.Ingredient.IngredientRepository;
import com.karabola.MyCookBook.Recipe.Recipe;
import com.karabola.MyCookBook.Recipe.RecipeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyCookBookController {
     private final RecipeRepository recipeRepository;
     private final IngredientRepository ingredientRepository;

    public MyCookBookController(RecipeRepository recipeRepository, IngredientRepository ingredientRepository) {

        this.recipeRepository = recipeRepository;
        this.ingredientRepository = ingredientRepository;
    }

    /**
     * methoda zwracająca listę przepisów. pobiera wszystke przepisy z repo. Dokonujemy mapowania
     */
    @GetMapping("/recipes")
    public List<Recipe> getRecipes (){
        return recipeRepository.findAll();
    }

    /**
     * metoda dodająca przepis do bazy danych; wystawiamy mapowanie pod metodą post, ponieważ wykonujemy zapis do bazy danych
     */
    @PostMapping("/recipes")
    public Recipe addRecipe(@RequestBody Recipe recipe){
       return recipeRepository.save(recipe);
    }

    @GetMapping("/ingredient")
    public Ingredient getIngredient(){
        Ingredient ingredient=new Ingredient();
        ingredient.setName("carrot");
        return ingredient;
    }

    @GetMapping("/ingredients")
    public List<Ingredient> getIngredients(){
        return ingredientRepository.findAll();
    }
    @PostMapping("/ingredients")
    public Ingredient addIngredient(@RequestBody Ingredient ingredient){
        return ingredientRepository.save(ingredient);
    }

}
