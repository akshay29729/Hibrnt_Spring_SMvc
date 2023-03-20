package com.springdemo.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBeanLifeCycleApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach = context.getBean("myTennisCoach",Coach.class);
		context.close();	
		
	}

}
