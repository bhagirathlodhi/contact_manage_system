package com.smart.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HomeController {
	
	
	@GetMapping("/")
	public String home() {
		System.out.println("home method called by ioc containgkajgdjgjdgjg");
		
		return "done";
	}

}
