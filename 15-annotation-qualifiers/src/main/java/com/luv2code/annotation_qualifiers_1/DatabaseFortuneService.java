package com.luv2code.annotation_qualifiers_1;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements IFortuneService {

	public String getFortune() {
		return "DatabaseFortuneService";
	}

}
