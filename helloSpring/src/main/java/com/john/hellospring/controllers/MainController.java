package com.john.hellospring.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping("/")
	public String indexz() {
		System.out.println("going to the main function");
		return "<h2 style='color:red'>hello ninjas</h2>";
	}
	
	@RequestMapping("/cool")
	public String coolRoute() {
		return "this is cool";
	}
	
//	Query parameters
//	http://localhost:8080/something/search?ww=hello!!!
	@RequestMapping("/something/search")
	public String something(@RequestParam(value="ww") String someSearchVar) {
		System.out.println(someSearchVar);
		return String.format("you have searched for %s", someSearchVar);
	}
	
//	PathVariables
//	http://localhost:8080/find/asdsadsadasdasd
	@RequestMapping("/{name}/{count}/{var2}")
	public String find(@PathVariable("name") String name, 
						@PathVariable("count") Integer count,
						@PathVariable("var2") String var2
			) {
//		if (name.equals("palmer")) {
//			
//		}
		if (count > 3) {
			return name + " has " + count + " " + var2;
		}
		System.out.println(name);
		return "you found " + name + " and they have " + count + " " + var2;
	}
	
	
	
}
