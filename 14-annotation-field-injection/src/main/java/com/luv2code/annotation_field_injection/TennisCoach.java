package com.luv2code.annotation_field_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements ICoach {

// @Autowired applied directly on the field no required setter method and constructor 
//	it is done by reflection
	@Autowired
	private IFortuneService iFortuneService;

	public TennisCoach() {
		System.out.println("TennisCoach: inside default constructor");
	}

// no @Autowired applied 
	public String getDailyWorkout() {
		return "TennisCoach getDailyWorkout() access";
	}

	// no @Autowired applied
	public String getDailyFortune() {
		return iFortuneService.getFortune();
	}

}
