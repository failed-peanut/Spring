# CommandLineRunner and ApplicationRunner


1. In spring boot application we can execute any task just before spring boot finishes its startup. 
2. To do so we need to create spring bean using CommandLineRunner or ApplicationRunner interface and spring boot will automatically detect them. 
3. Both the interfaces have run() method that needs to be overridden in implementing class and make the class as bean by using spring stereotype such as @Component.

## Why?
1. CommandLineRunner and ApplicationRunner serve the same purpose.
2. The difference between CommandLineRunner and ApplicationRunner is that the run() method of CommandLineRunner accepts array of String as an argument and run() method of ApplicationRunner accepts spring ApplicationArguments as an argument.
3. The arguments which we pass to main() method while starting spring boot, can be accessed in the run() method of CommandLineRunner and ApplicationRunner implementation classes/ or as I did in creating a Bean of those and implement their methods [SpringBootSurgeryApplication](https://github.com/failedpeanut/spring/blob/main/spring-boot-surgery/src/main/java/com/failedpeanut/springboot/surgery/SpringBootSurgeryApplication.java)
4. We can create more than one bean of CommandLineRunner and ApplicationRunner implementing classes.[CommandLineRunnerBean](https://github.com/failedpeanut/spring/blob/main/spring-boot-surgery/src/main/java/com/failedpeanut/springboot/surgery/CommandLineRunnerBean.java) and [ApplicationRunnerBean](https://github.com/failedpeanut/spring/blob/main/spring-boot-surgery/src/main/java/com/failedpeanut/springboot/surgery/ApplicationRunnerBean.java)
5. The run() method of CommandLineRunner and ApplicationRunner are executed just before SpringApplication finishes its startup.
6. After startup completes, application starts to run.
7. The usability of CommandLineRunner and ApplicationRunner are that we can start any scheduler or log any message before application starts to run.

### Read This :[The ApplicationContext](https://docs.spring.io/spring-framework/docs/3.0.0.M3/reference/html/ch04s08.html)

## Writing Test case for service:
Service class:[SimpleService](https://github.com/failedpeanut/spring/blob/main/spring-boot-surgery/src/main/java/com/failedpeanut/springboot/surgery/SimpleService.java)

Test class: [SpringBootSurgeryApplicationTests](https://github.com/failedpeanut/spring/blob/main/spring-boot-surgery/src/test/java/com/failedpeanut/springboot/surgery/SpringBootSurgeryApplicationTests.java)

## What is the Output?
1. when you run [SpringBootSurgeryApplication](https://github.com/failedpeanut/spring/blob/main/spring-boot-surgery/src/main/java/com/failedpeanut/springboot/surgery/SpringBootSurgeryApplication.java) as java Application or Spring Boot Application below results are seen:

Just chilling in ApplicationRunnerBean
Arguments Passed to spring boot application:[spring.output.ansi.enabled]
Just chilling in CommandLineRunnerBean
--------------------Let's see the beans provided by Spring Boot-------------------- START:
applicationAvailability
applicationRunnerBean
applicationRunnerMethod
applicationTaskExecutor
commandLineRunnerBean
commandLineRunnerMethod
forceAutoProxyCreatorToUseClassProxying
lifecycleProcessor
mbeanExporter
mbeanServer
objectNamingStrategy
org.springframework.aop.config.internalAutoProxyCreator
org.springframework.boot.autoconfigure.AutoConfigurationPackages
org.springframework.boot.autoconfigure.admin.SpringApplicationAdminJmxAutoConfiguration
org.springframework.boot.autoconfigure.aop.AopAutoConfiguration
org.springframework.boot.autoconfigure.aop.AopAutoConfiguration$ClassProxyingConfiguration
org.springframework.boot.autoconfigure.availability.ApplicationAvailabilityAutoConfiguration
org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration
org.springframework.boot.autoconfigure.context.LifecycleAutoConfiguration
org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration
org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration
org.springframework.boot.autoconfigure.internalCachingMetadataReaderFactory
org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration
org.springframework.boot.autoconfigure.sql.init.SqlInitializationAutoConfiguration
org.springframework.boot.autoconfigure.task.TaskExecutionAutoConfiguration
org.springframework.boot.autoconfigure.task.TaskSchedulingAutoConfiguration
org.springframework.boot.context.internalConfigurationPropertiesBinder
org.springframework.boot.context.internalConfigurationPropertiesBinderFactory
org.springframework.boot.context.properties.BoundConfigurationProperties
org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor
org.springframework.boot.context.properties.EnableConfigurationPropertiesRegistrar.methodValidationExcludeFilter
org.springframework.boot.sql.init.dependency.DatabaseInitializationDependencyConfigurer$DependsOnDatabaseInitializationPostProcessor
org.springframework.context.annotation.internalAutowiredAnnotationProcessor
org.springframework.context.annotation.internalCommonAnnotationProcessor
org.springframework.context.annotation.internalConfigurationAnnotationProcessor
org.springframework.context.event.internalEventListenerFactory
org.springframework.context.event.internalEventListenerProcessor
propertySourcesPlaceholderConfigurer
scheduledBeanLazyInitializationExcludeFilter
simpleService
spring.info-org.springframework.boot.autoconfigure.info.ProjectInfoProperties
spring.lifecycle-org.springframework.boot.autoconfigure.context.LifecycleProperties
spring.sql.init-org.springframework.boot.autoconfigure.sql.init.SqlInitializationProperties
spring.task.execution-org.springframework.boot.autoconfigure.task.TaskExecutionProperties
spring.task.scheduling-org.springframework.boot.autoconfigure.task.TaskSchedulingProperties
springApplicationAdminRegistrar
springBootSurgeryApplication
taskExecutorBuilder
taskSchedulerBuilder
`*******Simple Service for Demo Purpouse!*******`
--------------------Let's see the beans provided by Spring Boot-------------------- END:
Done with printing..... will die!





