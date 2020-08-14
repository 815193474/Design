package com.aitew.Manager.service;

import java.util.List;
import com.aitew.Manager.vo.Recommend;

public interface RecommendService {
	public void saveRecommend(Recommend f);
	public List<Recommend> findAllRecommend();
	public Recommend findOneRecommend(String id);
	public boolean delOneRecommend(String name);
}
