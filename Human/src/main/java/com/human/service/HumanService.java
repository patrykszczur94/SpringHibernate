package com.human.service;

import java.util.List;

import com.human.model.Human;

// service class
public interface HumanService {

	List<Human> findAllHumans();
	
	public void addHuman(Human human);
	
}
