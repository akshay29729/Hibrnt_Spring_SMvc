package com.springdemo.aop;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

	public void AddAccount() {
		System.out.println(getClass()+"Adding the account into database....");
	}
}
