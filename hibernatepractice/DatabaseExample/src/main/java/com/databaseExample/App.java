package com.databaseExample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.DataBaseEmployee.entity.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		System.out.println("Successful...." + cfg);
		SessionFactory sf = cfg.buildSessionFactory();
		System.out.println("sf is ready  " + sf);

		Session s = sf.openSession();
		Employee emp = new Employee();
		emp.getDetails();
		Transaction tr = s.beginTransaction();
		s.save(emp);
		tr.commit();
		s.close();

		/*
		 * emp.setid(1); emp.setname("ASHISH SAHAY"); emp.setdept("Software Engineer");
		 * emp.setsalary(12500.52);
		 */

	}
}
