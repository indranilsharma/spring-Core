package com.luv2code.injecting_literal_values;

public class EaducationBoardImpl implements IEaducationBoard {

	private String examName;
	private String standerd;

	private StateImpl stateImpl;

	public EaducationBoardImpl() {
		System.out.println("i am from default");
	}

	// getter setter of StateImpl
	public StateImpl getStateImpl() {
		return stateImpl;
	}

	public void setStateImpl(StateImpl stateImpl) {
		this.stateImpl = stateImpl;
		stateImpl.getStateName("Karnataka");
	}

	// new property define
	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		System.out.println("EaducationBoardImpl: Inside stter method:setExamName");
		this.examName = examName;
	}

	public String getStanderd() {
		return standerd;
	}

	public void setStanderd(String standerd) {
		System.out.println("EaducationBoardImpl: Inside stter method: setStanderd");
		this.standerd = standerd;
	}

	// from I-education implemented method
	public String getName() {
		return "ICSC";
	}

	public String getMidimum() {
		System.out.println(stateImpl.getCapital());
		System.out.println(stateImpl.getStateName("West-Bengal"));
		return "English\n";
	}

}
