package com.aitew.Manager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aitew.Manager.dao.TablesDao;
import com.aitew.Manager.vo.Tables;

@Service
public class TablesServiceImpl implements TablesService{
	@Autowired
	private TablesDao tablesDao;
	@Override
	public List<Tables> findAll() {
		// TODO Auto-generated method stub
		return tablesDao.findAll();
	}

}
