package dev.vulpden.whatsleft.ingredient.repo;

import dev.vulpden.whatsleft.ingredient.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IIngredientRepo extends JpaRepository<Ingredient, Long> {
}
