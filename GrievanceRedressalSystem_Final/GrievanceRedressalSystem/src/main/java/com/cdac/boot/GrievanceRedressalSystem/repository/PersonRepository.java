package com.cdac.boot.GrievanceRedressalSystem.repository;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdac.boot.GrievanceRedressalSystem.entity.PersonEntity;

@Transactional
@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, String> 
{			
	
	//******** find Person By loginId & password *********
	@Query(nativeQuery = true, value="select * from persons where login_id=:loginId")	
	public PersonEntity findPerson(@Param("loginId") String loginId);
	
	@Query(nativeQuery=true,value="select * from persons whrere login_id=:loginId and password=:password")
	public PersonEntity getPersonByLoginIdAndPassword(@Param("loginId")String loginId,@Param("password")String password);
	
	
	//******** Check Person By loginId & password *********
	@Query(nativeQuery = true, value="select * from persons where login_id=:loginId and password=:password")	
	public Optional<PersonEntity>findPersonByIdAndPassword(@Param("loginId") String loginId,@Param("password") String password);
	
	
	//******** Add Person by query *********
	@Modifying(clearAutomatically = true)
	@Query(nativeQuery = true, 
			value="insert into persons values(:role_id,:login_id,"
			+ ":ward_id,:full_name,:dob,:gender,"
			+ ":voter_id,:contact_no,"
			+ ":image_url,:address_line,:city_id,"
			+ ":pin_code,:question_id,:answer,"
			+ ":password)"
			)
	
	public int addPerson(
			@Param("role_id") int roleId,@Param("login_id") String loginId,
			@Param("ward_id") int wardId,@Param("full_name") String fullName,
			@Param("dob") String dob,@Param("gender") String gender,
			@Param("voter_id") String voterId,@Param("contact_no") String contactNo,
			@Param("image_url") String imageUrl,
			@Param("address_line") String addressLine,
			@Param("city_id") int cityId,@Param("pin_code") int pinCode,
			@Param("question_id") int questionId,@Param("answer") String answer, 
			@Param("password") String password
			);
	
	//******** Update Address *********
	@Modifying(clearAutomatically = true)
	@Query(nativeQuery = true, value="UPDATE persons SET address_line =:address_line WHERE login_id=:login_id")
	public int updateAddress(@Param("login_id") String loginId,@Param("address_line") String addressLine);

	
	//******** Update ContactNo *********
	@Modifying(clearAutomatically = true)
	@Query(nativeQuery = true, value="UPDATE persons SET contact_no =:contact_no WHERE login_id=:login_id")
	public int updateContactNo(@Param("login_id") String loginId,@Param("contact_no") String contactNo);

	//******** Update Password *********
	@Modifying(clearAutomatically = true)
	@Query(nativeQuery = true, value="UPDATE persons SET password =:password WHERE login_id=:login_id")
	public int updatePassword(@Param("login_id") String loginId,@Param("password") String password);

	
	
	//******** Find Person By Role Id *********
	@Query(nativeQuery = true, value="select * from persons where role_id=:role_id")
	public List<PersonEntity> findByRoleId(@Param("role_id") int roleId);
	
	
	//******** Delete Person By roleId & loginId *********
	@Modifying(clearAutomatically = true)
	@Query(nativeQuery = true, value="DELETE FROM persons WHERE login_id=:login_id;")
	public boolean deletePerson(@Param("login_id") String loginId);

	
}
