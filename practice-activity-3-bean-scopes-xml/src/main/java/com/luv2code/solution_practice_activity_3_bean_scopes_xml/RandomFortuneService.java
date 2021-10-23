package com.luv2code.solution_practice_activity_3_bean_scopes_xml;

import java.util.Random;

public class RandomFortuneService implements IFortuneService {

	private Random random = new Random();

	private String[] data = { "Beware of the wolf in sheep's clothing", "Diligence is the mother of good luck",
			"The journey is the reward" };

	public String getFortune() {
		int index = random.nextInt(data.length);

		String theFortune = data[index];

		return theFortune;
	}

}
