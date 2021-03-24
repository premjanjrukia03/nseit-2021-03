# Recap

- Exception Handling
    - Errors
    - Exceptions
        - Checked Exception
        - Unchecked Exception
- Compile Time Error
- Run Time Error
- Threads
- What are Processes
- Concurrency
- Parallelism
- Synchronization
- Thread Safe
- Stack and Heap
- Runnanble Interface
- Thread class
- finally

# Demos


- ProducerConsumer (Ends at 1:46)
    - Sync Block
- ProducerConsumerThreadSafe
    - Sync is in the Class itself
    - This Class will be thread safe
- Blocking Queue
- Locks
- Atomic Integer
- Executor Framework
- Semaphore

# ThreadSafe

If a class or method is ThreadSafe, that means it will have a well defined behaviour inside threads.

The developers of threadsafe classes have used synchronization in their code. So, if you use them inside threads, they will not cause ConcurrentModificationException. You can skip synchronization for them inside a thread.

# Ways for synchronization
- Sync
    - topics
        - synchronized method
        - sync block
        - threadsafe classes
    - benefits
        - this is too much optimized
    - drawbacks
        - it increases development complexity
        - Only Applicable for threads
        - is a java thing
- locks
    - OS concept
    - Java is giving you a wrapper around
    - benefits
        - this is optimized
        - reduces mental load on a developer
        - share locks between processes
- Semaphores
    - OS concept
    - Java is giving you a wrapper around it
    - Also work with processes


# Semaphores

- When you create a semaphore than you mention how many threads can pass the semaphore
- You specify the maximum number of threads that can run

# CountdownLatch & CyclicBarrier 

- You specify the minimum number of threads.
semaphores.acquire

# AtomicInteger

- An Atomic Operation is an operation during which a processor will not switch a thread

- Except long and double all binary operations related to primitive data types are atomic

- AtomicInteger gives you methods that are treated as a single atomic operation which on normal int data type might consist of multiple atomic operations.


# Lambda Expressions

- Lambda: Lambda Expressions
- Python: Lambda Functions
- Go: Anonymous Functions
- NodeJS: Anonymous Functions/ArrowFunction


# Streams API Practice

```java
List<Integer> list = new ArrayList<Integer>();
list.add(1);
list.add(2);
list.add(3);
list.add(4);
list.stream().forEach((n)-> System.out.println(n))
```
- with int[] arr;

    ```java
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 12, 33 };
    Arrays.stream(arr).forEach((n)-> System.out.println(n)) // for each terminates the chain
    Arrays.stream(arr).map((i)-> i*i).map((i)->i/2).toArray()
    Arrays.stream(arr).map((i)-> i*i).map((i)->i/2).sum()
    Arrays
    .stream(arr)
    .map((i)-> i*i)
    .map((i)->i/2)
    .average()
    ```

- map with normal stream

    ```java
    Arrays
    .stream(arr)
    .map((i)->{
        System.out.println(i + "*" + i);
        return i*i;
    }).toArray();
    ```
- map with parallel stream

    ```java
    Arrays.
    stream(arr).
    parallel().
    map((i)->{
        System.out.println(Thread.currentThread().getName() + " " + i + "*" + i);
        return i*i;
    }).toArray();
    ```

- Filter
    ```java
    Arrays.stream(arr).map((i)-> i*i).filter((i) -> i%2==0).toArray()
    ```

- Reduce
    ```java
    Arrays.stream(arr).map((i)-> i*i).reduce((x,sum)-> x+sum)
    ```

{1,2,3,4,5,6,7}
sum=0

x=1
sum=0
ret 1

x=2
sum=1
ret 3

- Experiment to find which is accumulator and which is value
    ```java
    Arrays.stream(arr1).reduce(10,(sum,x) -> {
        System.out.println("x=" + x + " sum="+sum );
        return x+sum;
    })
    ```

- with parallel
    ```java
    Arrays.stream(arr1).parallel().reduce(0,(sum,x) -> { // if the first argument to reduce is not identity element for the aggregate operation that you want to do, then parallel streams will not give correct result.
        System.out.println("x=" + x + " sum="+sum );
        return x+sum;
    })
    ```

- Multiplication using Reduce
    ```java
    Arrays.stream(arr2).reduce(1,(prod,x) -> {
        System.out.println("x=" + x + " prod="+prod );
        return x*prod;
    })
    ```

- Collector
    ```java
    list.stream().map(i -> i*i).collect(Collectors.toList()) // this converts it back to a list.
    ```

- EMR Elastic Map Reduce
- Hadoop Map Reduce
- MongoDB map reduce
- ca

# Good resources

- https://www.baeldung.com/java-thread-safety
- https://docs.oracle.com/javase/tutorial/essential/concurrency/index.html

# Task

- Read all the code in the JavaDemoWorkspace
- Try to make new SynchronizedList() work