package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ashish")
public class Person {
	@Id
	private int id;
	private String name;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void setid(int i) {
		// TODO Auto-generated method stub
		id = i;

	}

	public void setname(String string) {
		// TODO Auto-generated method stub
		name = string;

	}

}
