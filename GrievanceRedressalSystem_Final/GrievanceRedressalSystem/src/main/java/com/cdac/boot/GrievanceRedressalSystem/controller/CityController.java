package com.cdac.boot.GrievanceRedressalSystem.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.boot.GrievanceRedressalSystem.entity.CityEntity;
import com.cdac.boot.GrievanceRedressalSystem.service.CityService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("city")
public class CityController 
{
	@Autowired
	CityService cityService;
	
	@GetMapping("getCity")
	CityEntity getCity(@RequestParam (name="cityId")int cityId)
	{
		return cityService.getCity(cityId);
	}
	
	@GetMapping("getAllCities")
	List<CityEntity>getAllCities()
	{
		System.out.println("getAllCities called..");
		return cityService.getAllCities();
		
	}
}
