package com.cdac.boot.GrievanceRedressalSystem.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.cdac.boot.GrievanceRedressalSystem.entity.GrievanceEntity;

@Transactional
@Repository
public interface GrievanceRepository extends JpaRepository<GrievanceEntity, Integer> 
{
	@Query(nativeQuery = true, value="select * from grievances where grievance_id=:grievance_id")	
	public GrievanceEntity findGrievance(@Param("grievance_id") int grievanceId);

	//******** Update Status *********
	@Modifying(clearAutomatically = true)
	@Query(nativeQuery = true, value="UPDATE grievances SET status =:status WHERE grievance_id=:grievance_id")
	public int updateStatus(@Param("grievance_id") int grievanceId,@Param("status") String status);

	
	//******** Update Description *********
	@Modifying(clearAutomatically = true)
	@Query(nativeQuery = true, value="UPDATE grievances SET status_details =:status_details WHERE  grievance_id=:grievance_id")
	public int updateStatusDetails(@Param("grievance_id") int grievanceId,@Param("status_details") String statusDetails);

	@Query(nativeQuery = true, value="select * from grievances where status=:status")	
	public List<GrievanceEntity> getGrievancesByStatus(@Param("status") String status);

}
