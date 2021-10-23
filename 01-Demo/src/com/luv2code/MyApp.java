package com.luv2code;

public class MyApp {
	public static void main(String[] args) {

		Coach coach1 = new FootBallCoach();
		Coach coach2 = new BaseballCoach();

		System.out.println(coach1.getDailyWorkout());
		System.out.println(coach2.getDailyWorkout());

	}
}
