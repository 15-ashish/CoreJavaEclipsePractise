package com.details;

public class Variables
{

	int instVariable; // 0                  These are instance variable ,belong to class Variables.
	String strVariable; // null                 These are default value
	static int sm; // 0 belongs to class ...   Only one copy of this is created
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int localVar = 0;  //It is local variable
		Variables v1 = new Variables(); //v1 is instance of class Variable ,used to access instance variable
		System.out.println(v1.instVariable);
		System.out.println(v1.strVariable);
		System.out.println(localVar);
		System.out.println(sm);

	}

}
