import java.util.*;
class Flower
{
	void colour()
	{
		System.out.println("Based on flower");
	}
}
class Red extends Flower
{
	void colour1()
	{
		System.out.println("Blood");
	}
}
class Blue extends Red
{
	void colour2()
	{
		System.out.println("Sky");
	}
}
public class main {

	public static void main(String[] args) {
		Blue d=new Blue();
		d.colour2();
		d.colour1();
		d.colour();
	}

}
