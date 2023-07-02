package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogInController {

	@GetMapping("/login")
	public String login() {
		return "Hai iam Comming From AWS EC2 Instance";
	}

}
