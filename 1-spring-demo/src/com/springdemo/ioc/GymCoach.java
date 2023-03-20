package com.springdemo.ioc;

public class GymCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public GymCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public void getWorkoutDetails() {
		// TODO Auto-generated method stub
		System.out.println("Cardio for 30 min");

	}

	@Override
	public void getFortuneService() {
		// TODO Auto-generated method stub
		fortuneService.getFortuneService();
		
	}

}
