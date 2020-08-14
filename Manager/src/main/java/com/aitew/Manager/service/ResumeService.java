package com.aitew.Manager.service;

import java.util.List;

import com.aitew.Manager.vo.Resume;

public interface ResumeService  {
	public void saveOneResume(Resume r);
	public List<Resume> FindAllResume();
	public Resume FindOneResume(String party_name_b);
	public boolean delOneResume(String id);
}
