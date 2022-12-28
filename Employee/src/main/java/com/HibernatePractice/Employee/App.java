package com.HibernatePractice.Employee;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      // int id;String name,dept,Mno;
       Scanner sc=new Scanner(System.in);
       
    	Configuration c=new Configuration();
       c.configure();
     System.out.println("successful config "+c);;

       SessionFactory sf=c.buildSessionFactory();
       System.out.println("successful session "+sf);;
       Session s=sf.openSession();
       Transaction t=s.beginTransaction();
      
       Emp_Details obj=new Emp_Details();
       obj.setID(1);
       obj.setName("Ashish");
       obj.setDept("Engineering");
       obj.setMno("9431589730");
       
      Emp_Details obj1=new Emp_Details();
       obj.setID(2);
       obj.setName("Ashish");
       obj.setDept("Doctor");
       obj.setMno("9431589723");
       
      Emp_Details obj2=new Emp_Details();
       obj.setID(3);
       obj.setName("Ashish");
       obj.setDept("Teacher");
       obj.setMno("9431589758");
       
      // System.out.println("Enter 5  Record ");
      /* for(int i=1;i<=5;i++)
       {
    	   System.out.println("Enter ID ");
    	   id=sc.nextInt();
    	   obj[i].setID(id);
    	   System.out.println ("Enter Name"); 
    	   name=sc.next();
    	   obj[i].setName(name);
    	   System.out.println ("Enter Department");
    	   dept=sc.next();
    	   obj[i].setDept(dept);
    	   System.out.println("Enter Mobile Number");
    	   Mno=sc.next();
    	   obj[i].setMno(Mno);
       }
       */
       
       
       
       s.save(obj);
       s.save(obj1);
      s.save(obj2);
       //
       t.commit();
       s.close();
       
     sc.close();
       System.out.print("Record Saved...  ");
       
    	
    	
    	//Emp_Details emp=new Emp_Details(1,"Ashish","Engg");
    	//s.save(emp);
        
    	
    	
    	
    	//System.out.println( "Hello World!" );
    }
}
