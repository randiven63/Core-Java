interface Inf2
{
	final int a=10;
	static void display()
	{
		System.out.println("Static Method");
	}
}

public class StaticMethod implements Inf2{

	public static void main(String[] args) {
		Inf2.display();

	}

}
