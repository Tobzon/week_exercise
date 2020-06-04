package se.lexicon.tobias.week_exercise.data;


import org.springframework.stereotype.Repository;
import se.lexicon.tobias.week_exercise.entity.Recipe;
import se.lexicon.tobias.week_exercise.entity.RecipeCategory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class RecipeDAOImpl implements RecipeDAO {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Recipe> findAllWithName(String recipeName) {
        Query query = entityManager.createQuery("SELECT r from Recipe AS r WHERE r.recipeName = ?1");
        query.setParameter(1, recipeName);

        return query.getResultList();
    }

    @Override
    public List<Recipe> findAllWithIngredientName(String ingredientName) {
        Query query = entityManager.createQuery("SELECT r FROM Recipe AS r WHERE r.recipeIngredients = ?1");
        query.setParameter(1,ingredientName);

        return query.getResultList();
    }

    @Override
    public List<Recipe> allRecipesInCategory(String category) {
        Query query = entityManager.createQuery("SELECT r FROM Recipe AS r WHERE r.categories = ?1");
        query.setParameter(1,category);

        return query.getResultList();
    }

    @Override
    public List<Recipe> findRecipeWithManyCategories(List<RecipeCategory> recipeCategoryList) {
        Query query = entityManager.createQuery("SELECT r FROM Recipe AS r WHERE r.categories = ?1");
        query.setParameter(1,recipeCategoryList);

        return query.getResultList();
    }
}
