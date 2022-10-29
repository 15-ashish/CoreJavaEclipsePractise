package com.main;
import java.util.Scanner;

import com.inrecord.InRecord;

public class EmployeeDetails
{
	
	public static void getInput()
	{		
		InRecord obj1[]=new InRecord[10];
		//InRecord obj2=new InRecord();
		
		String name;
		String dept;
		int id,i=0;
		boolean c=true;
		float salary;
		
		Scanner sc=new Scanner(System.in);
		while(c)
		{
		System.out.println("Enter Name");
		name=sc.next();
		
		System.out.println("Enter Department");
		dept=sc.next();
		
		System.out.println("Enter ID");
		id=sc.nextInt();
		
		System.out.println("Enter Salary");
		salary=sc.nextFloat();
		
		obj1[i].input(name,dept,id,salary);
		i++;
		System.out.println("Want to enter more: t/f");
		c=sc.nextBoolean();
		}
		
		
		//obj1.show()


		/*/for obj2
		System.out.println("Enter Name");
		name=sc.next();
		
		System.out.println("Enter Department");
		dept=sc.next();
		
		System.out.println("Enter ID");
		id=sc.nextInt();
		
		System.out.println("Enter Salary");
		salary=sc.nextFloat();
		
		obj2.input(name, dept, id, salary);*/
		
		
		//obj2.show();
			
		sc.close();
	}
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		getInput();

		
		

}
}
