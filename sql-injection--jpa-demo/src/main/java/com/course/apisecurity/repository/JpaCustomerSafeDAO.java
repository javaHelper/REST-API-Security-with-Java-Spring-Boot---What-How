package com.course.apisecurity.repository;

import com.course.apisecurity.entity.JpaCustomer;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JpaCustomerSafeDAO {

	@Autowired
	private EntityManager entityManager;

	public List<JpaCustomer> findByGender(String gender) {
		var jpql = "FROM JpaCustomer WHERE gender = :gender";
		var query = entityManager.createQuery(jpql, JpaCustomer.class).setParameter("gender", gender);

		return query.getResultList();
	}
}