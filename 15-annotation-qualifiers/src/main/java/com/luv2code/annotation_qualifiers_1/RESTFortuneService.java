package com.luv2code.annotation_qualifiers_1;

import org.springframework.stereotype.Component;

@Component("myRESTFortuneService")

/*Annotations - Default Bean Names ... and the Special Case
 * special case of when BOTH the first and second characters of the class name
 * are upper case, then the name is NOT converted
 * that time we need to manually define our bean name 
 */
public class RESTFortuneService implements IFortuneService {

	public String getFortune() {
		return "RESTFortuneService";
	}

}
