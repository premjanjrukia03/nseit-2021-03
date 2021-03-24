# Recap

- Relationships
    - OneToMany
    - ManyToOne
    - OneToOne
    - ManyToMany
- @GeneratedValue
- @Column
- @Entity
- @JoinTable
- @Table
- Database Modelling and Normalization
- Oracle DB/Configuration Settings


# Model Views Controllers

This came out in 1979. It's architectural design pattern which talks about how to organize your code. It has 3 parts.

- Model: Code that is used to structure and process data. (DML and DDL)
- Views: Presentation Part, Graphical U/I, or even CLI 
- Controllers: Code that controls the execution of the code.

# Thymeleaf (View)

- Thymeleaf is a view rendering engine
- It is the most popular view engine for spring boot
- This is not part of your course. So you will not be assessed on it.
- You will have to use this in your projects though.

## Two things that you will work with

1. Thymleaf attributes
2. Spring Expression Language(SpEL)

```html
<h1 th:text="${message}">
	Index Page from Template folder
</h1>
```

Here h1 is an HTML tag

th:text is a thymeleaf attribute
"${message}" is a spring expression language

Thymeleaf has its own String evaluator. But, if you use Spring Boot with Thymeleaf then it uses SPeL

# Spring Expression Language (SpEL)

- Mostly used with @Value and Thymeleaf attributes


`${}` : Finds the value of a specific attribute or variable
`#{}` : Evaluates the text inside as a Java Expression
`@{}` : Helpful for creating links when domain or sub path is not provided

## @Value Annotation

The recording for this starts at 02:09:00

${}: looks for a bean, and returns an attribute. I think it's only looking for configs and environment variables
#{}: evaluates the string as kind of Java Expression

## thymeleaf attributes

- A single Value

```html
<p th:text="${msg}">the value of the key will be put inside this tag</p>
```

- Loop through values in an array

```html
<p th:each="m : ${msg}" th:text="${m}"></p>
```

This will result in the following for an array of three elements

```html
<p th:text="${m}">This m will be msg[0]</p>
<p th:text="${m}">This m will be msg[0]</p>
<p th:text="${m}">This m will be msg[0]</p>
```

# Spring Security

- Starts at 5:46:20
- My System Clock is 15:02 23/03/2021

## Terms

- Login Credentials
- Authentication
- securing against unauthorized modification and deletion of data
- Password Hashing
- Encryption

- Security is about securing your resources
    - assets
    - data


- Development side of security
    - IAM: Identity and Access Managmenr
    - Authentication and Authorization

- Authentication: Verifying your identity. Prove your identity. MultiFactor Authentication
    - Something you know: password, pins, security questions
    - Something you are: fingerprints, biometrics, retina scan, face recognition
    - Something you have: ID Cards, tokens, Mobile Phones+SIM+OTPs

- Authorization: What are you allowed to do.


We are going to take a look at authentication and authorization using Spring.

- Implement an Interface: Implement functionality on your own, you just have to stick to the functionality required
- Extend a Class: Functionality is already implemented for your, you can customize things the way you want.