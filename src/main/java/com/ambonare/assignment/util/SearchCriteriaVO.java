package com.ambonare.assignment.util;

import com.ambonare.assignment.entity.Student;

/**
 * Search Criteria Value Object For {@link Student} Search
 * 
 * @author Yahia Elakeed
 *
 */
public class SearchCriteriaVO {

	private String firstName;

	private String lastName;

	public SearchCriteriaVO() {

	}

	public SearchCriteriaVO(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
