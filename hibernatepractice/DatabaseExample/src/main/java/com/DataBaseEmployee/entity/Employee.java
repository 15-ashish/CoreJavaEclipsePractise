package com.DataBaseEmployee.entity;

import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Emp_Details")
public class Employee {

	@Id
	private int id;
	String name;
	String dept;
	float salary;

	public Employee() {
	}

	/*
	 * public Employee(int id, String name, String dept, float salary) { this.id =
	 * id; this.name = name; this.dept = dept; this.salary = salary; }
	 */
	public void getDetails()

	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID ");
		id = sc.nextInt();
		System.out.println("Enter Name");
		name = sc.next();
		System.out.println("Enter Department");
		dept = sc.next();
		System.out.println("Enter Salary");
		salary = sc.nextFloat();
		sc.close();
	}
}
