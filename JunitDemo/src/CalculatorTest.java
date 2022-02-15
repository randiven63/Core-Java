import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest 
{
	@Test
	void test() 
	{
		Calculator c=new Calculator();
		assertEquals(5, c.add(2,3));
	}
	
}
