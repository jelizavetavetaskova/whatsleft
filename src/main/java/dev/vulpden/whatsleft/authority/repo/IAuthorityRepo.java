package dev.vulpden.whatsleft.authority.repo;

import dev.vulpden.whatsleft.authority.model.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuthorityRepo extends JpaRepository<Authority, Long> {
}
