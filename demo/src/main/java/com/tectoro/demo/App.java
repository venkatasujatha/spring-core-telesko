package com.tectoro.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("App.xml");
		Car odj=(Car)context.getBean("car");
		odj.drive();
		
		//Tyre t=(Tyre)context.getBean("tyre");
		//System.out.println(t);
	}

}
