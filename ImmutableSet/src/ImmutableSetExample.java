import java.util.*;
public class ImmutableSetExample
{
	public static void main(String[] args) 
	{
		Student Student1=new Student(1,"MCA","Ram");
		Student Student2=new Student(2,"BCA","john");
		Student Student3=new Student(3,"BCA","Krishna");
		Set<Student> immutableSet=Set.of(Student1,Student2,Student3);
		for(Student s:immutableSet)
		{
			System.out.println("Roll No : "+s.getRollNo());
			System.out.println("Class Name : "+s.getClassName());
			System.out.println("Name : "+s.getName());
		}
		Iterator<Student> it=immutableSet.iterator();
		while(it.hasNext())
		{
			Student s=it.next();
			if(s.getRollNo()==2)
				s.setClassName("MCA");
		}
		Iterator<Student> it1=immutableSet.iterator();
		while(it1.hasNext())
		{
			Student s=it1.next();
			if(s.getRollNo()==2)
				System.out.println("Name Changed of Class : "+s.getClassName());
		}

	}

}
