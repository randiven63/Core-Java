import java.util.*;
public class Test {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int data=-1;
		for(int i=0;i<=n;i++)
		{
			try
			{
				data=100/i;
				//System.out.println(data);

			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
				System.out.println(data);

			}
			/*finally
			{
				System.out.println(data);
			}*/
			System.out.println(i+" ");

		}
			
	}

}
