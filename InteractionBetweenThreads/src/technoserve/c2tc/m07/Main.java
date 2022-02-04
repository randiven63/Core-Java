package technoserve.c2tc.m07;

public class Main {

	public static void main(String[] args) throws Exception{
		BankAccount ba=new BankAccount();
		Thread t=new Thread(()->
				{
					try 
					{
						ba.withdraw(1500);
					}
					catch (InterruptedException e) 
					{
						e.printStackTrace();
					}
				});
		Thread t1=new Thread(()->
				{
					ba.deposit(1000);
				});
		t.start();
		t.join();
		t1.start();
		t1.join();
		System.out.println(ba.amount);
	}

}
