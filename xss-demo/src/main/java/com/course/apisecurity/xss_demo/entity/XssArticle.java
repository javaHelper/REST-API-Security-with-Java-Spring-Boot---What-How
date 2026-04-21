package com.course.apisecurity.xss_demo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class XssArticle {
    @Id
    private long articleId;
    private String article;
}
