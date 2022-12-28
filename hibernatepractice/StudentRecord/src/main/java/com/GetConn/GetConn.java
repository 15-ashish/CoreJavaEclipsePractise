package com.GetConn;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import StudentDatabase.StudentRecord.Student;
import StudentDatabase.StudentRecord.course;

public class GetConn {
	private static SessionFactory sf;

	public static SessionFactory conn() {

		Configuration c = new Configuration();
		Properties prop = new Properties();
		prop.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
		prop.put(Environment.USER, "root");
		prop.put(Environment.PASS, "1234");
		prop.put(Environment.URL, "jdbc:mysql://localhost:3306/ashish");
		prop.put(Environment.HBM2DDL_AUTO, "create");
		prop.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
		prop.put(Environment.SHOW_SQL, "true");
		prop.put(Environment.FORMAT_SQL, "true");

		c.setProperties(prop);
		c.addAnnotatedClass(Student.class);
		c.addAnnotatedClass(course.class);

		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(c.getProperties()).build();
		sf = c.buildSessionFactory(sr);

		return sf;

	}

}
