package dev.vulpden.whatsleft.step.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StepDto {
    private int stepNumber;
    private String content;
    private String pathToImage;
}
