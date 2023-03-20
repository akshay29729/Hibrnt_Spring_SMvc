package com.springmvc_hibernate.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc_hibernate.entity.Customer;
import com.springmvc_hibernate.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/show")
	public String getCustomers(Model model) {
		
		List<Customer> theCustomers = customerService.getCustomers();
		model.addAttribute("customers", theCustomers);
		return "list-customer";
	}
	
	@GetMapping("/showFormAdd")
	public String addCustomer(Model model) {
		
		Customer theCustomer = new Customer();
		model.addAttribute("customer", theCustomer);
		return "add-customer";
	}

	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
	
		customerService.saveCustomer(theCustomer);
		
		return "redirect:/customer/show";
	}
	
	@GetMapping("/showFormToUpdate")
	public String updatecustomer(@RequestParam("customerId") int id, Model model) {
		  Customer theCustomer = customerService.getRequiredCustomer(id);
		  
		  model.addAttribute("customer",theCustomer);
		return "add-customer";
	}
	
	@GetMapping("/deleteCustomer")
	public String deleteCustomer(@RequestParam("customerId") int id) {

		customerService.deleteCustomer(id);
		return "redirect:/customer/show";
	}
}
