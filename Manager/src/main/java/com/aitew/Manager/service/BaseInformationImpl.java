	package com.aitew.Manager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aitew.Manager.dao.BaseInformationDao;
import com.aitew.Manager.vo.BaseInformation;
import com.aitew.Manager.vo.Batch;
import com.aitew.Manager.vo.ClassName;
@Service
public class BaseInformationImpl implements BaseInformationService{
	@Autowired
	private BaseInformationDao base;
	@Override
	public void saveOnebase(BaseInformation b) {
		// TODO Auto-generated method stub
		base.save(b);
		
	}

	@Override
	public List<BaseInformation> findAllBase() {
		// TODO Auto-generated method stub
		return base.findAll();
	}

	@Override
	public boolean delOneBase(String id) {
		// TODO Auto-generated method stub
		try {
			base.delete(id);
		}catch(Exception e) {
			return false;
		}
		return true;
	}

	@Override
	public BaseInformation findByName(String name_b) {
		// TODO Auto-generated method stub
		return base.findByName(name_b);
	}

	@Override
	public BaseInformation findById(String id) {
		// TODO Auto-generated method stub
		return base.findOne(id);
	}

	@Override
	public List<BaseInformation> findByClassName(ClassName className) {
		// TODO Auto-generated method stub
		return base.findByClassName(className);
	}

	@Override
	public List<BaseInformation> findByApplyTime(String year) {
		// TODO Auto-generated method stub
		return base.findByApplyTime(year);
	}

	@Override
	public List<BaseInformation> findByBatch(Batch b) {
		// TODO Auto-generated method stub
		return base.findByBatch(b);
	}
	
}
