package com.ambonare.assignment.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity implements Serializable {

	@Column(name = "CREATED_BY", nullable = false)
	private String createdBy;

	@Column(name = "CREATED_DATE_TIME", nullable = false)
	private final LocalDateTime createdDateTime = LocalDateTime.now();

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedDateTime() {
		return createdDateTime;
	}
}
