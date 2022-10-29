package com.demo.calculator;

import java.util.Scanner;
 
public class calculator {
	
	
	public static float add(float num1,float num2)       //Addition
	 {
		 return (float)(num1+num2);
	 }//end of add()
	
	public  static float subtract(float num1,float num2) //Subtraction
	 {
		 return (float)(num1-num2);
	 }//end of subtract()
	
	public static  float multiply(float num1,float num2) //Multiplication
	 {
		 return (float)(num1*num2);
	 }//end of multiply()
	 
	public static float division(float num1,float num2)//Division
	 {
		 if(num2==0)
		 { 
			 System.out.println("Cannot divide with zero");
			return (float)num2;
		 }
		 else
		    return (float)(num1/num2);
		 
	 }//end of division()
	
	public static float selection(int sel,float x,float y)  //Switch case
	{
		float c = .0f;
		switch(sel)
		{
		case 1:
			c=add(x,y);
			break;
		case 2:
			 c=subtract(x,y);
			 break;
		case 3:
			 c=multiply(x,y);
			 break;
			
		case 4:
			c=division(x,y);
			break;
		
			
		default: System.out.println("Invalid Input");
		}
		return c;
	}//end of  switch
	
	
	
	
	
	public static  void input()
	{
		Scanner sc=new Scanner(System.in);
		float num1=0.0f,num2=0.0f,result;
		boolean ch=true;
		int choice;
		while(ch)
		{
		System.out.println("What is your choice.... ");	//Asking for user choice
			System.out.println("1. Add ");
			System.out.println("2. Subtract ");
			System.out.println("3. Multiply ");
			System.out.println("4. Divide ");
			System.out.println("5. Exit ");
			
			
			choice=sc.nextInt();
			System.out.println("Enter first number.... ");  //Taking input
			num1=sc.nextFloat();
			System.out.println("Enter second number.... ");
			num2=sc.nextFloat();
			
			result=selection(choice,num1,num2);//calling method
			
			
			
			System.out.println("Result "+result);	
			System.out.println("Want more type true/false "); //Asking for continuance of program
			ch=sc.nextBoolean();
			
		}
		
		
	
	
	
	sc.close();
	}
	
	
	
	
	
	
		
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        input();
		
	}

}
