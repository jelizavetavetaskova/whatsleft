package dev.vulpden.whatsleft.step;

import dev.vulpden.whatsleft.step.dto.StepDto;
import dev.vulpden.whatsleft.step.model.Step;

public class StepMapper {
    public static StepDto toDto(Step step) {
        StepDto dto = new StepDto();

        dto.setStepNumber(step.getStepNumber());
        dto.setContent(step.getContent());
        dto.setPathToImage(step.getPathToImage());

        return dto;
    }
}
