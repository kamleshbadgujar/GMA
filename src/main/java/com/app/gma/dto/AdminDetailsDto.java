package com.app.gma.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class AdminDetailsDto {

	@Id
	private int adminId;
	@OneToOne()
	@JoinColumn(name = "emailId")
	private LoginDetailsDto emailId;

	private PersonalDetailsDto personalDetails;








	public int getAdminId() {
		return adminId;
	}



	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}



	public LoginDetailsDto getEmailId() {
		return emailId;
	}



	public void setEmailId(LoginDetailsDto emailId) {
		this.emailId = emailId;
	}


	public PersonalDetailsDto getPersonalDetails() {
		return personalDetails;
	}


	public void setPersonalDetails(PersonalDetailsDto personalDetails) {
		this.personalDetails = personalDetails;
	}

}
