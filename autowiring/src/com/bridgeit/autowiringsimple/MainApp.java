package com.bridgeit.autowiringsimple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
			
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		A a = context.getBean("a",A.class);
		
		a.display();
	}
}
