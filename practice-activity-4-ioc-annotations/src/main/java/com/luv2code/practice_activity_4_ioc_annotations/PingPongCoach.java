package com.luv2code.practice_activity_4_ioc_annotations;

import org.springframework.stereotype.Component;

@Component
public class PingPongCoach implements ICoach {

	// define a default constructor
	public PingPongCoach() {
		System.out.println("PingPongCoach: inside default constructor");
	}

	public String getDailyWorkout() {
		return "Practice your pingpong drop shot";
	}

	public String getDailyFortune() {
		return "PingPongCoach :getDailyFortune()";
	}

}
