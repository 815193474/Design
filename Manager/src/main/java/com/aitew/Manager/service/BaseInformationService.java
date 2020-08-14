package com.aitew.Manager.service;

import java.util.List;

import com.aitew.Manager.vo.BaseInformation;
import com.aitew.Manager.vo.Batch;
import com.aitew.Manager.vo.ClassName;

public interface BaseInformationService  {
	public void saveOnebase(BaseInformation b);
	public List<BaseInformation> findAllBase();
	public boolean delOneBase(String id);
	public BaseInformation findByName(String name_b);
	public BaseInformation findById(String id);
	public List<BaseInformation> findByClassName(ClassName className);
	 public List<BaseInformation> findByApplyTime(String year);
	 public List<BaseInformation> findByBatch(Batch b);
}
