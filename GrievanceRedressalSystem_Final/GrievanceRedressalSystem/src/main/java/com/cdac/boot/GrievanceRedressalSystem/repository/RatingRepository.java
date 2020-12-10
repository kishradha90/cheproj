package com.cdac.boot.GrievanceRedressalSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cdac.boot.GrievanceRedressalSystem.entity.RatingEntity;

public interface RatingRepository extends JpaRepository<RatingEntity, Integer> 
{
	@Query(nativeQuery = true, value="select * from ratings where rating_id=:ratingId")	
	public RatingEntity findRating(@Param("ratingId") int ratingId);	
}
