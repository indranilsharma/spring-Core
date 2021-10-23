package com.luv2code.practice_activity_4_ioc_annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get the bean from spring container
		ICoach theCoach = context.getBean("pingPongCoach", ICoach.class);

		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout()+"\n"+ theCoach.getDailyFortune());

		// close the context
		context.close();
	}
}
