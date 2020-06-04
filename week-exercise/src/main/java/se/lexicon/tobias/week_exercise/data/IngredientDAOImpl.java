package se.lexicon.tobias.week_exercise.data;

import org.springframework.stereotype.Repository;
import se.lexicon.tobias.week_exercise.entity.Ingredient;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class IngredientDAOImpl implements IngredientDAO {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Ingredient findByName(String ingredientName) {

        return entityManager.find(Ingredient.class, ingredientName);
    }

    @Override
    public List<Ingredient> findAllWithName(String name) {
        Query query = entityManager.createQuery("SELECT i from Ingredient as i WHERE i.ingredientName =?1");
        query.setParameter(1,name);

        return query.getResultList();
    }
}
