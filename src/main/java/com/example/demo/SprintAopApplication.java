package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.to.SomeBO;

@SpringBootApplication
public class SprintAopApplication {

	public static void main(String[] args) {
		ApplicationContext ap= new ClassPathXmlApplicationContext("beans.xml");
		SomeBO bo =ap.getBean("proxy",SomeBO.class);
		bo.Validate();
		try {
			bo.Validate(18);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		//SpringApplication.run(SprintAopApplication.class, args);
	}

}
