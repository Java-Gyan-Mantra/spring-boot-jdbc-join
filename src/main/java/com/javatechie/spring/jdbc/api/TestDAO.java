package com.javatechie.spring.jdbc.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TestDAO {

	@Autowired
	private JdbcTemplate template;

	String JOIN_QUERY = "SELECT  t1.id, t2.new_id,t1.name,t2.data FROM t1 JOIN t2 ON t1.pattern = t2.pattern";

	public List<MyModel> getTestData() {
		return template.query(JOIN_QUERY, new BeanPropertyRowMapper<MyModel>(MyModel.class));
	}

}
