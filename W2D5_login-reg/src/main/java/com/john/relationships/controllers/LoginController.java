package com.john.relationships.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.john.relationships.models.LoginUser;
import com.john.relationships.models.User;
import com.john.relationships.services.UserService;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userServ;
	
    @GetMapping("/")
    public String index(Model model) {
    
        // Bind empty User and LoginUser objects to the JSP
        // to capture the form input
        model.addAttribute("newUser", new User());
        model.addAttribute("newLogin", new LoginUser());
        return "index.jsp";
    }
    
    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("newUser") User newUser, 
            BindingResult result, Model model, HttpSession session) {
        
//      1.  execute the Service to Register FIRST
    	userServ.register(newUser, result);
        
        if(result.hasErrors()) {
            // Be sure to send in the empty LoginUser before 
            // re-rendering the page.
            model.addAttribute("newLogin", new LoginUser());
            return "index.jsp";
        } else {
        	// No errors! 
        	// TO-DO Later: Store their ID from the DB in session,
        	session.setAttribute("user_id", newUser.getId());
        	// in other words, log them in.
        	
        	return "redirect:/home";
        }
        
    }
    
//    LOGIN METHOD
    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
            BindingResult result, Model model, HttpSession session) {
        
        // Add once service is implemented:
        User user = userServ.login(newLogin, result);
    
        if(result.hasErrors()) {
            model.addAttribute("newUser", new User());
            return "index.jsp";
        } else {
//        	set user_id in session
        	session.setAttribute("user_id", user.getId());
        	return "redirect:/home";
        }
   
    }
    
    @GetMapping("/logout")
    public String logout(HttpSession seshRogan) {
    	seshRogan.invalidate();
    	return "redirect:/";
    }

}
