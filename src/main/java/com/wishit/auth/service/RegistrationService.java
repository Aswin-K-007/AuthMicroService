package com.wishit.auth.service;

import org.springframework.stereotype.Service;

import com.wishit.auth.dto.ProfileDTO;
import com.wishit.auth.dto.RegistrationDTO;
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

	    public Registration registerUser(RegistrationDTO regDTO) {
	      
	    	if (repository.findByEmailAndPassword(regDTO.getEmail(), regDTO.getPassword()).isPresent()) {
	    	    throw new RuntimeException("Email already in use");
	    	    
	    	}
	    	
	    	Registration newUser = new Registration();
	    	newUser.setEmail(regDTO.getEmail());
	    	newUser.setName(regDTO.getName().toString());
	    	newUser.setPassword(regDTO.getPassword());
	    	
	    	ProfileDTO profileDTO = new ProfileDTO();
	    	profileDTO.setAge(regDTO.getAge());
	    	profileDTO.setCity(regDTO.getCity());
	    	profileDTO.setGender(regDTO.getGender());
	    	profileDTO.setMobileNo(regDTO.getMobileNo());
	    	profileDTO.setFirstName(regDTO.getName());
	    	
	        Registration savedUser = repository.save(newUser);
	        userProfileService.addUserProfile(null, savedUser);
	        return savedUser;
	    }
	}
