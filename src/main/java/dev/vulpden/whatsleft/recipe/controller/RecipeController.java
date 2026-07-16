package dev.vulpden.whatsleft.recipe.controller;

import dev.vulpden.whatsleft.recipe.dto.RecipeListDto;
import dev.vulpden.whatsleft.recipe.service.IRecipeCRUDService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/recipes")
public class RecipeController {
    private final IRecipeCRUDService recipeService;

    public RecipeController(IRecipeCRUDService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping
    public Page<RecipeListDto> getRecipes(@PageableDefault(size = 20) Pageable pageable) {
        return recipeService.getAllRecipes(pageable);
    }
}
