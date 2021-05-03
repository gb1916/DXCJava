package com.org.health;

import com.org.emp.Department;

public class Patient {
	private int patientId ;
	private String patientName;
	private Double patientHeight;
	private Double patientWeight;
	
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public Double getPatientHeight() {
		return patientHeight;
	}
	public void setPatientHeight(Double patientHeight) {
		this.patientHeight = patientHeight;
	}
	public Double getPatientWeight() {
		return patientWeight;
	}
	public void setPatientWeight(Double patientWeight) {
		this.patientWeight = patientWeight;
	}
	
}
