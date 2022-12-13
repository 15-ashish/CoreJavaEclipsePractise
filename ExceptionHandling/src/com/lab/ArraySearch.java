package com.lab;

import java.util.Scanner;

public class ArraySearch {
	   void search(int arr[])
	   {
          Scanner sc=new Scanner(System.in);	   
		   int count=0,num;
		System.out.println("Enter the number to search ");
		num=sc.nextInt();
		for(int i=0;i<5;i++)
		{
			if(arr[i]==num)
			{
				count++;
				System.out.println("Number found "+arr[i]+" at position "+(i+1));
			}
			if(count==0)
			{
				System.out.println("Number not found ");
			}
		}

}
}
