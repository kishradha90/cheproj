package com.cdac.boot.GrievanceRedressalSystem.service;

import java.util.List;
import com.cdac.boot.GrievanceRedressalSystem.entity.AnnouncementEntity;
import com.cdac.boot.GrievanceRedressalSystem.entity.GrievanceEntity;
import com.cdac.boot.GrievanceRedressalSystem.entity.PersonEntity;
import com.cdac.boot.GrievanceRedressalSystem.entity.PersonFilterEntity;

public interface CorporatorService 
{
	boolean validateCorporator(PersonEntity entity);
	
	PersonFilterEntity getCorporator(String loginId);
	
	boolean changePassword(PersonEntity entity); // change password
	
	GrievanceEntity getGrievance(int grievanceId); // view perticular grievance
	
	List<GrievanceEntity>getAllGrievances(); // view all grievances
	
	boolean changeStatusOfGrievance(GrievanceEntity entity); // status of selected grievance
	
	boolean changeStatusDetails(GrievanceEntity entity);
	
	boolean notifyResidentforApproval();
	
	List<AnnouncementEntity>getAllAnnouncements();
	
	AnnouncementEntity getAnnouncement(int announcementId);
	
}
