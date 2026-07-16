package dev.vulpden.whatsleft.recipe.service;

import dev.vulpden.whatsleft.recipe.dto.RecipeListDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IRecipeCRUDService {
    Page<RecipeListDto> getAllRecipes(Pageable pageable);
}
