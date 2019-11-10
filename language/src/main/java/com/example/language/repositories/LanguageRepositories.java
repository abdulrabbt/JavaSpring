package com.example.language.repositories;

import com.example.language.models.Language;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LanguageRepositories extends CrudRepository<Language, Long> {
    List<Language> findAll();

    Optional<Language> findById(Long id);

    Language save(Language b);

    void deleteById(Long id);
}
