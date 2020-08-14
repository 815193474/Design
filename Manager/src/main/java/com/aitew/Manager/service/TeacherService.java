package com.aitew.Manager.service;

import java.util.List;

import com.aitew.Manager.vo.Teachers;

public interface TeacherService {
	public List<Teachers> findAll();
	public Teachers findOne(String id);
	public Teachers findByName(String name);
	public void save(Teachers t);
	public boolean del(String id);
}
