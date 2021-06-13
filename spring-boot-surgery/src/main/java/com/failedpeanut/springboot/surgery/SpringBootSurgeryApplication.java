package com.failedpeanut.springboot.surgery;

import java.util.Arrays;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootSurgeryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSurgeryApplication.class, args);
		System.out.println("Done with printing..... will die!");

	}

	@Bean
	public CommandLineRunner commandLineRunnerMethod(ApplicationContext ctx) {
		return args -> {
			System.out.println(
					"--------------------Let's see the beans provided by Spring Boot-------------------- START:");
			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}
			SimpleService service = ctx.getBean(SimpleService.class);//get simple service Bean from Application Context
			System.out.println(service.getMessage());
			System.out.println(
					"--------------------Let's see the beans provided by Spring Boot-------------------- END:");
		};

	}

	@Bean
	public ApplicationRunner applicationRunnerMethod() {
		return args -> {
			System.out.println("Arguments Passed to spring boot application:" + args.getOptionNames());
		};
	}
}
