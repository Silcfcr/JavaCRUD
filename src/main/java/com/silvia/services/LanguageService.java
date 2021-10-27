package com.silvia.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.silvia.models.Language;
import com.silvia.repositories.LanguageRepository;



@Service
public class LanguageService {
	
	private final LanguageRepository languageRepository;
	
	public LanguageService(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	
	//returns all languages
	public List<Language> allLanguages() {
		return languageRepository.findAll();
		}
	
	//creates a language
	public Language createLanguages(Language newLanguage) {
		return languageRepository.save(newLanguage);
		}
	
	//returns one language
	public Language findLanguage(Long id) {
		Optional<Language> language = languageRepository.findById(id);
		if (language.isPresent()) {
			return language.get();
		} else {
			return null;
		}
	}
	
	public Language updateLanguage(Language updatedLanguage) {
		return languageRepository.save(updatedLanguage);
	}
	
	public void deleteLanguage(Language language) {
		languageRepository.delete(language);
	}
	
	
	

}
