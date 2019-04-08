package com.krishna.training.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.deloitte"})
public class Test {

	public static void main(String[] args) {
		
		

		org.springframework.context.ApplicationContext context=SpringApplication.run(Test.class, args);
	
		System.out.println("ApplciationContext Name ::"+context.getClass().getName());
		
		
	}

}
