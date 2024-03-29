package com.luv2code.annotation_bean_scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") 
//@Scope("singleton") // default scope
public class TrackCoachBean implements ICoach {

	@Autowired // field injection
	@Qualifier("happyFortuneServiceBean") // multiple implementation for same interface
	private HappyFortuneServiceBean happyFortuneServiceBean;

	public TrackCoachBean(HappyFortuneServiceBean happyFortuneServiceBean) {
		this.happyFortuneServiceBean = happyFortuneServiceBean;
	}

	public TrackCoachBean() {

	}

	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	public String getDailyFortune() {
		return "Just Do It: " + happyFortuneServiceBean.getFortune();
	}

	@PostConstruct
	public void myInit() {
		System.out.println("myinit() applied after @PostConstruct");
	}

	@PreDestroy // in case of prototype destroy method are not called 
	public void myDestroy() {
		System.out.println("myDestroy() applied after @PreDestroy");
	}
}
