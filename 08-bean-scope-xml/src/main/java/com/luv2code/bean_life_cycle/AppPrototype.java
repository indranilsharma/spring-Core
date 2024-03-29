package com.luv2code.bean_life_cycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AppPrototype {
	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beanLifeCycle-applicationContext-Prototype.xml");

		// retrieve bean from spring container
		TrackCoach coach = context.getBean("myTrackCoach", TrackCoach.class);
		TrackCoach theCoach = context.getBean("myTrackCoach", TrackCoach.class);

		boolean result = (coach == theCoach );
		
		//singleton scope thats why return true
		System.out.println(coach == theCoach);
		
		//memory location
		System.out.println(coach +"\n"+ theCoach);
		
		System.out.println(theCoach.getDailyWorkout());

		// close the context
		context.close();
	}
}
