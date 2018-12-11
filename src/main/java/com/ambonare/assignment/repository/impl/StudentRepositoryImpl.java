package com.ambonare.assignment.repository.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ambonare.assignment.entity.Student;
import com.ambonare.assignment.repository.StudentRepositoryCustom;
import com.ambonare.assignment.util.SearchCriteriaVO;

@Repository
public class StudentRepositoryImpl implements StudentRepositoryCustom {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public Student findStudent(SearchCriteriaVO searchCriteriaVO) {

		try {

			List<String> criteria = new ArrayList<>(2);

			// Check if first name will be used in search
			if (searchCriteriaVO.getFirstName() != null && !searchCriteriaVO.getFirstName().trim().isEmpty()) {
				criteria.add("st.firstName = '" + searchCriteriaVO.getFirstName() + "'");
			}

			// Check if last name will be used in search
			if (searchCriteriaVO.getLastName() != null && !searchCriteriaVO.getLastName().trim().isEmpty()) {
				criteria.add("st.lastName = '" + searchCriteriaVO.getLastName() + "'");
			}

			if (!criteria.isEmpty()) {

				StringBuilder queryString = new StringBuilder();

				queryString.append("SELECT st FROM Student as st WHERE ");
				queryString.append(criteria.get(0));

				// If there more than one criteria
				if (criteria.size() > 1) {
					queryString.append(" and ").append(criteria.get(1));
				}

				// Create query
				Query query = entityManager.createQuery(queryString.toString(), Student.class);

				return (Student) query.getSingleResult();

			} else {
				return null;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}

	}

}
