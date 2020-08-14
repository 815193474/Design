package com.aitew.Manager.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aitew.Manager.vo.Teachers;


public interface TeacherDao extends JpaRepository<Teachers, Serializable>{
	public Teachers findByName(String name);
}
