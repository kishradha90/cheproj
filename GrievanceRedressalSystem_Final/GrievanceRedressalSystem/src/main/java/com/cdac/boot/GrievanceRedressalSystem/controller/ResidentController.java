package com.cdac.boot.GrievanceRedressalSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.boot.GrievanceRedressalSystem.entity.GrievanceEntity;
import com.cdac.boot.GrievanceRedressalSystem.entity.PersonEntity;
import com.cdac.boot.GrievanceRedressalSystem.entity.PersonFilterEntity;
import com.cdac.boot.GrievanceRedressalSystem.service.ResidentService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("resident")
public class ResidentController
{
	@Autowired
	ResidentService residentService; 
	
	@PostMapping("validateResident")
	public boolean validateResident(@RequestBody PersonEntity entity) 
	{
		return residentService.validateResident(entity);
	}
	
	@PostMapping("addNewResident")
	public boolean addNewResident(@RequestBody PersonEntity entity) 
	{
		return residentService.addNewResident(entity);
	}
	
	@PostMapping("changeContactNo")
	public boolean changeContactNo(@RequestBody PersonEntity entity) 
	{
		String loginId = entity.getLoginId();
		String contactNo = entity.getContactNo();
		return residentService.changeContactNo(loginId, contactNo);
	}
	
	@PostMapping("changeAddress")
	public boolean changeAddress(@RequestBody PersonEntity entity) 
	{
		String loginId = entity.getLoginId();
		String addressLine = entity.getAddressLine();
		return residentService.changeAddress(loginId, addressLine);
	}
	
	@PostMapping("changePassword")
	public boolean changePassword(@RequestBody PersonEntity entity) 
	{
		String loginId = entity.getLoginId();
		String password = entity.getPassword();
		return residentService.changePassword(loginId, password);
	}
	
	@PostMapping("addNewGrievance")
	public boolean addNewGrievance(@RequestBody GrievanceEntity entity) 
	{
		return residentService.addNewGrievance(entity);
	}
	
	@GetMapping("getGrievance")
	GrievanceEntity getGrievance(@RequestParam (name="grievanceId")int grievanceId)
	{
		return residentService.getGrievance(grievanceId);
	}
	
	@GetMapping("getResident")
	PersonFilterEntity getCorporator(@RequestParam(name="loginId") String loginId)
	{
		return residentService.getResident(loginId);
	}
	
}
