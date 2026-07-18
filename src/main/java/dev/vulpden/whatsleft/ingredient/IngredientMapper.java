package dev.vulpden.whatsleft.ingredient;

import dev.vulpden.whatsleft.ingredient.dto.IngredientDto;
import dev.vulpden.whatsleft.ingredient.model.Ingredient;
import dev.vulpden.whatsleft.product.ProductMapper;

public class IngredientMapper {
    public static IngredientDto toDto(Ingredient ingredient) {
        IngredientDto dto = new IngredientDto();

        dto.setProduct(ProductMapper.toDto(ingredient.getProduct()));
        dto.setQuantity(ingredient.getQuantity());
        dto.setUnit(ingredient.getUnit());

        return dto;
    }
}
