package com.pradeip.curiosity.service;

import com.pradeip.curiosity.exception.DatabaseInteractException;
import com.pradeip.curiosity.model.Profile;

public interface ProfileService {
	
	public Profile getProfiles() throws DatabaseInteractException;
	public Profile saveProfile(Profile profile) throws DatabaseInteractException;

}
