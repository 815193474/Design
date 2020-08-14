package com.aitew.Manager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aitew.Manager.dao.ResumeDao;
import com.aitew.Manager.vo.Resume;
@Service
public class ResumeServiceImpl implements ResumeService	 {
	@Autowired
	private ResumeDao resumeDao;
	@Override
	public void saveOneResume(Resume r) {
		// TODO Auto-generated method stub
		resumeDao.save(r);
	}
	@Override
	public List<Resume> FindAllResume() {
		// TODO Auto-generated method stub
		return resumeDao.findAll();
	}
	@Override
	public boolean delOneResume(String id) {
		// TODO Auto-generated method stub
		try {
			resumeDao.delete(id);
		}catch(Exception e) {
			return false;
		}
		return true;
	}
	@Override
	public Resume FindOneResume(String party_name_b) {
		// TODO Auto-generated method stub
		return null;
	}
}
