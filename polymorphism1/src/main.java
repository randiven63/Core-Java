//Runtime Polymorphism / method overrriding

import java.util.*;
class A
{
	void method()
	{
		System.out.println("From class A");
	}
}
class B extends A
{
	void method()
	{
		System.out.println("From class B");
	}
}

public class main {

	public static void main(String[] args) {
		A a1=new A();
		a1.method();
		B a2=new B();
		a2.method();
	}

}
