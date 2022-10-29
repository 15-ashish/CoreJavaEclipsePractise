/*
 * Pattern printing using loop
 * Ashish Sahay
 * Date: 27/10/22
 * 
 * 
 * */

package com.loop.main;
import com.loop.DiamondPattern.*;   /*    Importing Different packages*/
import com.loop.RtAnglePattern.*;
import com.loop.PyramidPattern.*;
import com.loop.StarPattern.*;

public class MainPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("......DIAMOND PATTERN..........");
		DiamondPattern obj=new DiamondPattern();
		obj.DiamondPatern();//caling method in DiamondPattern Package
		
		System.out.print(".......RIGHT ANGLE TRIANGLE............");
		RtAnglPattern obj1=new RtAnglPattern();
		obj1.RtAnglPatern();//caling method in RtAnglePattern package
		
		System.out.print("..................PYRAMID PATTERN.................");
		PyramidPattern obj2=new PyramidPattern();
        obj2.PyramidPatern();//caling method inPyramidPattern Package
       
        System.out.print("............STAR PATTERN.....................");
        StarPattern obj3=new StarPattern();
        obj3.StarPatern();//caling method in StarPattern Package
       
	}

}
