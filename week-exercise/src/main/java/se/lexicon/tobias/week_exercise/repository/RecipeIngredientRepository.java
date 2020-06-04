package se.lexicon.tobias.week_exercise.repository;


import org.springframework.data.repository.CrudRepository;
import se.lexicon.tobias.week_exercise.entity.RecipeIngredient;

import java.util.UUID;

public interface RecipeIngredientRepository extends CrudRepository<RecipeIngredient, UUID> {



}
