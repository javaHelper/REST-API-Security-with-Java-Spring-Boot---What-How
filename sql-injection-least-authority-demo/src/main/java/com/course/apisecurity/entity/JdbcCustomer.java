package com.course.apisecurity.entity;

import jakarta.validation.constraints.Email;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Data
public class JdbcCustomer {

	@Id
	private int customerId;

	private String fullName;

	@Email
	private String email;

	private LocalDate birthDate;

	//@Pattern(regexp = "^[MF]$", message = "Invalid gender")
	private String gender;
}