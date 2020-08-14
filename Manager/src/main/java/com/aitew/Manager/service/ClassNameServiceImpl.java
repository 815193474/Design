package com.aitew.Manager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aitew.Manager.dao.ClassNameDao;
import com.aitew.Manager.vo.ClassName;
@Service
public class ClassNameServiceImpl implements ClassNameService {
	@Autowired
	private ClassNameDao classNameDao;
	@Override
	public void SaveOneClass(ClassName c) {
		// TODO Auto-generated method stub
		classNameDao.save(c);
		
	}
	@Override
	public boolean delOneClass(String name) {
		// TODO Auto-generated method stub
		try {
			classNameDao.delete(name);
		}catch(Exception e) {
			return false;
		}
		return true;
	}
	@Override
	public ClassName findOne(String id) {
		// TODO Auto-generated method stub
		return classNameDao.findOne(id);
	}
	@Override
	public List<ClassName> findAll() {
		// TODO Auto-generated method stub
		return classNameDao.findAll();
	}

}
