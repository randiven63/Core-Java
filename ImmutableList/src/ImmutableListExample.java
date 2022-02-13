//import java.util.Set;
import java.util.*;
public class ImmutableListExample {

	public static void main(String[] args) {
		Student Student1=new Student(1,"MCA","Ram");
		Student Student2=new Student(2,"BCA","john");
		Student Student3=new Student(3,"MCA","Krishna");
		List<Student> immutableList=List.of(Student1,Student2,Student3);
		for(Student s:immutableList)
		{
			System.out.println("Roll No : "+s.getRollNo());
			System.out.println("Class Name : "+s.getClassName());
			System.out.println("Name : "+s.getName());
		}
		immutableList.get(1).setClassName("MCA");
		System.out.println("After make changes of RollNo 2 : "+immutableList.get(1).getClassName());
	}

}
