package com.cdac.boot.GrievanceRedressalSystem.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="city")
public class CityEntity implements Serializable
{
	private static final long serialVersionUID = 2775084502187639168L;

	@Id
	@Column(name="city_id")
	int cityId;
	
	@Column(name="city_name")
	String cityName;

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	
}
