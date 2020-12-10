package com.cdac.boot.GrievanceRedressalSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.boot.GrievanceRedressalSystem.entity.RatingEntity;
import com.cdac.boot.GrievanceRedressalSystem.service.RatingService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("rating")
public class RatingController
{
	@Autowired
	RatingService ratingService;
	
	@GetMapping("getRating")
	RatingEntity getVote(@RequestParam (name="ratingId") int ratingId)
	{
		return ratingService.getRating(ratingId);
	}

}
