import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;

//import org.junit.jupiter.params.provider.ValueSource;

class CalculatorTest 
{
	Calculator c;
	//int value;
	@BeforeEach
	void setup()
	{
		System.out.println("this is setup");
		c=new Calculator();
	}
	@BeforeAll
	static void setup2()
	{
		System.out.println("Demo");
	}
	@Test
	void test() 
	{
		assertEquals(5, c.add(2,3));
	}
	@Test
	void areatest()
	{
		assertEquals(Math.PI,c.area(1));
	}
	private static String[] method()
	{
		return new String[]  {"sanjana","nayana","poonam"};
	}
	@ParameterizedTest
	@MethodSource("method")
	void test2(String args)
	{
		System.out.println(args);
	}

	enum level
	{
		high,low,medium
	}
	@ParameterizedTest
	@EnumSource(level.class)
	
	void test1(level args)
	{
		System.out.println(args);
	}
	
	@RepeatedTest( value = 4)
	void test2()
	{
		System.out.println("This is reapeated");
	}
}
