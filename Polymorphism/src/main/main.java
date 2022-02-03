//write a java code for method overloading/compile time polymorphism

package main;
import java.util.*;
class Area
		{
			void findArea(int a)
			{
				System.out.println("Area of the square: " +(a*a));
			}
			void findArea(int l,int b)
			{
				int area=l*b;
				System.out.println("Area of the rectngle: " +area);
			}
			void findArea(float b,int h)
			{
				float area=(float)(0.5*b*h);
				System.out.println("Area of the triangle: " +area);
			}
			void findArea(int b,float h)
			{
				float area=b*h;
				System.out.println("Area of the parrallelogrm: " +area);
			}

		}
public class main 
	{	
		public static void main(String[] args) 
		{
			Area a=new Area();
			a.findArea(5);
			a.findArea(5,2);
			a.findArea(10f,5);
			a.findArea(5,10f);
	}

}
