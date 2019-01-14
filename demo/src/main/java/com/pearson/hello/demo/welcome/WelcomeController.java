package com.pearson.hello.demo.welcome;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@RequestMapping("/welcome/user")
	public String welcomeUser() {
		return "Welcome User";
	}
	
}
