package com.aitew.Manager.service;

import java.util.List;

import com.aitew.Manager.vo.Talk;

public interface TalkService {
	public void saveOneTalk(Talk t);
	public List<Talk> findAllTalk();
	public Talk findOneTalk(String id);
	public boolean delOneTalk(String id);
}
