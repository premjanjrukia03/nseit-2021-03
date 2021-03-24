# Recap

- Creating tables
- CRUD
- Inserting a Value
    - Insert
- Inserting Values
    - Insert All
- where clause
    - Like
- We could actually do operations with the table name in the select query. it worked like map operation from java.
- Constraints
- Primary
- Unique
- Not Null
- Check
- set pagesize, set linesize
- Delete, Drop
- Update

# TableSpace

- Your table name must be unique within a tablespace

# Creating a user

```sql
Create tablespace username_space;

CREATE USER username
    Identified by "password"
    Default Tablespace username_space;
```

- to change your password, log back in as admin

```sql
Alter user username identified by newPassword;
```

- Least Privilege
- Role `dba` is short for database administrator
- Role dba is defined by Amazon

```sql
grant dba to username;
```

sqlplus `user@host:port/sid`


# A strong password is like

1. Mix of Capital and small letters
2. And numbers in between


# Users and privileges

- When you have your own installation of Oracle
- You get a user whose name is SYSTEM
- Amazon doesn't give you access to SYSTEM, rather it creates a new user admin, with less privileges.

# Oracle Database

- Oracle database is written
- SQL is a language
- Oracle database is a database management system that allows using SQL

# Benefits of using oracle database

- The biggest benefits are stability and performance.
- Cost is heavy RAM and Processor usage
- less features
- Concurrency
- Oracle uses locks internally to avoid ConcurrentModification of Data

# Starting and Stopping DB

- Cannot do it for AWS RDS

# Oracle Client

- Instant Client
    - SQL Plus
- SQL Developer

# Database Modeling

# Keys and Normalization

## Foreign Key

- Table 1

```sql
create table members(
    memID Number(3) Primary Key,
    fullName VARCHAR2(30),
    address varchar2(50),
    salutation varchar2(4) CHECK (Salutation in ('Ms.','Mr.','Mrs.'))
);
```

- Table 2

```sql
create table movies_rented(
    memID number(3),
    movieName Varchar2(20),
    Foreign Key (memID) References Members(memID)
)
```

- insert values in table 1

```sql
INSERT ALL
    into members values(1,'Jane Jones','Some Address','Ms.')
    into members values(2,'Robert Something', 'Second Address', 'Mr.')
    into members values(3, 'Robert Same Name', 'Same address', 'Mr.')
Select * from dual;
```

- insert values in table 2

```sql
INSERT ALL
    into movies_rented values(1,'Clash of the Titans')
    into movies_rented values(3,'Clash 2')
    into movies_rented values(1,'Avengers: Endgame')
Select * from dual;
```

- All the commands above will work. Let's look at commands which won't work

```sql
Insert into movies_rented values(5,'Black Panther');
```

- This will give an error because foreign key(memID) of table movies_rented is referencing memID of table members. You can only add values to foreign key which are present in the primary key.

- Now try deleting a record from members table

```sql
delete from members where memid=2;
```

- This will not let you delete the record because a foreign key from another table(movies_rented) references this record.

# Data Types

- varchar2
- char
- number

- An example of varchar 2. (The following code is not something that you have to run :p)

```sql
movieName Varchar2(20)
```

- Char datatype in Oracle is similar to char[] in Java are the same, same range, same memory and so

```sql
movieName char(20)
```

- Char vs Varchar2
    - A field with char datatype will always take the memory specified even if the requirement is less
    - Varchar2 is like ArrayList<Char> it increases and decreases in size depending on the value. In varchar2 you specify the max size.
    - char takes more memory but is faster
    - varchar takes less memory but it might be slower
    - But for dbms memory is import than processing speed.



- Numeric
    - int
    - double
    - number

- Temporal/Date and Time ( These will be explained properly in due time with Java)
    - date
    - timestamp
- String
    - char: 1 byte. Saves ASCII
    - nchar: 2 bytes. Saves UTF-8
    - varchar2
    - nvarchar2

# Character Set and Collation Support

- https://docs.oracle.com/en/database/oracle/oracle-database/19/nlspg/choosing-character-set.html#GUID-EB1D9CE7-4730-4995-945D-0647AA6EF7AC
- utf-8
- ascii
- utf-16
- Unicode

- Collation
    - comparator and compare to
    - ignore this for now as beginners
    - if you face any issue while sorting, then search on google for that issue using the keywords `collate operator`

# Creating a Database

- This is something we cannot do for our environment

# Creating a Table

already done

# Table Constraints

- sequence. spring boot 

# Indexes

- Create Index
- a[index]
- contains entry of each value
- allows faster retrieval of data

in a book
```
Index:

Title - Page
```

Let's take the following statement as example(This might not a valid sql statement)

```sql
select tablename * from dba_tables where username='ghost';
```

1. Kenny
2. Asmita
3. Kothaai
4. Manas
5. Dhanalakshmi
6. ghost

```sql
select tablename * from dba_tables where id=6;
```


- Create an index

```sql
create index index_name on tablename(username,uid);
delete index index_name;
```

Username

Asmita          2
Dhanalakshmi    5
Kenny           1
Kothaai         3
ghost           6
Manas           4

- Pros and cons
    - indexes allows for faster searches and retrieval of data
    - takes a huge amount of memory depending on fields and size of the original table

# Deleting Tables

- Drop table

# Seeding the db

- inserting values manually to the original table

```sql
INSERT ALL
    into studentswithids values(1,'test@gmail.com','Faiz','Khan',28)
    into studentswithids values(2,'kothaai@gmail.com','Kothaai','R',21)
    into studentswithids values(3,'kunj@gmail.com','kunj','Oza',19)
    into studentswithids values(4,'vjk@gmail.com','VijayKumar','S',20)
    into studentswithids values(5,'vjr@gmail.com','VijayRaj','',22)
    into studentswithids values(6,'nk@gmail.com','Nighil','Kumar',21)
    into studentswithids values(7,'aniket@gmail.com','Aniket','Suresh Patil',20)
    into studentswithids values(8,'asmita@gmail.com','Asmita','Prakash Wagh',19)
    into studentswithids values(9,'aswini.m@gmail.com','Aswini','M',20)
    into studentswithids values(10,'christy.lyona@gmail.com','Christy','Lyona',23)
    into studentswithids values(11,'dhanalakshmi@gmail.com','Dhanalakshmi','',19)
    into studentswithids values(12,'dsilva.kenny@gmail.com','Kenny','Dsilva',20)
    into studentswithids values(13,'manas.j@gmail.com','Manas','Jogale',21)
    into studentswithids values(14,'mayank@gmail.com','mayank','',19)
    into studentswithids values(15,'m.mrinal@gmail.com','Mrinal','M',20)
Select * from dual;
```

#

# Create a New Table using an Existing Table

- Copying Table Structure and data

```sql
CREATE TABLE
    STUDENTS_Batch2
AS
    Select * from students;
```

- Copy Table Structure and data only for specific records

```sql
CREATE TABLE
    notStudent
AS
    Select * from students where firstname='Faiz';
```

- Copy Only Specific Columns from table structure and all data in those columns

```sql
CREATE TABLE
    notStudent
AS
    Select id,firstname,age from students;
```

- Copy only table structure not values

```sql
CREATE TABLE
    Students_Batch3
AS
    Select * from students where 1=0;
```

- Insert into
    - it copies data from one table to another

```sql
INSERT INTO 
    students_batch3
SELECT
    *
FROM
    students_batch2;
```

# Creating a Temporary Table

# Copying a Table Structure

# Modifying Table Columns and Indexes

# Unions

studentRecords-2013
studentRecords-2012
studentRecords-2011
studentRecords-2010

```sql
select * from studentRecords-2013
union
select * from studentRecords-2012
union
select * from studentRecords-2011
union
select * from studentRecords-2010
```

- Problem is that union requires you to have the same number of columns retrieved in the select query and they should have the same data type


# Working with Views

- Create a view with fields from different tables.
- Whenever there is a modification in any referenced table, your view is updated.

- many many reads per a single write

# Working with Scripts

# Users and Authorization Levels

# Transaction Management

# Working with joins

Joins is where I can choose the columns I want from different tables

## Inner Joins

## Outer Joins

# Working with Functions

- String Functions
- Date and Time Functions
- Numeric Functions
- Aggregate Functions

# Working with Stored Procedures

- sql procedures

# To Do

- Create Table as with constraints