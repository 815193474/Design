package com.aitew.Manager.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aitew.Manager.vo.Talk;

public interface TalkDao extends JpaRepository<Talk, Serializable>{

}
