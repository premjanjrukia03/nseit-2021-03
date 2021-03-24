# Recap

- Software Architecture
    - Client Server
    - Layered Architecture
    - MVC Architecture
    - Domain Driven Development
- Protocols
    - HTTP
- @RestController
    - @RequestMapping
    - @GetMapping
    - @PostMapping
    - @PutMapping
    - @DeleteMapping
- Spring Web framework
    - Spring MVC
- Spring Devtools: Hot Reload
- How to configure RAM usage in STS
- How to use PostMan for API Testing
- URL Paths
- URL Params
- HTTP
    - RFC 7230-35
    - HTTP Request
        - HTTP Methods
    - HTTP Response
        - HTTP Status Codes
- Refactored an old spaghetti Menu Program into a Layered Architecture with Dependency Injection.

# Web vs Internet

## Raw

- Web is something accessible over the Internet
- Internet is something that connects computers and provides services
- web is the webpage which we see on our device.........internet is the network which connects many computers

## Definition and Differences

- Internet is short for Interconnected Networks
- The Internet is different from internet
- If you have a network of computers then its called an internet.
- The Internet is the internet that you connect to by paying money to your ISP

- The internet was created to share information
- Sir Tim Berners Lee created the Web in 1991
    - Web had two parts
        - A Common Protocol for sharing Information: HTTP
        - A pattern to request a spefic Information: URL 
        - A Format to make sense of the information: HTML
    - The HTML emphasised on links, so that information can be linked and easily accessed.

# HTTP

HyperText Transfer Protocol

## Versions in Use

- Latest Version is HTTP/2.0
- The most used version is HTTP/1.1
- I would recommend you to learn websockets in your free time.

## HTTP/1.1

- RFC 7230-7235


Every HTTP message is divided into two parts:

1. HTTP Header
2. HTTP Body


A Web Browser generates an HTTP Request and processes and HTTP Response
A Web Server processes an HTTP request and generates an HTTP Response

# HTTP API CRUD Mapping Convention

## Create

HTTP Method: POST
URL Structure: */modelname
Data: Body

## Read

- Read a specific entity

HTTP Method: GET
URL Structure: */modelname/{id}
Data: No Data Required

- Read all the data

HTTP Method: Get
URL Structure: */modelname

## Update

HTTP Method: PUT
URL Structure: */modelname/{id}
Data: Body

## Delete

HTTP Method: DELETE
URL Structure: */modelname/{id}
Data: No data required


# Working with Models

You can actually implements most of the CRUD operations automatically using STS. Just generate the following:

1. Constructor
2. Getters and Setters
3. toString()

Some things which you cannot automatically generate but are often used are:

1. Comparable


# Autowiring List interface

```java
@RestController
public class AuthorController {
	
	// We can have multiple Authors but we will have a single AuthorList
	@Autowired
	public List<Author> authorList;
	
	@GetMapping("/")
	public String readAll() {
		return authorList.getClass().getName();
	}
}
```

By default a List<E> interface is autowired to ArrayList<E> implementation. The above pro


I was not able to change the implementation used for autowire using @Primary and @Qualifier using the bean id. The only thing that switched the dependency was @Qualifier with the name of the Bean method.


- Controller

```java
@RestController
public class AuthorController {
	
	// We can have multiple Authors but we will have a single AuthorList
	@Autowired
	public List<Author> authorList;
	
	@GetMapping("/")
	public String readAll() {
		return authorList.getClass().getName();
	}
}
```

- Inside @SpringBootController

```java
@Bean
	public List<Author> createAuthor(){
		return new LinkedList<Author>();
	}
```

# JavaScript Object Notation (JSON)

{
    "Name":"Faiz",
    "Role":"Trainer",
    "Skills": {
        "Skill1":"Java",
        "Skill2":"Oracle",
        "PrimarySkill":"Go",
    }
}


This is equivalent to

```java
class Person{
    public String name;
    public String role;

    // all getters and setters
    // Constructores
}
```

- main class

```java
    public static void main(String[] args){
        Person person = new Person();
        person.name ="Faiz";
        person.role ="Trainer";
    }
```


# Finding Author inside AuthorList

## Unoptimized

```java
	for(int i=0;i<authorList.size();i++){
	        if (authorList.get(i).getId() == id){
	            return authorList.get(i);
	        }
	    }

	    return new Author();
```

## Optimized

- Comparable/Comparator(on the basis of id)
- BinarySort
- BinarySearch


# Problem Statement

Write a spring boot project to store data for Authors, and implement functionality to perform CRUD Operations. Use a layered architecture with layers models, controllers, and service.

Model: Only implement CRUD operations related to a single Author. You can do this by adding an empty constructor, implement Getters/Setters, implement toString() method, and implement a compareTo function(your class should implement Comparable<Author>)

Service Implementation: Contains methods to perform CRUD operations on Author related data stored as an ArrayList.

Controller: Handle Request, call service, Produce Response

# ToDO

- How to inject a LinkedList using interface List. Issue = solved