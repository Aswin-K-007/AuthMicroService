package com.wishit.auth.dto;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;


public class ProfileDTO {
    private String firstName;
    private String lastName;
    private String email;
    private String profilePic;
    private Date joinedOn;
    private Long mobileNo;
    private String address;
    private String gender;
    private String prefferedLang;
    private Long alternativeMobNo;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProfilePic() {
		return profilePic;
	}
	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	public Date getJoinedOn() {
		return joinedOn;
	}
	public void setJoinedOn(Date joinedOn) {
		this.joinedOn = joinedOn;
	}
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPrefferedLang() {
		return prefferedLang;
	}
	public void setPrefferedLang(String prefferedLang) {
		this.prefferedLang = prefferedLang;
	}
	public Long getAlternativeMobNo() {
		return alternativeMobNo;
	}
	public void setAlternativeMobNo(Long alternativeMobNo) {
		this.alternativeMobNo = alternativeMobNo;
	}    
}
