package com.cdac.boot.GrievanceRedressalSystem.service;

import java.util.List;
import com.cdac.boot.GrievanceRedressalSystem.entity.WardEntity;

public interface WardService
{
	WardEntity getWard(int wardId);
	
	List<WardEntity> getAllWards();
}
