package com.luv2code.annotation_setter_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements ICoach {

	private IFortuneService fortuneService;

	public TennisCoach() {
		System.out.println(" TennisCoach: inside default constructor");
	}

	public IFortuneService getFortuneService() {
		return fortuneService;
	}

	@Autowired
	public void setFortuneService(IFortuneService fortuneService) {
		System.out.println("TennisCoach: inside setter injection");
		this.fortuneService = fortuneService;
	}
	
	// inject dependency we can call any method to the particular object
		@Autowired
		public void methodInjection(IFortuneService thefortuneService) {
			System.out.println("TennisCoach: methodInjection");
			this.fortuneService = thefortuneService;
		}

	// implemented method from icoach
	@Override
	public String getDailyWorkout() {
		return "TennisCoach :getDailyWorkout() ";
	}

	@Override
	public String getDailyFortune() {
		return "TennisCoach : getDailyFortune() ";
	}

	

}
