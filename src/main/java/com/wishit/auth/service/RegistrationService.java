package com.wishit.auth.service;


import org.springframework.stereotype.Service;

import com.wishit.auth.entity.Registration;
import com.wishit.auth.repository.RegistrationRepo;


@Service
public class RegistrationService {

	 private final RegistrationRepo repository;
	 private final UserProfileService userProfileService;

	    public RegistrationService(RegistrationRepo repository, UserProfileService userProfileService) {
	        this.repository = repository;
	        this.userProfileService = userProfileService;
	    }

	    public Registration registerUser(Registration user) {
	      
	    	if (repository.findByEmailAndPassword(user.getEmail(), user.getPassword()).isPresent()) {
	    	    throw new RuntimeException("Email already in use");
	    	    
	    	}

	        Registration savedUser = repository.save(user);
	        userProfileService.addUserProfile(null, savedUser);
	        return savedUser;
	    }
	}
