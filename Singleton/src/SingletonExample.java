
public class SingletonExample {

	public static void main(String[] args) 
	{
		Singleton obj1=Singleton.getSingleInstance();
		//obj1.getSingleInstance("Hello I am a singleton! Let me say hello world to you");
		System.out.println("hello world\r\n");
	}

}
 class Singleton
{
	static Singleton obj=new Singleton();
	private Singleton()
	{
		
	}
	public static Singleton getSingleInstance()
	{
		return obj;
	}
	
}
