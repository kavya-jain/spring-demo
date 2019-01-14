package com.pearson.hello.demo.register;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	private List<User> users = new ArrayList<>(Arrays.asList(
			new User("1", "Kavya",""), 
			new User("2", "Amrita",""),
			new User("3", "Ria",""), 
			new User("4", "Aastha","")
			));
	
	public List<User> getAllUsers(){
		return users;
	}

	public void registerUser(User user) {
		users.add(user);
	}
	
	public User getUser(String id) {
		return users.stream().filter(u -> u.getId().equals(id)).findFirst().get();
	}

	public void updateUser(String profile, String id) {
		for(User u : users) {
			if(u.getId().equals(id))
				u.setProfile(profile);
		}
		
	}

	public void deleteUser(String id) {
		users.removeIf(u -> u.getId().equals(id));
		
	}
	
}
