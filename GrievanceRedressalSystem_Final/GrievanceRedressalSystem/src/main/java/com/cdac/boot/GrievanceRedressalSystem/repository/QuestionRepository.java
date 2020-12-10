package com.cdac.boot.GrievanceRedressalSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.cdac.boot.GrievanceRedressalSystem.entity.QuestionEntity;

public interface QuestionRepository extends JpaRepository<QuestionEntity, Integer> 
{


	@Query(nativeQuery = true, value="select * from questions")	
	public List<QuestionEntity> findAllQuestions();
	
}
