package com.wishit.auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wishit.auth.dto.ProfileDTO;
import com.wishit.auth.entity.UserProfile;
import com.wishit.auth.repository.UserProfileRepository;

@Service
public class UserProfileService {

	@Autowired
	UserProfileRepository userProfileRepo;
	
	public ProfileDTO getUserProfile(Long userId) {
		UserProfile profile = userProfileRepo.findByUser_Id(userId)
                .orElseThrow(() -> new RuntimeException("Profile not found"));

        ProfileDTO dto = new ProfileDTO();
        dto.setFirstName(profile.getFirstName());
        dto.setLastName(profile.getLastName());
        dto.setEmail(profile.getEmail());
        dto.setProfilePic(profile.getProfilePic());
        dto.setJoinedOn(profile.getJoinedOn());
        dto.setMobileNo(profile.getMobileNo());
        dto.setAddress(profile.getAddress());
        dto.setGender(profile.getGender());
        dto.setPrefferedLang(profile.getPrefferedLang());
        dto.setAlternativeMobNo(profile.getAlternativeMobNo());

        return dto;
	}
}
