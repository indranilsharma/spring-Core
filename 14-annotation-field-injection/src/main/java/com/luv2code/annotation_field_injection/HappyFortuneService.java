package com.luv2code.annotation_field_injection;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements IFortuneService {

	public String getFortune() {
		return "HappyFortuneService access!";
	}
}
