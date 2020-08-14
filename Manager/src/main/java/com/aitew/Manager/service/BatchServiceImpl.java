package com.aitew.Manager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aitew.Manager.dao.BatchDao;
import com.aitew.Manager.vo.BaseInformation;
import com.aitew.Manager.vo.Batch;

@Service
public class BatchServiceImpl implements BatchService {
	@Autowired
	private BatchDao batchDao;
	@Override
	public Batch findOne(String batch_id) {
		// TODO Auto-generated method stub
		return batchDao.findOne(batch_id);
	}

	@Override
	public List<Batch> findAll() {
		// TODO Auto-generated method stub
		return batchDao.findAll();
	}

	@Override
	public boolean delOne(String batch_id) {
		// TODO Auto-generated method stub
		try {
			batchDao.delete(batch_id);
		}catch(Exception e) {
			return false;
		}
		return true;
	}

	@Override
	public void saveOne(Batch b) {
		// TODO Auto-generated method stub
		batchDao.save(b);
	}



}
