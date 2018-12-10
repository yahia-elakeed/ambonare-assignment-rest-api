package com.ambonare.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ambonare.assignment.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
