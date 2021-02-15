package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping ("/welcome")
	public String getString() {
		return "Welcome to Sprong Boot, Docker and AWS ECS";
	}
}
