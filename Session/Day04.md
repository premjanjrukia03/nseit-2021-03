# Recap

- Methods
- Scanner and input
- Arrays
- Finding Prime Numbers
- While 
- Do While
- Switch
- Menu Program
- Heap and Stacks
- Labels
- For Loop
- Sorting 
- Swapping 
- File Descriptors
- Scanner in everymethod, then it gives me an exception
- Concept of Buffers in OS. stdin,stdout,stderr.


# Object Oriented Programming (OOPs)

- Class
- Objects
- Encapsulation
- Data hiding. Not true.
- Inheritance
- Polymorphism
- Abstraction
- Interface
- Method Overloading
- Method Overriding
- Access Modifiers
- Non Access Modifiers
- methods
- new keyword to initialize and object
- constructor
- implements
- extends keyword
- abstract
- static
- final keyword
- data binding
- Truly Object Oriented Programming Language: in which everything is an object
- DRY (Don't Repeat Yourself) vs WET ( Write everything twice)


# Class

- It is a collection of objects
- Collection of related methods
- Blueprint that can be used to create an object
- One class many objects

- stock
    - brand
    - company name
    - id
    - buying price
    - current price
    - sell(parameters)
    - buyMore(parameters)


# Object

- Is an instantiation of a Class.
- Variables and Methods in a class are not created unless we create an object out of it except static methods

- Attributes are data stored in Object
- Methods are functions for the Object

- Text Book Examples
- this allows you to use variables declared in the class scope.


- Industrial Programming
    - Associate System Analyst
    - Project whose timeline is different from the timeline of employees
    - Project which in under development, and when an employee leaves, another Associate System Analyst will take his/her place.
    - **fill it afterwards**

# Inheritance

- Extending a class
- Code Reusability
- Classes derived from existing class
- acquiring attributes of another class
- Types of Inheritance

## Use

- New Responsibilities = new classes. Reuse parent's code into new class with more responsibily.
- When you do not like a functionality.

# Topics Covered:

- Class: Blueprint for objects. *
- Object: Methods and Attributes.
- Encapsulation: Methods and Attributes are closely related. You use methods to interact with attributes. This allows for easy validation.

# SOLID Design Principles

- Agility
- Expectations of Requirements
- Requirement is different from expectation.

- Refactoring: SOLID(the clean architecture)

SOLID stands for:

S - Single-responsiblity Principle 
    - Arrays only have functionaly related to operations on arrays. SingleResponisility: Operations on arrays
    - PersistenceofArrays: save arrays to a file, or read arrays from a file.
O - Open-closed Principle (Open for extension, closed for modifications)
L - Liskov Substitution Principle
I - Interface Segregation Principle
D - Dependency Inversion Principle


- Arrays is a wrapper for common operations
- Persistence
- PArrays

- this
    - everything inside the same class
    - all public/protected things from the parent class

- Access Modifiers
    - public: accessible to all
    - protected: visible to all things inside the same package. Not recommended by the Trainer. Trainer calls it a useless modifer, because he says so.
    - private: cannot be used outside class. Not even from the object.
    - static: global scope, tied to a class, but not an object

# Generating Code in STS

- Right CLick -> Source -> Generate toString()

# Left 

- Constructor
- Interfaces
- Abstracts

# Pareto's Principle

- 20% of all the things that you learn will be used 80% of the time

# Main Methods test

- 3 Classes
    - Main1
        - main method
    - Main2
        - main method

# Steps for Students Project

- Create a class `Grade`
- get 9 fields

```java
private String name;
	private int id;
	
	private double ProjectManagement;
	private double BigData;
	private double UIUX;
	private double DistributedSystems;
	private double WirelessComm;
	
	private double total;
	private String Grade;
```

- Generate Getters and Setters
- Generate toString()

- Tradeoffs
    - for fields total and grade, either you can remove them from the code. More load towards processor, but memory used will be less.
    - adding these fields. Load on memory, but processing will be faster

# Interfaces

A service-level agreement (SLA) is a contract between a service provider and its customers that documents what services the provider will furnish and defines the service standards the provider is obligated to meet.

interface InterfaceName{
    public double calculateTotal();
    public double getProjectManagement();
    public double getTotal();
}
