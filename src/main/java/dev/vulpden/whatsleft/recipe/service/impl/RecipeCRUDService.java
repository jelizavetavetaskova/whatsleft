package dev.vulpden.whatsleft.recipe.service.impl;

import dev.vulpden.whatsleft.recipe.RecipeMapper;
import dev.vulpden.whatsleft.recipe.dto.RecipeListDto;
import dev.vulpden.whatsleft.recipe.repo.IRecipeRepo;
import dev.vulpden.whatsleft.recipe.service.IRecipeCRUDService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

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
}
