package edu.icet.service.impl;

import edu.icet.Entity.Language;
import edu.icet.repository.LanguageRepository;
import edu.icet.service.LanguageService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class LanguageServiceImpl implements LanguageService {

    final LanguageRepository languageRepository;



    @Override
    public List<Language> getAll() {

       List <edu.icet.Entity.Language> languageEntites  = languageRepository.findAll();
       return languageEntites;
    }

    @Override
    public void add(Language language) {

        languageRepository.save(language);
    }
}
