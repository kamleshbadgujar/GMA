package com.app.gma.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class MemberDetailsDto {

	@Id
	private int memberId;
	@OneToOne
	private LoginDetailsDto emailId;

	private boolean paymentStatus;

	private Date dateOfJoining;

	@ManyToOne
	private TrainerDetailsDto trainer;

	@ManyToOne
	private PlanDetailsDto plan;

	private String timeSlot;


	public int getMemberId() {
		return memberId;
	}


	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}


	public LoginDetailsDto getEmailId() {
		return emailId;
	}


	public void setEmailId(LoginDetailsDto emailId) {
		this.emailId = emailId;
	}


	public boolean isPaymentStatus() {
		return paymentStatus;
	}


	public void setPaymentStatus(boolean paymentStatus) {
		this.paymentStatus = paymentStatus;
	}


	public Date getDateOfJoining() {
		return dateOfJoining;
	}


	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}



	public TrainerDetailsDto getTrainer() {
		return trainer;
	}



	public void setTrainer(TrainerDetailsDto trainer) {
		this.trainer = trainer;
	}



	public PlanDetailsDto getPlan() {
		return plan;
	}



	public void setPlan(PlanDetailsDto plan) {
		this.plan = plan;
	}



	public String getTimeSlot() {
		return timeSlot;
	}



	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}

}
