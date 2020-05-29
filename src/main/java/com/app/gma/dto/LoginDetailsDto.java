package com.app.gma.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LoginDetailsDto {

	@Id
	private int email;

	private String password;

	private String actionCode;

	public int getEmail() {
		return email;
	}
	public void setEmail(int email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getActionCode() {
		return actionCode;
	}
	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}


}
