package com.john.views.unicorns;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

	@RequestMapping("/")
	public String indexCool(Model model) {
		String message = "<h1>hello</h1>";
		model.addAttribute("someKey", message);
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		model.addAttribute("nums", nums);

		return "index.jsp";
	}

	@RequestMapping("/dojos")
    public String index(Model model) {
        ArrayList<String> dojos = new ArrayList<String>(); // []
        dojos.add("Burbank"); // [Burbank]
        dojos.add("Chicago"); // [Burbank, Chicago]
        dojos.add("Bellevue"); //....
        model.addAttribute("dojosFromMyController", dojos);
        return "dojos.jsp";
    }
}
