# Recap

- Annotations
- Spring vs SpringBoot
- Industrial Best Practices (IBP)
- @Primary
- @Qualifier
- Models
- Services
- Controllers
- Wiring
- Autowired
- PostConstruct
- PreDestroy
- Value
- Scope
- Component
- Spring Initializer

## Organized Recap

- Annotations
    - Application
        - @SpringBootApplication: usually used to mark the class which has the main method.
    - Producer Side
        - Over the bean
            - @Bean
            - @Component
            - @Controller
            - @Service
            - @Primary
            - @Scope
        - Inside a Bean
            - @Value
            - @PostConstruct
            - @PreConstruct
    - Consumer Side
        - @Autowired
        - @Qualifier
    - Others
        - @Configuration : Denotes that the wrapped class has methods that returns a bean.
    - HTTP
        - @Controller
            - @RequestMapping
        - @RestController

- Software Design
    - Laws, Rules, and Regulations (Must be followed)
    - Standard (Should be followed)
    - Best Practices (You can follow)
        - Naming Conventions
            - Models/Domains
            - Controllers
            - Services
        - Project Structure
            - Everything should be a subpackage of the package that contains your main spring boot method.
    - Design Patterns

# Main Concern in Software Design

- Industrial Programming
- Code is read more times that it is written
- Readibility
- Refactorable.
- Loose coupling


# MVC

This was introduced in the 1980s. Organize your code as per the following convention:

- Models: Code that deals with data retrieval, data manipulation and data definition.
- Views: Code that deals with presentation or UI/UX.
- Controllers: Code that deals with the flow of execution of code.

This was successful for sometime. But, as the codebase started growing, this no longer had value.

# Object Oriented Programming

- Readibility
- Refactorability


- Objects which normally denote an entity
- Methods inside objects denote the actions that can be done.

# Layered Architecture

Many Implementations.

A commonly followed representation https://herbertograca.files.wordpress.com/2017/07/2010s-layered-architecture.png?w=640

- User Interface
- Presentation
- Application
- Domain/Model
- Persistence
- Data


An opinionated Layered Architecture is as follows:

- Presentation Layer
- Business layer
- Models
- DAO: Data Access Layer
- Data Layer


**In a layered architecture your package names and class names reflect the technical information about the code organized in them**

The code we wrote yesterday, which is IndustryBPDI, is an example of layered architecture.


# Domain Driven Development

This is something which people do not understand.

Let's consider an e-commerce platform:

- Shopping Cart
- Orders
- Catalogue
- Accounts
- Payments/Invoices


In a layered architecture this would be:

- Layered
    - Models
        - Cart
        - Order
        - Catalogue
        - Account
        - Invoice
    - Controllers
        - BaseController
        - CartController
        - OrderController
        - CatalogueController
        - AccountController
        - InvoiceController
    - Views(This isn't how it works with springboot)
        - Dashboard
        - CartView
        - OrderView
        - and so on
    - Services
        - CartService
        - CLICartService
        - WebCartService
        - and so on
    - Tests

- DDD
    - Cart
        - Model
        - Controller
        - Service
        - Implementations of These Service
        - Test
    - Orders
        - Model
        - Controller
        - Service
        - Implementations of these Services
    - Catalogue
    - Accounts
    - Invoices
    - Login
        - Password Management
            - Forget Password
        - User Details

    

- Layered Architecture normally deals with Technical Concerns
- Business Concerns normally deals with Business Concerns


- Your code structure should reflect your business processes. Physocological Advice.



Today's Task: 
1. Practice DI with layered Architecture
2. A normal web service
3. A simple example with rest service


# Example

Source Project: `Day3` from workspace `workspace`

Refactoring the old project to accomodate Layered Architecture and Dependency Injection 

## Listing Features

1. Menu
2. ReadInput
3. Sum of Digits of an Integer
4. Find if Prime
5. Sorting

## Structure

- Models
- Controllers
    - Menu
- Services
    - ReadInput
    - Sum of Digits of an Integer
    - Find if Prime
    - Sorting


# STS Problems with Spring Boot

- Spring Boot applications require more ram
- Java actually limits the memory in a VM
- Configuration file `SpringToolSuite4.ini`
    - There are two settings
        - `-Xms` this specifies the minimum ram that STS will use.
        - `-Xmx` this specifies the max ram that STS can use.
- If your STS starts crashing again and again, then increase the `-Xmx` value
    - The only catch is that you should never speficy ram greater than Half of your total ram.

# Web Applications Enum

- Client/Server
- Request/Response
- API
- HTTP/HTTPs
- Request Methods
    - GET
    - POST
- URL Parameters
- Servlet
- HTML
- CSS
- Applet
- JavaScript
- Bootstrap
- DBs
- Domain Names
- Listeners


# Communication Protocols

- These are standards that specify the format for requesting services.

Some examples of Application Layer Protocols:

1. HTTP
2. FTP
3. SMTP
4. SFTP
5. SSH

# HTTP

HTTP is a standard and HTTP/1.1 is defined by RFCs 7230-7235


## HTTP Request

Requests have methods

1. Get
2. Post
3. Put
4. Delete

## HTTP Response

Response have status code

1. 100
2. 200 Status Ok
3. 201 Found
4. 404 Not Found
5. 302 Redirect


# Annotations for Handling Request and Producing Response

## Requests

The most basic annotation is @RequestMapping

## Requesting Mapping overload 1

If you pass a single string argument to @RequestMapping. Then it is taken as the path.

```java
    @RequestMapping("/")
	public String index() {
		return "Hello World";
	}
	
	// To access this browse to http://localhost:8080/test
	// This function will work for the file /hello
	// This function will not work for the folder /hello/
	@RequestMapping("/test")
	public String testFile() {
		return "This is a test file";
	}
	
	
	// To acces this browse to http://localhost:8080/test/
	// Which means the paths "/test" and "/test/" are not the same
	@RequestMapping("/test/")
	public String testFolder() {
		return "This is a test folder";
	}
	
	
	// Assuming that we only have a mapping for "/test1" and no mapping for "/test1/" 
	// Then if you browse to http://localhost:8080/test1/
	// then it will run the function for mapping "/test1"
	// It doesn't work the other way around
	@RequestMapping("/test1")
	public String testFileFolder() {
		return "This is a test1 file";
	}
	
	
	
	//	You can have complex paths as well
	@RequestMapping("/dir1/dir2/test")
	public String testComplexPath() {
		return "This is a message which is inside subdirectories";
	}
```

Rest of the example is inside the project `SimpleHTTPAPI` of `SpringBoot` Workspace. It's well commented and explained in the code itself.


URI vs URL vs URN


URL

http://localhost:8080/dir1/dir2/test

protocol: http://
domain: localhost
port: :8080
path: /dir1/dir2/test