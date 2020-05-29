package com.app.gma.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class TrainerDetailsDto {
	@Id
	private int trainerId;
	@OneToOne
	private LoginDetailsDto login;

	private PersonalDetailsDto personalDetails;

	private long salary;

	private String expertise;

	private Date dateOfJoining;

	private float rating;

	private String timeSlot;

	@OneToMany(mappedBy = "trainerReview")
	private List<ReviewsDto> reviews;

	public int getTrainerId() {
		return trainerId;
	}


	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}









	public LoginDetailsDto getLogin() {
		return login;
	}



	public void setLogin(LoginDetailsDto login) {
		this.login = login;
	}


	public PersonalDetailsDto getPersonalDetails() {
		return personalDetails;
	}


	public void setPersonalDetails(PersonalDetailsDto personalDetails) {
		this.personalDetails = personalDetails;
	}


	public long getSalary() {
		return salary;
	}


	public void setSalary(long salary) {
		this.salary = salary;
	}


	public String getExpertise() {
		return expertise;
	}


	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}


	public Date getDateOfJoining() {
		return dateOfJoining;
	}


	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}


	public float getRating() {
		return rating;
	}


	public void setRating(float rating) {
		this.rating = rating;
	}


	public String getTimeSlot() {
		return timeSlot;
	}


	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}



	public List<ReviewsDto> getReviews() {
		return reviews;
	}



	public void setReviews(List<ReviewsDto> reviews) {
		this.reviews = reviews;
	}


}
