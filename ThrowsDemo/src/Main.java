//What will be the output of below snippet mcq question

class Base extends Exception{}
class Derived extends Base{}
public class Main
{
	public static void main(String[] args) 
	{
		try
		{
			throw new Derived();
		}
		catch(Base b)
		{
			System.out.println("caugth base class exception");
		}
		catch(Derived d)
		{
			System.out.println("caugth Derived class exception");
		}
	}
}


/*class InvalidAgeException extends Exception
{
	InvalidAgeException(String s)
	{
		super(s);
	}
}
public class Main {
	static void validate(int age) throws InvalidAgeException
	{
		if(age<18)
			throw new InvalidAgeException("not valid");
		else
			System.out.println("welcome to vote");
	}
	public static void main(String[] args) 
	{
		try
		{
			validate(13);
		}
		catch(Exception e)
		{
			System.out.println("Exception occured: "+e);
		}
		System.out.println("rest of the code.....");
	}

}
public class Main
{
	public static void main(String[] args)
	{
		try
		{
			throw 10;
		}
		catch(int e)
		{
			System.out.println("got exception "+e);

		}
	}
	
}*/
