package com.cdac.boot.GrievanceRedressalSystem.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdac.boot.GrievanceRedressalSystem.entity.WardEntity;

@Transactional
@Repository
public interface WardRepository extends JpaRepository<WardEntity, Integer>
{
	@Query(nativeQuery = true, value="select * from ward where ward_id=:wardId")	
	public WardEntity findWard(@Param("wardId") int wardId);
	
	@Query(nativeQuery = true, value="select * from ward")	
	public List<WardEntity> findAllWards();
	
}
