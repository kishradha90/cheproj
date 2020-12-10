package com.cdac.boot.GrievanceRedressalSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.boot.GrievanceRedressalSystem.entity.PersonEntity;
import com.cdac.boot.GrievanceRedressalSystem.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public int validateUser(PersonEntity entity) 
	{
		String loginId = entity.getLoginId();
		String password = entity.getPassword();
		
		PersonEntity isPerson = userRepository.getPersonByLoginIdAndPassword(loginId, password);
		
		if(isPerson!=null)
			return isPerson.getRoleIdFk().getRoleId();
		else
			return 0;
	}

	@Override
	public String getUserName(String loginId) 
	{
		PersonEntity Person = userRepository.getPersonByLoginId(loginId);
		return Person.getFullName();
	}

}
