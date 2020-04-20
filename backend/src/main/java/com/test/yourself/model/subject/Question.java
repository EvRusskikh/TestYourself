package com.test.yourself.model.subject;

import com.test.yourself.model.AbstractEntity;
import com.test.yourself.model.test.Test;
import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@Entity
@Table(name = "questions")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Question extends AbstractEntity {


    @ManyToOne(fetch = FetchType.LAZY)
    private Subject subject;

    private String name;

    private String description;

    @ElementCollection

    @Column(name = "answer")
    private List<Answer> answers;

    @ElementCollection
    private List<Integer> correctAnswers;
    
}