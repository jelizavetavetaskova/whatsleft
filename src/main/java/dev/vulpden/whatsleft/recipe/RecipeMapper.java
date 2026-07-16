package dev.vulpden.whatsleft.recipe;

import dev.vulpden.whatsleft.recipe.dto.RecipeListDto;
import dev.vulpden.whatsleft.recipe.model.Recipe;

public class RecipeMapper {
    public static RecipeListDto toListDto(Recipe recipe) {
        RecipeListDto dto = new RecipeListDto();

        dto.setRecipeId(recipe.getRecipeId());
        dto.setTitle(recipe.getTitle());
        dto.setCookingTime(recipe.getCookingTime());
        dto.setDifficulty(recipe.getDifficulty());
        dto.setPathToImage(recipe.getPathToImage());

        return dto;
    }
}
