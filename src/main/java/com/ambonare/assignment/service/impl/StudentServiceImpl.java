package com.ambonare.assignment.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ambonare.assignment.entity.Student;
import com.ambonare.assignment.repository.StudentRepository;
import com.ambonare.assignment.service.StudentService;
import com.ambonare.assignment.util.SearchCriteriaVO;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student findStudent(int studentId) {
		return studentRepository.findById(studentId).orElse(null);
	}

	@Override
	public Student findStudent(String firstName, String lastName) {
		return studentRepository.findStudent(new SearchCriteriaVO(firstName, lastName));
	}

	@Override
	public List<Student> findAllStudents() {

		List<Student> students = studentRepository.findAll();
		return students == null ? Collections.emptyList() : students;
	}

	@Override
	public Student saveOrUpdateStudent(Student student) {
		return studentRepository.save(student);
	}

}
