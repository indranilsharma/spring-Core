package com.luv2code;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlApp {
	public static void main(String[] args) {
		// load spring config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

		// retrive bean from container
		Coach theCoachbean1 = context.getBean("myCoachTrack", Coach.class);
		Coach theCoachbean2 = context.getBean("myCoachBaseBall", Coach.class);
		
		System.out.println(theCoachbean1.getDailyWorkout());
		System.out.println(theCoachbean2.getDailyWorkout());
		// close the connection
		context.close();
	}
}
