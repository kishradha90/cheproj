package com.cdac.boot.GrievanceRedressalSystem.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdac.boot.GrievanceRedressalSystem.entity.PersonEntity;

@Transactional
@Repository
public interface UserRepository extends JpaRepository<PersonEntity, String> 
{
	@Query(nativeQuery=true,value="select * from persons where login_id=:loginId and password=:password")
	public PersonEntity getPersonByLoginIdAndPassword(@Param("loginId")String loginId,@Param("password")String password);	

	@Query(nativeQuery=true,value="select * from persons where login_id=:loginId")
	public PersonEntity getPersonByLoginId(@Param("loginId")String loginId);	

}
