package com.springdemo.annotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String[] data = {"Happy for your work...","DO your best...","Practice makes man perfect"};
	
	private Random myRandom = new Random();

	@Override
	public String getFortuneService() {
		// TODO Auto-generated method stub
		int i = myRandom.nextInt(data.length);
		String fortune = data[i];
		return fortune;
	}

}
