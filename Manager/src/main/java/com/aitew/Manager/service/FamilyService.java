package com.aitew.Manager.service;

import java.util.List;

import com.aitew.Manager.vo.Family;

public interface FamilyService {
	public void saveFamily(Family f);
	public List<Family> findAllFamily();
	public boolean delOneFamily(String id);
}
