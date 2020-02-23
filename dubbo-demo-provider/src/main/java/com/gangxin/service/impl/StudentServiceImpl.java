package com.gangxin.service.impl;

import com.gangxin.pojo.Student;
import com.gangxin.service.StudentService;

public class StudentServiceImpl implements StudentService{

	@Override
	public Student getById(int id) {
		
		Student stu = new Student();
		
		stu.setAge(18);
		stu.setId(id);
		stu.setName("羽洛"+id);
		
		return stu;
	}

	@Override
	public Student addAge(Student stu, int n) {
		
		//增加年龄
		stu.setAge(stu.getAge()+n);
		
		return stu;
	}

	

}
