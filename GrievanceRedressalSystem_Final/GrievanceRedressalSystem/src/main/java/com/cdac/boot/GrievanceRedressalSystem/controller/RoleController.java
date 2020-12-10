package com.cdac.boot.GrievanceRedressalSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.boot.GrievanceRedressalSystem.entity.RoleEntity;
import com.cdac.boot.GrievanceRedressalSystem.service.RoleService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("role")
public class RoleController 
{
	@Autowired
	RoleService roleService;
	
	@GetMapping("getRole")
	public RoleEntity getRole(@RequestParam(name="roleId") int roleId)
	{
		return roleService.getRole(roleId);
	}
	
	@GetMapping("getRoleType")
	public String getRoleType(@RequestParam(name="roleId") int roleId)
	{
		return roleService.getRole(roleId).getRoleType();
	}
	
	@GetMapping("getAllRoles")
	public List<RoleEntity> getAllRoles()
	{
		return roleService.getAllRoles();
	}
	
}
