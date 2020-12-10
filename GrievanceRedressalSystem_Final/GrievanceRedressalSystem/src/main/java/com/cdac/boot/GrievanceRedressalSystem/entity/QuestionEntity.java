package com.cdac.boot.GrievanceRedressalSystem.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="questions")
public class QuestionEntity implements Serializable
{

	private static final long serialVersionUID = -1468667453821583792L;

	@Id
	@Column(name="question_id")
	int questionId;
	
	@Column(name="question")
	String question;

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	
	
}
