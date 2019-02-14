package com.aj.Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/aj/Demo/resources/bow.xml");
		Hello h=(Hello)applicationContext.getBean("cool");
		System.out.println(h.getData());
		System.out.println(h.disp());
	}
}
