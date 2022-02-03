package Array;

//package Main;
import java.util.*;
public class main {

	public static void main(String[] args) {
		int size,key;
		boolean flag=false;
		Scanner sc = new Scanner(System.in);
		size=sc.nextInt();
		int arr[]=new int[size];  //declaration of array
		for(int i=0;i<size;i++)
		arr[i]=sc.nextInt();
		key=sc.nextInt();
		for(int i=0;i<size;i++)
		if(arr[i]==key)
		{
			System.out.println("Idex position of" + key + "is: " +i);
			flag=true;
			break;
		}
		if(flag==false)
		System.out.println("not found");
	}

}
