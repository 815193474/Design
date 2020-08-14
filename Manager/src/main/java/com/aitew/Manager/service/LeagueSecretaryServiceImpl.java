package com.aitew.Manager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aitew.Manager.dao.LeagueSecretaryDao;
import com.aitew.Manager.vo.LeagueSecretary;
@Service
public class LeagueSecretaryServiceImpl implements LeagueSecretaryService {
	@Autowired
	private LeagueSecretaryDao leagueSecretaryDao;
	@Override
	public void saveOneLeague(LeagueSecretary l) {
		// TODO Auto-generated method stub
		leagueSecretaryDao.save(l);
		
	}

	@Override
	public boolean delOneLeague(String id) {
		// TODO Auto-generated method stub
		try {
			leagueSecretaryDao.delete(id);
		}catch(Exception e) {
			return false;			
		}
		return true;
	}

	@Override
	public LeagueSecretary findOne(String id) {
		// TODO Auto-generated method stub
		return leagueSecretaryDao.findOne(id);
	}

	@Override
	public List<LeagueSecretary> findAll() {
		// TODO Auto-generated method stub
		return leagueSecretaryDao.findAll();
	}

}
