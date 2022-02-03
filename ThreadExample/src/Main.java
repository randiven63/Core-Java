//example of multithreading.
class MyClass extends Thread
{
	MyClass(String t)
	{
		super(t);
	}
	@Override     //annotation
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				
			}
			System.out.println("Hello");

		}
	}
}
class MyClass1 extends Thread
{
	@Override     //annotation
	public void run()
	{
		for(int i=0;i<5;i++)
		System.out.println("hi");
		//System.out.println(Thread.getName());
	}
}

public class Main 
{
	public static void main(String[] args) throws InterruptedException
	{
		MyClass t1=new MyClass("t1");
		MyClass1 t2=new MyClass1();
		System.out.println(t1.getName());
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Nayana");
	}

}
