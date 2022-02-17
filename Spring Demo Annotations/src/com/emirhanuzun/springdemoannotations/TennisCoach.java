package com.emirhanuzun.springdemoannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")

@Component
public class TennisCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;

	// define a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach : inside default constructor");
	}

	/*
	 * @Autowired // public TennisCoach(FortuneService theFortuneService) { //
	 * fortuneService = theFortuneService; } These are used for constructor
	 * injection.
	 */

	// define a setter method
	// @Autowired
	//	public void setFortuneService(FortuneService theFortuneService) {
	//		System.out.println(">> TennisCoach : inside setFortuneService() method");
	//		fortuneService = theFortuneService;
	//	}

	//	// Method injection
	//	@Autowired
	//	public void doSomeCrazyStuff(FortuneService theFortuneService) {
	//		System.out.println(">> TennisCoach : inside doSomeCrazyStuff() method");
	//		fortuneService = theFortuneService;
	//	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
