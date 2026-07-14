package dev.vulpden.whatsleft.user.repo;

import dev.vulpden.whatsleft.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User, Long> {
}
