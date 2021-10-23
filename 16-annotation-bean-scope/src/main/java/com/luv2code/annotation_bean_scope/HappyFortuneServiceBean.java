package com.luv2code.annotation_bean_scope;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneServiceBean {
	public String getFortune() {
		return "HappyFortuneServiceBean :: getFortune()";
	}
}
