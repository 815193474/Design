package com.aitew.Manager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aitew.Manager.dao.FamilyDao;
import com.aitew.Manager.vo.Family;
@Service
public class FamilyServiceImpl implements FamilyService {
	@Autowired
	private FamilyDao familyDao;
	@Override
	public void saveFamily(Family f) {
		// TODO Auto-generated method stub
		familyDao.save(f);
	}

	@Override
	public List<Family> findAllFamily() {
		// TODO Auto-generated method stub
		return familyDao.findAll();
	}

	@Override
	public boolean delOneFamily(String id) {
		// TODO Auto-generated method stub
		try {
			familyDao.delete(id);
		}catch(Exception e) {
			return false;
		}
		return true;
	}

}
