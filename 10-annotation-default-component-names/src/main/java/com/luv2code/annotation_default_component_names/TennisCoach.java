package com.luv2code.annotation_default_component_names;

import org.springframework.stereotype.Component;

/* by default tennis coach container will create same name as class name
start will lower-case like tennisCoach */

@Component
public class TennisCoach implements ICoach {

	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	public String getDailyFortune() {
		return "Practice your backhand football";
	}

}
