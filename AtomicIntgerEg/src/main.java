import technoserve.c2tc.m07.Counter;

public class main {

	public static void main(String[] args) throws InterruptedException {
		Counter c=new Counter();
		Thread t=new Thread(c);
		Thread t1=new Thread(c);
		t.start();
		t1.start();
		t.join();
		t1.join();
		System.out.println(c.count);
	
	}

}
