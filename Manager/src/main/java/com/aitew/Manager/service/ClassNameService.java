package com.aitew.Manager.service;

import java.util.List;

import com.aitew.Manager.vo.ClassName;

public interface ClassNameService {
	public void SaveOneClass(ClassName c);
	public boolean delOneClass(String name);
	public ClassName findOne(String id);
	public List<ClassName> findAll();
}
