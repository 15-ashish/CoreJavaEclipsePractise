package com.inrecord;

public class InRecord {
	
	
	String name;
	String dept;
	int id;
	float salary;
	
	public  void input(String name1,String dept1,int id1,float salary1)
	{
		name=name1;
		dept=dept1;
		id=id1;
		salary=salary1;
	}
	
	public void show()
	{
		System.out.println("Name "+name);
		System.out.println("Department "+dept);
		System.out.println("ID "+id);
		System.out.println("Salary "+salary);

}
}
