package com.ead_course.ead_course.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LessonDTO {

    @NotBlank
    private String title;

    private String description;

    @NotBlank
    private String videoUrl;
}
