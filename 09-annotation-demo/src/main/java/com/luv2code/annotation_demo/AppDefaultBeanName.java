package com.luv2code.annotation_demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppDefaultBeanName {
	public static void main(String[] args) {
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get the bean from spring container
		//use the default bean id from bean 
        ICoach theCoach = context.getBean("tennisCoach", ICoach.class);
//        IFortuneService fortuneService = context.getBean("myHappyFortuneService",IFortuneService.class);
		
		// call a method on the bean Tenniscoach
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());

		// call method to get daily fortune
//		System.out.println(fortuneService.getFortune());

		// close the context
		context.close();
	}
}
