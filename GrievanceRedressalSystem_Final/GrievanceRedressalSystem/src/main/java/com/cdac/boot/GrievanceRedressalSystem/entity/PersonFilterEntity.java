package com.cdac.boot.GrievanceRedressalSystem.entity;

import java.io.Serializable;


public class PersonFilterEntity implements Serializable
{
	private static final long serialVersionUID = -449584344155770693L;
	
	String loginId;
	
	String wardName;
	
	String fullName;
	
	String dob;
	
	String gender;
	
	String voterId;

	String contactNo;
	
	String imageUrl;
	
	String addressLine;
	
	String cityName;
	
	int pinCode;
	
	String question;
	
	String answer;

	String password;
	
	
	public PersonFilterEntity()
	{
		
	}
	

	public PersonFilterEntity(String loginId, String wardName, String fullName, String dob, String gender,
			String voterId, String contactNo, String imageUrl, String addressLine, String cityName,
			int pinCode, String question, String answer, String password) 
	{
		super();
		this.loginId = loginId;
		this.wardName = wardName;
		this.fullName = fullName;
		this.dob = dob;
		this.gender = gender;
		this.voterId = voterId;
		this.contactNo = contactNo;
		this.imageUrl = imageUrl;
		this.addressLine = addressLine;
		this.cityName = cityName;
		this.pinCode = pinCode;
		this.question = question;
		this.answer = answer;
		this.password = password;
	}
	
	public PersonFilterEntity(String loginId, String wardName, String fullName, String dob, String gender,
			String voterId, String contactNo, String imageUrl, String addressLine, String cityName,
			int pinCode) 
	{
		super();
		this.loginId = loginId;
		this.wardName = wardName;
		this.fullName = fullName;
		this.dob = dob;
		this.gender = gender;
		this.voterId = voterId;
		this.contactNo = contactNo;
		this.imageUrl = imageUrl;
		this.addressLine = addressLine;
		this.cityName = cityName;
		this.pinCode = pinCode;

	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getWardName() {
		return wardName;
	}

	public void setWardName(String wardName) {
		this.wardName = wardName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getVoterId() {
		return voterId;
	}

	public void setVoterId(String voterId) {
		this.voterId = voterId;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
