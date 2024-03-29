package com.luv2code.java_configureration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements ICoach {

	public TennisCoach() {
		System.out.println("Default constructor TennisCoach()");
	}

	@Autowired
	@Qualifier("happyFortuneService")
	private IFortuneService fortuneService;

	public TennisCoach(IFortuneService theortuneService) {
		this.fortuneService = theortuneService;
	}

	public String getDailyWorkout() {
		return "TennisCoach : getDailyWorkout()";
	}

	public String getDailyFortune() {
		return "TennisCoach:  " +fortuneService.getFortune();
	}

}
