package dev.vulpden.whatsleft.recipe.service.impl;

import dev.vulpden.whatsleft.recipe.RecipeMapper;
import dev.vulpden.whatsleft.recipe.dto.RecipeDetailDto;
import dev.vulpden.whatsleft.recipe.dto.RecipeListDto;
import dev.vulpden.whatsleft.recipe.model.Recipe;
import dev.vulpden.whatsleft.recipe.repo.IRecipeRepo;
import dev.vulpden.whatsleft.recipe.service.IRecipeCRUDService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class RecipeCRUDService implements IRecipeCRUDService {
    private final IRecipeRepo recipeRepo;

    public RecipeCRUDService(IRecipeRepo recipeRepo) {
        this.recipeRepo = recipeRepo;
    }

    @Override
    public Page<RecipeListDto> getAllRecipes(Pageable pageable) {
        return recipeRepo.findAll(pageable).map(RecipeMapper::toListDto);
    }

    @Override
    public RecipeDetailDto getRecipeById(Long recipeId) {
        if (recipeId == null) throw new IllegalArgumentException("Recipe id must not be null");
        if (recipeId <= 0) throw new IllegalArgumentException("Recipe id must be greater than 0");

        Recipe recipe = recipeRepo.findById(recipeId)
                .orElseThrow(() -> new NoSuchElementException("Recipe with this id does not exist"));

        return RecipeMapper.toDetailDto(recipe);
    }
}
