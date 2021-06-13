package com.failedpeanut.springboot.surgery;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunnerBean implements ApplicationRunner {
	

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Just chilling in ApplicationRunnerBean");
		
	}
}