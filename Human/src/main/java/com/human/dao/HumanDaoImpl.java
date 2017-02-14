package com.human.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.human.model.Human;

@Repository("humanDao")
public class HumanDaoImpl extends AbstractDao<Integer, Human> implements HumanDao {

	@SuppressWarnings("unchecked")
	public List<Human> findAllHumans() {
		Criteria criteria = createEntityCriteria();
		return (List<Human>)criteria.list();
	}

	public void addHuman(Human human) {
		persist(human);
	}
}
