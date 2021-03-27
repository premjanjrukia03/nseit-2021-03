# Recap

- Two Assessments
    - Oracle
    - Spring Boot
- Zuul
- Eureka
- Communication between microservices on HTTP using RestTemplate
- Yaml
- @LoadBalanced
    - When you annotate your RestTemplate with load balanced it will only look for serviceids and stop looking for ip addresses and domain name
- @EnableEurekaServer
- @EnableEurekaClient
- Microservices
    - High Cohesian
    - Business Domain
    - Autonomous
    - Microservices enable DevOps
- How to implement relationships over multiple microservices


# Host Files

Maps domain to ips on a system level. Has Priority over DNS.

`C:/Windows/system32/drivers/etc/hosts`

# Spring boot downgrade (FROM HERE)

- I have downgraded the version from 2.4.4 to 2.3.9-RELEASE

# Fixes when your maven project breaks

1. Right Click on Project > Maven > Update Project > Select Force update>update

If you get an error like this

```
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by org.springframework.cglib.core.ReflectUtils (file:/C:/Users/ghost/.m2/repository/org/springframework/spring-core/5.2.13.RELEASE/spring-core-5.2.13.RELEASE.jar) to method java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int,java.security.ProtectionDomain)
WARNING: Please consider reporting this to the maintainers of org.springframework.cglib.core.ReflectUtils
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
```

Solution to this is to delete everytbing inside .m2/repository folder, which you can locate using the error message.

It is a hidden folder

After you delete the .m2 folder, right click on every project and update the maven project

# Issues when you directly modify your pom.xml

1. go to https://start.spring.io
2. I configured the form with the details similar to my project
3. I clicked on explore
4. I copied and pasted the pom.xml from the website and overwrote the pom.xml in the project

# Issues while hashing password

1. You need to use BCryptPasswordEncoder
2. It is the part of Spring Security Dependency
3. Spring Boot is an opinionated framework
4. As soon as you import Spring Security, spring boot blacklists all url and methods, unless you configure to permit users in WebSecurityConfigurer.
5. We can disable spring security by modifying the @SpringBootApplication to 

```java
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
```

# Initializing the database (Database Seeding)

1. Create a file called data.sql inside resources folder
2. Insert SQL DML Commands
3. These sql commands will be executed on the database as soon as your JPA/Hibernate connects to the db.

# Initializing the Application (CommandLineRunner)

- Either use this to initialize the database or data.sql, but not both.


```

package com.nseindia.b2.webapp.clirunners;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nseindia.b2.webapp.entities.Author;
import com.nseindia.b2.webapp.repositories.Repository;

@Component
public class Bootstrap implements CommandLineRunner {
	@Autowired
	Repository repo;
	
	@Override
	public void run(String... args) throws Exception {
		Author author = new Author();
		author.setName("TestNmae");
		repo.save(author);
	}
}
```


# Important Topics

- JUnit5
- Writing and read from files
- Transaction in Spring Boot
- Aspect Oriented Programming
- JWT and OAuth
- Circuit Breaker
- Actuator


# Resources

- This guy's example works, but his theory might not be on point. So take his word with a grain of salt.
- He has used Interceptors to work with JWT, and the code actually works.
- Normally you use filters in Spring Security. https://www.toptal.com/spring/spring-security-tutorial

- This course will help you with the current training topics:https://www.udemy.com/course/spring-framework-5-beginner-to-guru/
- This course is for future:https://www.udemy.com/course/spring-boot-microservices-with-spring-cloud-beginner-to-guru/

# Swagger APIs

- Normally we were manually accessing the api and trying to understand the response type.
- In a professional environment the author of an API will release API documentation
- Swagger API is one tool to write this documentation
- You can read this documentation to understand request variables and response variables


# Meetups

https://www.meetup.com/


Blockchain is immutable ledgers

- NGO
	- supposed to show how much money they are getting
	- For privacy reasons they do not show, because the donators might want to be anonymous
	- This is reason is exploited and there is corruption
	- In a blockchain based environment, every transaction will be visible from anonymous entities.

- WORM = Write once read many
- Complex Cryptography

- Smart Contracts
	- You write legal business documentations as code
	- When certain conditions are fullfilled, the money is automatically transferred.

- Decentralized Apps(not actually decentralized, the concept is amazing) vs Distributed Apps(This course)

- Software as a Service: Cryptocurrency

- Ownership over software assets

- Trading Cryptocurrency is the only profitable blockchain app

# YouTube Channel

- Please subscribe and like the only video I have

https://www.youtube.com/channel/UCrbnmfoPzbXXLa0k_aiuP5Q


# Running spring boot applications

- go the the folder and type in `mvn spring-boot:run`
- to run this you need to have maven installed on your computer
- to install maven just type in `scoop install maven`

Running `mvn install package` will create a jar file

The jar file will be present inside the target folder

You can run this jar file on any platform with java installed

`java -jar <filename>`