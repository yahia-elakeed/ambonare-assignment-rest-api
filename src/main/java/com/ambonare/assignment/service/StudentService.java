package com.ambonare.assignment.service;

import java.util.List;

import com.ambonare.assignment.entity.Student;

public interface StudentService {

	/**
	 * Find student by id
	 * 
	 * @param studentId
	 * @return {@link Student}
	 */
	Student findStudent(int studentId);

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
