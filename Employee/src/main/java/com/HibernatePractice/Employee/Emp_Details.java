package com.HibernatePractice.Employee;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;


@Entity
@Table(name="Emp_Details")
public class Emp_Details {

	@Id
	private int ID;
   @Column(name="Employee_Name")
	private String name;
   @Column(name="Employee_Department")
	private String dept;
   @Column(name="Employee_Mobile_No",length=10,nullable=false)
    private String mno;
    
	public Emp_Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp_Details(int iD, String name, String dept, String mno) {
		super();
		ID = iD;
		this.name = name;
		this.dept = dept;
		this.mno = mno;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getMno() {
		return mno;
	}
	public void setMno(String mno) {
		this.mno = mno;
	}
	
	}

	
	
	
	



