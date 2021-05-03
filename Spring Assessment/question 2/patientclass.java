package com.org.health;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class patientclass {
	public static void main(String[] args) {
		
			ApplicationContext ap = new ClassPathXmlApplicationContext("bean.xml");
			BMICalculator BMI =(BMICalculator) ap.getBean("BMI");
			BMI.getPatient();BMI.calculateBMI(53, 5.2);
	}
}
