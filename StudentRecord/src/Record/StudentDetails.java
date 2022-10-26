package Record;

import java.util.Scanner;

public class StudentDetails {
	
	//Instance Variable
	 int id;
	 String s_name,s_course;
	  
	public void getDetails()
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Details of Student......ID,NAME,COURSE");
		 System.out.println("Eneter ID :");
		 id=sc.nextInt();
		 System.out.println("Enter  name");
		 s_name=sc.next();
		 System.out.println("Eneter Course");
		 s_course=sc.next();
		 sc.close();
		 
	 }//end of  getDetails method
	 
	public void showDetails()
	 {
		 System.out.println("Showing Details of Student......ID,NAME,COURSE");
		 System.out.println("NAME "+s_name);
		 System.out.println("ID "+id);
		 System.out.println("Course "+s_course);
	 }
	 
	 
	

}
