package com.messi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@GetMapping("/")
	public String display() {
		return "messi";
	}
	@PostMapping("/")
	public String insertRecord() {
		
		return "messi";
	}

}
