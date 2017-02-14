package com.human.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.human.model.Human;
import com.human.service.HumanService;


@Controller
public class HumanController {

	@Autowired	
	HumanService humanService;
	
	@ModelAttribute("human")
	public Human createModel() {
	    return new Human();
	}
	
	@RequestMapping("/")
	public String showWelcomeScreen() {
		return "HelloScreen";
	}
	
	@RequestMapping(value = { "/new" }, method = RequestMethod.GET)
    public String newHuman(ModelMap model) {
        Human human = new Human();
        model.addAttribute("human", human);
        model.addAttribute("REGISTER", true);
        return "NewHuman";
    }
	
	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
    public String saveHuman(@Valid Human human, BindingResult result, ModelMap model) {
 
		// redirect to re-fill form
        if (result.hasErrors()) {
            return "NewHuman";
        }        
        // if form is correct add human to db and redirect to main page
        humanService.addHuman(human);
        return "HelloScreen";
    }
	
	// display list of humans from db
    @RequestMapping(value = { "/show" }, method = RequestMethod.GET)
	public String showHumans(ModelMap model) { 
		List<Human> humans = humanService.findAllHumans();
		model.addAttribute("humans", humans);
		return "list";
	}
}
