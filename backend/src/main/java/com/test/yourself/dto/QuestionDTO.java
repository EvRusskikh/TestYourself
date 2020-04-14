package com.test.yourself.dto;

import com.test.yourself.model.Answer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QuestionDTO {

    private Long id;

    private Long subjectId;

    private String name;

    private String description;

    private Set<Answer> answers;

    private String mode;
}
