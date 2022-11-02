/*
 * Ashish Sahay
 * 1/nov/2022
 * Pallindrome String and  Number
 * 
 * 
 * */


package com.demo.pallindrome;

public class Pallindrome {
	 
	  void NumberPallindrome(int num)
	{
	   int temp=num;         //temp to store original number
	                                // keep last digit
		int revnum=0;
		while(num>0)
		{
		revnum=(revnum*10)+(num%10);
		num=num/10;
			
		}
		System.out.println("Reverse of number supplied is "+revnum);
		if(temp==revnum)
			System.out.println("pallindrome");
		else
			System.out.println("Not pallindrome");
	}
	  
	 void StringPallindrome(String str)
	 {
            String reverseStr="";
             int strLength = str.length();

		    for (int i = (strLength - 1); i >=0; --i)
		    {
		      reverseStr = reverseStr + str.charAt(i);
		    }

		    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
		      System.out.println(str + " is a Palindrome String.");
		    }
		    else {
		      System.out.println(str + " is not a Palindrome String.");
		    }
		  }
		 
		 
		 
	 }
	 


