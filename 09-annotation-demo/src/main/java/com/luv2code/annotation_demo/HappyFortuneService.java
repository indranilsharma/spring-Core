package com.luv2code.annotation_demo;

import org.springframework.stereotype.Component;

@Component("myHappyFortuneService")
//@Component
public class HappyFortuneService implements IFortuneService {

	public String getFortune() {
		return "i am from HappyFortuneService :getFortune()";
	}
}
