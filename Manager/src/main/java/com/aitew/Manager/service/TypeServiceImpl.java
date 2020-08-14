package com.aitew.Manager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aitew.Manager.dao.TypeDao;
import com.aitew.Manager.vo.Type;
@Service
public class TypeServiceImpl implements TypeService{
	@Autowired
	private TypeDao typeDao;
	@Override
	public List<Type> findAllType() {
		// TODO Auto-generated method stub
		return typeDao.findAll();
	}

	@Override
	public Type findOneType(String id) {
		// TODO Auto-generated method stub
		return typeDao.findOne(id);
	}

}
