package com.messi.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.messi.model.Customer;
import com.messi.model.UserService;


@RestController
public class SignRegisterController {
	@Autowired
	UserService uService;
	 //Date d = new Date();
	// DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	 LocalDateTime date = LocalDateTime.now();
	
	
	@PostMapping("/patient/register")
	public String register(@RequestParam String name, @RequestParam String father_name,
			@RequestParam int age, @RequestParam char sex, @RequestParam String qualification,
			@RequestParam String address, @RequestParam String occupation, @RequestParam String email,
			@RequestParam String password) {
		
Customer cust = new Customer(name,father_name,age,sex,qualification,address,occupation,email,password);
       uService.addUser(cust);
		
		
		return "index";
	}
	
	
	
	
	
	

}
