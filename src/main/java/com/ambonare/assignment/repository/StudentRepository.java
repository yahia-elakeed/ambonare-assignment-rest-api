package com.ambonare.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ambonare.assignment.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>, StudentRepositoryCustom {

	/**
	 * Find {@link Student} by it's first name
	 * 
	 * @param firstName
	 * @return {@link Student}
	 */
	Student findByFirstName(String firstName);

	/**
	 * Find {@link Student} by it's last name
	 * 
	 * @param lastName
	 * @return {@link Student}
	 */
	Student findByLastName(String lastName);

	/**
	 * Find {@link Student} by it's first name and last name
	 * 
	 * @param firstName
	 * @param lastName
	 * @return {@link Student}
	 */
	Student findByFirstNameAndLastName(String firstName, String lastName);

}
