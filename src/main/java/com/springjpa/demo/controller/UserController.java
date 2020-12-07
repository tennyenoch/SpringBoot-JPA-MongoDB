package com.springjpa.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springjpa.demo.document.Users;
import com.springjpa.demo.repository.UserRepository;

@RestController
@RequestMapping("/rest/users")
public class UserController {
	
	//@Autowired
	private UserRepository userRepo;
	
	public UserController(UserRepository userRepo)
	{
		this.userRepo=userRepo;
	}
	
	@GetMapping("/all")
	public List<Users> getUsers()
	{
		return userRepo.findAll();
	}

}
