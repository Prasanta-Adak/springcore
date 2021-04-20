package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
Samosa samosa=(Samosa)context.getBean("s1");
System.out.println(samosa);
context.registerShutdownHook();

System.out.println("==================================");

Papsi papsi=(Papsi)context.getBean("papsi");
System.out.println(papsi);
	}

}
