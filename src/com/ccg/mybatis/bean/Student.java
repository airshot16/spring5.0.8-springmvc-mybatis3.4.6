package com.ccg.mybatis.bean;

import lombok.Data;

@Data
public class Student {
	private Integer id; //用包装器类型，父类可以是object，可以传入null
	private String name;
	private Integer age;
	
	public Student() {
	}
	
	
	public Student(Integer id, String name, Integer age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}


	
}
