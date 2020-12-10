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

import com.cdac.boot.GrievanceRedressalSystem.entity.GrievanceEntity;
import com.cdac.boot.GrievanceRedressalSystem.entity.PersonEntity;
import com.cdac.boot.GrievanceRedressalSystem.entity.PersonFilterEntity;
import com.cdac.boot.GrievanceRedressalSystem.service.CorporatorService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("corporator")
public class CorporatorController 
{
	@Autowired
	CorporatorService corporatorService; 
	
	@PostMapping("validateCorporator")
	public boolean validateCorporator(@RequestBody PersonEntity entity) 
	{
		return corporatorService.validateCorporator(entity);
	}
	
	@PostMapping("changePassword")
	public boolean changePassword(@RequestBody PersonEntity entity) 
	{
		return corporatorService.changePassword(entity);
	}
	
	@GetMapping("getGrievance")
	GrievanceEntity getAllGrievances(@RequestParam (name="grievanceId")int grievanceId)
	{
		return corporatorService.getGrievance(grievanceId);
	}
	
	@GetMapping("getAllGrievances")
	List<GrievanceEntity> getAllGrievances()
	{
		return corporatorService.getAllGrievances();
	}
	
	@GetMapping("getCorporator")
	PersonFilterEntity getCorporator(@RequestParam(name="loginId") String loginId)
	{
		return corporatorService.getCorporator(loginId);
	}
	
	@PostMapping("changeStatusofGrievance")
	public boolean changeStatusOfGrievance(@RequestBody GrievanceEntity entity)
	{
		return corporatorService.changeStatusOfGrievance(entity);
	}

	@PostMapping("changeStatusDetails")
	public boolean changeStatusDetails(@RequestBody GrievanceEntity entity)
	{
		return corporatorService.changeStatusDetails(entity);
	}
}
