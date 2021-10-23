package com.luv2code.injecting_literal_values;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		// Load Spring config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// create bean
		IEaducationBoard board = context.getBean("myEaducationBoardImpl", IEaducationBoard.class);

		EaducationBoardImpl board_1 = context.getBean("myEaducationBoardImpl", EaducationBoardImpl.class);
		
		System.out.println(board.getName());
		System.out.println(board.getMidimum());
		
		// i can access all
		System.out.println(board_1.getExamName());
		System.out.println(board_1.getStanderd());
		System.out.println(board_1.getName());
		System.out.println(board_1.getMidimum());

		// close bean
		context.close();
	}
}
