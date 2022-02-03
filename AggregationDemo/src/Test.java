class Student
{
	String name;
	int roll_no;
	Address stu_address;
	Student(String name,int roll_no,Address stu_address)
	{
		this.name=name;
		this.roll_no=roll_no;
		this.stu_address=stu_address;
	}
}
class Address
{
	int street_no;
	String street;
	String city;
	String state;
	Address(int street_no,String street,String city,String state)
	{
		this.street_no=street_no;
		this.street=street;
		this.city=city;
		this.state=state;
	}
	
}
public class Test {

	public static void main(String[] args) {
		Address a=new Address(34,"Nehru street","Coimbatore","TamilNadu");
		Student s=new Student("Ajay",101,a);
		System.out.println(s.name);
		System.out.println(s.roll_no);
		System.out.println(s.stu_address.city);
	}

}
