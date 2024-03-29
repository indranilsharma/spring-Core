package com.luv2code.java_configureration;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements ICoach {

	//Field level injection from  properties file
	
	@Value("${foo.email}")
	private String email;

	@Value("${foo.team}")
	private String team;
	
	IFortuneService fortuneService;

	public SwimCoach(IFortuneService thefortuneService) {
		this.fortuneService = thefortuneService;
	}

	public String getDailyWorkout() {
		return "SwimCoach :: getDailyWorkout()";
	}

	public String getDailyFortune() {
		return "SwimCoach :: getDailyFortune()" + fortuneService.getFortune();
	}

	//getter for properties field injected value
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
	
	

	
	

	
	
	
}
