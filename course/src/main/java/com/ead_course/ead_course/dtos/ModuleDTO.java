package com.ead_course.ead_course.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ModuleDTO {

    @NotBlank
    private String title;

    @NotBlank
    private String description;
}
