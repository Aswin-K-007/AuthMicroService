package com.wishit.auth.entity;

import java.util.Date;
import jakarta.persistence.*;

@Entity
public class UserProfile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long profileID;
	
	private String firstName;
	private String lastName;
	private String email;
	private String profilePic;
	private Date joinedOn;
	private Long mobileNo;
	private Long AlternativeMobNo;
	private String address;
	private String gender;
	private String prefferedLang;
	
	@OneToOne
	@JoinColumn(name = "userid")
	private Registration user;
	
	public Long getProfileID() {
		return profileID;
	}

	public void setProfileID(Long profileID) {
		this.profileID = profileID;
	}

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

	public Long getAlternativeMobNo() {
		return AlternativeMobNo;
	}

	public void setAlternativeMobNo(Long alternativeMobNo) {
		AlternativeMobNo = alternativeMobNo;
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

	public Registration getUser() {
		return user;
	}

	public void setUser(Registration user) {
		this.user = user;
	}
}
