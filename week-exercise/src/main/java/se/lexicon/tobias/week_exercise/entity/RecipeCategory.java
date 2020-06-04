package se.lexicon.tobias.week_exercise.entity;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Entity
public class RecipeCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int recipeCategoryId;

    private String category;

    @OneToMany(mappedBy = "recipecategory")
    List<Recipe> recipes;

    public RecipeCategory(int recipeCategoryId, String category, List<Recipe> recipes) {
        this(category, recipes);
        this.recipeCategoryId = recipeCategoryId;

    }

    public RecipeCategory(String category, List<Recipe> recipes) {
        this.category = category;
        this.recipes = recipes;
    }

    public RecipeCategory() {
    }

    public int getRecipeCategoryId() {
        return recipeCategoryId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeCategory that = (RecipeCategory) o;
        return recipeCategoryId == that.recipeCategoryId &&
                Objects.equals(category, that.category) &&
                Objects.equals(recipes, that.recipes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeCategoryId, category, recipes);
    }

    @Override
    public String toString() {
        return "RecipeCategory{" +
                "recipeCategoryId=" + recipeCategoryId +
                ", category='" + category + '\'' +
                ", recipes=" + recipes +
                '}';
    }
}
