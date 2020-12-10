package com.cdac.boot.GrievanceRedressalSystem.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdac.boot.GrievanceRedressalSystem.entity.VoteEntity;

@Transactional
@Repository
public interface VoteRepository extends JpaRepository<VoteEntity, Integer> 
{
	
	@Query(nativeQuery = true, value="select * from votes where vote_id=:voteId")	
	public VoteEntity findVote(@Param("voteId") int voteId);
	
	@Query(nativeQuery = true, value="select * from votes where grievance_id=:grievanceId")	
	public List<VoteEntity> findVotesByGrievanceId(@Param("grievanceId") int grievanceId);
	
}
