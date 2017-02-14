package com.human.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.human.dao.HumanDao;
import com.human.model.Human;

@Service("humanService")
@Transactional
public class HumanServiceImple implements HumanService{
	
	@Autowired
	HumanDao humanDao;

	public void addHuman(Human human) {
		humanDao.addHuman(human);
	}
	
	public List<Human> findAllHumans() {
		return humanDao.findAllHumans();
	}

}
