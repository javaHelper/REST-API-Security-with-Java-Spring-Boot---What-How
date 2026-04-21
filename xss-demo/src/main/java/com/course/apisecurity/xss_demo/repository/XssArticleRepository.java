package com.course.apisecurity.xss_demo.repository;

import com.course.apisecurity.xss_demo.entity.XssArticle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface XssArticleRepository extends CrudRepository<XssArticle, Long> {
	public List<XssArticle> findByArticleContainsIgnoreCase(String article);
}