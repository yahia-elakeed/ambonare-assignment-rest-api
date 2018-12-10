package com.ambonare.assignment.entity;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Entity
public class Student extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "FIRST_NAME", nullable = false)
	private String firstName;

	@Column(name = "LAST_NAME", nullable = false)
	private String lastName;

	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "STUDENT_CLASSES", joinColumns = { @JoinColumn(name = "STUDENT_ID") }, inverseJoinColumns = {
			@JoinColumn(name = "CLASS_ID") })
	private Set<StudentClass> studentClasses;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Set<StudentClass> getStudentClasses() {
		return Collections.unmodifiableSet(studentClasses);
	}

	public void setStudentClasses(Set<StudentClass> studentClasses) {
		this.studentClasses = studentClasses;
	}

	public void addStudentClass(StudentClass studentClass) {

		this.studentClasses.add(studentClass);
	}

	public boolean RemoveStudentClass(StudentClass studentClass) {
		return this.studentClasses.remove(studentClass);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(id).append(firstName).append(lastName).toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			final Student other = (Student) obj;
			return new EqualsBuilder().append(id, other.id).append(firstName, other.firstName)
					.append(lastName, other.lastName).isEquals();
		} else {
			return false;
		}
	}

}
