package com.cdac.boot.GrievanceRedressalSystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.boot.GrievanceRedressalSystem.entity.QuestionEntity;
import com.cdac.boot.GrievanceRedressalSystem.service.QuestionService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("question")
public class QuestionController
{
	@Autowired
	QuestionService questionService;
	
	@GetMapping("getQuestion")
	Optional<QuestionEntity>getQuestion(@RequestParam(name="questionId") int questionId)
	{
		return questionService.getQuestion(questionId);
	}
	
	@GetMapping("getAllQuestions")
	List<QuestionEntity>getAllQuestions()
	{
		System.out.println("getAllQuestions called....");
		return questionService.getAllQuestions();
	}
}
