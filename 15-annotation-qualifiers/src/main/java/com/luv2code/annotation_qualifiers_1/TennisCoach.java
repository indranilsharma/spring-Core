package com.luv2code.annotation_qualifiers_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements ICoach {

	// @Qualifier will use where multiple implementation(@Component) are found for
	// same interface single
	
	@Autowired
	@Qualifier("randomFortuneService") // we change implementation class ...like HappyFortuneService
//	if i remove the @Qualifier then noSuchQuniqueBeanDefination error will come	
	private IFortuneService iFortuneService;

	public TennisCoach() {
		System.out.println("TennisCoach: inside default constructor");
	}

	public String getDailyWorkout() {
		return "TennisCoach: inside getDailyWorkout()";
	}

	public String getDailyFortune() {
		return iFortuneService.getFortune();
	}

}
