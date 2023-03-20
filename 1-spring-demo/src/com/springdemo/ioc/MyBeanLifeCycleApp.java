package com.springdemo.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBeanLifeCycleApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanslifecycle_applicationContext.xml");
		
		Coach coach = context.getBean("myCoach",Coach.class);
		context.close();	
		
	}

}
