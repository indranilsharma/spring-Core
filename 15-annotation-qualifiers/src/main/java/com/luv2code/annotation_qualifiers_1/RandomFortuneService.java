package com.luv2code.annotation_qualifiers_1;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements IFortuneService {

	private String[] data = { "Spring 5 Learn Spring 5 Core", "AOP", "Spring MVC", "Spring Security", "Spring REST",
			"Spring Boot 2", "Thymeleaf", "JPA & Hibernate" };
	private Random myRandom = new Random();

	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		System.out.println("random number genarated :" +index);
		String theFortune = data[index];
		return theFortune;
	}
}
