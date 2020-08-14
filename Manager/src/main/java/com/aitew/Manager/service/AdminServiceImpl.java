package com.aitew.Manager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aitew.Manager.dao.AdminDao;
import com.aitew.Manager.vo.Admin;
@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminDao adminDao;
	
	@Override
	public void SaveOneAdmin(Admin a) {
		// TODO Auto-generated method stub
		adminDao.save(a);
	}

	@Override
	public List<Admin> findAll() {
		// TODO Auto-generated method stub
		return adminDao.findAll();
	}

	@Override
	public Admin findOneAmdin(String id) {
		// TODO Auto-generated method stub
		return adminDao.findOne(id);
	}

	@Override
	public boolean delOneAdmin(String id) {
		// TODO Auto-generated method stub
		try {
			adminDao.delete(id);
		}catch(Exception e) {
			return false;
		}
		return true;
	}
}
