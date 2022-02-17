package com.emirhanuzun.springdemoannotations;

import org.springframework.stereotype.Component;

@Component("footballComponent")
public class FootballCoach implements Coach {
	
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Shoot better ! ";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
