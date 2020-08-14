package com.aitew.Manager.service;

import java.util.List;

import com.aitew.Manager.vo.SuperAdmin;

public interface SuperAdminService {
	public SuperAdmin findOneSuper(String id);
	public List<SuperAdmin> findAll();
	void save(SuperAdmin superAdmin);

}
