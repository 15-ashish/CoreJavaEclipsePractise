/*
 * Pattern printing using loop
 * Ashish Sahay
 * Date: 27/10/22
 * 
 * 
 * */




package com.loop.PyramidPattern;

public class PyramidPattern {

	public void PyramidPatern()
	{
	  int number = 5;
	 
      int m, n;
    for (m = 1; m <= number; m++) 
    {

                                       // Inner loop 1 print whitespaces in between stars
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
}
}
