package com.cdac.boot.GrievanceRedressalSystem.service;

import java.util.List;
import java.util.Optional;

import com.cdac.boot.GrievanceRedressalSystem.entity.QuestionEntity;

public interface QuestionService 
{
	Optional<QuestionEntity>getQuestion(int questionId);
	
	List<QuestionEntity>getAllQuestions();
}
