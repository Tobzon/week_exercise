package se.lexicon.tobias.week_exercise.data;

import se.lexicon.tobias.week_exercise.entity.Ingredient;

import java.util.List;

public interface IngredientDAO {

    Ingredient findByName(String ingredientName);

    List<Ingredient> findAllWithName(String name);

}
