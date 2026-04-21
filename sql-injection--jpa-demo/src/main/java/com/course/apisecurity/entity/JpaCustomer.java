package com.course.apisecurity.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class JpaCustomer {

	@Id
	private long customerId;

	private String fullName;

	private String email;

	private LocalDate birthDate;

	private String gender;
}