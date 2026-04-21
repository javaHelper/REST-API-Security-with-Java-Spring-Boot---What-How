package com.course.apisecurity.repository;

import com.course.apisecurity.entity.JpaCustomer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface JpaCustomerCrudRepository extends CrudRepository<JpaCustomer, Integer> {

	List<JpaCustomer> findByEmail(String email);

}