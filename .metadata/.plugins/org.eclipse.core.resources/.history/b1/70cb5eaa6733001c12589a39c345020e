package com.luv2code.annotation_bean_scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App_Prototype {
	public static void main(String[] args) {
		
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		// get the bean from spring container
		ICoach theCoach1 = context.getBean("trackCoachBean", ICoach.class);
		ICoach theCoach2 = context.getBean("trackCoachBean", ICoach.class);

		// check if they are the same
		boolean result = (theCoach1 == theCoach2);

		// print out the results
		System.out.println("\nPointing to the same object: " + result);

		System.out.println("\nMemory location for theCoach1: " + theCoach1);

		System.out.println("\nMemory location for theCoach2: " + theCoach2 + "\n");

		// close the context
		context.close();
	}
}
