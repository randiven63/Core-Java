class MyClass1
{
	    void run1()
		{
			System.out.println("Hello");
		}
	
}
public class MyClass {

	public static void main(String[] args) {
		new MyClass1().run1();//Ananimous object creation.
		Runnable obj=()->
		{
			System.out.println("Hi");
		};
		Thread t=new Thread(obj);
		t.start();
	}

}
