package com.luv2code.annotation_qualifiers_1;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements IFortuneService {

	public String getFortune() {
		return "HappyFortuneService :: getFortune()";
	}
}
