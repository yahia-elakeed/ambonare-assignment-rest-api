package com.ambonare.assignment.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.ambonare.assignment.entity.Student;
import com.ambonare.assignment.util.SearchCriteriaVO;

public interface StudentService {

	/**
	 * Find student by id
	 * 
	 * @param studentId
	 * @return {@link Student}
	 */
	Student findStudent(int studentId);

	/**
	 * Find Student based on first name or last name or both
	 * 
	 * @param firstName
	 * @param lastName
	 * 
	 * @return {@link Student}
	 */
	Student findStudent(String firstName, String lastName);

	/**
	 * Find all registered students in the system
	 * 
	 * @return List of all {@link Student} registered in the system
	 */
	List<Student> findAllStudents();

	/**
	 * Save student if not exist, or update it if exist
	 * 
	 * @param student
	 * @return {@link Student} after Save or Update operation done on it
	 */
	Student saveOrUpdateStudent(Student student);

}
