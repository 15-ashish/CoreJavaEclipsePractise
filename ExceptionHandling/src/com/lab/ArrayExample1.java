package com.lab;

import java.util.Scanner; 
//import ArraySearch.*;

public class ArrayExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		int sum=0;
		int temp,temp1;
		Scanner sc=new Scanner(System.in);
		System.out.println("..............Entering marks  of 5 Subjects.............. ");
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter marks  of "+ (i+1) +" Subjects: ");
			arr[i]=sc.nextInt();
			sum+=arr[i];
			
		}
		System.out.println("Sum of marks is: "+sum);
		temp=arr[0];
		for(int i=0;i<5;i++)
		{
			if(arr[i]>temp)
			{
				temp=arr[i];
			}
		}
		System.out.println("Greater number is: "+temp);
		temp1=arr[0];
		for(int i=0, j=0;i<5;i++)
		{
			if(arr[i]<arr[j++])
			{
				temp1=arr[i];
			}
		}
		System.out.println("Smallest number is: "+temp1);
		
		ArraySearch obj=new ArraySearch();
		obj.search(arr);
		
		

	}

}
