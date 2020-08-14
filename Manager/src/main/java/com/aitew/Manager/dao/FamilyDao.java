package com.aitew.Manager.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aitew.Manager.vo.Family;

public interface FamilyDao extends JpaRepository<Family, Serializable>{

}
