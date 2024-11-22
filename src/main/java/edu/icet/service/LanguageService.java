package edu.icet.service;

import edu.icet.Entity.Language;

import java.util.List;

public interface LanguageService {

    public List<Language> getAll();

    void add(Language language);
}
