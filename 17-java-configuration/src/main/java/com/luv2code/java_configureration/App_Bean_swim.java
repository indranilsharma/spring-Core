package com.luv2code.java_configureration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App_Bean_swim {

	public static void main(String[] args) {

		// read spring config file from java config ..so applicationContext.xml file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class);

		// get the bean from spring container --same method name we passed from sprots
		// bean
		ICoach theCoach = context.getBean("swimCoach", ICoach.class);

		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		// call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());

		// close the context
		context.close();
	}

}
