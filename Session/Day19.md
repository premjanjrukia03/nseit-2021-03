# Realization

- Last Week
- 6 Days left
- Lots of things to look into
- Few Important BackLogs

Today is a slow day
Tomorrow will be fast day to wrap up Spring and Spring Boot
From Wednesday we will start microservices
wed & thursday will be slow days
Friday and Saturday will be crash course

# Recap

- CRUD Repository
    - save method
    - deleteById
    - findById
    - findAll
- JPA (Java Persistence API)
- H2 (Hypersonic 2 Database)
- Annotations
    - Entity
    - Id
- ddlauto
    - create_drop
    - create
    - update
    - null
    - validate
- @JSONIgnore
- @JsonInclude(Include.NON_NULL)
- RequestModel
- ResponseModel
- h2.console.enabled
- We're running out of RAM
- Layered Architecture
    - repositories
    - entities


# Example 1

- Copy AuthorsAPIIBP1 and paste it as a new project
- Add starter dependencies
    - JPA
    - H2

- I already have a service which performs CRUD operations on Authors using a list
- I now need a service which performs CRUD operations on Authors using a database

- Now I have two implementations of AuthorService
- That's why in Autowiring I would need to provide either
    - @Primary
    - @Qualifier


- Inside Controller we used Qualifier to select the DBCRUD Service
- I created a repository for AuthorCrud. Spring takes care of everything when this repository is autowired
- I autowired the repository in the DB Crud service, and used to implement add and readAll method.


- In the entity Author. We added an annotation @GeneratedValue to automatically generate IDs for us.

- Right now we are using integer
- Sometimes you might also use a string.
- INVOICE000 Invoice001

# Moving to Oracle

YOu need some settings, which you should have stored somewhere


# ManyToMany

when you use @ManyToMany for relationships between two classes that will be represented in tables.

in one which should have ownership use 
```java
@ManyToMany
@JoinTable
private Set<Author> authors;
```


Use
```java
@ManyToMany(mappedBy="authors")
private Set<Book> books;
```


# Plan for following days

23rd: Unit Testing, Thymeleaf, Sessions/User Login and Access Control
24th: Microservice, Development Part of Microservices
25th: Operations of Microservices
26th: Security of Microservices
27th: Writing and Reading from Files, JDBC,Stored Procedures, Working with Relationships