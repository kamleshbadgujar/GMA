package com.app.gma.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AttendanceDto {

	@Id
	private int attendanceId;

	@ManyToOne
	private TrainerDetailsDto trainer;

	@ManyToOne
	private MemberDetailsDto member;

	private Date date;

	private String inTime;

	private String outTime;

	private String attendanceCode;


	public int getAttendanceId() {
		return attendanceId;
	}


	public void setAttendanceId(int attendanceId) {
		this.attendanceId = attendanceId;
	}


	public TrainerDetailsDto getTrainer() {
		return trainer;
	}


	public void setTrainer(TrainerDetailsDto trainer) {
		this.trainer = trainer;
	}


	public MemberDetailsDto getMember() {
		return member;
	}


	public void setMember(MemberDetailsDto member) {
		this.member = member;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getInTime() {
		return inTime;
	}


	public void setInTime(String inTime) {
		this.inTime = inTime;
	}


	public String getOutTime() {
		return outTime;
	}


	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}


	public String getAttendanceCode() {
		return attendanceCode;
	}


	public void setAttendanceCode(String attendanceCode) {
		this.attendanceCode = attendanceCode;
	}


}
