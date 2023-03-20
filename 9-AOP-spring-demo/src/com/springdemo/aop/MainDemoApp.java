package com.springdemo.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDAO accountDao = context.getBean("accountDAO", AccountDAO.class);
		
		accountDao.AddAccount();
		
		context.close();
		
		
//		SingltonClass instance1 = SingltonClass.getInstance();
//		SingltonClass instance2 = SingltonClass.getInstance();
//		SingltonClass instance3 = instance1.clone();
//
//		
//		System.out.println("Instance1: "+ instance1.hashCode());
//		System.out.println("Instance2: "+ instance2.hashCode());
//		System.out.println("Instance3: "+ instance3.hashCode());
		
	}

}
