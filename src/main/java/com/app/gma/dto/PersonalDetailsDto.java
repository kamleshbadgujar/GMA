package com.app.gma.dto;

import javax.persistence.Embeddable;

@Embeddable
public class PersonalDetailsDto {
	private String firstName;
	private String lastName;
	private String Gender;
	private String contactNumber;
	private AddressDetailsDto address;

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

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public AddressDetailsDto getAddress() {
		return address;
	}

	public void setAddress(AddressDetailsDto address) {
		this.address = address;
	}


}
