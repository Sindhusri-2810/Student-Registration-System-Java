# Student-Registration-System-Java(Java + JDBC)
 OBJECTIVES:
           To create a simple Java console application that allows users to register students (Roll, Name, Department) and store the data in a MySQL database using JDBC.

TECHNOLOGIES USED:
                  Java 
                  MySQL
                  JDBC (Java Database Connectivity)
                  Eclipse IDE

DATABASE TABLE:
  CREATE DATABASE College;
  USE College;
  CREATE TABLE students (
  id INT AUTO_INCREMENT PRIMARY KEY,
  roll INT,
  name VARCHAR(50),
  dept VARCHAR(50)
);

How to Run
       1. Open Eclipse and import the project.
       2. Add MySQL JDBC driver to your project build path.
       3. Update database credentials in StudentRegister.java:

Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/College",
    "root",
    "root"
);
       4. Run StudentRegister.java as Java Application.
       5. Enter student details in the console.

FEATURES:
        Register new students with Roll, Name, and Department.
        Data stored securely in MySQL database.
        Uses PreparedStatement to prevent SQL Injection.

SAMPLE OUTPUT:
   Enter Roll Number:
   143
   Enter Student Name:
   Sindhu
   Enter Department:
   CSE
   Student Registerd Succesfully

Student Registered Successfully
ID   : 1
Roll : 143
Name : Sindhu
Dept : CSE






