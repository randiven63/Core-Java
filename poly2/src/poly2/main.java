//Dynamic binding / upcasting

package poly2;
import java.util.*;
class Animal
{
	void sound()
	{
		System.out.println("Animal");
	}
}
class Cat extends Animal
{
	void sound()
	{
		System.out.println("Meows");
	}
}
class Lion extends Animal
{
	void sound()
	{
		System.out.println("Roars");
	}
}

public class main {
	public static void main(String[] args) {
		Animal a;
		a=new Cat();
		a.sound();
		a=new Lion();
		a.sound();
	}

}
