import java.util.*;
public class Test1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double data;
		int count=0,n=s.nextInt();
		for(int i=0;i<=n;i++)
			try
			{
				data=100/i;
				System.out.println(data+" ");
			}
			catch(ArithmeticException e)
			{
				count++;
				System.out.println(e);
			}
			finally
			{
				if(i==n)
				{
					if(count==0)
						System.out.println("No Exception");
					else
						System.out.println(count+ "Exception Handled");


				}
			}
	}

}
