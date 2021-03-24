# Recap

- Annotations
- Configurations
- Coupling
    - Tightly Coupled
    - Loosely Coupled
- Bean Scopes
- Dependency Injection
- Inversion of Control
- I had lots of issues
- Brief intro to Spring Boot
- Installed and Setup Maven
- Installed and Setup Postman
- Looked into Spring Initializer
    - Generated Ready to use Maven pom.xml
    - Web Interface
    - STS Interface
- Three ways to perform DI using Spring(not three types)
    - Through an XML File
    - Through @Configurations (Factory Design Pattern)
    - Annotations

# Spring Boot vs Spring

- The Spring Framework is unopionated
    - This is like an unfurnished flat
- The Spring Boot Framework is opinionated
    - This is like a furnished flat

- Annotation Based Injection and Spring Boot works perfectly when you use SOLID Principles and Domain Driven Development

- Resources to learn about Clean Code
    - https://www.youtube.com/watch?v=7EmboKQH8lM
    - https://www.youtube.com/watch?v=6wDoopbtEqk

# Flow

- Start with a bad code(Something that we have been doing since the start).
- Rewrite that as a good code.
- These two things will be done using Annotation Based Dependency Injection.

# BasicDI Example

Create a new Spring Starter Project without any dependency


# Annotations

- `@Bean` : This annotation is used outside a method which returns an object. It creates a bean for the class taht the object is returned for
- `@Component`: This annotation is used outside a class. It creates a bean for the class.
- `@Scope`: This changes the scope of the bean. Should be used along annotations that creates a bean.
- `@PostConstruct`: This is used in a method inside a class that will result in a bean. The code runs after an object has been created.
- `@PreDestroy`: This is used in a method inside a class that will result in a bean. The code runs just before the Garbage Collector destroys the object.
- `@Value`: This allocates default values to fields in a bean. Can be used at multiple places.
- `@Autowired`: This automatically wires a bean to an object variable on the basis of the Class that the object is an instance of.
- `@Primary`: In case there are multiple beans that satisfy the autowire, then the bean which has this annotation will be set as the default bean. You can only annotate one bean is Primary.
- `@Qualifier("beanID")`: In case of multiple beans that satisfy the autowire, then you can use this annotation along with @Autowired and enter the bean id for the bean that you want to use. If the Class name for the bean contains multiple capital letters in the beginning then the bean id is the same as class name. Eg.1 Class: AnotherMessage  BeanID: anotherMessage, Eg.2 Class: CLIMessage BeanId: CLIMessage.

# Wiring

```java
ApplicationContext ctx = SpringApplication.run(BasicDiApplication.class, args);
MessageS m = (MessageS) ctx.getBean("messageS");
```

Wiring is the process of allocating a bean object to an object variable manually

# Clean BasicDI Example

So, the code of the example that we looked into before is commonly referred to as `Spaghetti Code`. Spaghetti doesn't have a uniform shape, it's messed up.

When this type of coding style results in a large codebase. Then

1. The code is hard to understand
2. Hard to refactor.

## Flow of Steps

1. Convert spaghetti code into clean code without using DI
2. Add DI

## Principles

1. S in SOLID stands for Single Responsibililty: Every class that you write should have only one responsibility.
2. The Message Class should only contain logic related to Retrieving, Modifying, and Processing message data.
3. Another Class should focus on performing external operations like printing on the terminal, and scanning from the terminal

# Industrial Best Practices

- A piece of code is read more times than it is written/modified
- Convention that people in the industry follow, so that you can easily understand their code and you can understand theirs.

## Package/Class Naming Conventions

- Model
- Service
- Controller

Model is a name given to a class which contains CRUD operations around data. The Message Class from the BestBasicDI project is an example of Model. Reusable.

Service is a class that contains infrastructure/platform specific operations around data. Service has a contract on how things can be used. Service usually utilizes Models. Reusable.

Controllers contain code that controls the execution of the program. It invokes other classes. All the code that we have been writing in main so far is supposed to be inside a controller. 


For a model, just use the name of the noun/entity that you're creating a model for.

For a service interface around a model or task, use the model/task name and suffix it with the word "Service"

For a service implementation, add a prefix which distinguished between the implementations of the service.

Example:

Model: Marks
Service: MarksService
Service: CLIMarksService
Service: DbMarksService


List of Beans:

- MessageController             : Stateless Class
- @Autowired CLIMessageService  : Stateless Class
- @Autowired Message            : Stateful


The `IndustryBPDI` example contains best practices for Code Structure, but not for beans. I have just made everything a bean that I could.

Some notes:

1. Beans can only be made out of classes/objects that you have written
2. By convention/default Autowiring only wires components that are the subpackages/samepackage of the package the main method is in.
3. You can also autowire interfaces easily if there's only a single implementation.
4. If there are multiple beans that implement the same interface. Then if you want to autowire the interface, you will either have to user @Primary(below the @Component in your bean's side) or you will have to use @Qualifier("beanName")(below the @Autowired that causes the issue)


My main method is in the package: com.nseindia.b2.industrybpdi

- Subpackages of com.nseindia.b2.industrybpdi:
    - com.nseindia.b2.industrybpdi.models
    - com.nseindia.b2.industrybpdi.controllers
    - com.nseindia.b2.industrybpdi.services

If I have a component in com.nseindia.b2 or in com.nseindia.b2.test. Then that component can't be autowired.

# Offline work for practice.

1. Try to refactor the Menu program with all the sub methods using Industrial Best Practices and Dependency Injection using Spring Boot. (Day3)

Not a lot of responses = no demonstration