package com.cdac.boot.GrievanceRedressalSystem.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.boot.GrievanceRedressalSystem.entity.CityEntity;
import com.cdac.boot.GrievanceRedressalSystem.repository.CityRepository;

@Service
public class CityServiceImpl implements CityService
{
	@Autowired
	CityRepository cityRepository;

	@Override
	public CityEntity getCity(int cityId) 
	{
		return cityRepository.findCity(cityId);
	}

	@Override
	public List<CityEntity> getAllCities() 
	{
		return cityRepository.findAllCities();
	}

	
}
