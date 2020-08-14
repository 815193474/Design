package com.aitew.Manager.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aitew.Manager.vo.BaseInformation;
import com.aitew.Manager.vo.Batch;
import com.aitew.Manager.vo.ClassName;

public interface BaseInformationDao extends JpaRepository<BaseInformation, Serializable> {
 public BaseInformation findByName(String name_b);
 public List<BaseInformation> findByClassName(ClassName className);
 public List<BaseInformation> findByApplyTime(String year);
 public List<BaseInformation> findByBatch(Batch b);
}
