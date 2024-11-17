package com.karabola.MyCookBook.Recipe;

import com.karabola.MyCookBook.Ingredient.Ingredient;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Entity
public class Recipe {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private List<String> ingredientList;
//    @Autowired
//    private Map<Ingredient, Long> ingredientMap;
    private String description;

    public Recipe() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<String> getIngredientList() {
        return ingredientList;
    }

    public void setIngredientList(List<String> ingredientList) {
        this.ingredientList = ingredientList;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
