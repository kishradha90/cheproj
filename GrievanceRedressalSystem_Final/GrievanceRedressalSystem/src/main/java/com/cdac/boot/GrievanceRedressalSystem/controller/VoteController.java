package com.cdac.boot.GrievanceRedressalSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.boot.GrievanceRedressalSystem.entity.VoteEntity;
import com.cdac.boot.GrievanceRedressalSystem.service.VoteService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("vote")
public class VoteController 
{
	@Autowired
	VoteService voteService;
	
	@GetMapping("getVote")
	VoteEntity getVote(@RequestParam (name="voteId") int voteId)
	{
		return voteService.getVote(voteId);
	}
	
	@GetMapping("findVotesByGrievanceId")
	List<VoteEntity> getAllVotes(@RequestParam (name="grievanceId")int grievanceId)
	{
		System.out.println("findVotesByGrievanceId controller called");
		return voteService.findVotesByGrievanceId(grievanceId);
	}
	
	@PostMapping("addVote")
	boolean addVote(@RequestBody VoteEntity entity)
	{
		//System.out.println("findVotesByGrievanceId controller called");
		return voteService.addVote(entity);
	}
	
}
