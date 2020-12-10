package com.cdac.boot.GrievanceRedressalSystem.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ratings")
public class RatingEntity implements Serializable 
{

	private static final long serialVersionUID = 2046135931577240141L;

	@Id
	@Column(name="rating_id")
	int ratingId;
	
	@Column(name="grievance_id")
	int grievanceId;
	
	@Column(name="login_id")
	String loginId;
	
	@Column(name="rating")
	int rating;

	public int getRatingId() {
		return ratingId;
	}

	public void setRatingId(int ratingId) {
		this.ratingId = ratingId;
	}

	public int getGrievanceId() {
		return grievanceId;
	}

	public void setGrievanceId(int grievanceId) {
		this.grievanceId = grievanceId;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	

	
}
