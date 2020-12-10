package com.cdac.boot.GrievanceRedressalSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.boot.GrievanceRedressalSystem.entity.RoleEntity;
import com.cdac.boot.GrievanceRedressalSystem.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService
{
	@Autowired
	RoleRepository roleRepository;

	@Override
	public RoleEntity getRole(int roleId) 
	{
		return roleRepository.findRole(roleId);
	}

	@Override
	public List<RoleEntity> getAllRoles() 
	{
		return roleRepository.findAll();
	}

}
