package com.student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class StudentRegister {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Roll Number:");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Student Name:");
        String name = sc.nextLine();

        System.out.println("Enter Department:");
        String dept = sc.nextLine();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/College",
                "root",
                "root"
            );
String query = "INSERT INTO students(roll, name, dept) VALUES (?, ?, ?)";
 PreparedStatement pst = con.prepareStatement(query);

 pst.setInt(1, roll);
 pst.setString(2, name);
 pst.setString(3, dept);
 pst.executeUpdate();
 System.out.println("Student Registered Successfully");
                

            pst.close();
            con.close();
            sc.close();

        }
        catch (Exception e) {
              e.printStackTrace();
        }
    }
}




