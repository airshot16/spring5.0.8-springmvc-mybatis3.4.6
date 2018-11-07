package com.ccg.mybatis.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ccg.mybatis.Service.StudentService;
import com.ccg.mybatis.bean.Student;

@Controller
public class StudentController {
	
	@Autowired
	StudentService studentService;

	/**
	 * @ RequestMapping 从浏览器访问的path，相当于servlet路径
	 * 参数stuMap的数据共享到页面中
	 */
	@RequestMapping("/getStus")
	public String getStudents(Map<String,Object> stuMap){
		List<Student> stus = studentService.getStus();
		stuMap.put("stuList", stus);
		return "listStudent";
	}
}
