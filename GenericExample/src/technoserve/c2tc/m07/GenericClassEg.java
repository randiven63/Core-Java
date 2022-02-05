package technoserve.c2tc.m07;

public class GenericClassEg<T> 
{
	private T t;
	public void add(T t)
	{
		this.t=t;
	}
	public T get()
	{
		return t;
	}
	public static void main(String[] args) 
	{
		GenericClassEg<Integer> integerGenericClassEg=new GenericClassEg<Integer>();
		GenericClassEg<String> stringGenericClassEg=new GenericClassEg<String>();
		integerGenericClassEg.add(10);
		stringGenericClassEg.add("Hello World");
		System.out.printf("Integer value:%d\n\n",integerGenericClassEg.get());
		System.out.printf("String value:%s\n",stringGenericClassEg.get());

		
	}

}
