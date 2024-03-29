package com.luv2code.dependency_injection;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "getDailyWorkout() from TrackCoach implementation";
	}

	@Override
	public String getDailyFortune() {
		//use myforture service to get a fortune 
		return "From trackCoach :" +fortuneService.getFortune() ;
	}

}
