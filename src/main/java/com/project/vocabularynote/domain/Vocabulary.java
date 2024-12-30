package com.project.vocabularynote.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
public class Vocabulary extends AuditingField {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Column(nullable = false)
    private String word;

    @Setter
    @Column(nullable = false)
    private String definition;

    @Setter
    private String example;

    @Setter
    private Long sortOrder;

    protected Vocabulary() {}

    @Builder
    public Vocabulary(Long id, String word, String definition, String example) {
        this.id = id;
        this.word = word;
        this.definition = definition;
        this.example = example;
    }

}
