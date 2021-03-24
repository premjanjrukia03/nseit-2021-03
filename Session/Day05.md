# Recap

- Classes
- Inheritance
- Overloading
- Overriding
- Polymorphism
- OOPs concepts
- constructor
- getters and setter
- interfaces
- SOLID Principles
- Easy Refactoring
- Public Private Protected
- Industrial Programming
- Encapsulation
- Truly Object Oriented Programming Language
- This
- Super
- DRY vs WET
- toString()
- Class Object
- Static Methods
- Integer.parseInt
- Automatically generating getter and setters
- toString()

# Industrial Programming

- Industrial Programming is when you are programming for a company
- A developer may come and go
- Documentation
- Follows Conventions and Design Patterns
- The classes and objects, makes the code more readable.

- https://www.youtube.com/watch?v=6wDoopbtEqk

# Final Keyword

- constant
- final

# Interface

- Grades Class
    - methods
    - implements an interface, then I cannot change the code. It will not allow the program to compile
- Interface

# Collections Framework

- We can actually use code that is written by someone else
- This Collection Framework contains a lot of classes that implements various interfaces

- Collections. Is a group of objects.
- int arr[]


- Collections: A group of objects
    - Set
        - Duplicate entries are discarded
    - List
        - Ordered Collection
        - Duplicate Entries
    - Queue
        - FIFO
    - LinkedList
        - Multiple Node
        - One part is pointer to next node
        - second part stores the actual element inside the current node
    - Trees
        - LinkedList with the first part container points to multiple node


# ArrayList

- Better optimization for reading


# LinkedList

- Better optimization for modification


# Interface

```java
List<String> list = new ArrayList<String>();

```

- To find all classes that implement an interface
- In sts right click the interface name, open type heirarchy, click on "Show SubType Heirarchy".

# Collections that I am supposed to cover in this training

- Lists
- ArrayList
- LinkedList
- ListIterator
- Comparable and Comparator interfaces

- Set
- Queue
- Vector
    - Stack
- HashSet
- TreeSet
- EnumSet
- HashMap
- Hashtable
- TreeMap
- EnumMap


- Primitive Data Types
- Custom Objects




# ListIterator

- iterator


# Comparable and Comparator

- Class Students
    - methods
    - attributes
        - id
        - Name
        - Marks

[3,"Swanit",200]
[1,"Faiz",100]
[2,"Manas",101]


- implements Comparable
    - int compareTo(s2)


- implements Comparator
    - int compare(s1,s2)


## Comparable

- for your class that you want to compare
- Add an implementation of Comparable<YourClassName>


```java
public class Student implements Comparable<Student>{
    /*
    * application code
    */
    public int compareTo(Student s2){
        // return 0 if equal
        // return negative if current object is smaller than s2
        // return positive if current object is bigger than s2
    }
}
```

- With this you can run Collections.sort(list)

- you need to create another class

```java
public class SortStdById implements Comparator<Student> {

    public int compare(Student s1, Student s2){
        // return 0 if equal
        // return negative if s1 is smaller than s2
        // return positive if s1 is bigger than s2
    }
}
```

# Important Collections

// CRUD

- List
    - Ordered Collection
    - 0,1,2,3,4,5 -> {33,122,44,5,66}
    - This should be used when the search query can be any attribute
- Map
    - Key:Value Pairs
    - int,String,Custom Object
    - This should be used when the search is based on a single attribute
- Set
    - Unique Values
- Queue
    - FIFO

- Stack
    - LIFO

- List of user ids
    - 1
    - 2
    - 5 
    - 6
- list of username
    - maps


- Facebook
    - Login
        - Map[username][value]
        - Searches will be very very fast compared to ordered list when only a single key is used for searching
    - Search
        - OrderedList
    - Data is actually stored in a db
    - When you load the data from the db, then you put it inside a data structure
    
# Dates

- 1 - 7 Java
- 8 - 11 Oracle Sql
- 12 - 24 DevOps, Microservices, Spring Boot, Spring 
- 25 -30 Linux
- 31-35 < - write your projects