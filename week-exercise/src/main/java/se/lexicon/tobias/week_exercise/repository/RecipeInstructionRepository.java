package se.lexicon.tobias.week_exercise.repository;


import org.springframework.data.repository.CrudRepository;
import se.lexicon.tobias.week_exercise.entity.RecipeInstruction;

import java.util.UUID;

public interface RecipeInstructionRepository extends CrudRepository<RecipeInstruction, UUID> {



}
