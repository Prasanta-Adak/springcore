package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ref/refConfig.xml");
A a1=(A)context.getBean("aref");
System.out.println("print value of y through referance of b");
System.out.println(a1.getObj().getY());
System.out.println("print a");
System.out.println(a1);

	}

}
