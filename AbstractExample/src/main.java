abstract class Test
{
	public abstract void m1();
	void m2()
	{
		System.out.println("Normal-method");
	}
}
public class main extends Test {
	public void m1()
	{
		System.out.println("m1-method");
	}
	public static void main(String[] args) {
		main c=new main();
		c.m1();
		c.m2();
	}

}
