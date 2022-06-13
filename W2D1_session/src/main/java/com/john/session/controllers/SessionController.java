package com.john.session.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SessionController {

	@RequestMapping("/")
	public String cool(Model model,
						HttpSession sesh) {
		String name = "Waldo";
//		model.addAttribute("name", name);
		
//		setting something in session
		sesh.setAttribute("name", name);
		return "cool.jsp";
	}
	
	@RequestMapping("/cool")
	public String cooler(HttpSession session, Model model) {
		
//		route guard - check if sessions has something in
		if (session.getAttribute("name") == null) {
			session.setAttribute("name", "");
			return "cool2.jsp";
////			redirect to a ROUTE
//			return "redirect:/";
		} else {
			
//		grab the key from session
			String someName = (String) session.getAttribute("name");
			int nameLength = someName.length();

			model.addAttribute("stringLength", nameLength);
			return "cool2.jsp";
		}
		
	}
	
	
	
}
