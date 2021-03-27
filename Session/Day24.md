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