package com.luv2code.annotation_demo;

import org.springframework.stereotype.Component;

//Customized bean id
//@Component("mytennisCoach")

//in case of default bean-id spring container automatically register the bean 

@Component
public class TennisCoach implements ICoach {

//	private IFortuneService iFortuneService;

//	@Autowired
//	public TennisCoach(IFortuneService iFortuneService) {
//		this.iFortuneService = iFortuneService;
//	}

	public String getDailyWorkout() {
		return "TennisCoach : getDailyWorkout()";
	}

	public String getDailyFortune() {
		return "TennisCoach: ";
//		return "TennisCoach:  " +iFortuneService.getFortune();

	}

}
