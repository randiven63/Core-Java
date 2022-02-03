class Super1
{
	void m1()
	{
		System.out.println("Super m1");
	}
	final void m2()
	{
		System.out.println("Super m2");
	}
}
public class Final1 extends Super1
{
	void m1()
	{
		System.out.println("sub m1");
	}
	public static void main(String[] args) 
	{
		Final1 obj=new Final1();
		obj.m1();
		obj.m2();
	}

}

