package com.john.relationships.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.john.relationships.models.User;
import com.john.relationships.services.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userServ;
	
//	@RequestMapping(value={"/", "", "/home"})
	@RequestMapping("/home")
	public String home(HttpSession sesh, Model model) {
		
//		retreive the user from session
		Long userId = (Long) sesh.getAttribute("user_id");
//		check if userId is null
		if (userId == null) {
			return "redirect:/";
		} else {
//			go to the db to retrieve the user using the id from session
			User thisUser = userServ.findOne(userId);
//			normally we don;t want to pass the ENTIRE user obj
//			this is just to see what we have access to:
			model.addAttribute("thisUser", thisUser);
//			model.addAttribute("thisUser", thisUser.getUserName());
			return "home.jsp";
		}
	}
}
