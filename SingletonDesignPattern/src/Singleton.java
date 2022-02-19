
public class Singleton {

	public static void main(String[] args) {
		Thread t1=new Thread(new Runnable() 
		{
			public void run() 
			{
				Abc obj=Abc.getInstance();
			}
		});
		Thread t2=new Thread(new Runnable() 
		{
			public void run() 
			{
				Abc obj=Abc.getInstance();
			}
		});
		
		t1.start();
		t2.start();
		
	}
}
class Abc
{
	
	public static Abc obj;
	int i;
	private Abc()
	{
		System.out.println("Instance Created");
	}
	public static synchronized Abc getInstance()//double checked looking
	{
		if(obj==null)
		{
			obj=new Abc();
		}
		return obj;
	}
}
