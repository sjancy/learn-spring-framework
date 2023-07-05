package com.jancy.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		//1.Launch a Spring Context
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		//2. Configure the thing that we ant spring to manage 
		//HelloWorldConfiguration -@configuration
		//name -@Bean
		
		//3. Retrieving Beans managed by Spring
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		
	}

}
