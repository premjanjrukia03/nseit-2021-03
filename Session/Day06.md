# Recap

- Collection Framework
- Collections
- List interface
- CRUD Operations
- Comparable
- Comparator
- Sets
- LinkedLists
- ArrayList
- Map interface
- HashMap
- Iterator
- ListIterator
- Enum
- Queue
- Sort
- BinarySearch
- Trees
- Share the VSCOde
- Boxing/Unboxing
- Autoboxing/Auto Unboxing
- Final
- Hashes

- Collection
    - Interface
    - Look at implementations and sub interfaces, by pressing F4
    - STS Menu Type Heirarchy
    - 4 Sub Interfaces
        - List
        - Set
        - Queue
    
- Collections
    - sort
    - binary

- Iterator
    - hasNext()
    - next()
- ListIterator
    - hasNext()
    - next()
    - previous(0)
    - set()

- Threads
- Exception Handling

# Exception Handling

- try..catch..finally
- to handle error conditions
- Checked Exceptions
- Unchecked Exceptions

- Errors
    - Compile Error
    - Runtime Error
    - Logical Error

- throws
- throw

- Types of Exceptions?
    - ArithmeticException
    - ClassNotFoundException
    - ArrayIndexOutOfBoundException
    - NullPointerException

```java
try{
    throw
} catch(ExceptionClass e) {

} finally {

}

```

# Types of Throwables

- Errors
    - Compile 
    - Runtime 

- Errors (These cannot be handled)
    - Non-recoverable
    - Out of Memory
- Exceptions 
    - Checked Exceptions
        - Checked by Compiler at Compilation Time
    - Unchecked Exceptions
        - Not Checked by Compiler at Compilation Time

# Problem Statement

Checked Exceptions are the exceptions that are checked at compile time.
But our code for exception handling is executed during runtime. So, what do you actually mean by checking at compile time.

- Official Docs

# Question 1

"If the JVM exits while the try or catch code is being executed, then the finally block may not execute. " this was the note in java docs can you elaborate this

# Processes and Threads

- Program: Processes they execute a program
- Code: threads they execute a piece of code

## Raw

- Not the ones used for manufacturing clothes
- Multiple threads make up a process
- It gives a sequence of execution
- threads utilizing max capacity of CPU to execute a program
- Threads can run simultaneously/parallelly
- Concurrent execution of two or more parts of a program
- Independent Execution Environemnt
- Task Manager.
- What is a process?
    - Series of Steps (Not computer related)
    - Step by Step Execution

## Definitions

- Process: A process, in the simplest terms, is an executing program.
- Thread:  thread is the basic unit to which the operating system allocates processor time. One or more threads run in the context of the process.

# Concurrency

Concurrency is the ability of a computer to simultaneously run multiple processes

- Concurrency from an english point of view
    - Talking
    - Typing
    - Using the mouse to select things

- Parallel
    - When things happen at the same

- Not Concurrency (task1 , task 2, task3)
    - You start task1
    - You finish task1
    - You start task2 
    - you finish task 2
    - you start task3
    - you finish task3

- Concurrency not Parallelism
    - You start task1
    - you pause task1
    - you start task2
    - you pause task2
    - you resume task1
    - you pause task1
    - you start task3
    - you finish task3
    - you resume task2
    - you finish task2
    - you resume task1
    - you finish task1

- Parallelism not Concurrency
    - two people working on different things

- Parallelism and concurrency
    - two people they work on the same context
    

# Creating a thread

- Extend the `Thread` class
    - create a new class with parent `Thread`
    - override run()
    - create an object of your class
    - use it to run a thread
- Implement the `Runnable` interface
    - Create a new class which implements `Runnable` interface
    - write a method `void run()`
    - create an object of your class
    - Create an object of Thread class by passing the runnable as an argument
    - use this thread object to start a thread

# ThreadPractice Example

- Main
    - How I want the code to work
- RunnableFor
    - run things for new thread
- Countdown
    - compute the forloop

# ThreadSafe

- thread.join()
- synchronized methods
- synchronized block

# OPL

- Checked vs Unchecked
- throw and throws


# Options for Examples on Producer Consumers


# Modules

1. Linux Fundamentals
2. Agile And Scrum
3. DevOps
4. Java
5. Maven
6. Spring
    - Spring Boot
7. Microservices
8. Oracle Database


1. Employee Mangement
2. Student
3. Stock Market
