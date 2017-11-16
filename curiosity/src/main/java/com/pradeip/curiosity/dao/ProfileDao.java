package com.pradeip.curiosity.dao;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.pradeip.curiosity.model.Profile;

@Repository("profileDao")
public class ProfileDao extends BaseDao<Long, Profile> {

	@Override
	public Profile getByKey(Long key) throws Exception {
		return super.getByKey(key);
	}

	@Override
	public void persist(Profile entity) throws Exception {
		super.persist(entity);
	}

	@Override
	public void update(Profile entity) throws Exception {
		super.update(entity);
	}

	@Override
	public void delete(Profile entity) throws Exception {
		super.delete(entity);
	}

	@Override
	protected Criteria createEntityCriteria() throws Exception {
		return super.createEntityCriteria();
	}

}
