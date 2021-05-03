package com.org.dxc;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Internship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CacheConfig.class);
	Cognizant set = context.getBean(Cognizant.class);
		ApplicationContext app = new ClassPathXmlApplicationContext("Bean.xml");
		Cohorts c = (Cohorts)app.getBean("cohorts");
	}

}
