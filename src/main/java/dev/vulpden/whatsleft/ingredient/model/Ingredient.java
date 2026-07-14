package dev.vulpden.whatsleft.ingredient.model;

import dev.vulpden.whatsleft.ingredient.model.enums.Unit;
import dev.vulpden.whatsleft.product.model.Product;
import dev.vulpden.whatsleft.recipe.model.Recipe;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "ingredients")
@Getter
@Setter
@NoArgsConstructor
public class Ingredient {
    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ingredientId;

    private BigDecimal quantity;

    @Enumerated(EnumType.STRING)
    private Unit unit;

    @ManyToOne
    @JoinColumn(name = "recipe_id", nullable = false)
    private Recipe recipe;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;
}
