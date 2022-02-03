
package techniserve.c2tc;
import java.util.*;
import techniserve.c2tc.b9.Student;
//import techniserve.c2tc.M7.*;
public class Technicle
{
	String trainer_name="Sanjana Mam";

	public static void main(String[] args) 
	{
		Technicle t=new Technicle();
		techniserve.c2tc.M7.Student s1=new techniserve.c2tc.M7.Student();
		Student s2=new Student();
		System.out.println(t.trainer_name + "Takes class For " s1.batch_name + "and" + s2.batch_name);
	}

}
