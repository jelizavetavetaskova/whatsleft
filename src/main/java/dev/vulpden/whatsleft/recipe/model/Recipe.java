package dev.vulpden.whatsleft.recipe.model;

import dev.vulpden.whatsleft.ingredient.model.Ingredient;
import dev.vulpden.whatsleft.recipe.model.enums.Difficulty;
import dev.vulpden.whatsleft.step.model.Step;
import dev.vulpden.whatsleft.user.model.User;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "recipes")
@Getter
@Setter
@NoArgsConstructor
public class Recipe {
    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recipeId;

    private String title;
    private String description;
    private Integer cookingTime;

    @Enumerated(EnumType.STRING)
    private Difficulty difficulty;

    private Integer servings;
    private String pathToImage;
    private BigDecimal caloriesPerServing;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Step> steps;

    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Ingredient> ingredients;
}
