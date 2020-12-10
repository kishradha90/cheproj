package com.cdac.boot.GrievanceRedressalSystem.service;

import java.util.List;
import com.cdac.boot.GrievanceRedressalSystem.entity.GrievanceEntity;

public interface GrievanceService
{
	GrievanceEntity getGrievance(int grievanceId);
	
	List<GrievanceEntity>getAllGrievances();
	List<GrievanceEntity>getGrievancesByStatus(String status);
	
	boolean addNewGrievance(GrievanceEntity entity);
	
	boolean changeStatusOfGrievance(GrievanceEntity entity);
	
	boolean changeStatusDetails(GrievanceEntity entity);
}
