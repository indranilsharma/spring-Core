package com.luv2code.annotation_qualifiers_1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get the bean from spring container
		ICoach theCoach = context.getBean("tennisCoach", ICoach.class);

		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		// call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		// call method to get daily fortune

		//System.out.println(theCoach.getDailyFortune_2());

		// close the context
		context.close();
	}
}
