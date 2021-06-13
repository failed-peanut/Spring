package com.failedpeanut.springboot.surgery;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerBean implements CommandLineRunner {
   
    public void run(String... args) {
    	System.out.println("Just chilling in CommandLineRunnerBean");
    }
} 