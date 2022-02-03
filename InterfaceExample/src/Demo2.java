//Default method in interface
interface Inf1
{
	final int a=10;
	default void display()
	{
		System.out.println("Default Method");
	}
}
public class Demo2 implements Inf1 {

	public static void main(String[] args) {
		Demo2 t=new Demo2();
		t.display();
	}

}
