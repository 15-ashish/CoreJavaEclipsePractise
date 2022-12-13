package String;
import java.util.*;
public class RevString {
	static void rev(char [] name)
	 {
		char[] revname= {'a'};
		 int i,j,k;
		int len=name.length;
		 for(j=len-1,k=0; j>=0;j--,k++)
		 {
			 revname[k]=name[j];
		 }
		 System.out.println(revname);
		 
	 }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i=0;
           //char name1[]=new char[20];
           System.out.println("eneter");
           char[] name1=sc.next().toCharArray();
           rev(name1);
           sc.close();
           
	}

}
