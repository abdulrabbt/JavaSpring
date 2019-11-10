package com.example.language.service;

import com.example.language.models.Language;
import com.example.language.repositories.LanguageRepositories;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LanguageService {
    private final LanguageRepositories languageRepositories;

    public LanguageService(LanguageRepositories languageRepositories) {
        this.languageRepositories = languageRepositories;
    }

    public List<Language> allLanguages() {
        return languageRepositories.findAll();
    }
    // creates a Language
    public Language createLanguage(Language b) {
        return languageRepositories.save(b);
    }

    public void updateLanguage(Language l) {

        Optional<Language> optionalLanguage = languageRepositories.findById(l.getId());

        if(optionalLanguage.isPresent()) {
            Language optionalLanguage1 = optionalLanguage.get();
            optionalLanguage1.setName(l.getName());
            optionalLanguage1.setCreator(l.getCreator());
            optionalLanguage1.setcurrentVersion(l.getcurrentVersion());
            languageRepositories.save(optionalLanguage1);
        } else {
            System.out.print("null");;
        }


    }

    public void deleteLanguage(Long id) {
        languageRepositories.deleteById(id);;
    }

    public Language findLanguage(Long id) {
        Optional<Language> optionalLanguage = languageRepositories.findById(id);
        if(optionalLanguage.isPresent()) {
            return optionalLanguage.get();
        } else {
            return null;
        }
    }
}
