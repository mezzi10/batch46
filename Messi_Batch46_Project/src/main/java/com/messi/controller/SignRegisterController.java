package com.messi.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.messi.model.Branch;
import com.messi.model.Customer;
import com.messi.model.Policy;
import com.messi.service.UserService;


@RestController
public class SignRegisterController {
	@Autowired
	UserService uService;
	 //Date d = new Date();
	// DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	 LocalDateTime date = LocalDateTime.now();
	
	
	@PostMapping("/patient/register")
	public String custRegister(@RequestParam String name, @RequestParam String father_name,
			@RequestParam int age, @RequestParam char sex, @RequestParam String qualification,
			@RequestParam String address, @RequestParam String occupation, @RequestParam String email,
			@RequestParam String password) {
		
Customer cust = new Customer(name,father_name,age,sex,qualification,address,occupation,email,password);
       uService.addUser(cust);
		
		
		return "/patient/dashboard";
	}
	
	@PostMapping("/patient/delete")
	public void delete(@RequestParam int id) {		

		 uService.delete(id);		
	}
	
	@PostMapping("/patient/update")
	public void update(@RequestParam int id) {		

		 uService.update(id);		
	}
	
	@PostMapping("/add/branch")
	public String addBranch(@RequestParam String name, @RequestParam String address, @RequestParam String phone,
			@RequestParam String location, @RequestParam String city, @RequestParam String state) {
		
Branch bra = new Branch(name,address,phone,location,city,state);
       uService.addUser(bra);
		
		
		return "/ceo/dashboard";
	}
	
	@PostMapping("/add/policy")
	public String addPolicy(@RequestParam String name, @RequestParam int term, @RequestParam double policy_amount,
			@RequestParam float interest, @RequestParam String type, @RequestParam double maturity_amount) {
		
Policy bra = new Policy(name,term,policy_amount,interest,type,maturity_amount);
       uService.addUser(bra);
		
		
		return "/ceo/dashboard";
	}
	
	
	
	
	
	

}
