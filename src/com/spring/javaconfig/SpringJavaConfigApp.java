package com.spring.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringJavaConfigApp {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Baseballcoach coach=context.getBean("getBaseballc",Baseballcoach.class);
		
		System.out.println(coach.getWorkout());
		System.out.println(coach.getQuote());
		System.out.println(coach.getName());
		System.out.println(coach.getEmail());
		
		context.close();
		
		
		
	}

}
