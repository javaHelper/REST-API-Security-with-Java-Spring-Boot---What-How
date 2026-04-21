package com.course.apisecurity.repository;


import jakarta.persistence.EntityManager;
import com.course.apisecurity.entity.JpaCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JpaCustomerDangerDAO {

	@Autowired
	private EntityManager entityManager;

	public List<JpaCustomer> findByGender(String gender) {
		// some complex business logic to build query

		var jpql = "FROM JpaCustomer WHERE gender = '" + gender + "'";
		var query = entityManager.createQuery(jpql, JpaCustomer.class);
		return query.getResultList();
	}
}