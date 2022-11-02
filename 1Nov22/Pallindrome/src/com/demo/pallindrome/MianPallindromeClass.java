//Ashish sahay
//1/nov/2022  ........Pallindrome example 
// main method call code



package com.demo.pallindrome;

import java.util.Scanner;

public class MianPallindromeClass {

	
	  static void call()
	 {
		int num;
		String name;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter Integer Number : ");
		  
		  num=sc.nextInt();
		  
		  System.out.println("Enter String : ");
		  name=sc.next();
		  
		  Pallindrome s1=new Pallindrome();
		  s1.NumberPallindrome(num);
		  s1.StringPallindrome(name);
	      sc.close();
	 }
	  
	  
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 call();

	}

}
