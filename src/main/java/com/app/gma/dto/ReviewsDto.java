package com.app.gma.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ReviewsDto {

	@Id
	private int reviewId;
	@ManyToOne
	private MemberDetailsDto member;

	private boolean forTrainer;

	@ManyToOne
	private TrainerDetailsDto trainerReview;

	private String reviewDescription;

	private float rating;


	public int getReviewId() {
		return reviewId;
	}


	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}


	public MemberDetailsDto getMember() {
		return member;
	}


	public void setMember(MemberDetailsDto member) {
		this.member = member;
	}


	public boolean isForTrainer() {
		return forTrainer;
	}


	public void setForTrainer(boolean forTrainer) {
		this.forTrainer = forTrainer;
	}


	public TrainerDetailsDto getTrainer() {
		return trainerReview;
	}


	public void setTrainer(TrainerDetailsDto trainerReview) {
		this.trainerReview = trainerReview;
	}


	public String getReviewDescription() {
		return reviewDescription;
	}


	public void setReviewDescription(String reviewDescription) {
		this.reviewDescription = reviewDescription;
	}


	public float getRating() {
		return rating;
	}


	public void setRating(float rating) {
		this.rating = rating;
	}


}
