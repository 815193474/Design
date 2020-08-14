package com.aitew.Manager.service;

import java.util.List;

import com.aitew.Manager.vo.LeagueSecretary;

public interface LeagueSecretaryService {
	public void saveOneLeague(LeagueSecretary l);
	public boolean delOneLeague(String id);
	public LeagueSecretary findOne(String id);
	public List<LeagueSecretary> findAll();
}
