## Let's Learn Spring

### Initial set up process

1. [official Spring website](https://spring.io/)
2. [Download](https://spring.io/tools) STS IDE *optional:but it provides everything in one place* or use [spring starter](https://start.spring.io/) to create spring template, download and import in eclipse or any IDE of your choice.
3. I use maven build (you can also use gradle if you are comfortable with)
4. start coding.
5. Refer [Spring Documentation](https://docs.spring.io/spring-framework/docs/current/reference/html/) in case if you need some additional reference.

### My first Spring Boot Application [spring-boot](https://github.com/failedpeanut/spring/tree/main/spring-boot)
*well, it does Nothing!*
1. project Structure:

<img src="https://raw.githubusercontent.com/failedpeanut/spring/main/Ignore_this_folder_images_for_README/spring-boot1.png"/>


2. when you run the [Application.java](https://github.com/failedpeanut/spring/blob/main/spring-boot/src/main/java/com/failedpeanut/Application.java) as spring Boot Application or Java application it prints something in console.

### Let's do some surgery [spring-boot-surgery](https://github.com/failedpeanut/spring/tree/main/spring-boot-surgery)
1. using: [ApplicationRunner](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/ApplicationRunner.html) and [CommandLineRunner](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/CommandLineRunner.html)
2. what are these shit? [Check this Link](https://github.com/failedpeanut/spring/blob/main/spring-boot-surgery/SpringBootSurgery.md)

### changing Banner [spring-boot-banner](https://github.com/failedpeanut/spring/tree/main/spring-boot-banner)
1. To add a custom banner in Spring Boot application, create a banner.txt file and put it into the resources folder.
2. Create your own by writing a Java code or visit some [site](https://fsymbols.com/generators/carty/) to generate. 
3. Copy the text and paste in banner.txt
4. If banner.txt is empty No banner will be seen in console.
5. My banner looks like [this](https://github.com/failedpeanut/spring/blob/main/spring-boot-banner/src/main/resources/banner.txt)

### Lets create a Traditional Web Application with Spring Boot and Spring Web 

###[spring-boot-web-application](https://github.com/failedpeanut/spring/tree/main/spring-boot-web-application)

1. Refer this for complete details. [README : spring-boot-web-application](https://github.com/failedpeanut/spring/blob/main/spring-boot-web-application/spring-boot-web-application.md)
