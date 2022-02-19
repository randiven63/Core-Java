import java.util.*;

public class Solution 
{
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			int a[][]=new int[6][6];
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				a[i][j]=sc.nextInt();
			}
			int max=-99999,start=0;
			for(int i=0;i<4;i++)
			{
				int pos=1;
				for(int j=0;j<4;j++)
				{
					int sum=a[start][pos]+a[start][pos+1]+a[start][pos+2]+a[start+1][pos+1]+a[start+2][pos]+a[start+2][pos+1]+a[start+2][pos+2];
					if(sum>max)
					max=sum;
					pos++;
				}
				start++;
			}
			System.out.println(max);
		}
	}

}
