package com.springdemo.ioc;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public void getWorkoutDetails() {
		// TODO Auto-generated method stub
		System.out.println("Practice for Yo-Yo test...");

	}

	@Override
	public void getFortuneService() {
		// TODO Auto-generated method stub
		fortuneService.getFortuneService();
		
		// added for cricketCoach only
		System.out.println(this.getEmailAddress());
		System.out.println(this.getTeam());
		
	}
	
	// custom initialization method
	
	public void customBeanInitMethod() {
		System.out.println("Initiating the cricketCoach object....");
	}

	// custom destroying method
	
	public void customBeanDestroyMethod() {
		System.out.println("Destroying the cricketCoach object....");
	}
}
