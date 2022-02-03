import java.util.*;
class Technical
{
	void display()
	{
		System.out.println("The class is handled by sanjana mam");
	}
}
public class main extends Technical
{
	void display()
	{
		System.out.println("The class is handled for banglore Students");
	}

	public static void main(String[] args) 
	{
		Technical t=new Technical();//upcasting or dynamic binding
		t.display();
	}
}