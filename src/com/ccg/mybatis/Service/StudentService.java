package com.ccg.mybatis.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccg.mybatis.bean.Student;
import com.ccg.mybatis.mapper.StudentMapper;

@Service
public class StudentService {
	@Autowired
	private StudentMapper studentMapper;
	
	public List<Student> getStus(){
		return studentMapper.getStudentsAll();
	}
	
}
