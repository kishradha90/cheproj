package com.cdac.boot.GrievanceRedressalSystem.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="role")
public class RoleEntity implements Serializable
{
	
	private static final long serialVersionUID = -297443991531057868L;

	@Id
	@Column(name="role_id")
	int roleId;
	
	@Column(name="role_type")
	String roleType;

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}
	
	
	
}
