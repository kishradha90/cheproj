package com.cdac.boot.GrievanceRedressalSystem.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cdac.boot.GrievanceRedressalSystem.entity.GrievanceEntity;
import com.cdac.boot.GrievanceRedressalSystem.repository.GrievanceRepository;

@Service
public class GrievanceServiceImpl implements GrievanceService
{
	@Autowired
	GrievanceRepository grievanceRepository;
	
	@Override
	public GrievanceEntity getGrievance(int grievanceId) 
	{
		return grievanceRepository.findGrievance(grievanceId);
	}

	@Override
	public boolean addNewGrievance(GrievanceEntity entity) 
	{
		GrievanceEntity  isSaved = grievanceRepository.save(entity);
		if(isSaved != null)
			 return true;
		 else 
			 return false;
	}

	@Override
	public List<GrievanceEntity> getAllGrievances() 
	{
		return grievanceRepository.findAll();
	}

	@Override
	public boolean changeStatusOfGrievance(GrievanceEntity entity) 
	{
		int grievanceId = entity.getGrievanceId();
		String status = entity.getStatus();
		int isUpdated =  grievanceRepository.updateStatus(grievanceId, status);
		return isUpdated !=0?true:false;
	}

	@Override
	public boolean changeStatusDetails(GrievanceEntity entity) 
	{
		int grievanceId = entity.getGrievanceId();
		String statusDetails = entity.getStatus();
		int isUpdated =  grievanceRepository.updateStatusDetails(grievanceId, statusDetails);
		return isUpdated !=0?true:false;
	}

	@Override
	public List<GrievanceEntity> getGrievancesByStatus(String status) 
	{
		return grievanceRepository.getGrievancesByStatus(status);
	}

}
