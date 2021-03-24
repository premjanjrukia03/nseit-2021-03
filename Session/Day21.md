# REST API

- RESTFul
- API

## Rough

- api allows application to interact and acts like an intermediate
- It is a software intermediary that allows two applications to talk to each other.
- api is like a part of server that receives request and send responses
- API used for exchanging data between client and server
- set of code that enables data transmission

## API

Application Programming Interface is an interface in which we can give inputs and receive outputs, while the actual process being abstracted from us.



@RestController creates an HTTP API
Services are normally Functional API

## Problems with API

- THe logic of processing data is abstracted from us
- We trust the API authors to implement proper login
- But we still have to care about the inputs and outputs

- The biggest problem is trust
    - The API author might change the input pattern
    - The API author might change the output pattern


To solve this we have an API contract. It is a contract for input and output patterns that the author of the API confirms to follow.

The `interface` that we create in Java is a functional API contract.
The classes that implement this interface are functional APIs.


For HTTP API contracts. You have legal contracts for businesses. If one business violates the contract then a legal fine is imposed. This legal contract is called Service Level Agreement (SLAs). API contract is just one part of it. It can include other things like Uptime, latency and so on.


The API contract is for a specific version. v2 of the api can have a different contract.

/authors

/v1/authors

Now after a long time, I know that there is different way of having inputs and outputs.

/v2/authors

This can have a different input and output pattern.


# Many Names of the API

- REST API
    - API which follows the RESTFul design pattern
- HTTP API
    - API which uses HTTP for input and output
    - Can produce html as well as json as well as .mp3 as well as .jpg and so on.
- HTTP JSON API
    - API which uses HTTP for comm. and JSON for communicating data
    - It will always use JSON, will not output HTML or any other format
    - Normally called a REST API, even though it is not

there was a survey from Google which said that 18% of the self proclaimed REST APIs on the internet are actually REST APIs.

# RESTFul Services

Just like Layered Architecture and DDD which if we follow our code will become refactorable


Similarly if we want to have a scalable and refactorable infrastructure, then we use RESTFul services.
If we follow RESTFul principles and constraints then our application will become easily refactorable.

# RESTFul APIs

- APIs that follow the RESTFul architecture, its principles and constraints
- RESTFul APIs need not be HTTP, they can be functional as well.

# Misconceptions about RESTFul APIs

*Important*: You should know these misconceptions, because your client or your superior may use these terms.

In practice whenever someone refers to a REST API, assume that it's an HTTP JSON API.

# Good Resource

- https://restfulapi.net/

# RESTFul

- Basics
- Principles
- Constraints


The key abstraction of information in REST is a resource. Resources are entities that you might to perform CRUD Operations on.

The resource should be present in the URI. As it's a resource it is always a noun.

REST APIs always work with CRUD Operations.

Key Points(in case of REST HTTP API)
- Your URL defines the entity
- Your HTTP methods define the action(CRUD)

For operations like shutdown, or `hashString` that we used to create a hash which we used to calculate a hash, we are not working with a specific type of resource. Hence, it is not a part of REST.

REST architecture is only valid for APIs or services that deal with CRUD operations on data.
For other things the architecture which is commonly followed is RPC.


# Constraints

- Client–server
- Stateless: Should not store state in memory. SHould always store and retrieve from a DB.
- Cacheable: Read operations can be cached
- Uniform interface: Use the same struture for input and outputs. JSON at one endpoint, use JSON at all endpoints. If you're using HTTP, then use HTTP for all inputs and outputs
- Layered system: Do not write everything in a single service. Create multiple services with interfaces and interact using these interfaces.
- Code on demand (optional): Return Preprocessed code. Rather than returning a string, return a code which can be used by the client.


# Monoliths

- The complete codebase runs as a single application

# Problems

- A single missing semicolon can cause issues in compilation of code that can be in millions of lines of code.
- A single silly bug can crash the whole application.
- If I have millions of lines of code to compile it might take 30 mins or more to compile your code everytime.
- 100s of Developers working on one Project which has multiple lines of code
    - If i am testing something
    - Someone else is testing something as well. 
    - if the other person makes an error
    - I will get an error as well
        - if this error is not decriptive
- Use one single Language or framework for the complete application


# Monolith vs Microservice

In Monolith all your code starts up a single process and it has a single codebase
In Microservices all your code is divided into multiple processes and they have their own codebases.

A monolith can have a total of 200 lines of code
A big microservice can have a code of 10000 of lines

# Benefits of Microservices

- Polyglotic environment

# Problems with Microservices


## Rough

- Monitoring
- Increases operational complexity
    - Many ports required for many microservice
    - Hard to keep track of ports for different services
- Connectivity
- Maintenance cost will increase since there are many processes.
- Complicated Security System

## Trainer's THoughts

- Operational Complexity
    - More ports to manage and remember
        - *Solution*: Docker Containers/VMs
    - Dependency Conflict
        - *Solution*: Docker Containers/VMs
- Connectivity
    - Calling a function in the same process is way faster than using it over a network
        - Fiber
            - 1GBPS
            - Internet speed has improved
            - This is faster
    - Have to create networks
- Monitoring
    - Very hard to keep track of the logs of different microservices.
    - Prometheus/ELK



# Recap of all Optimizations

- DevOps
    - Less people in a team (Two Pizza Team)
    - All People related to a project in the same team
    - Automate everything
- DDD
    - Organize your code on the basis of business domain
- Microservices
    - Decompose a Monolith into smaller independent service on the basis of Domains
    - Enabling DevOps
    - Enable DDD