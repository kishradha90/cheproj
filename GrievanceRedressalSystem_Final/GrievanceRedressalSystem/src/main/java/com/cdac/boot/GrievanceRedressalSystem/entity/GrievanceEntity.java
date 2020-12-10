package com.cdac.boot.GrievanceRedressalSystem.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="grievances")
public class GrievanceEntity implements Serializable
{
	private static final long serialVersionUID = -4662038841047441327L;

	@Id
	@Column(name="grievance_id")
	int grievanceId;
	
	@Column(name="login_id")
	String loginId;
	
	@Column(name="title")
	String title;
	
	@Column(name="description")
	String description;
	
	@Column(name="status")
	String status;
	
	@Column(name="status_details")
	String statusDetails;
	
	@Column(name="image_url")
	String imageUrl;
	
	@CreationTimestamp
	@Column(name="file_date")
	Date fileDate;
	
	@Column(name="resolve_date")
	Date resolveDate;

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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusDetails() {
		return statusDetails;
	}

	public void setStatusDetails(String statusDetails) {
		this.statusDetails = statusDetails;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Date getFileDate() {
		return fileDate;
	}

	public void setFileDate(Date fileDate) {
		this.fileDate = fileDate;
	}

	public Date getResolveDate() {
		return resolveDate;
	}

	public void setResolveDate(Date resolveDate) {
		this.resolveDate = resolveDate;
	}
	
	
	
}
