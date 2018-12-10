package com.ambonare.assignment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Entity
@Table(name = "CLASS")
public class StudentClass extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "CODE", nullable = false)
	private String code;

	@Column(name = "NAME", nullable = false)
	private String className;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(id).append(code).append(className).toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof StudentClass) {
			final StudentClass other = (StudentClass) obj;
			return new EqualsBuilder().append(id, other.id).append(code, other.code).isEquals();
		} else {
			return false;
		}
	}

}
