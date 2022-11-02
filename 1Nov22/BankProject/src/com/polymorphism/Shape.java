/*
 * Ashish Sahay
 * 1/Nov/22
 * Polymorphism 
 * *
 */
package com.polymorphism;

public class Shape 
{
	double area;

	// polymorphism with number of arguments & type
	void calculateArea(float length, float breadth)  //method to calculate area of rectangle
	{
		area = length * breadth;
		System.out.println("The area of rectangle is:" + area);
	}

	void calculateArea(float side)                  //method to calculate area of Square
	{
	
		area = side * side;
		System.out.println("The area of square is:" + area);

	}

	void calculateArea(double radius)                 //method to calculate area of Circle
	
	{
		area = 3.14 * radius * radius;
		System.out.println("The area of circle is:" + area);

	}
	
	
	
}//end of class
