package com.cdac.boot.GrievanceRedressalSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.boot.GrievanceRedressalSystem.entity.PersonEntity;
import com.cdac.boot.GrievanceRedressalSystem.service.UserService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("user")
public class UserController 
{
	@Autowired
	UserService userService;
	
	@PostMapping("validateUser")
	public int validateUser(@RequestBody PersonEntity entity)
	{
		System.out.println(entity.getLoginId());
		System.out.println(entity.getPassword());
		return userService.validateUser(entity);
	}
	
	@GetMapping("getUserName")
	public String getUserName(@RequestParam("loginId") String loginId)
	{
		return userService.getUserName(loginId);
	}
	
}
