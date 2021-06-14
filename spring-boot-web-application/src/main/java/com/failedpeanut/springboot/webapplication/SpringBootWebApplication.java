package com.failedpeanut.springboot.webapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootWebApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebApplication.class, args);
	}

	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(SpringBootWebApplication.class);
	    }
	 
	 
	 /*
	  * SpringBootServletInitializer
		SpringBootServletInitializer is an interface to run SpringApplication from a traditional WAR deployment. 
		It binds Servlet, Filter and ServletContextInitializer beans from the application context to the server.
	  * 
	  * Older Servlet containers don’t have support for the ServletContextInitializer bootstrap process used in Servlet 3.0. 
	  * You can still use Spring and Spring Boot in these containers but you are going to need to add a web.xml to your application 
	  * and configure it to load an ApplicationContext via a DispatcherServlet.
	  * Inorder to create deployable war file is to provide a SpringBootServletInitializer subclass and override its configure method. 
	  * This makes use of Spring Framework’s Servlet 3.0 support and allows you to configure your application when it’s launched 
	  * by the servlet container. Typically, you update your application’s main class to extend SpringBootServletInitializer.

					@SpringBootApplication
					public class Application extends SpringBootServletInitializer {
					@Override
					    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
					        return application.sources(Application.class);
					    }
					
					    public static void main(String[] args) {
					        SpringApplication.run(Application.class, args);
					    }
					}
	  * 
	  * 
	  * SpringApplicationBuilder:
	  * With SpringApplication , most of application settings have hard coded default values like profiles and property files to use etc.
	  *  You need to look at this class's code to understand that.
	  * With SpringApplicationBuilder , you can simply change few of these application default settings before application starts 
	  * even though most of these settings have sensible default values. 
	  * So with few lines of code, you can build a different applications with different settings for 
	  * different purposes ( embedded deployment, external deployment , testing etc ) while your actual underlying business logic remains same.
	  * 
	  * 
	  * 
	  * Let's say that you have to solve a problem where you need to work with multiple databases or structures and 
	  * each one needs to be isolated from the other, in that case I would use a SpringApplicationBuilder approach, 
	  * because every domain can be isolated through the creation of parent and child context and there is no need to mix different domain problems, 
	  * for example you could have Application1 and Application2 configuration, each one with its own domains, controllers, and repositories 
	  * but you don't want to mix all this complixity and instead of that you can create two different configuration with SpringApplicationBuilder

 			SpringApplicationBuilder appBuilder = new SpringApplicationBuilder().sources(Parent.class);
 			appBuilder.child(Application1.class).run(args);
 			appBuilder.child(Application2.class).run(args);
	  */
}
