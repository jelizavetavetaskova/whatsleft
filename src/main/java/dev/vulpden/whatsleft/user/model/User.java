package dev.vulpden.whatsleft.user.model;

import dev.vulpden.whatsleft.authority.model.Authority;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(unique = true)
    private String email;

    private String password;
    private String name;
    private String surname;

    @ManyToOne
    @JoinColumn(name = "authority_id", nullable = false)
    private Authority authority;
}
