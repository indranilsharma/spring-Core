package com.luv2code.dependency_injection;

public class BaseballCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;
	private HappyFortuneService happyFortuneService;
	
	// define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	public String getDailyWorkout() {
		return "I am from BaseballCoach";
	}

	public String getDailyFortune() {		
		// use my fortuneService to get a fortune		
		return fortuneService.getFortune();/* + happyFortuneService.getFortuneStatus(); */
	}
	
	public boolean sayFortune() {
		return happyFortuneService.getFortuneStatus();
	}
}








