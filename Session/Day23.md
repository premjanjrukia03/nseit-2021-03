# Recap

- RestTemplate
- WebClient
- OpenFeign


# Microservices

- Frontend
    - Port: 8080
- Author
    - Port: 8081
- Book 
    - Port: 8082


# Designing Microservices

- Business Domain Driven: The architecture of the microservice should reflect your organization's structure
- Autonomous: Autonomous. The team members that will be working on this microservice should have ownership of the software dependencies of the microservice.
- High Cohesian: Only closely related components should be inside the same microservice. Only tightly coupled functionality should be on the same microservice


# Microservice Example

Starts at 26/03/2021 14:35


- Zuul
    - Port 8080
- AuthorServiceShort
    - Port 8081
- BookServiceShort
    - Port 8082

I have implemented the code for mapping author.bookId to BookService.
Your homework is to write the code for mapping book.authorId to AuthorService.


Finishes at 26/03/2021 15:40

# Zuul - Load Balancer created by Netflix

Starts at 26/03/2021 16:19

2 Things required to configure Zuul:

1. I have to add @EnableZuulProxy annotation in my main class above @SpringBootApplication.
2. Configure application.yaml to add routes like the following

```yaml
zuul:
  routes:
    author:
      path: /authors/**
      url: http://localhost:8081/
    book:
      path: /books/**
      url: http://localhost:8082/
```



## Setting Application Properties

1. application.properties
2. application.json
3. application.yaml

# Setting up Eureka Server

Starts at 17:07 26/03/2021

2 things to set it up

1. Add the annotation @EnableEurekaServer to the main class above @SpringBootApplication
2. Application.properties

```
# You have to set this to 8761 or things will not work on the clients
server.port=8761

spring.application.name=eurekaserver
```

# Setting up Eureka Client

- Add EurekaDiscoveryClient to your dependencies
- Add annotation @EnableEurekaClient to the main class above @SpringBootApplication
- Set application.properties

```
spring.application.name=authors
eureka.client.service-url.defaultzone=http://localhost:8761
```

- Add add @LoadBalance to your RestTemplate bean declarataion (not the autowiring). This will make it refer to Service-IDs rather than ip address or domain