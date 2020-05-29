package com.app.gma.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class DailyRecordsDto {

	@Id
	private int recordId;

	@ManyToOne
	private MemberDetailsDto member;

	private float weight;

	private Date date;


	public int getRecordId() {
		return recordId;
	}


	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}


	public MemberDetailsDto getMember() {
		return member;
	}


	public void setMember(MemberDetailsDto member) {
		this.member = member;
	}


	public float getWeight() {
		return weight;
	}


	public void setWeight(float weight) {
		this.weight = weight;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


}
