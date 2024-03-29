package com.luv2code.java_configureration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {

		// read spring config file from java config ..so applicationContext.xml file 
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class);

		// get the bean from spring container
		ICoach theCoach = context.getBean("tennisCoach", ICoach.class);
		
		IFortuneService fortuneService = context.getBean("happyFortuneService", IFortuneService.class);

		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(fortuneService.getFortune());

		// call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());

		// close the context
		context.close();
	}
}
