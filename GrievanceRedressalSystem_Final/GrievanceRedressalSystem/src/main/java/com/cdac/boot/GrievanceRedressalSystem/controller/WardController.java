package com.cdac.boot.GrievanceRedressalSystem.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.boot.GrievanceRedressalSystem.entity.WardEntity;
import com.cdac.boot.GrievanceRedressalSystem.service.WardService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("ward")
public class WardController 
{
	@Autowired
	WardService wardService;
	
	@GetMapping("getWard")
	WardEntity getWard(@RequestParam (name="wardId")int wardId)
	{
		return wardService.getWard(wardId);
	}
	
	@GetMapping("getAllWards")
	List<WardEntity> getAllWards()
	{
		System.out.println("get All Wards called.......");
		return wardService.getAllWards();
	}
	
}
