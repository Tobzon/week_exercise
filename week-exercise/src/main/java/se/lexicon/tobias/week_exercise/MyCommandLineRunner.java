package se.lexicon.tobias.week_exercise;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import se.lexicon.tobias.week_exercise.data.IngredientDAO;
import se.lexicon.tobias.week_exercise.data.RecipeDAO;
import se.lexicon.tobias.week_exercise.entity.Recipe;
import se.lexicon.tobias.week_exercise.repository.RecipeIngredientRepository;
import se.lexicon.tobias.week_exercise.repository.RecipeInstructionRepository;


@Component
@Transactional(rollbackFor = Exception.class)
public class MyCommandLineRunner implements CommandLineRunner {

    RecipeDAO recipeDAO;
    IngredientDAO ingredientDAO;



    @Autowired
    public MyCommandLineRunner(RecipeDAO recipeDAO,IngredientDAO ingredientDAO ){
        this.recipeDAO = recipeDAO;
        this.ingredientDAO = ingredientDAO;
    }


    @Override
    public void run(String... args) throws Exception {



    }
}
