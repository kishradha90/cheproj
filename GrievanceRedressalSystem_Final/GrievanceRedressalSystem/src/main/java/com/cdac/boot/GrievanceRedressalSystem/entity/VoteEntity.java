package com.cdac.boot.GrievanceRedressalSystem.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="votes")
public class VoteEntity implements Serializable 
{
	private static final long serialVersionUID = 7240412570757632862L;
	
	@Id
	@Column(name="vote_id")
	int voteId;
	
	@Column(name="login_id")
	String loginId;
	
	@Column(name="grievance_id")
	int grievanceId;

	@Column(name="vote_status")
	String voteStatus;
	
	@Column(name="comment")
	String comment;

	public int getVoteId() {
		return voteId;
	}

	public void setVoteId(int voteId) {
		this.voteId = voteId;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public int getGrievanceId() {
		return grievanceId;
	}

	public void setGrievanceId(int grievanceId) {
		this.grievanceId = grievanceId;
	}

	public String getVoteStatus() {
		return voteStatus;
	}

	public void setVoteStatus(String voteStatus) {
		this.voteStatus = voteStatus;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
