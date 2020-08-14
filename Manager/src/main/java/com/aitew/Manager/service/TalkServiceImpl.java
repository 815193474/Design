package com.aitew.Manager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aitew.Manager.dao.BaseInformationDao;
import com.aitew.Manager.dao.TalkDao;
import com.aitew.Manager.vo.Talk;
@Service
public class TalkServiceImpl implements TalkService{
	@Autowired
	private TalkDao talkDao;
	@Override
	public void saveOneTalk(Talk t) {
		// TODO Auto-generated method stub
		talkDao.save(t);
	}
	@Override
	public List<Talk> findAllTalk() {
		// TODO Auto-generated method stub
		return talkDao.findAll();
	}
	@Override
	public Talk findOneTalk(String id) {
		// TODO Auto-generated method stub
		return talkDao.findOne(id);
	}
	@Override
	public boolean delOneTalk(String id) {
		// TODO Auto-generated method stub
		try {
			talkDao.delete(id);
		}catch(Exception e) {
			return false;
		}
		return true;
	}

}
