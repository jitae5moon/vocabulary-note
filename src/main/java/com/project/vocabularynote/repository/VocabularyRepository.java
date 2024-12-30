package com.project.vocabularynote.repository;

import com.project.vocabularynote.domain.Vocabulary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VocabularyRepository extends JpaRepository<Vocabulary, Long> {
}
