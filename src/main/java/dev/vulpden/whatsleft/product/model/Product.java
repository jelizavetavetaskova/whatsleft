package dev.vulpden.whatsleft.product.model;

import dev.vulpden.whatsleft.product.model.enums.Type;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
public class Product {
    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    @Column(unique = true)
    private String title;

    @Enumerated(EnumType.STRING)
    private Type type;
}
