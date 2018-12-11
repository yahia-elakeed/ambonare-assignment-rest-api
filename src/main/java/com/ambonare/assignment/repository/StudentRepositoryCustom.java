package com.ambonare.assignment.repository;

import com.ambonare.assignment.entity.Student;
import com.ambonare.assignment.util.SearchCriteriaVO;

public interface StudentRepositoryCustom {

	/**
	 * Find {@link Student} based on {@link SearchCriteriaVO}
	 * 
	 * @param searchCriteriaVO
	 * @return {@link Student}
	 */
	Student findStudent(SearchCriteriaVO searchCriteriaVO);
}
