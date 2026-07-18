package dev.vulpden.whatsleft.recipe.controller;

import dev.vulpden.whatsleft.recipe.dto.RecipeListDto;
import dev.vulpden.whatsleft.recipe.service.IRecipeCRUDService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/recipes")
public class RecipeController {
    private final IRecipeCRUDService recipeService;

    public RecipeController(IRecipeCRUDService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping
    public Page<RecipeListDto> getAll(@PageableDefault(size = 20) Pageable pageable) {
        return recipeService.getAllRecipes(pageable);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getById(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(recipeService.getRecipeById(id));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (NoSuchElementException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }
}
