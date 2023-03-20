package com.springdemo.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyCoachApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach = context.getBean("myCoach", Coach.class);
		
		coach.getWorkoutDetails();
		coach.getFortuneService();
		
		context.close();	
	}
}
