package com.javatechie.spring.jdbc.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringJdbcApplication {

	@Autowired
	private TestDAO dao;

	@GetMapping("/")
	public List<MyModel> getData() {
		return dao.getTestData();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcApplication.class, args);
	}
}
