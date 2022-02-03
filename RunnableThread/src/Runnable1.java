
public class Runnable1 implements Runnable
{
	public void run()
	{
		System.out.println("thread is running......");
	}

	public static void main(String[] args) 
	{
		
		Runnable1 r1=new Runnable1();
		Thread t=new Thread(r1);
		t.start();
	}

}
