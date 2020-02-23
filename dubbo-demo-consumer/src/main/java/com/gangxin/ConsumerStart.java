package com.gangxin;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gangxin.pojo.Student;
import com.gangxin.service.StudentService;

public class ConsumerStart {

	private static ClassPathXmlApplicationContext context;
	private static StudentService studentService;
	
	
	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("classpath:ApplicantionContext.xml");
		
		
		studentService = context.getBean(StudentService.class);
		
		Student stu = studentService.getById(18);
		System.out.println("stuent is "  + stu);
		
		Student addAge = studentService.addAge(stu, 3);
		System.out.println("加岁数以后的数据 "  + addAge);
	}
	
	
}
