# Topics to be covered

- Software Development Life Cycle
    - Waterfall Model
    - Agile Model
    - Spiral Model
    - Incremental Model
    - RAD
    - Big Bang Model
    - Iterative Model
    - V-Model
    - Extreme Programming
- Agile
    - Methodology
    - Scrum
    - Sprints
- DevOps
- Maven

# Software Development Life Cycle

- sdlc act as a framework that holds some specific tasks to be achived at every phase during the software development progression // it's not a framework because it doesn't give you any specification

- Process of developing high quality softwares // It is just a representation of common ways to develop a software. It helps you come up with efficient ways to develop high quality software

- Monitor the progress of the completion of a project  // If you know the phases that are going to occur during development, then you have common grounds to talk about progress.

- sdlc is a process to develop high quality software in a organized and disciplined mannner // Talk about this afterwards

- Define the activity that are performed during the software development project.

- SDLC is process of devloping end to end softwares.SDLC has different phases like requirement gathering ,designing, development, testing , deployment . this all stages can be collectively called as SDLC. // SDLC is the representation of the process of developing*



- Code: Is a sequence of instructions that perform a specific task
    ```java
        int sum = 0;
        for (int i=1;i<=10;i++){
            sum+=i;
        }
    ```
- Program: Is a code written with necessary parts to make it run in a programming environment
    ```java
        package com.nseindia.sum

        class Main(){
            public static void main(String[] args){
                int sum = 0;
                for (int i=1;i<=10;i++){
                    sum+=i;
                }
                System.out.println("Sum is " + sum);
            }
        }
    ```
- Software: Virtual Counterparts to hardware. Any thing that can run on a computer is a software.
- Application: Software that has a specific application.


## Benefit of SDLC

- It organizes your thoughts

# Waterfall Model

It is an SDLC model where the complete life cycle is divided into individual phases. These phases are carried out in sequential order and every task in a phase should be completed before moving on to the next one.

## Benefits of Waterfall Model

1. Easy to understand
2. You spend less time thinking about how to do a project and more time doing the project 
    1. Total time to do a project is 32 hrs
    2. You spend 4 hrs planning a project with waterfall model
    3. You get to have 28 hrs to actually work on the project
3. It allows you to understand time constraint, and focus on things with high priority.
4. Good for small projects
5. Good for projects where the complete picture is clear.
6. For beginners you can actually learn one thing at a time, and get an understanding of simple parts.


## Problems with Waterfall

- Strict with timelines for specific phases
    - if there is an overflow in one place, you cannot use the time from other.
    - Output of one phase serves as input to another(it's not necessary that they would cause issues in the immediate next step).


# Iterative Model

- Parallel Development
- the initial stage will be easy and simplified whereas it becomes complex in final stage
- Iterative model is a type of sdlc model in which different functional components can be developed in parallel. Each iteration consists development of seperate component which can be added to the component developed earlier. It does not need to list requirements fully
- development takes place in the form of iterations
- iterative model allows the accessing earlier phases,in which the veritions made respectively.the final output of the project renewed at the end of the cycle

## My Def

It is an improvement to waterfall model. In this the list of total requirements is divided into sublists. In each iterations all the requirements mentioned in the sublists are completed as a waterfall model, and then the iteration is carried out for remaining requirements.


For example. For a project 15 requirements were gathered. These requirements were then split into groups of 3,4,5 and 3 (totalling 15 req) requirements. Waterwall model is used to develop these sub features from start to end. And after every iteration a new version is release with new features.

## Benefit of iterative:

1. (over waterfall) issues are detected earlier in the project timeline, even if they appear later in the sdlc
2. improved best cases
3. You can have feedback after a feature

## Issues that it doesn't solve

1. Doesn't solve timeline issue

## Drawback

1. It increases time and effort during planning


# V Model

- It's a model following TDD (Test Driven Development)

- A Project
    - List of Requirements
        - Tests 
    - Package
        - Tests
        - Classes
            - Functions

- Benefits are the same as TDD


# Agile

- A person is agile if he is able to perform the same thing as a normal person, but in a shorter period of time.

In agile after every sprint you have a working software. (The functions do not need to be optimized or working correctly). 

if i have a random number generator

```java
    public int randomNumber(){
        return 3;
    }
```

- Iterative is about getting a functionalilty to be implemented properly and with optimization
- Different functionality can be worked on in different iterations
- In agile all base functions are written, and improvements are made to them in every sprint.

- Unofficial logo of Microsoft by community

> Ship to Market first, add improvements and test later


- The main benefit of agile is that you always have a ready to ship software. This might not be high quality, but you can eventually make it high quality.
- The second benefit is that when you have a working software, then while using it you can actually come up with more ideas or improvements.
- Client gets more awareness about the project as well. And they can guide you to implement the features that they want.

## Agile Process

1. Every Sprint should result in improvements of a working software
2. Get client/feedback after every sprint.
3. In agile you do not plan for the complete project
4. You plan the features for the complete project. Draft Specification.
5. You only plan for the current and the next sprint, and this plan should lead towards the final Draft Specification.
6. During this if you find something which is not achievable. Then on client's permission you are free to change the draft specification.
- MVP
    - all required features are there.
    - These features work
    - these features need not be optimized
7. Agile can be used to test the feasibility of a product.
8. Sprints normally are of one to 4 weeks. The most common sprint I have seen is of 2 weeks.
9. Not good for beginners, as a working software is desired right from the beginning.


# Agile Manifesto

- https://agilemanifesto.org/

# Amazing Resources

- https://www.atlassian.com/agile/manifesto

----

# DevOps

Development: CS. These people they write softwares.
Testing Team: Tests your software on a hardware.
Operations: IT. These people they deploy the software.


Setting up Oracle: IT
Writing a program that uses Oracle: CS


Java: CS
Amazon Web Service: IT

DevOps engineer


# Team organization before DevOps

- Development Team
- Operations Team
- Testing Team
- HR Team

# Issues With Teams

Rather than having different teams consisting of development and it professional, let's have a small team for business projects.

- Team 1 (Expectation)
    - 2 Developers
    - 1 Operation
    - 1 Tester
    - 1 Project Manager
    - 1 Security Professional
    - 1 HR

- Team 2 (Reality)
    - 5 DevOps ( who know develop, operations, and testing)
    - 1 Project Manager
    - 1 HR

- Phoenix Project (Recommended Reading)


- DevOps : Development + Operations
- The person who coined the term called it so because he thought it sounded Cool!

# Two pizza team at amazon

- Jeff Bezos 
- 2 pizzas can fill the team's stomach. Normally 2-6 people.


20 People = 20 * 19/2*1 = 190 ways of communication to solve an error

5 = 5* 4/2 *1 = 10 links

# History Lessons

- 2001 Agile Methodology
- Software Development Process should be fast
- Different companies and researchers started thinking about solving issues that cause a delay in software delivery

## Issues that increased pressure on Humans because of other humans

- There is less politics, then people trust each other, and they perform better.
- If there are less people, then it is easy to get to know each other.
- Requirements change a lot.
- Communication gap.

- DevOps is a solution to this

### Solution

- Two Pizza Team
    - Problems
        - Too much work for 2-6 people to handle
    - Solution
        - IaC : AWS
        - Infrastructure as Code
        - Allowed automation

## Issues that increased pressure on Humans because of technology

- It works on my computer
- Compatibility issues
- Hardware Resources 
- Learning curve

- Docker Containers/Virtualization/Cloud Platforms are solutions for this

## Issues that increased pressure on Humans because of process

- Repetative tasks
- One off tasks

- CI/CD pipeline and container they solve this issue
- Java Code -> git commit -> javac -> bytecode -> upload this to a server -> run it over there
- If I have CI/CD pipelines setup. Then as soon as I commit my java code to a repository, everything else is automated.


# DevOps

DevOps is a philosophy that promotes teams that are made up of different professionals related to a single project. DevOps embraces human errors and tries to find a way which leads to less human errors.

- DevOps says automate everything that can be automation.
- DevOps is strongly tied to Infrastructure as Code.

## Four Types of Work

1. Business Project: This is a project that brings you money
2. Internal Project: Vital for company to work.
3. Changes
4. Unplanned Work

Works in progress is a silent killer. If you keep on increasing work not done, then it keeps on feeding on the capabilities of the employee.

Set a limit on the work you can take, and learn to say no to overflows.

## Three ways of doing work (Actually published by a Chinese philosopher in 18th Century)

1. Flow: Create a discipline of doings. 
2. Continuous feedback
3. Continuous Learning and Experimentation

https://freshservice.com/itsm/phoenix-project-three-ways-devops-blog/

# Shift left

- Automate everything from day1
- Beginners cannot do it from day1.
- But professionals with experience can do it.

- To know more about devops read the https://www.amazon.in/DevOPS-Handbook-World-Class-Reliability-Organizations/dp/1942788002

- https://www.alldaydevops.com/

# DevOps vs DevSecOps

DevOps is about Development and Operations
DevSecOps is about Development, Security, and Operations

Actually they are the same thing. Security people wanted attention and money. Power struggle.

# Cloud Native Applications

- These are applications written for Cloud Platform.