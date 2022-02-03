class Main2
{
	public void run1(){
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello");
		}
	}
}
class Main1 extends Main2 implements Runnable
{
	@Override     //annotation
	public void run()
	{
		for(int i=0;i<5;i++)
		System.out.println("hi");
	}
}
public class RunnableDemo {

	public static void main(String[] args) throws Exception {
		Main2 t1=new Main2();
		Main1 t2=new Main1();
		Thread t=new Thread(t2);
		t1.run1();
		t.start();
		t.join();
		System.out.println("Nayana");
	}

}
