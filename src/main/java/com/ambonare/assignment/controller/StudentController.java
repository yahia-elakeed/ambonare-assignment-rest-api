package com.ambonare.assignment.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ambonare.assignment.service.StudentService;
import com.ambonare.assignment.util.EntityDTOConverter;

import dto.StudentDto;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping(value = "/all")
	public @ResponseBody List<StudentDto> findAllStudents() {
		return studentService.findAllStudents().stream().map(student -> EntityDTOConverter.convertToDto(student))
				.collect(Collectors.toList());
	}

	@PostMapping("/save-student")
	public @ResponseBody StudentDto saveStudent(@RequestBody StudentDto studentDto) {
		return EntityDTOConverter
				.convertToDto(studentService.saveOrUpdateStudent(EntityDTOConverter.convertToEntity(studentDto)));
	}

	@GetMapping(value = "/get-student/{studentId}")
	public @ResponseBody StudentDto findStudent(@PathVariable int studentId) {
		return EntityDTOConverter.convertToDto(studentService.findStudent(studentId));
	}

}
