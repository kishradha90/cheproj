package com.cdac.boot.GrievanceRedressalSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.boot.GrievanceRedressalSystem.entity.VoteEntity;
import com.cdac.boot.GrievanceRedressalSystem.repository.VoteRepository;

@Service
public class VoteServiceImpl implements VoteService
{

	@Autowired
	VoteRepository voteRepository;
	
	@Override
	public VoteEntity getVote(int voteId) 
	{
		System.out.println("vote id = "+voteId);
		return voteRepository.findVote(voteId);
	}

	@Override
	public List<VoteEntity> findVotesByGrievanceId(int grievanceId) 
	{
		System.out.println("findVotesByGrievanceId service called");
		return voteRepository.findVotesByGrievanceId(grievanceId);
	}

	@Override
	public boolean addVote(VoteEntity entity) 
	{
		VoteEntity isSaved = voteRepository.save(entity);
		return isSaved != null?true:false;
	}
	

}
