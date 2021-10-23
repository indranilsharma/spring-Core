package com.luv2code.annotation_bean_scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App_Singleton {
	public static void main(String[] args) {
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		// get the bean from spring container
		ICoach theCoach = context.getBean("trackCoachBean", ICoach.class);

		ICoach theCoach_1 = context.getBean("trackCoachBean", ICoach.class);
		
		// check if they are the same
		boolean result = (theCoach == theCoach_1);

		// print out the results
		System.out.println("\nPointing to the same object: " + result);

		System.out.println("\nMemory location for theCoach1: " + theCoach);

		System.out.println("\nMemory location for theCoach2: " + theCoach_1 + "\n");

		// close the context
		context.close();
	}
}
