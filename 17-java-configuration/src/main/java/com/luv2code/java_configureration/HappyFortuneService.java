package com.luv2code.java_configureration;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements IFortuneService {

	public String getFortune() {
		return "i am from HappyFortuneService :getFortune()";
	}
}
