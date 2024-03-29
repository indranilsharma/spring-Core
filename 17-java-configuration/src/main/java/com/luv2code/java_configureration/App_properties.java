package com.luv2code.java_configureration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App_properties {

	public static void main(String[] args) {

		// read spring config file from java config ..so applicationContext.xml file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfigProperties.class);

		// get the bean from spring container --same method name we passed from sprots
		// bean
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		// call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		
		//call new properties value
		
		System.out.println("Email :" +theCoach.getEmail()+"   \n" +"team :"+theCoach.getTeam());

		// close the context
		context.close();
	}
	
}
