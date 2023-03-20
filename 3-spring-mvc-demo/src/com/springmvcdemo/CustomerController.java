package com.springmvcdemo;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	// add initbinder to trim input string
	// remove leading and trailing whitespaces
	
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, editor);
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		Customer theCustomer = new Customer();
		model.addAttribute("customer",theCustomer);
		
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processStudentForm(@Valid @ModelAttribute("customer")Customer 
			theCustomer, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			return "customer-form";
		}
		else {
			return "customer-confirmation";
		}
	}
}
