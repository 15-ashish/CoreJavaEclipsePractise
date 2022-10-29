package com.demo.calculator;

import java.util.Scanner;

public class calculator {
	
	public static  void input()
	{
		Scanner sc=new Scanner(System.in);
		float num1,num2;
		boolean ch=true;
		do
		{
			
			System.out.println("1. Add ");
			System.out.println("2. Subtract ");
			System.out.println("3. Multiply ");
			System.out.println("4. Divide ");
			System.out.println("5. Exit ");
			System.out.println("Enter the choice:true/false");	
		}while(!ch);
		
	}
	
	
	
		
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        input();
		
	}

}
