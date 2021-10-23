package com.luv2code.inject_values_properties_file;

public class EaducationBoardImpl implements IEaducationBoard {

	/*default constructor */
	public EaducationBoardImpl() {
	}

	/* getter setter injected*/
	private StateImpl stateImpl;

	public StateImpl getStateImpl() {
		return stateImpl;
	}

	public void setStateImpl(StateImpl stateImpl) {
		this.stateImpl = stateImpl;
	}

	/* injecting literal implemented */
	private String examName;
	private String standerd;

		
	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public String getStanderd() {
		return standerd;
	}

	public void setStanderd(String standerd) {
		this.standerd = standerd;
	}

	/* IEaducationBoard method implemented */
	
	public String getName() {
		return examName;
	}

	public String getMidimum() {
	
		/* state method access*/
		System.out.println(stateImpl.getCapital());
		System.out.println(stateImpl.getName());
		return "English\n" ;
	}
}
