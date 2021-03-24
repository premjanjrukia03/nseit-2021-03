# Recap

- Web vs Internet
- HTTP
- CRUD operations
- HTTP Methods
- Mappings
    - Post Method to Create Operation
    - Get Method to Read Operation
    - Put Method to Update Operation
    - Delete Method to Delete Operation
- JSON
- Used Sort and Search
- PathVariable
- RequestBody
- Controllers are used for Processing input, carrying out operations(By Calling Reusable Code from Services), and producing output
- Spring boot automatically parses objects into JSON structure
    - The package it uses is a third party package called Jackson

# Producing a Better Response

- ResponseEntity which can be used to produce even better response than what I am covering in this section.
- Right now we are just going to use Models.

# Services and Abstraction

So far we were abstracting code from the controllers and putting them inside a service. This was due to Single Responsibility principle of SOLID design. The controllers concern is to process input, control the flow of execution(calling services), and produce output. Business logic is not a concern for controllers and hence it was abstracted.

```java
@PostMapping("/")
public ResponseAuthor add(@RequestBody Author author) {
    // Any validation, and exception handling should be present inside the service
    authorService.add(author);
    
    response.setId(author.getId());
    response.setBooks(author.getBooks());
    response.setName(author.getName());
    
    return response;
}
```

## Json output from a model - Ignore null values

Just annotate the class with @JsonInclude(Include.NON_NULL)

# Try to update the rest of the mappings with the ResponseAuthor

- Put
- Delete

# ID Generation.

1. P1
2. 
3. P3
4. P4
5. P5


```java
public class ListAuthorCRUDService implements AuthorService {

	List<Author> authorList = new ArrayList<Author>();
	AtomicInteger idCount = new AtomicInteger(0);

	@Override
	public Author add(Author author) {
		// TODO Validations
		// TODO Proper Response if not able to add an author
		author.setId((long) idCount.getAndIncrement());
		
		authorList.add(author);
		return author;
	}
}
```

# Spring Data JPA + H2 Database

- H2 = Inmemory database, not something that you use for production, only during development.
- Really good when you are prototyping your application
- Java Persistence API: it provides a lot of annotations and functionality related to Databases.

# Package Names

- Controllers
- Models: Generic
- Entities: Represent Structure for data to be stored on a Database
- Services
- Repositories: Contains functionality to perform DML operations on database repositories

# Hibernate

ORM = Object Relationship Model

Create a Model and make changes to the model, these changes are reflected back on a database.

```
spring.jpa.hibernate.ddl-auto=
```

When I used @Entity over a class, then it automatically creates a table for us. The behavious of creation of table is defined by the following options.

5 options DDL(Data Definition Language):

1. create: Drops a table with the same name, and creates a new one.
2. create-drop: Drops a table with the same name, and creates a new one. But, when our program finishes, it drops the table too.
3. none: doesn't create a table
4. update: doesn't delete the old table, and adds entries to it.
5. validate: Doesn't create a table. Validates if a table with the required structure is present.

# Creating a repository

- It is an interface which should be inside the subpackage repositories
- It extends CrudRepository from org.springframework.data.repository.CrudRepository

```java
public interface AuthorRepository extends CrudRepository<Author,Long>{
}
```

CrudRepository<T,ID> required T to be your entity class name, and ID should be the datatype of your primary key(denoted by @Id)



ailable at 'jdbc:h2:mem:1dc1b541-4ea7-4699-84ee-18a336866af8`


# CrudRepository

- save(Entity e)
    - It takes in an entity, creates a new record if there is no record with the same id. Create
    - It updates a previous record if there already exists an record with the same id. Update
- delete(Entity e)
- findById(Long id)


# offline assigment(Will not be marked)

- Create a copy of AuthorAPIIBP-1
- Try to implement AuthorService this time using CRUDRepository.
- Use that inside your controller