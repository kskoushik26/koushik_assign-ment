package com.koushik.myAssignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
     ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
           Customer customer= (Customer) context.getBean("customer");
      System.out.println(customer); 
        
       
       
    }
}
