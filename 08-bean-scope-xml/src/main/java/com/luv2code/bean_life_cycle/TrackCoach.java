package com.luv2code.bean_life_cycle;

public class TrackCoach implements ICoach {
	
	private HappyFortuneService happyFortuneService;

	public TrackCoach() {
      System.out.println("Default Constuctor :");
	}

	public TrackCoach(HappyFortuneService happyFortuneService) {
		this.happyFortuneService = happyFortuneService;
	}

	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	public String getDailyFortune() {
		return "Just Do It: " + happyFortuneService.getFortune();
	}

	// add an init() custom method to bean life cycle  
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}

	//add an destroy custom method to bean life cycle  
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside method doMyCleanupStuff ");
	}
}
