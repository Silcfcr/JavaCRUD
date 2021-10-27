package com.silvia.Controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import com.silvia.models.Language;
import com.silvia.services.LanguageService;

@Controller
public class LanguageController {
	private final LanguageService languageService;
	
	public LanguageController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@RequestMapping("/languages")
	public String home(Model model, @ModelAttribute( "language" ) Language language) {
		List<Language> languages = languageService.allLanguages();
		model.addAttribute("languages", languages);
		return "/home.jsp";
	}
	
	@RequestMapping("/show/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		Language language = languageService.findLanguage(id);
		model.addAttribute("language", language);
		return "/show.jsp";
	}
	

	@RequestMapping(value="/newLanguage", method=RequestMethod.POST)
	public String createLanguage(@Valid @ModelAttribute( "language" ) Language language,
			   BindingResult result,
			   RedirectAttributes redirectAttributes) {
		System.out.println("I got here");
		if ( result.hasErrors() ) {
			redirectAttributes.addFlashAttribute( "errorMessage", "You need to provide all details!" );
			System.out.println("I got here with error");
		}
		else {
			languageService.createLanguages( language );
			System.out.println("I got here with everything okay");
	
		}
		return "redirect:/languages";
	}
	
	@RequestMapping("/update/{id}")
	public String showUpdateLanguage(@PathVariable("id") Long id, Model model) {
		Language language = languageService.findLanguage(id);
		model.addAttribute("language", language);
		return "/update.jsp";
	}
	
	@RequestMapping(value="/update/{id}", method=RequestMethod.POST)
	public String updateLanguage(@Valid @ModelAttribute( "language" ) Language language,
			   BindingResult result, RedirectAttributes redirectAttributes) {
		Language currentLanguage = languageService.findLanguage(language.getId());
		if ( currentLanguage == null ) {
			redirectAttributes.addFlashAttribute( "errorMessage", "That language identifier doesn't exist." );
		}
		else {
			currentLanguage.setName( language.getName() );
			currentLanguage.setCreator( language.getCreator() );
			currentLanguage.setVersion( language.getVersion() );
			languageService.updateLanguage( currentLanguage );
		}
		return "redirect:/languages";
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteLanguage(@PathVariable("id") Long id) {
		Language currentLanguage = languageService.findLanguage(id);
		languageService.deleteLanguage(currentLanguage);
		
		return "redirect:/languages";
	}

}
