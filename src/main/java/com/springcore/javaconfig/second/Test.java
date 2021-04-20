package com.springcore.javaconfig.second;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
Student student=context.getBean("getStudent", Student.class);
student.stuinfo();
	}

}
