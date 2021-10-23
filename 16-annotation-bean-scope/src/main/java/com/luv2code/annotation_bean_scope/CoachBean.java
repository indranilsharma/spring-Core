package com.luv2code.annotation_bean_scope;

import org.springframework.stereotype.Component;

@Component
public class CoachBean implements ICoach{

	public String getDailyWorkout() {
		return "5hr";
	}

	public String getDailyFortune() {
		return "good";
	}

}
