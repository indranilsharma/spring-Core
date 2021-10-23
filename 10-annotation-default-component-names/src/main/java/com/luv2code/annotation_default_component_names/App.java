package com.luv2code.annotation_default_component_names;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get the bean from spring container
		
		ICoach coach_obj = context.getBean("tennisCoach", ICoach.class); //no bean name

		// call a method on the bean
		System.out.println(coach_obj.getDailyWorkout());
		System.out.println(coach_obj.getDailyFortune());

		// close the context
		context.close();
	}
}
