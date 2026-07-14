package dev.vulpden.whatsleft.step.repo;

import dev.vulpden.whatsleft.step.model.Step;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStepRepo extends JpaRepository<Step, Long> {
}
