package com.aitew.Manager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aitew.Manager.dao.TeacherDao;
import com.aitew.Manager.vo.Teachers;
@Service
public class TeacherServiceImpl implements TeacherService {
	@Autowired
	private TeacherDao teacherDao;
	@Override
	public List<Teachers> findAll() {
		// TODO Auto-generated method stub
		return teacherDao.findAll();
	}
	@Override
	public Teachers findOne(String id) {
		// TODO Auto-generated method stub
		return teacherDao.findOne(id);
	}
	@Override
	public Teachers findByName(String name) {
		// TODO Auto-generated method stub
		return teacherDao.findByName(name);
	}
	@Override
	public void save(Teachers t) {
		// TODO Auto-generated method stub
		teacherDao.save(t);
	}
	@Override
	public boolean del(String id) {
		// TODO Auto-generated method stub
		try {
			teacherDao.delete(id);
		}catch(Exception e) {
			return false;
		}
		return true;
	}

}
