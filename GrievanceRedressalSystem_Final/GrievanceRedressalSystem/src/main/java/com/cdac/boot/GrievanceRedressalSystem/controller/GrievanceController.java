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
import com.cdac.boot.GrievanceRedressalSystem.service.GrievanceService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("grievance")
public class GrievanceController 
{
	@Autowired
	GrievanceService grievanceService;

	@GetMapping("getAllGrievances")
	List<GrievanceEntity> getAllGrievances()
	{
		return grievanceService.getAllGrievances();
	}
	
	@PostMapping("addNewGrievance")
	boolean addNewGrievance(@RequestBody GrievanceEntity entity)
	{
		return grievanceService.addNewGrievance(entity);
	}
	
	@GetMapping("getGrievancesByStatus")
	List<GrievanceEntity> getGrievancesByStatus(@RequestParam("status") String status )
	{
		return grievanceService.getGrievancesByStatus(status);
	}

}
