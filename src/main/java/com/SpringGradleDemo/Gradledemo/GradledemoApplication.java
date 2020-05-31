package com.SpringGradleDemo.Gradledemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import static org.springframework.boot.SpringApplication.*;


@SpringBootApplication
public class GradledemoApplication {

	private static ApplicationContext applicationContext;

	public static void main(String[] args) {

		applicationContext= run(GradledemoApplication.class,args);

		displayAllBeans();
	}


	public static void displayAllBeans(){

		String allBeanNames = applicationContext.getDisplayName();

		System.out.println(allBeanNames);

	}

}
