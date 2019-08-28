package unitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import junit.textui.TestRunner;

public class TestCalculator extends TestCase {


	@Test
	public void testCompare() {

		int x = 10;
		int y = 40;
		Calculator c = new Calculator(x, y);
		int result = c.Compare();

		assertEquals(-1,result);
System.out.println(result);
	}
	@Test

	public	void testAddMethod() {
		int x = 10;
		int y = 40;
		Calculator c1= new Calculator(x, y);
		int result = c1.AddMethod();

		assertEquals(50, result);
	}
}
	
	
