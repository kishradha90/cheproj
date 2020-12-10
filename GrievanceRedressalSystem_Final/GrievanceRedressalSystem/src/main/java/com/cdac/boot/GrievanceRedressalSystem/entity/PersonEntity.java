package com.cdac.boot.GrievanceRedressalSystem.entity;

import java.io.Serializable;
//import java.sql.Date;
//import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;


@Entity
@Table(name="persons")
@SecondaryTable(name="ward", pkJoinColumns = @PrimaryKeyJoinColumn(name="ward_id"))
@SecondaryTable(name="city", pkJoinColumns = @PrimaryKeyJoinColumn(name="city_id"))
@SecondaryTable(name="questions", pkJoinColumns = @PrimaryKeyJoinColumn(name="question_id"))
@SecondaryTable(name="role", pkJoinColumns = @PrimaryKeyJoinColumn(name="role_id"))
public class PersonEntity implements Serializable 
{
	private static final long serialVersionUID = 6616644230409760954L;
	
	@Id
	@Column(name="login_id")
	String loginId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="role_id",referencedColumnName="role_id",table="role",insertable=false,updatable=false)
	RoleEntity roleIdFk;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="ward_id",referencedColumnName="ward_id",table="ward",insertable=false,updatable=false)
	WardEntity wardIdFk;
	
	@Column (name="full_name")
	String fullName;
	
	@Column (name="dob")
	String dob;
	
	@Column (name="gender")
	String gender;
	
	@Column (name="voter_id")
	String voterId;

	@Column (name="contact_no")
	String contactNo;
	
	@Column (name="image_url")
	String imageUrl;
	
	@Column (name="addressLine")
	String addressLine;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="city_id",referencedColumnName="city_id",table="city",insertable=false,updatable=false)
	CityEntity cityIdFk;
	
	@Column (name="pin_code")
	int pinCode;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="question_id",referencedColumnName="question_id",table="questions",insertable=false,updatable=false)
	QuestionEntity questionIdFk;
	
	@Column (name="answer")
	String answer;

	@Column (name="password")
	String password;
	

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	
	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public WardEntity getWardIdFk() {
		return wardIdFk;
	}

	public void setWardIdFk(WardEntity wardIdFk) {
		this.wardIdFk = wardIdFk;
	}

	public CityEntity getCityIdFk() {
		return cityIdFk;
	}

	public void setCityIdFk(CityEntity cityIdFk) {
		this.cityIdFk = cityIdFk;
	}

	public QuestionEntity getQuestionIdFk() {
		return questionIdFk;
	}

	public void setQuestionIdFk(QuestionEntity questionIdFk) {
		this.questionIdFk = questionIdFk;
	}

	public RoleEntity getRoleIdFk() {
		return roleIdFk;
	}

	public void setRoleIdFk(RoleEntity roleIdFk) {
		this.roleIdFk = roleIdFk;
	}



}
