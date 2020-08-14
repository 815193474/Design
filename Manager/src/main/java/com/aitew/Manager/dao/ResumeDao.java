package com.aitew.Manager.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aitew.Manager.vo.Resume;

public interface ResumeDao extends JpaRepository<Resume, Serializable> {
	
}
