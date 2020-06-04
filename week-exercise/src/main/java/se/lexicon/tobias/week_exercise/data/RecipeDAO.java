package se.lexicon.tobias.week_exercise.data;

import se.lexicon.tobias.week_exercise.entity.Recipe;
import se.lexicon.tobias.week_exercise.entity.Ingredient;
import se.lexicon.tobias.week_exercise.entity.RecipeCategory;

import java.util.List;

public interface RecipeDAO {

    List<Recipe> findAllWithName(String recipeName);

    List<Recipe> findAllWithIngredientName(String ingredientName);

    List<Recipe> allRecipesInCategory(String category);

    List<Recipe> findRecipeWithManyCategories(List<RecipeCategory> recipeCategoryList);


}
