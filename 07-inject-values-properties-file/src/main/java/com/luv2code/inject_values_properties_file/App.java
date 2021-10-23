package com.luv2code.inject_values_properties_file;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		EaducationBoardImpl board = context.getBean("myEaducationBoardImpl", EaducationBoardImpl.class);
		StudentBean studentBean = context.getBean("myStudentBean",StudentBean.class);
		System.out.println(board.getName());
		System.out.println(board.getMidimum());
		System.out.println(board.getName());
		System.out.println(board.getStanderd());
		System.out.println(studentBean.getName());
		System.out.println(studentBean.getContactNo());
		System.out.println(studentBean.getAge());
		context.close();
	}
}
