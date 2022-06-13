package com.john.more_session.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class FormController {

	@RequestMapping("/")
	public String whatever() {
		return "form.jsp";
	}
	
	@RequestMapping(value="/formSubmission", method=RequestMethod.POST)
	public String formMethod(
			@RequestParam(value="name") String name,
			@RequestParam(value="powerLevel") Integer powerLevel,
			HttpSession session,
			RedirectAttributes flash) {
		
		if (powerLevel <= 9000) {
			System.out.println("you are not wise enough");
			flash.addFlashAttribute("powerError", "you are not fit to fight!");
			return "redirect:/";
		} else {
			System.out.println("you are awesome!");
			flash.addFlashAttribute("cool", "you are ready to fight!!");
		}
		
//		add name and powerLevel in session
//		these keys are now GLOBALLY available to any JSP file and our app
		session.setAttribute("name", name);
		session.setAttribute("powerLevel", powerLevel);
		
		return "redirect:/results";
	}
	
	@RequestMapping("/results")
	public String results(HttpSession sesh, Model model) {
		
//		get from session the key "powerLevel"
		String name = (String) sesh.getAttribute("name");
		Integer power = (Integer) sesh.getAttribute("powerLevel");

		if (name.equals("Yamcha")) {
			model.addAttribute("tooLow", "wow you need to train");
		}
			
		System.out.println("powerLevel: " + power);
		return "/cool/results.jsp";
	}
}












