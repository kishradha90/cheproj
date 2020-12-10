package com.cdac.boot.GrievanceRedressalSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.boot.GrievanceRedressalSystem.entity.QuestionEntity;
import com.cdac.boot.GrievanceRedressalSystem.repository.QuestionRepository;

@Service
public class QuestionServiceImpl implements QuestionService
{
	@Autowired
	QuestionRepository questionRepository;
	
	@Override
	public Optional<QuestionEntity> getQuestion(int questionId) 
	{
		return questionRepository.findById(questionId);
	}

	@Override
	public List<QuestionEntity> getAllQuestions() 
	{
		return questionRepository.findAllQuestions();
	}

}
