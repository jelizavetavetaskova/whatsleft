package dev.vulpden.whatsleft.recipe;

import dev.vulpden.whatsleft.ingredient.IngredientMapper;
import dev.vulpden.whatsleft.recipe.dto.RecipeDetailDto;
import dev.vulpden.whatsleft.recipe.dto.RecipeListDto;
import dev.vulpden.whatsleft.recipe.model.Recipe;
import dev.vulpden.whatsleft.step.StepMapper;
import dev.vulpden.whatsleft.user.UserMapper;

public class RecipeMapper {
    public static RecipeListDto toListDto(Recipe recipe) {
        RecipeListDto dto = new RecipeListDto();

        dto.setRecipeId(recipe.getRecipeId());
        dto.setTitle(recipe.getTitle());
        dto.setCookingTime(recipe.getCookingTime());
        dto.setDifficulty(recipe.getDifficulty());
        dto.setPathToImage(recipe.getPathToImage());
        dto.setDescription(recipe.getDescription());

        return dto;
    }

    public static RecipeDetailDto toDetailDto(Recipe recipe) {
        RecipeDetailDto dto = new RecipeDetailDto();

        dto.setRecipeId(recipe.getRecipeId());
        dto.setTitle(recipe.getTitle());
        dto.setDescription(recipe.getDescription());
        dto.setCookingTime(recipe.getCookingTime());
        dto.setDifficulty(recipe.getDifficulty());
        dto.setPathToImage(recipe.getPathToImage());
        dto.setServings(recipe.getServings());
        dto.setCaloriesPerServing(recipe.getCaloriesPerServing());

        dto.setSteps(recipe.getSteps()
                .stream()
                .map(StepMapper::toDto)
                .toList());

        dto.setIngredients(recipe.getIngredients().stream().map(IngredientMapper::toDto).toList());
        dto.setAuthor(UserMapper.toAuthorDto(recipe.getUser()));

        return dto;
    }
}
