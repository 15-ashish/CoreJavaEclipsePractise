package StudentDatabase.StudentRecord;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
import com.GetConn.GetConn;

public class App {
	public static void main(String[] args) {

		SessionFactory sf = GetConn.conn();

		Session s = sf.openSession();

		course c1 = new course();
		course c2 = new course();
		course c3 = new course();
		course c4 = new course();
		course c5 = new course();
		course c6 = new course();

		c1.setC_name("MCA");
		c2.setC_name("BCA");
		c3.setC_name("Economics");
		c4.setC_name("Science");
		c5.setC_name("BBA");
		c6.setC_name("Science");

		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();
		Student s6 = new Student();

		s1.setName("Ashish sahay");
		s1.setC_id(101);

		s2.setName("Gaurav sahay");
		s2.setC_id(201);

		s3.setName("Pragyaa");
		s3.setC_id(301);

		s4.setName("Megha");
		s4.setC_id(401);

		s5.setName("bholu");
		s5.setC_id(501);

		s6.setName("gauri");
		s6.setC_id(601);

		Transaction tr = s.beginTransaction();
		s.save(s1);
		s.save(s2);
		s.save(s3);
		s.save(s4);
		s.save(s5);
		s.save(s6);

		s.save(c1);
		s.save(c2);
		s.save(c3);
		s.save(c4);
		s.save(c5);
		s.save(c6);

		// s.delete(s6);

		/*
		 * course c1 = new course(); c1.setC_name("MCA"); course c2 = new course();
		 * c2.setC_name("bca"); Student s1 = new Student(); s1.setName("Ashsih");
		 * s1.setC_id(101); Student s2 = new Student(); s2.setName("Gaurav");
		 * s2.setC_id(202); Transaction tr = s.beginTransaction(); s.save(c1);
		 * s.save(c2); s.save(s1); s.save(s2);
		 */ tr.commit();
		s.close();

		System.out.println("Successful " + sf);

		System.out.println("Hello World!");
	}
}
