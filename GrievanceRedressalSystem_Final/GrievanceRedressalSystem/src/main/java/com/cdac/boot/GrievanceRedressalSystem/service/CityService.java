package com.cdac.boot.GrievanceRedressalSystem.service;

import java.util.List;
import com.cdac.boot.GrievanceRedressalSystem.entity.CityEntity;

public interface CityService 
{
	CityEntity getCity(int cityId);
	
	List<CityEntity>getAllCities();
}
