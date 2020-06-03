package se.lexicon.tobias.week_exercise.entity;


import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

public class RecipeIngredient {


    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "recipeIngredientId", updatable = false, nullable = false)
    private String recipeIngredientId;

    @ManyToOne(cascade = {CascadeType.PERSIST,
                          CascadeType.MERGE,
                          CascadeType.DETACH,
                          CascadeType.REFRESH}
    )
    private Ingredient ingredient;

    private double amount;

    private Measurement measurement;

    @ManyToOne
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;


}
