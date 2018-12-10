package com.ambonare.assignment.util;

import org.modelmapper.ModelMapper;

import com.ambonare.assignment.entity.Student;
import com.ambonare.assignment.entity.StudentClass;

import dto.StudentClassDto;
import dto.StudentDto;

public final class EntityDTOConverter {

	private static ModelMapper modelMapper = new ModelMapper();

	/**
	 * Convert {@link Student} Entity to {@link StudentDto}
	 * 
	 * @param student
	 * @return {@link StudentDto}
	 */
	public static StudentDto convertToDto(Student student) {
		return modelMapper.map(student, StudentDto.class);
	}

	/**
	 * Convert {@link StudentClass} Entity to {@link StudentClassDto}
	 * 
	 * @param studentClass
	 * @return {@link StudentClassDto}
	 */
	public static StudentClassDto convertToDto(StudentClass studentClass) {
		return modelMapper.map(studentClass, StudentClassDto.class);
	}

	/**
	 * Convert {@link StudentDto} to {@link Student} Entity
	 * 
	 * @param student
	 * @return {@link Student}
	 */
	public static Student convertToEntity(StudentDto studentDto) {
		return modelMapper.map(studentDto, Student.class);
	}

	/**
	 * Convert {@link StudentClassDto} to {@link StudentClass} Entity
	 * 
	 * @param studentClass
	 * @return {@link StudentClass}
	 */
	public static StudentClass convertToEntity(StudentClassDto studentClassDto) {
		return modelMapper.map(studentClassDto, StudentClass.class);
	}
}
