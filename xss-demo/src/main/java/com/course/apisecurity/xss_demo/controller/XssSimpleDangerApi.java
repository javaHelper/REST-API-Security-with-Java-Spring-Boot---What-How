package com.course.apisecurity.xss_demo.controller;

import java.time.LocalTime;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/xss/danger/v1")
@CrossOrigin(origins = "http://localhost:3000")
public class XssSimpleDangerApi {

	@GetMapping(value = "/greeting")
	public String greeting(@RequestParam(value = "name", required = true) String name) {
		var nowHour = LocalTime.now().getHour();
		return (nowHour >= 6 && nowHour < 18) ? ("Good morning " + name) : ("Good night " + name);
	}

	@GetMapping(value = "/file")
	public Resource downloadFile() {
        return new ClassPathResource("static/fileWithXss.csv");
	}
}