package com.aitew.Manager.service;

import java.util.List;

import com.aitew.Manager.vo.Batch;

public interface BatchService {
	public Batch findOne(String batch_id);
	public List<Batch> findAll();
	public boolean delOne(String batch_id);
	public void saveOne(Batch b);
	
}
