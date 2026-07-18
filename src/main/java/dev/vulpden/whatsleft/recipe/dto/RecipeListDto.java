package dev.vulpden.whatsleft.recipe.dto;

import dev.vulpden.whatsleft.recipe.model.enums.Difficulty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RecipeListDto {
    private Long recipeId;
    private String title;
    private String description;
    private Integer cookingTime;
    private Difficulty difficulty;
    private String pathToImage;
}
