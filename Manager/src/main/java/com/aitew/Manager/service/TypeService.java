package com.aitew.Manager.service;

import java.util.List;

import com.aitew.Manager.vo.Type;

public interface TypeService {
	
	public List<Type> findAllType();
	public Type findOneType(String id);
}
