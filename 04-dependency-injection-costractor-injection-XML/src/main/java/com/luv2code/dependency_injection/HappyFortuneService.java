package com.luv2code.dependency_injection;

public class HappyFortuneService implements FortuneService {

	public String getFortune() {
		return "I am from HappyFortuneService";
	}

	public boolean getFortuneStatus() {
		return true;
	}
}
