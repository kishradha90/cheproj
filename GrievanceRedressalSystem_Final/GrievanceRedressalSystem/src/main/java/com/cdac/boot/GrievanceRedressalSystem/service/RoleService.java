package com.cdac.boot.GrievanceRedressalSystem.service;

import java.util.List;

import com.cdac.boot.GrievanceRedressalSystem.entity.RoleEntity;

public interface RoleService 
{
	RoleEntity getRole(int roleId); 
	
	List<RoleEntity>getAllRoles();
}
