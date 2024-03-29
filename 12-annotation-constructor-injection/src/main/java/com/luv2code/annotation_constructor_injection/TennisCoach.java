package com.luv2code.annotation_constructor_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myFebTennisCoach")
public class TennisCoach implements ICoach {

	private IFortuneService iFortuneService;

	@Autowired
	public TennisCoach(IFortuneService iFortuneService) {
		this.iFortuneService = iFortuneService;
	}

	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	public String getDailyFortune() {
		return iFortuneService.getFortune();
	}

}
