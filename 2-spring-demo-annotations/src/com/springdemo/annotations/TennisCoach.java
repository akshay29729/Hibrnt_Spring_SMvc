package com.springdemo.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("myTennisCoach") // if we don't specify the bean id here then spring will make default id "tennisCoach"
//@Scope("prototype") // Default is singleton
public class TennisCoach implements Coach {
	
	 // Field Injection
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	
	// Constructor injection
//
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
	// setter injection
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getWorkoutDetails() {
		// TODO Auto-generated method stub
		return "Practice the backhand shots....";
		
	}

	// its not getter method.. its method from interface.. name should be different..
	@Override
	public String getFortuneService() {
		return fortuneService.getFortuneService();
	}
	
	// custom initialization method
	@PostConstruct
	public void customBeanInitMethod() {
		System.out.println("Initiating the cricketCoach object....");
	}	

	// custom destroying method
		
	@PreDestroy
	public void customBeanDestroyMethod() {
		System.out.println("Destroying the cricketCoach object....");
	}

}
