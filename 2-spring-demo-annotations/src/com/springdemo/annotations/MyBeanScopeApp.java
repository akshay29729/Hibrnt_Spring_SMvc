package com.springdemo.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBeanScopeApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach1 = context.getBean("myTennisCoach", Coach.class);
		Coach coach2 = context.getBean("myTennisCoach", Coach.class);
		boolean result = (coach1==coach2);
		
		System.out.println("Two objects are same: "+result);
		
		System.out.println("Location of first object: "+coach1);
		System.out.println("Location of second object: "+coach2);
		
		context.close();	
	}

}
