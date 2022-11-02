/*
 * Ashish Sahay
 * 1/nov/2022
 * Polymorphism Example
 * */



package com.polymorphism;

public class AreaCalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape square = new Shape();        //Polymorphism :Here methods are differentiated on the basis of parameter given
		                                   //both Number and Type
		square.calculateArea(15.2f);

		Shape rectangle = new Shape();
		rectangle.calculateArea(10.5f, 20.5f);

		Shape circle = new Shape();
		circle.calculateArea(2.3);
		
		
	}

}
