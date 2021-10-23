package com.luv2code.setter_injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		// load config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve bean from container
		CricketCoach coach = context.getBean("xmlRefcricketCoach", CricketCoach.class);
	
		//call bean method
		System.out.println(coach.getDailyFortune() + " " + coach.getDailyWorkout());
		
		//close context 
		context.close();
	}
}
