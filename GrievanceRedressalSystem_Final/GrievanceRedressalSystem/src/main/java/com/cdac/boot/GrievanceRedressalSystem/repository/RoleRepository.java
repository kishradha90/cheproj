package com.cdac.boot.GrievanceRedressalSystem.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdac.boot.GrievanceRedressalSystem.entity.RoleEntity;

@Transactional
@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Integer> 
{
	@Query(nativeQuery = true, value="select * from role where role_id=:roleId")	
	public RoleEntity findRole(@Param("roleId") int roleId);
	
}
