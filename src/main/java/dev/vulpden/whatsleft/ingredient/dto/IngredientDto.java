package dev.vulpden.whatsleft.ingredient.dto;

import dev.vulpden.whatsleft.ingredient.model.enums.Unit;
import dev.vulpden.whatsleft.product.dto.ProductDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class IngredientDto {
    private ProductDto product;
    private BigDecimal quantity;
    private Unit unit;
}
