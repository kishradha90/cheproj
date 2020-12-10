package com.cdac.boot.GrievanceRedressalSystem.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.boot.GrievanceRedressalSystem.entity.GrievanceEntity;
import com.cdac.boot.GrievanceRedressalSystem.entity.PersonEntity;
import com.cdac.boot.GrievanceRedressalSystem.entity.PersonFilterEntity;
import com.cdac.boot.GrievanceRedressalSystem.repository.PersonRepository;

@Service
public class ResidentServiceImpl implements ResidentService 
{

	@Autowired
	PersonRepository personRepository;
	
	@Autowired
	GrievanceService grievanceService;
	
	@Override
	public boolean validateResident(PersonEntity entity) 
	{
		String loginId = entity.getLoginId();
		String password = entity.getPassword();
		Optional<PersonEntity> isEntity = personRepository.findPersonByIdAndPassword(loginId, password);
	
		return isEntity.isPresent();
	}

	@Override
	public boolean addNewResident(PersonEntity person) 
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
	public boolean addNewGrievance(GrievanceEntity entity) 
	{
		return grievanceService.addNewGrievance(entity);
	}
	
	@Override
	public boolean changeAddress(String loginId,String addressLine) 
	{
		int isUpdated = personRepository.updateAddress(loginId, addressLine);
		return isUpdated!=0?true:false;
	}

	@Override
	public boolean changePassword(String loginId,String password) 
	{
		int isUpdated = personRepository.updatePassword(loginId, password);
		return isUpdated!=0?true:false;
	}

	@Override
	public boolean changeContactNo(String loginId,String contactNo) 
	{
		int isUpdated = personRepository.updateContactNo(loginId, contactNo);
		return isUpdated!=0?true:false;
	}

	@Override
	public GrievanceEntity getGrievance(int grievanceId)
	{
		return grievanceService.getGrievance(grievanceId);
	}

	@Override
	public PersonFilterEntity getResident(String loginIdTemp) 
	{
		 PersonEntity person = personRepository.findPerson(loginIdTemp);
		 
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
}
