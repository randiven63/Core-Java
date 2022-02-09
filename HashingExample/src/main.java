import java.util.*;
public class main {

	public static void main(String[] args) 
	{
		Pen p1=new Pen(5,"blue");
		Pen p2=new Pen(10,"red");
		Pen p3=new Pen(10,"red");
		Set<Pen> s=new HashSet<Pen>();
		s.add(p1);
		s.add(p2);
		s.add(p3);
		//System.out.println(p1.equals(p3));
		System.out.println(p2.equals(p3));
		System.out.println(s);
	}

}
