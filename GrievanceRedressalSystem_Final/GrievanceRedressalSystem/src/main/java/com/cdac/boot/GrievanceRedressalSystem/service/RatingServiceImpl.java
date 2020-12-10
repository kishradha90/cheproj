package com.cdac.boot.GrievanceRedressalSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cdac.boot.GrievanceRedressalSystem.entity.RatingEntity;
import com.cdac.boot.GrievanceRedressalSystem.repository.RatingRepository;

@Service
public class RatingServiceImpl implements RatingService
{
	@Autowired
	RatingRepository ratingRepository;

	@Override
	public RatingEntity getRating(int ratingId) 
	{
		return ratingRepository.findRating(ratingId);
	}

}
