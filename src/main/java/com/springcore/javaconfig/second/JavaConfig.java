package com.springcore.javaconfig.second;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	@Bean
	public Student getStudent() {
		Student student=new Student();
		return student;
	}
}
