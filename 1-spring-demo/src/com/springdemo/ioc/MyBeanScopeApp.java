package com.springdemo.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBeanScopeApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanscopes_applicationContext.xml");
		
		Coach coach1 = context.getBean("myCoach", Coach.class);
		Coach coach2 = context.getBean("myCoach", Coach.class);
		boolean result = (coach1==coach2);
		
		System.out.println("Two objects are same: "+result);
		
		System.out.println("Location of first object: "+coach1);
		System.out.println("Location of second object: "+coach2);
		
		context.close();	
	}

}
