package com.pradeip.curiosity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pradeip.curiosity.dao.ProfileDao;
import com.pradeip.curiosity.exception.DatabaseInteractException;
import com.pradeip.curiosity.model.Profile;

@Service("profileService")
@Transactional
public class ProfileServiceImpl implements ProfileService {

	@Autowired
	ProfileDao ProfileDao;
	@Override
	public Profile getProfiles() throws DatabaseInteractException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Profile saveProfile(Profile profile) throws DatabaseInteractException {
		try {
			ProfileDao.persist(profile);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/*//@Autowired
	//ProfileDao profileDao;
	
	@Override
	public Profile getProfiles() throws DatabaseInteractException {
		return null;
	}

	@Override
	public Profile saveProfile() throws DatabaseInteractException {
		return null;
	}*/

}
