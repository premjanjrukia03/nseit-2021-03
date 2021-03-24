# Resources

- https://github.com/cloudnativearts/nseit-2021-03
- `scoop install vscode`
- install vscode + install extension **LiveShare by Microsoft**
- CLick on the link in the chat

# Recap

- Installed STS
- Wrote Hello World Program
- Using STS Ran it
- Java
- History of Java
- License
    - Corretto *GPLv2 with CPE*
    - FLOSS Vs FOSS
- Java Vendors
- Java Versions
- ECMA Script
- Programming
- Need for Programming
- Compilers
- Bytecode
- Interpreters
- JVM vs JDK vs JRE
- Looked at a package manager for windows
- For some people we fixed TLS as well
- COnfigured STS

- Environment Variables?

# Fixing Issues

- If your corretto11/11.* folder is empty
    - scoop uninstall corretto11
    - delete that folder if any issue
    - scoop install corretto11

# Variables

## Raw

- Storing Value
- Memory Location is allocated when a variable is created
- Every Variable must be given a value before using it.
- Memory Allocation is done when an object is created
- value vs reference

# Definition of a Variable

- A named storage location
- It's value can be changed/varied
- We can use the variable name to assign, read, and modify values

# Variable Definition

```
dataType variableName = value;
```

- Variables and Literals
    - Literal :"Hello World", 3,2.3,-11
    - Variable: newVariableName

## Statically Typed Language

- Statically Typed Language vs Dynamically Typed Language
- It's mandatory to declare a type for all variables

# Identifiers and Keyword

- Notes present in Basics Project
- Basics.Java

# Regardings Names

- Naming Convention
    - camelCase
    - PascalCase
    - snake_case
- Nomenclature
    - var(DataType)

# Floating Point Numbers

- https://en.wikipedia.org/wiki/IEEE_754
- https://babbage.cs.qc.cuny.edu/IEEE-754.old/Decimal.html

# Overflow and Underflow

[0,1,2,3,4,5,6,7]

# Other References

https://heartbleed.com/


# Current Situation

I am giving you time till 2:50pm to try out the code I have written so far today. You can check that out in `Basics.java` file. Practice that in your own STS, and if you have any doubts, feel free to ask me.

# Jshell

- It's REPL Read-Eval-Print-Loop


# Operators

- Operators are special symbols that perform specific operations on one, two, or three operands, and then return a result.


- Arithmetic
- Assignment Operators
- Comparison Operators
- Logical
- Bitwise Operator
- Ternary Operator

1+2    - unary 
+1+2    - unary + binary plus
+1      - unary plus
-1      - unary minus

- Expression
- Statement
- Blocks ({})

## Expression Example
```java
int a;
System.out.println(a=3);
```

- multiple expressions

```java
System.out.println(1+3+(2*6/(1+4)));
```


# Control Statements

Computer executes instructions sequentially   
Control Statements alter the sequence of execution of code

- Conditional Statements
    - if..then..else
    - switch..case
- Loops
- Jump Statement
- Method calls

# Conditional Statements

## if..then..else

```java
if (condition/expression){

} else if (condition/expression) {

} else if(conditions/expression) {

} else {


}

```

# Code Examples

- https://www.programiz.com/java-programming/examples
- WAP that checks if a given variable which is used to denote a year is a leap year
- Create two variables to input `name` and `gender` of a person, and then depending on the gender print the name with proper prefix(Mr/Miss). 


# For Loop

- Syntax

```java
for (definition;condition;expression){
    // code
}
```

# To Do
- Does Java Still only considers signed 
- Bitwise operator example
- Switch
- Do While
- While

```java
System.out.println(gender);
System.out.println(gender.toLowerCase());
System.out.println(gender.toLowerCase() == "male");
System.out.println(gender == "Male");
```

# Day 3

- Do while
- While
- Arrays
- Switch
- Classes and Object/Objected Oriented Programming