package com.aitew.Manager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aitew.Manager.dao.RecommendDao;
import com.aitew.Manager.vo.Recommend;
@Service

public class RecommendServiceImpl implements RecommendService{
	@Autowired
	private RecommendDao recommendDao;
	@Override
	public void saveRecommend(Recommend r) {
		// TODO Auto-generated method stub
		recommendDao.save(r);
	}

	@Override
	public List<Recommend> findAllRecommend() {
		// TODO Auto-generated method stub
		return recommendDao.findAll();
	}

	@Override
	public boolean delOneRecommend(String name) {
		// TODO Auto-generated method stub
		try {
			recommendDao.delete(name);
		}catch(Exception e) {
			
			return false;
		}
		return true;
	}

	@Override
	public Recommend findOneRecommend(String id) {
		// TODO Auto-generated method stub
		return recommendDao.findOne(id);
	}
		
}
