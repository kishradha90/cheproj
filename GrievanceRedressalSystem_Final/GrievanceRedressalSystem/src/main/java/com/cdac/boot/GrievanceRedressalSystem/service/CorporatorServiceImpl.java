package com.cdac.boot.GrievanceRedressalSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.boot.GrievanceRedressalSystem.entity.AnnouncementEntity;
import com.cdac.boot.GrievanceRedressalSystem.entity.GrievanceEntity;
import com.cdac.boot.GrievanceRedressalSystem.entity.PersonEntity;
import com.cdac.boot.GrievanceRedressalSystem.entity.PersonFilterEntity;
import com.cdac.boot.GrievanceRedressalSystem.repository.PersonRepository;

@Service
public class CorporatorServiceImpl implements CorporatorService 
{
	@Autowired
	PersonRepository personRepository;
	
	@Autowired
	GrievanceService grievanceService;
	
	@Override
	public boolean validateCorporator(PersonEntity entity) 
	{
		String loginId = entity.getLoginId();
		String password = entity.getPassword();
		Optional<PersonEntity> isEntity = personRepository.findPersonByIdAndPassword(loginId, password);

		return isEntity.isPresent(); //true if a value is present, otherwise false		
	}
	
	@Override
	public boolean changePassword(PersonEntity entity) 
	{
		String loginId = entity.getLoginId();
		String password = entity.getPassword();
		int isUpdated = personRepository.updatePassword(loginId, password);
		return isUpdated!=0?true:false;
	}

	@Override
	public GrievanceEntity getGrievance(int grievanceId) 
	{
		return grievanceService.getGrievance(grievanceId);
	}

	@Override
	public List<GrievanceEntity> getAllGrievances() 
	{
		return grievanceService.getAllGrievances();
	}

	@Override
	public boolean changeStatusOfGrievance(GrievanceEntity entity) 
	{
		return grievanceService.changeStatusOfGrievance(entity);
	}

	@Override
	public boolean changeStatusDetails(GrievanceEntity entity) 
	{
		
		return grievanceService.changeStatusDetails(entity);
	}

	@Override
	public boolean notifyResidentforApproval() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<AnnouncementEntity> getAllAnnouncements() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AnnouncementEntity getAnnouncement(int announcementId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PersonFilterEntity getCorporator(String loginIdTemp) 
	{
		 PersonEntity person = personRepository.findPerson(loginIdTemp);
		 
		 if(person == null)
		 {
			 return null;
		 }
		 else
		 {
			
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
