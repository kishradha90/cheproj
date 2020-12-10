package com.cdac.boot.GrievanceRedressalSystem.service;

import java.util.List;

import com.cdac.boot.GrievanceRedressalSystem.entity.VoteEntity;

public interface VoteService
{
	VoteEntity getVote(int voteId); 
	
	List<VoteEntity> findVotesByGrievanceId(int grievanceId);
	
	boolean addVote(VoteEntity entity);
	
}
