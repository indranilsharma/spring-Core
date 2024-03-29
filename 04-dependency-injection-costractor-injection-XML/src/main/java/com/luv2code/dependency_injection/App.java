package com.luv2code.dependency_injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		BaseballCoach baseballCoach_obj = context.getBean("baseballCoach", BaseballCoach.class);
		Coach coach_obj = context.getBean("baseballCoach", Coach.class);
		Coach coach_obj_1 = context.getBean("trackCoach", Coach.class);

		System.out.println(coach_obj.getDailyFortune() + " ===== " + coach_obj.getDailyWorkout());

		// call methods on the bean
		System.out.println(baseballCoach_obj.getDailyWorkout());

		// let's call our new method for fortunes
		System.out.println(baseballCoach_obj.getDailyFortune());

		// null pointer is coming
//		System.out.println(baseballCoach_obj.sayFortune());

		// from track coach
		System.out.println(coach_obj_1.getDailyFortune());

		// close the context
		context.close();
	}
}
