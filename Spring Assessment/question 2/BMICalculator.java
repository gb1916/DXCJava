package com.org.health;

import java.util.Arrays;


public class BMICalculator {
private String Patient[];

public String[] getPatient() {
	return Patient;
}


public double calculateBMI(double weight,double height) {
	double h=height*height;
	double BMI=(weight/h)*703;
	
	return BMI;
	
}

 
}

