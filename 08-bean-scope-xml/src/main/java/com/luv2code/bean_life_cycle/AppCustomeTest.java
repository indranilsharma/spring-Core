package com.luv2code.bean_life_cycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AppCustomeTest {
	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beanLifeCycleCustom-applicationContext.xml");

		// retrieve bean from spring container
		TrackCoach theCoach = context.getBean("myTrackCoach", TrackCoach.class);
		
		//TrackCoach theCoach_1 = context.getBean("myTrackCoach", TrackCoach.class);

		//System.out.println(theCoach==theCoach_1);
	
		System.out.println(theCoach.getDailyWorkout());

		// close the context
		context.close();
	}
}
