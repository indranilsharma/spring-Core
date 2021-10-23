package com.luv2code.inject_values_properties_file;

public class StudentBean {

	/*getter setter inject*/
	public EaducationBoardImpl eaducationBoardImpl;

	public void setEaducationBoardImpl(EaducationBoardImpl eaducationBoardImpl) {
		this.eaducationBoardImpl = eaducationBoardImpl;
	}
	
	
	/*inject from properties file*/
	String name;
	String Age;
	String contactNo;

	public String getAge() {
		return Age;
	}

	public void setAge(String age) {
		Age = age;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

}
