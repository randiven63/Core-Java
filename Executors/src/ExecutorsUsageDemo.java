import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.*;
public class ExecutorsUsageDemo
{
	private static ExecutorService executor=null;
	private static volatile Future taskOneResults=null;
	private static volatile Future tasktwoResults=null;

	public static void main(String[] args) 
	{
		executor=Executors.newFixedThreadPool(2);
		while(true)
		{
			try
			{
				checkTasks();
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println("Caught exception : "+e.getMessage());
			}
		}
	}	
	private static void checkTasks() throws Exception
	{
		if(taskOneResults==null || taskOneResults.isDone() || taskOneResults.isCancelled())
		{
			taskOneResults=executor.submit(new TestOne());
		}
		if(tasktwoResults==null || tasktwoResults.isDone() || tasktwoResults.isCancelled())
		{
			tasktwoResults=executor.submit( new TestTwo());
		}		
	}

}
