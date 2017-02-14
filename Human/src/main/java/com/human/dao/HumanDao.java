package com.human.dao;

import java.util.List;

import com.human.model.Human;

// DAO class
public interface HumanDao {
	
	List<Human> findAllHumans();
	
	public void addHuman(Human human);
		
}
