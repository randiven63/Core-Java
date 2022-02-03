public class Person
{
	Person()
	{
		System.out.println("person class constructor");
	}
}
class Student1 extends Person
{
	Student1()
	{
		super();
		System.out.println("student class constructor");
	}
	
} 
public class Constructor {

	public static void main(String[] args) {
		Student1 s=new Student1();
	}

}
