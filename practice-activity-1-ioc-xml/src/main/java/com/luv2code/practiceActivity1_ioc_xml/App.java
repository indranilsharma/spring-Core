package com.luv2code.practiceActivity1_ioc_xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Play cricketBean_obj = context.getBean("cricketBean", Play.class);
		Play footballBean_obj = context.getBean("footballBean", Play.class);
		System.out.println(cricketBean_obj.getTypeOfPlay());
		System.out.println(footballBean_obj.getTypeOfPlay());
		context.close();
	}
}
