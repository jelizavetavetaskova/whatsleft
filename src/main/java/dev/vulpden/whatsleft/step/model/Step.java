package dev.vulpden.whatsleft.step.model;

import dev.vulpden.whatsleft.recipe.model.Recipe;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "steps")
@Getter
@Setter
@NoArgsConstructor
public class Step {
    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stepId;

    private int stepNumber;
    private String content;
    private String pathToImage;

    @ManyToOne
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;
}
