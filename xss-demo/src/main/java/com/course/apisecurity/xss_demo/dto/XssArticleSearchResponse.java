package com.course.apisecurity.xss_demo.dto;

import com.course.apisecurity.xss_demo.entity.XssArticle;
import lombok.Data;

import java.util.List;

@Data
public class XssArticleSearchResponse {
    private String queryCount;
    private List<XssArticle> result;
}
