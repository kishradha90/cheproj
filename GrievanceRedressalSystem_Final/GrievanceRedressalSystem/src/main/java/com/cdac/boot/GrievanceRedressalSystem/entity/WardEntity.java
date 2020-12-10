package com.cdac.boot.GrievanceRedressalSystem.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ward")
public class WardEntity implements Serializable 
{
	private static final long serialVersionUID = -3336864636625459285L;

	@Id
	@Column(name="ward_id")
	int wardId;
	
	@Column(name="ward_name")
	String wardName;

	public int getWardId() {
		return wardId;
	}

	public void setWardId(int wardId) {
		this.wardId = wardId;
	}

	public String getWardName() {
		return wardName;
	}

	public void setWardName(String wardName) {
		this.wardName = wardName;
	}
	
	
	
}
