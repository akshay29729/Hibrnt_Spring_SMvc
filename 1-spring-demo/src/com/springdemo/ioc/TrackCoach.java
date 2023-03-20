package com.springdemo.ioc;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public void getWorkoutDetails() {
		// TODO Auto-generated method stub
		System.out.println("Run 5 Km daily...");

	}

	@Override
	public void getFortuneService() {
		// TODO Auto-generated method stub
		fortuneService.getFortuneService();
	}

}
