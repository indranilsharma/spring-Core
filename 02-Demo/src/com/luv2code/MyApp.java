package com.luv2code;

public class MyApp {
	public static void main(String[] args) {
		
		// create the object
		// Coach theCoach = new BaseballCoach();
		Coach trackCoach = new TrackCoach();
		Coach baseballCoach = new BaseballCoach();
		
		// use the object
		System.out.println(trackCoach.getDailyWorkout() + " AND \n" + baseballCoach.getDailyWorkout());
	}
}
