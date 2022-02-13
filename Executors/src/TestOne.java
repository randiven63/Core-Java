
public class TestOne implements Runnable
{
	public void run()
	{
		while(true)
		{
			System.out.println("Executing Task One");
			try
			{
				Thread.sleep(1000);
			}
			catch(Throwable e)
			{
				e.printStackTrace();
			}
		}
	}
}
