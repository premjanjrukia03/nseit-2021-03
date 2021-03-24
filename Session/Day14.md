# Recap

- Maven
- Spring Framework
- Inversion of Control
- Dependency Injection
- Pom.xml (Project Object Model)
- Beans
- Jar files
- Scopes
    - Prototype
    - Singleton
- BeanLifecycle
    - On Initialization
    - On Destruction


# Creating a Spring project

New Maven project with skip archtype


Search on mvnrepository.com for spring, and add spring context into your pom.xml

- Basic pom.xml for Spring

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<groupId>com.nseindia.b2</groupId>
	<artifactId>VehicleDisplay</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name>Vehicle</name>

	<dependencies>
		<!-- https://mvnrepository.com/artifact/org.springframework/spring-context -->
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-context</artifactId>
			<version>5.2.13.RELEASE</version>
		</dependency>

	</dependencies>
</project>
```

# To allow search for mvn packages

- Window>Preferences>Maven> Download repository index updates on startup

# Coupling

- Tightly Coupled
- Loosely Coupled

These terms are similar to 

- High Level Language
- Low Level Language


Two things are tightly coupled if it takes some effort to replace one thing
Two things are loosely coupled if it takes less effort to replace one thing

# Spring

There are three ways for DI:

1. Through an XML File
2. Annotations (in spring 2.5)
3. Configuration

# DI through xml

get a beans template from the official website on for a newer version

https://docs.spring.io/spring-framework/docs/4.3.x/spring-framework-reference/html/beans.html

- bean id is normally the same name as the class, but the first letter should be in lowercase

`VehicleDisplay project corresponds to this section`

## Examples

- Simple DI
- DI with objects that have state
    - property based DI
    - constructor based DI
    - Primitive Data Types
    - Collections
    - Objects.

## First benefit

```java
ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

String vType ="bike";

Vehicle v = (Vehicle) context.getBean(vType);
```

With Spring beans, I can programmatically change the object class at runtime.

# DI with objects that have state

- Scope
    - singleton (default)
    - prototype

- Types of Dependency Injection
    - Setter Based
    - Constructor

## Setter Based Injection

if I used the following property:

```xml
<bean  id="car" class="com.nseindia.b2.vehicle.Car">
    <property name="brand" value="BMW"></property>
</bean>
```
Then the spring IoC container searches for a method for the object named `setBrand` and passes the property value to that

## Constructor Based Injection

You use the following syntax for constructor:

```xml
<bean  id="car" class="com.nseindia.b2.vehicle.Car" >
    <constructor-arg type="String" value="Maruti"></constructor-arg>
</bean>
```

If you have multiple arguments for the constructor, then use the same sequence and data type.


# Creating a spring boot app

I would recommend creating a new workspace here.

Go to https://start.spring.io/, do not add any dependencies, and click on Generate.

The browser will prompt you for a location to download a zip file. Download it in the same location as you STS workspace

Extract the folder in the workspace. Please make sure that you don't extract the files directly in the workspace. You can delete the .zip file

Open up your STS, go to file-> Open Projects from FileSystem. This will open up a new wizard.

Click on directory next to the input for Import Source. Click on Finish.

This will trigger maven to download dependencies and create a project structure. You can track the progress at the bottom right corner of STS. You will have to wait for it to finish before you can do anything in the project.

# Create a spring boot app without going to the website


Click on File>New>Spring Starter Project

# Installing other Tools

Maven
```
    scoop install maven
```

Type `mvn --version` to verify installation


Postman

```
    scoop install postman
```

Once installed, click on start menu, search for postman and click it. Do not do anything yet. If it opens then close the window. We will take a look at it tomorrow.