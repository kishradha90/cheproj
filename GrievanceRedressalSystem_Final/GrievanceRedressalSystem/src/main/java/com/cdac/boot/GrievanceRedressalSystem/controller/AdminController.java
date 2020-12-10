package com.cdac.boot.GrievanceRedressalSystem.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.boot.GrievanceRedressalSystem.entity.PersonEntity;
import com.cdac.boot.GrievanceRedressalSystem.entity.PersonFilterEntity;
import com.cdac.boot.GrievanceRedressalSystem.service.AdminService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("admin")
public class AdminController
{
	@Autowired
	AdminService adminService;

	@GetMapping("getAllCorporators")
	public List<PersonEntity>getAllCorporators()
	{
		return adminService.getAllCorporators();
	}
	
	@GetMapping("getCorporator")
	PersonFilterEntity getCorporator(@RequestParam(name="loginId") String loginId)
	{
		//System.out.println("getCorporator controller called......!!!");
		return adminService.getCorporator(loginId);
	}
	
	@PostMapping("addNewCorporator")
	public boolean addNewCorporator(@RequestBody PersonEntity entity)
	{
		System.out.println("addNewCorporator controller called....!!!");
		System.out.println(entity.getLoginId());
		System.out.println(entity.getFullName());
		System.out.println("addNewCorporator controller called.... 2 !!!");
		return adminService.addNewCorporator(entity);
	}
	
	@PostMapping("validateAdmin")
	public boolean validateAdmin(@RequestBody PersonEntity entity)
	{
		System.out.println("validateAdmin reuest called.........!!");
		System.out.println(entity.getPassword());
		//System.out.println(entity.getPersonId().getLoginId());
		return adminService.validateAdmin(entity);
	}
	

}
