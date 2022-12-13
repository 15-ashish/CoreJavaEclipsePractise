package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.entity.Person;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg = cfg.configure();
		System.out.println("cfg is ready" + cfg);

		SessionFactory sf = cfg.buildSessionFactory();
		System.out.println("sf is ready" + sf);

		Session s = sf.openSession();
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();

		p1.setid(12);
		p1.setname("Ashiohs");

		p2.setid(13);
		p2.setname("Sahay");

		p3.setid(14);
		p3.setname("Gaurav");

		p4.setid(14);
		p4.setname("Sahay");

		Transaction tr = s.beginTransaction();
		s.save(p1);
		s.save(p2);
		s.save(p3);
		s.save(p4);
		tr.commit();
		s.close();

		System.out.println("object saved..........");

	}
}
