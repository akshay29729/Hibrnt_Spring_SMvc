package com.springdemo.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class DemoAspect {

	@Before("execution(public void AddAccount())")
	public void adviceMethod1() {
		System.out.println("---------Doing required stuff before AddAccount method---------");
	}
}
