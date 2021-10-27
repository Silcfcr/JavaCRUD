package com.silvia.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.silvia.models.Language;
import com.silvia.services.LanguageService;


@RestController
public class LanguageAPI {
	private final LanguageService languageService;
	
	public LanguageAPI(LanguageService languageService) {
		this.languageService = languageService;
	}
	
//	@RequestMapping("/")
//	public List<Language> index(){
//		return languageService.allLanguages();
//	}
//	
//	@RequestMapping(value="/newbook", method=RequestMethod.POST)
//	public Language create(@RequestParam(value="name") String name,
//			@RequestParam(value="creator") String creator,
//			@RequestParam(value="version") String version) {
//		Language language = new Language(name,creator,version);
//		return languageService.createLanguages(language);
//	}
//	
//	@RequestMapping("/showLanguage/{id}")
//	public Language show(@PathVariable("id")Long id) {
//		Language language = languageService.findLanguage(id);
//		return language;
//	}
//	
//	@RequestMapping(value="/updateLanguage/{id}", method=RequestMethod.PUT)
//    public Language update(@PathVariable("id") Long id, @RequestParam(value="name") String name,
//    		@RequestParam(value="creator") String creator,
//    		@RequestParam(value="version") String version) {
//        Language language = new Language(name,creator,version);
//        return language;
//    }
    
//    @RequestMapping(value="/deleteLanguage/{id}", method=RequestMethod.DELETE)
//    public void delete(@PathVariable("id") Long id) {
//        languageService.deleteLanguage(id);
//    }
	
	
}
