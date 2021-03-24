# Reading material

- https://docs.oracle.com/en/database/oracle/oracle-database/19/tdddg/two-day-developer-intro.html#GUID-AE8B7A74-AD1F-4474-B0CF-B3E95D075DDA   This is recommended, but can only be used when you have enough time.
- https://www.javatpoint.com/oracle-tutorial


# Download instant clinet

go to https://www.oracle.com/in/database/technologies/instant-client/winx64-64-downloads.html

download Basic Package and SQL*Plus Package

# Go to the extracted folder

Run powershell inside

Paste the following code in powershell

.\sqlplus.exe 'user@(DESCRIPTION=(ADDRESS=(PROTOCOL=TCP)(HOST=host)(PORT=1521))(CONNECT_DATA=(SID=sid)))'

Once you are inside try running

```sql
select 3 from dual;
```

and inform me how fast did you get the result back.


# If you want to use your own docker setup of Oracle 19c

Then from powershell run the following

sqlplus.exe SYSTEM@localhost:1521/ORCLCDB

The password is something

# Docker clean up

1. People who want to free up resources and make their computers faster, just remove the container
2. Remove any oracle or odb image
    - Click on the image name, you will get a dropdown.
    - Delete it from their.
3. Uninstall Docker
4. Restart your computer.

# Download SQL Developer

1. https://www.oracle.com/tools/downloads/sqldev-downloads.html

# Adding SQLPlus to the environment variables

1. Copy the path to your sqlplus
2. Right click on `This PC` inside explorer
3. Select Properties
4. Click on Advanced System Settings
5. Click on Environment Variables
6. Select the path variable for your user
7. Click on Edit
8. Click on New and paste the path to your sqlplus
9. Click Ok on every prompt

After setting up the environment variables you can change the command to the following:

sqlplus.exe 'user@(DESCRIPTION=(ADDRESS=(PROTOCOL=TCP)(HOST=hostname)(PORT=1521))(CONNECT_DATA=(SID=sid)))'

- run the code given to you.

# Basics of SQL


CRUD(Create Read Update Delete)

- Data Manipulation Language (DML)
    - Data
- Data Definition Language (DDL)
    - Database
    - Tables

# Creating a table (C of CRUD for Tables)

Syntax

```sql
CREATE TABLE <table-Name>(
    columnname columndatatype
)
```


```sql
CREATE TABLE students(
    FirstName VARCHAR2(15),
    LastName VARCHAR2(15),
    Age Number(2)
);
```

# Listing Tables

```mysql
show tables;
```
- To list tables in oracle

```sql
select * from user_tables;
```

- I get an ugly output


- R of CRUD for tables;
- Describe command is used to read a table structure

```sql
desc user_tables;
```

To get a list of all tables type in the following:

```sql
select TABLE_NAME from user_tables; 
```

# Creating/Inserting Data to a table

```sql
INSERT INTO STUDENTS(FIRSTNAME,LASTNAME,AGE) VALUES('Faiz','Khan',28);
```

to read the values:

```sql
select * from students;
```

```sql
INSERT INTO STUDENTS(LASTNAME,FIRSTNAME,AGE) VALUES('Asmita','Wagh',18);
```

In Oracle SQL a string can only be denoted by encompassing it within Single Quotes. You cannot use double quotes for strings. This is a different behaviour than mysql.    
An Example of this error:

```sql
INSERT INTO STUDENTS(LASTNAME,FIRSTNAME,AGE) VALUES("Asmita","Wagh",18);
```

Double quoutes are used to denote a column name

The following shortcut will only work if you give values to all the columns in the table and in the sequence of the columns as shown by `desc Students`;

```sql
Insert Into Students values('S1','SLN1',10);
```

- Why only single quotes? Because of SQL Injection Attacks

## Adding Multiple Values

This works in mysql, not in oracle

```sql
Insert Into Students(Firstname,LastName,Age) values
    ('S1','SLN1',10),
    ('Student2','LN2',22),
    ('Student1','LN2',22),
    ('Student3','LN2',17);
```

- Oracle has `Insert ALL`

```sql
INSERT ALL
    into students values ('S1','SLN1',10)
    into students values ('Student2','LN2',22)
    into students values ('Student1','LN2',22)
    into students values ('Student3','LN2',17)
SELECT * from dual;
```


# To change themes in VSCode

1. Press CTRL+SHIFT+P
2. type in theme
3. Select Preferences: Color Theme
4. Choose your theme

# Story So far

- Create a Table with simple instructions
- Describe it's structure with desc
- List all table names for the current user
- Insert values into tables
- DML commands are not made persistent until you do a commit or you exit the sqlplus shell.
- DML = Data Manipulation Language
- Select is not a DML command
- Double quotes do not work for strings
- We cannot use a simple insert statement for multiple values
- We have to use a different Insert ALL structure to add them.

# Updating values in a table;

```sql
update <tablename> set Columnname=newvalue where <condition>
```

- for the students table

```sql
update students set age=27 where firstname='Student2';
```

# Delete Operation

```sql
delete from students where firstname='s1';
```

- String literals are case-sensitive while language keywords and identifiers are not;

```sql
delete from students where firstname='S1';
```

- for dmls you have to commit or you have to exit properly from your sql plus.


# Recap 

- CRUD
- Create a table (DDL)
- Inserting values (DML)
- Insert multiple records
- Shorthand way of adding record;
- Update (DML)
- Describe structure of a table (DDL)
- Delete (DML)
- Commit

# Creating a table

## Contraints

**Issue**: You can perform delete or update operations on a record which same fields as some other record    
**Solution**: Primary Key. A table can only have one column as Primary Key.

```sql
create table studentsWithIds(
    ID Number(3) Primary Key,
    FirstName VARCHAR2(15),
    LastName VARCHAR2(15),
    Age Number(2)
)
```

**Issue**: Two or more columns need to have only unique values. We can only have one column as Primary Key
**Unique**: *Unique*. You can put this constraint on as many columns as you like.

```sql
create table studentsWithIds(
    ID Number(3) Primary Key,
    Email VARCHAR2(30) Unique,
    FirstName VARCHAR2(15),
    LastName VARCHAR2(15),
    Age Number(2)
)
```

**Issue**: This field is mandatory. You need to always have a value in it. 
**Solution** : Put the constaint of *Not Null* to this.

```sql
create table studentsWithIds(
    ID Number(3) Primary Key,
    Email VARCHAR2(30) Unique,
    FirstName VARCHAR2(15) Not Null,
    LastName VARCHAR2(15),
    Age Number(2)
)
```

**Issue** : To avoid insertion of invalid data. Like a negative number for age. SQL doesn't allow us to write programs
**Solution** : Put the constraint *check* on such columns

```sql
create table studentsWithIds(
    ID Number(3) Primary Key,
    Email VARCHAR2(30) Unique,
    FirstName VARCHAR2(15) Not Null,
    LastName VARCHAR2(15),
    Age Number(2) CHECK(AGE>=0)
)
```

**Feature Request**: Default values if nothing has been given. 
**Solution**: to use Default constraint on such columns.

```sql
create table studentsWithIds(
    ID Number(3) Primary Key,
    Email VARCHAR2(30) Unique,
    FirstName VARCHAR2(15) Not Null,
    LastName VARCHAR2(15),
    Age Number(3) CHECK(AGE>=0)
)
```

# Dropping a Table

```sql
drop table studentswithids;
```

# Verifying constraints

## Testing Primary Key (Unique + Not Null)

```sql
Insert All
    into studentswithids values(1,'test@gmail.com','FN','LN',12)
    into studentswithids values(1,'t1est@gmail.com','FN','LN',12)
Select * from dual;
```

- Violating two constraints

```sql
Insert All
    into studentswithids values(1,'test@gmail.com','FN','LN',12)
    into studentswithids values(1,'test@gmail.com','FN','LN',12)
Select * from dual;
```

- When using insert all, it will either run all inserts successfully, or 0 inserts.

- Violating Not Null

```sql
insert into studentswithids(ID,EMAIL,LASTNAME,Age) values(1,'test@gmail.com','LN',12); 
```

- Violating Check Constraint

```sql
insert into studentswithids values(2,'est@gmail.com','FN','LN',-12); 
```

# Reading Records

- Inserting these records quickly to have some data to work with for select:

```sql
Insert All
    into studentswithids values(11,'rahul@gmail.com', 'Rahul','Khanna',23)
    into studentswithids values(12,'Preethi@gmail.com','Preethi','B V',20)
    into studentswithids values(13,'VJ@gmail.com','Vijayraj','',20)
    into studentswithids values(14,'waju@gmail.com','Wajahat','Rasool',20)
    into studentswithids values(16,'Aniket@gmail.com','Aniket','Suresh Patil',20)
Select * from dual;
```

- To select all the data present inside the table;

```sql
select * from studentswithds;
```

- if the output is ugly, then you can use the following to try and fix the output.

```sql
set linesize 200; -- to increase the printable area on a single line in the output
set pagesize 50;  -- to avoid repitition of headers 
column EMAIL format a15; -- sets the column width(in output) to 15 characters(a15)
```

- Assignment: beautify the output of the following command

```sql
select * from user_tables;
```

- Trying to only select specific columns

```sql
select ID, EMAIL, AGE from studentswithids;
```

- You can also perform operations inside the select column names

```sql
select ID,concat('Email: ', EMAIL),AGE/2 from studentswithids; 
```

- where clause

```sql
select * from studentswithids where age=20;
```

- where with and

```sql
select * from studentswithids where age>18 and age<26;
```

- if i match a string with a number, it actually matches it

```sql
select * from studentswithids where id='11'; 
```

- like

```sql
select * from studentswithids where email like 'F%';
```

- in

```sql
select * from studentswithids where age in (23,12);
select * from studentswithids order by age;
```

# Update

```sql
update studentswithids set id=2,firstname='first name' where id=100;
```

Similar to the examples in the select statement. Like, in, and others work in the same manner with update.

# Delete

The following deletes everything:

```sql
delete from studentswithids;
```

This works pretty much the same. Just experiment with it. If any issues tell me tomorrow.

# Offline

try out everything which is in: https://www.w3schools.com/sql/default.asp and see if it works for Oracle SQL

# Notes

- I am not going to turn off the server tonight
- So please practice from the above website. It will be good for you.
- Tommorow I will give you guys you your own accounts.
- Try out SQL Developer

## To be covered later

- Foreign Key
- Auto_Increment
- Create Index