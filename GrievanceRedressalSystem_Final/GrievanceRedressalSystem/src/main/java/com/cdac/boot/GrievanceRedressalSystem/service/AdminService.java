package com.cdac.boot.GrievanceRedressalSystem.service;

import java.util.List;
import com.cdac.boot.GrievanceRedressalSystem.entity.PersonEntity;
import com.cdac.boot.GrievanceRedressalSystem.entity.PersonFilterEntity;

public interface AdminService 
{
	boolean addNewCorporator(PersonEntity entity);
	
	PersonFilterEntity getCorporator(String loginId);
	
	List<PersonEntity>getAllCorporators();
	
	boolean validateAdmin(PersonEntity entity);
		
}
