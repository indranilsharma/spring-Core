package com.luv2code.solution_practice_activity_3_bean_scopes_xml;

public class GolfCoach implements ICoach {

	private IFortuneService iFortuneService;

	public GolfCoach(IFortuneService iFortuneService) {
		this.iFortuneService = iFortuneService;
	}

	public String getDailyWorkout() {
		return "Practice your putting skills for 2 hours today";
	}

	public String getDailyFortune() {
		return iFortuneService.getFortune();
	}

}
