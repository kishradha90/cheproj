package com.cdac.boot.GrievanceRedressalSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.boot.GrievanceRedressalSystem.entity.PersonEntity;
import com.cdac.boot.GrievanceRedressalSystem.entity.PersonFilterEntity;
import com.cdac.boot.GrievanceRedressalSystem.repository.PersonRepository;


@Service
public class AdminServiceImpl implements AdminService 
{
	@Autowired
	PersonRepository personRepository;
	
	@Autowired
	WardService wardService;
	
	@Autowired
	CityService cityService;
	
	@Autowired
	QuestionService questionService;
	
	@Override
	public PersonFilterEntity getCorporator(String loginIdTemp) 
	{	
		//System.out.println("getCorporator Service called......!!!");
		
		PersonEntity person = personRepository.findPerson(loginIdTemp);
		
		//System.out.println("getCorporator After Service called......!!!");
		 
		 if(person == null)
		 {
			// System.out.println("person == null");
			 return null;
		 }
		 else
		 {
			//System.out.println("Person != null");
			
		 	String loginId = person.getLoginId();
		 	
			String wardName = person.getWardIdFk().getWardName();
			
			String fullName = person.getFullName();
			
			String dob = person.getDob();
			
			String gender = person.getGender();
			
			String voterId = person.getVoterId();

			String contactNo = person.getContactNo();
			
			String imageUrl = person.getImageUrl();
			
			String addressLine = person.getAddressLine();
			
			String cityName = person.getCityIdFk().getCityName();
			
			int pinCode = person.getPinCode();
			
			PersonFilterEntity  filteredPerson = 
									new PersonFilterEntity(loginId,wardName,
											fullName,dob,gender,voterId,contactNo,
											imageUrl,addressLine,cityName,pinCode);
			 
			return filteredPerson;
			 
		 }
		
	}

	@Override
	public List<PersonEntity> getAllCorporators() 
	{
		int roleId=2; 
		return personRepository.findByRoleId(roleId);
	}

	@Override
	public boolean addNewCorporator(PersonEntity person) 
	{
		
		int roleId = person.getRoleIdFk().getRoleId();
		
	 	String loginId = person.getLoginId();
	 	
		int wardId = person.getWardIdFk().getWardId();
		
		String fullName = person.getFullName();
		
		String dob = person.getDob();
		
		String gender = person.getGender();
		
		String voterId = person.getVoterId();

		String contactNo = person.getContactNo();
		
		String imageUrl = person.getImageUrl();
		
		String addressLine = person.getAddressLine();
		
		int cityId = person.getCityIdFk().getCityId();
		
		int pinCode = person.getPinCode();
		
		int questionId = person.getQuestionIdFk().getQuestionId();
		
		String answer = person.getAnswer();
		
		String password = person.getPassword();
		
		int isSaved = personRepository.addPerson(roleId, loginId, wardId, fullName, dob, gender, voterId, contactNo, imageUrl, addressLine, cityId, pinCode, questionId, answer, password);
		
		return isSaved != 0?true:false;
			
	}

	@Override
	public boolean validateAdmin(PersonEntity entity) 
	{
	
		String loginId = entity.getLoginId();
		String password = entity.getPassword();
		Optional<PersonEntity> isEntity = personRepository.findPersonByIdAndPassword(loginId, password);
	
		return isEntity.isPresent(); //true if a value is present, otherwise false
			
	}

}
