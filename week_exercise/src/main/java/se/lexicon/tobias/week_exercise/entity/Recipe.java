package se.lexicon.tobias.week_exercise.entity;

import javax.persistence.OneToMany;
import java.util.Arrays;
import java.util.List;

public class Recipe {

    private int recipeId;

    private String recipeName;

    @OneToMany(mappedBy = "recipe")
    List<RecipeIngredient> recipeIngredients;

    RecipeInstruction instruction;

    List<RecipeCategory> categories;

}
