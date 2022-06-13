package com.john.session.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class FormController {

	@RequestMapping("/form")
	public String form() {
		return "form.jsp";
	}
	
//	route method for submitting a form:
	@RequestMapping(value="/processForm", method=RequestMethod.POST)
	public String formMethod(@RequestParam(value="email") String email,
							@RequestParam(value="password") String pass,
							HttpSession sesh) {
		System.out.println(email + " : " + pass);
		
//		add the captured form inputs in session
		sesh.setAttribute("email", email);
		sesh.setAttribute("pass", pass);
		return "redirect:/results";
	}
	
	@RequestMapping("/results")
	public String result() {
		return "result.jsp";
	}
	
}
