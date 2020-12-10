package com.cdac.boot.GrievanceRedressalSystem.service;

import com.cdac.boot.GrievanceRedressalSystem.entity.GrievanceEntity;
import com.cdac.boot.GrievanceRedressalSystem.entity.PersonEntity;
import com.cdac.boot.GrievanceRedressalSystem.entity.PersonFilterEntity;

public interface ResidentService 
{
	boolean validateResident(PersonEntity entity);
	
	boolean addNewResident(PersonEntity entity);
	
	boolean changeAddress(String loginId,String addressLine);
	
	boolean changePassword(String loginId,String password);
	
	boolean changeContactNo(String loginId,String contactNo);
	
	boolean addNewGrievance(GrievanceEntity entity);
	
	GrievanceEntity getGrievance(int grievanceId); 
	
	PersonFilterEntity getResident(String loginId);
	
}
