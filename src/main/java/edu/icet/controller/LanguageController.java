package edu.icet.controller;


import edu.icet.Entity.Language;
import edu.icet.service.LanguageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Language")
@RequiredArgsConstructor
@CrossOrigin
public class LanguageController {


    final LanguageService languageService;

    @GetMapping("/all")
    public List<Language> getAll()
    {
        return languageService.getAll();
    }

    @PostMapping("/add")
    public ResponseEntity<Language> add(@RequestBody Language language){
        languageService.add(language);
        return ResponseEntity.ok(language);
    }
}
