package com.luv2code.annotation_setter_injection;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements IFortuneService {

	public String getFortune() {
		return "Today is your lucky day!";
	}
}
