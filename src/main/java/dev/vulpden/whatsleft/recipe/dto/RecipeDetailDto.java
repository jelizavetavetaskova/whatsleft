package dev.vulpden.whatsleft.recipe.dto;

import dev.vulpden.whatsleft.ingredient.dto.IngredientDto;
import dev.vulpden.whatsleft.recipe.model.enums.Difficulty;
import dev.vulpden.whatsleft.step.dto.StepDto;
import dev.vulpden.whatsleft.user.AuthorDto;
import dev.vulpden.whatsleft.user.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RecipeDetailDto {
    private Long recipeId;
    private String title;
    private String description;
    private Integer cookingTime;
    private Difficulty difficulty;
    private Integer servings;
    private String pathToImage;
    private BigDecimal caloriesPerServing;
    private AuthorDto author;
    private List<StepDto> steps;
    private List<IngredientDto> ingredients;
}
