package com.aitew.Manager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aitew.Manager.dao.SuperDao;
import com.aitew.Manager.vo.SuperAdmin;
@Service
public class SuperAdminServiceImpl implements SuperAdminService {
	@Autowired
	private SuperDao superAdminDao;
	@Override
	public SuperAdmin findOneSuper(String id) {
		// TODO Auto-generated method stub
		return superAdminDao.findOne(id);
	}
	@Override
	public List<SuperAdmin> findAll() {
		// TODO Auto-generated method stub
		return superAdminDao.findAll();
	}

	@Override
	public void save(SuperAdmin superAdmin) {
		superAdminDao.save(superAdmin);
	}

}
