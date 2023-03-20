package com.springmvcdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	// method to show initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// method to process HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// method to process form and add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String processFormVersionTwo(HttpServletRequest request, Model model) {
		
		String name = request.getParameter("studentName");
		name = name.toUpperCase();
		String result ="Yo!!! "+ name;
		model.addAttribute("message",result);
		return "helloworld";
	}
	
	// method to process form and add data to the model
		@RequestMapping("/processFormVersionThree")
		public String processFormVersionThree(@RequestParam("studentName") String name, Model model) {
			
//			String name = request.getParameter("studentName");
			name = name.toUpperCase();
			String result ="Yo!!! "+ name;
			model.addAttribute("message",result);
			return "helloworld";
		}
}
