# Recap

- SDLC
- AGILE
- Waterfall model
- DevOps
    - Three ways
        - Flow
        - Continuous Feedback
        - Continuous Learning and Experimentation
    - four types of work
        - Business Projects
        - Internal Projects
        - Changes
        - Unplanned Work
- V-Model
- Scrum
- CI CD pipeline
- Iterative Model
- Two Pizza Team
- DevOps vs DevSecOps
- Cloud Native Applications
- Phoenix Project

# Maven

- Package Manager and a Build Tool
- It's something like pip/npm

## Packages

- We are using the libraries which are present in the package
- Provides modules
- it lets you access all the classes and methods inside the package

Diagram on Page-1 

## Uses of Maven

- Allows you to download, update, and remove third party packages
- It allows configuring the version of Java
- You can also automate the build process of your Java Projects

# Maven

Maven is a project management and comprehension tool that provides developers a complete build lifecycle framework. Development team can automate the project's build infrastructure in almost no time as Maven uses a standard directory layout and a default build lifecycle.

Maven provides developers ways to manage the following −

- Builds
- Documentation
- Reporting
- Dependencies
- SCMs
- Releases
- Distribution
- Mailing list

## Components 

- CLI
- Configuration File

Maven project structure and contents are declared in an xml file, pom.xml, referred as Project Object Model (POM), which is the fundamental unit of the entire Maven system.

# Philosophies that tools you encounter might follow

- Configuration over Code
- Convention over Configuration

- Personal Opinions: Convention over Configuration over Code

## Convention over Configuration

Maven uses Convention over Configuration, which means developers are not required to create build process themselves.

Developers do not have to mention each and every configuration detail. Maven provides sensible default behavior for projects. When a Maven project is created, Maven creates default project structure. Developer is only required to place files accordingly and he/she need not to define any configuration in pom.xml.

# POM

POM stands for Project Object Model. It is fundamental unit of work in Maven. It is an XML file that resides in the base directory of the project as pom.xml.

The POM contains information about the project and various configuration detail used by Maven to build the project(s).

POM also contains the goals and plugins. While executing a task or goal, Maven looks for the POM in the current directory. It reads the POM, gets the needed configuration information, and then executes the goal. Some of the configuration that can be specified in the POM are following −

- project dependencies
- plugins
- goals
- build profiles
- project version
- developers
- mailing list

Before creating a POM, we should first decide the project group (groupId), its name (artifactId) and its version as these attributes help in uniquely identifying the project in repository.

```xml
<project xmlns = "http://maven.apache.org/POM/4.0.0"
   xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance"
   xsi:schemaLocation = "http://maven.apache.org/POM/4.0.0
   http://maven.apache.org/xsd/maven-4.0.0.xsd">
   <modelVersion>4.0.0</modelVersion>

   <groupId>com.companyname.project-group</groupId>
   <artifactId>project</artifactId>
   <version>1.0</version>
</project>
```


# Introduction to Spring

- Spring is a framework that came out in 2003
- It was a small framework in the beginning
- J2EE was something by java which satisfied enterprise requirements like packages and functionalities for web server, logging, security, documentation, database access, etc.
- Spring as an easy alternative to J2EE
- J2EE was developed by Oracle. Spring is developed by a company known as Pivotal


- Spring is a framework which contains functionalities that are commonly used while writing enterprise applications.
- Spring used to be a single framework, which has now expanded to multiple projects/frameworks.
- Spring allows you to abstract infrastructre details and lets you focus on writing business logic.

# Learning Spring

- Spring has actually become something which is nearly as big as java.(unverified)
- To actually start working with spring, you need to know multiple things in advance.
- Conceptual
    - Dependency Injection
    - Inversion of Control
    - Coupling
    - Beans
- Tool
    - we need maven 
    - we need the spring framework

# Inversion of Control (IoC)

- Software engineering principles
    - Dependency Inversion
    - Inversion of Control

An amazing article

https://martinfowler.com/articles/dipInTheWild.html#YouMeanDependencyInversionRight

# Dependency Injection

- Spring brings you a lot of features for dependency injection
- Interfaces and Polymorphism allows you to inject dependency at compile
- Spring allows you to inject dependency at runtime
- JVM was the first successful container
- Docker containers are similar to JVM, but they have more features

- Spring has a container which is called IoC container. This has code which allows the program to swap dependencies at runtime.

# Maven directory structure

Example1
├───.settings
├───src
│   ├───main
│   │   ├───java
│   │   └───resources
│   └───test
│       ├───java
│       └───resources
└───target
    ├───classes
    │   └───META-INF
    │       └───maven
    │           └───com.nseindia
    │               └───example1
    └───test-classes

- Maven is opinionated which means that maven gives you a structure that you should use for proper results.


- Spring Versions: https://repo.spring.io/release/org/springframework/spring/

- For versioning your software https://semver.org/

- Example pom.xml for spring applications

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<groupId>com.nseindia</groupId>
	<artifactId>example1</artifactId>
	<version>1.0.0</version>


	<dependencies>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-context</artifactId>
			<version>5.2.13.RELEASE</version>
		</dependency>
	</dependencies>
</project>
```

- Write down the code for the project that was shown before lunch. I am waiting till 2:50.


- Maven plugin for jar files

```xml
<build>
		<plugins>
			<plugin>
				<!-- Build an executable JAR -->
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-jar-plugin</artifactId>
				<version>3.1.0</version>
				<configuration>
					<archive>
						<manifest>
							<addClasspath>true</addClasspath>
							<classpathPrefix>lib/</classpathPrefix>
							<mainClass>com.nseindia.example1.eg.Main</mainClass>
						</manifest>
					</archive>
				</configuration>
			</plugin>
		</plugins>
	</build>
```

add this directly inside project markup

- sample beans files

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="..." class="...">
        <!-- collaborators and configuration for this bean go here -->
    </bean>

    <bean id="..." class="...">
        <!-- collaborators and configuration for this bean go here -->
    </bean>

    <!-- more bean definitions go here -->

</beans>
```

# Bean scopes

1. Singleton
2. Prototype
3. Request
4. Session
5. Global-Session

# Contructors

# Bean lifecycle

1. Initialization
2. Destruction

# To do

- Spring Framework realtime IoC = failure with maven assembly