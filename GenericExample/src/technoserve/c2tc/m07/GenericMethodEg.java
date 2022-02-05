package technoserve.c2tc.m07;

public class GenericMethodEg 
{
	public static <E>void printArray(E[] inputArray)
	{
		for(E element : inputArray)
		{
			System.out.printf("%s", element);
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		Integer[] intArray={1,2,3,4,5};
		Double[] doubleArray= {1.1 , 1.2 , 1.3 , 1.4};
		Character[] charArray= {'h','e','l','l','o'};
		System.out.println("\nArray integerArray contains:");
		printArray(intArray);
		System.out.println("\nArray doubleArray contains:");
		printArray(doubleArray);
		System.out.println("\nArray charArray contains:");
		printArray(charArray);

	}

}
