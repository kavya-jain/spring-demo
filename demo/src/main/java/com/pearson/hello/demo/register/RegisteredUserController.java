package com.pearson.hello.demo.register;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisteredUserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/userlist")
	public List<User> getRegisterdUsers() {
		return userService.getAllUsers();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/register/user")
	public void registerUser(@RequestBody User user) {
		userService.registerUser(user);
	}
	
	@RequestMapping("/userlist/{id}")
	public User getUser(@PathVariable String id) {
		return userService.getUser(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/userlist/{id}")
	public void registerUser(@RequestBody String profile, @PathVariable String id) {
		userService.updateUser(profile, id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/userlist/{id}")
	public void deleteUser(@PathVariable String id) {
		userService.deleteUser(id);
	}

}
