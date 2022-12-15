package com.example;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Emp
{

public static void main(String[] args)
{
///Configuration
Configuration cfg=new Configuration().configure().addAnnotatedClass(Employee.class);
SessionFactory sf=cfg.buildSessionFactory();  
Session ss=sf.openSession();  
Transaction t=ss.beginTransaction(); 
Employee emp=new Employee();
Scanner sc = new Scanner(System.in);

System.out.println("Enter the Employee Id :"); 
int id=sc.nextInt();
emp.setEid(id);

Scanner sc1 = new Scanner(System.in);
System.out.println("Enter the Employee Name :");
String name=sc1.nextLine();
emp.setEname(name);

Scanner sc2 = new Scanner(System.in);
System.out.println("Enter the Employee Deparment :");
String dept=sc2.nextLine();
emp.setEdept(dept);

Scanner sc3 = new Scanner(System.in);
System.out.println("Enter the Employee Salary :"); 
int salary=sc3.nextInt();
emp.setEsalary(salary);

Address ad=new Address();
Scanner sc4=new Scanner(System.in);
System.out.println("Enter the Employee Home Name :");
String home=sc4.nextLine();
ad.setHname(home);

Scanner sc5=new Scanner(System.in);
System.out.println("Enter the Employee Area :"); 
String area=sc5.nextLine();
ad.setArea(area);

Scanner sc6=new Scanner(System.in);
System.out.println("Enter the Employee City :");
String city=sc6.nextLine();
ad.setCity(city);

Scanner sc7=new Scanner(System.in);
System.out.println("Enter the Employee Pincode :"); 
int pin=sc7.nextInt();
ad.setPincode(pin);

emp.setAddress(ad);
ss.save(emp); 
t.commit();

}

}