package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BasketballCocah implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "practice the shoot";
	}

}
