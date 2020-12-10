package com.cdac.boot.GrievanceRedressalSystem.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdac.boot.GrievanceRedressalSystem.entity.CityEntity;

@Transactional
@Repository
public interface CityRepository extends JpaRepository<CityEntity, Integer> 
{
	@Query(nativeQuery = true, value="select * from city where city_id=:cityId")	
	public CityEntity findCity(@Param("cityId") int cityId);

	@Query(nativeQuery = true, value="select * from city")	
	public List<CityEntity> findAllCities();
	
}
