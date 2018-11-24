package com.javatechie.spring.jdbc.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MyModel {
	private int id;
	private String new_id;
	private String name;
	private String data;
}
