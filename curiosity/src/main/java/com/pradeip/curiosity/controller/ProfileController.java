package com.pradeip.curiosity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pradeip.curiosity.exception.DatabaseInteractException;
import com.pradeip.curiosity.model.Profile;
import com.pradeip.curiosity.service.ProfileService;

@RestController
@RequestMapping("/profile")
public class ProfileController {

	@Autowired
	ProfileService profileService;

	@RequestMapping(method = RequestMethod.POST, value = "/save", consumes = "application/json")
	public Profile saveProfile(@RequestBody Profile profile)
			throws DatabaseInteractException {

		profile.setfName("Pradeep");
		profile.setlName("patel");
		profile.setProfileNumber(4562L);
		System.out.println("I am here ----------------> 22 "
				+ profile.toString());
		profileService.saveProfile(profile);
		return null;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/get")
	public Profile getProfile() throws DatabaseInteractException {
		System.out.println("I am here ----------------> 30");
		// profileService.getProfiles();
		return null;
	}

}
