/*
 * Pattern printing using loop
 * Ashish Sahay
 * Date: 27/10/22
 * 
 * 
 * */



package com.loop.RtAnglePattern;

public class RtAnglPattern
{
	public void RtAnglPatern()
	{
	for(int i=1;i<=5;i++)           //outer loop for rows
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j +" ");  //inner loop for column and printing numbers
		System.out.print("\n");
	}

}
	}
}