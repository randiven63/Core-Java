//What will be the output of below snippet

import java.util.*;
public class Test3 {

	public static void main(String[] args) {
		try
		{
			int a[]= {1,2,3,4};
			for(int i=1;i<=4;i++)
			{
				System.out.println("a[" + i + "]=" + a[i] +"n");
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("error ="+ e);

		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundException");
		}
	}

}
