/*
 * Pattern printing using loop
 * Ashish Sahay
 * Date: 27/10/22
 * 
 * 
 * */



package com.loop.DiamondPattern;

public class DiamondPattern
{
	
	public void DiamondPatern()
	{
		
        
        int number = 5;
 
        int m, n;
 
        // Outer loop 1
        // prints the first half diamond
        for (m = 1; m <= number; m++) 
        {
 
                                           // Inner loop 1 print whitespaces inbetween
            for (n = 1; n <= number - m; n++)
            {
                System.out.print(" ");
            }
 
                                                  // Inner loop 2 prints star
            for (n = 1; n <= m * 2 - 1; n++)
            {
                System.out.print("*");
            }
 
                                                     // Ending line after each row
            System.out.println();
        }
 
        // Outer loop 2
        // Prints the second half diamond
        for (m = number - 1; m > 0; m--) 
        {
        	                                         // Inner loop 1 print whitespaces inbetween
            for (n = 1; n <= number - m; n++)
            {
                System.out.print(" ");
            }
 
            // Inner loop 2 print star
            for (n = 1; n <= m * 2 - 1; n++)
            {
                System.out.print("*");
            }
 
            // Ending line after each row
            System.out.println();
        }
    }
	
	}
	


