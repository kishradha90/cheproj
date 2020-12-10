package com.cdac.boot.GrievanceRedressalSystem.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.boot.GrievanceRedressalSystem.entity.WardEntity;
import com.cdac.boot.GrievanceRedressalSystem.repository.WardRepository;

@Service
public class WardServiceImpl implements WardService
{
	@Autowired
	WardRepository wardRepository;

	@Override
	public WardEntity getWard(int wardId) 
	{
		return wardRepository.findWard(wardId);
	}

	@Override
	public List<WardEntity> getAllWards() 
	{
		return wardRepository.findAllWards();
	}
	
	
}
