package com.cdac.boot.GrievanceRedressalSystem.service;

import com.cdac.boot.GrievanceRedressalSystem.entity.PersonEntity;

public interface UserService 
{
	int validateUser(PersonEntity entity);
	
	String getUserName(String loginId);
}
