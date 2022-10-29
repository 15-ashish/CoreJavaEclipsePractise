/*
 * Pattern printing using loop
 * Ashish Sahay
 * Date: 27/10/22
 * 
 * 
 * */




package com.loop.StarPattern;

import java.util.Scanner;

public class StarPattern
{

	public void StarPatern()
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows to print : "); //asking for rows
 
        int rows = sc.nextInt();        
        for (int i= 0; i<= rows-1 ; i++)  //outer loop 
        {
            for (int j=0; j<=i; j++)    //inner loop
            { 
             System.out.print("*"+ " "); 
           	} 
            
            System.out.println(""); 
          } 
        
        for(int i=rows-1; i>=0; i--)
        {
            for(int j=0; j <= i-1;j++)
            {
                System.out.print("*"+ " ");
            }
            System.out.println("");
        }
        sc.close();
    }
	}

