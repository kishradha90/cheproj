package com.cdac.boot.GrievanceRedressalSystem.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="announcements")
public class AnnouncementEntity implements Serializable
{
	private static final long serialVersionUID = 4534054596380381318L;

	@Id
	@Column(name="announcement_id")
	int announcementId;
	
	@Column(name="title")
	String title;
	
	@Column(name="description")
	String description;
	
	@Column(name="image_url")
	String imageUrl;
	
	@Column(name="start_date")
	Date startDate;
	
	@Column(name="end_date")
	Date endDate;

	public int getAnnouncementId() {
		return announcementId;
	}

	public void setAnnouncementId(int announcementId) {
		this.announcementId = announcementId;
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

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
}
