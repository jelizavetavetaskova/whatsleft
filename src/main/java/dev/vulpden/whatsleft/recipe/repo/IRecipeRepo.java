package dev.vulpden.whatsleft.recipe.repo;

import dev.vulpden.whatsleft.recipe.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRecipeRepo extends JpaRepository<Recipe, Long> {
}
