class MyClass
{
	public void run1(){
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello");
		}
	}
}
class MyClass1 extends MyClass implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		System.out.println("hi");
	}
}
public class Main {

	public static void main(String[] args) throws Exception {
		MyClass t1=new MyClass();
		MyClass1 t2=new MyClass1();
		Thread t=new Thread(t2);
		t1.run1();
		t.start();
		t.join();
		System.out.println("Nayana");
	}

}
