import technoserve.c2tc.m07.AtomicInteger;
import java.util.concurrent.atomic.AtomicInteger;
public class Counter extends Thread 
{
	AtomicInteger  count=new AtomicInteger (0);
	public void run()
	{
		for(int i=0;i<100000;i++)
			count.addAndGet(1);
	}


}
