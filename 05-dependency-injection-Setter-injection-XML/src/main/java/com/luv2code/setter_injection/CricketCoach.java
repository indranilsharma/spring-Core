package com.luv2code.setter_injection;

public class CricketCoach implements Coach {

	IFortuneService fortuneService;

	public CricketCoach() {
		System.out.println("CricketCoach: no arg costractor");
	}

	//setter injection 
	public void setFortuneService(IFortuneService fortuneService) {
		System.out.println("setFortuneService: setter method");
		this.fortuneService = fortuneService;
		//fortuneService.getFortune();
	}

	public String getDailyWorkout() {
		return " I am from implemented class: getDailyWorkout()";
	}

	public String getDailyFortune() {
		return "I am call by interface getDailyFortune()"+ fortuneService.getFortune();
	}

}
