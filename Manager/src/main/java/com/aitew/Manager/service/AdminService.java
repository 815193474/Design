package com.aitew.Manager.service;

import java.util.List;

import com.aitew.Manager.vo.Admin;

public interface AdminService {
	public void SaveOneAdmin(Admin a);
	public List<Admin> findAll();
	public Admin findOneAmdin(String id);
	public boolean delOneAdmin(String id);
}
