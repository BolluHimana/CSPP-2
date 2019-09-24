/**
 * This is JUnit that tests the factorial method that is available 
 * in Factorial class. This contains 13 testcases.
 * 
 * Please don't run this file.
 * 
 * You can add your own test cases to this file by just copy and paste the last three 
 * lines of the code (TestCase13).
 * 
 * @author: Siva Sankar
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJUnit {
	@Test
	public void testCase1() {
		assertEquals(Factorial.factorial(1), 1);
	}

	@Test
	public void testCase2() {
		assertEquals(Factorial.factorial(5), 120);
	}

	@Test
	public void testCase3() {
		assertEquals(Factorial.factorial(2), 2);
	}

	@Test
	public void testCase4() {
		assertEquals(Factorial.factorial(0), 1);
	}

	@Test
	public void testCase5() {
		assertEquals(Factorial.factorial(10), 3628800);
	}

	@Test
	public void testCase6() {
		assertEquals(Factorial.factorial(11), 39916800);
	}

	@Test
	public void testCase7() {
		assertEquals(Factorial.factorial(12), 479001600);
	}

	@Test
	public void testCase8() {
		assertEquals(Factorial.factorial(15), 1307674368000L);
	}

	@Test
	public void testCase9() {
		assertEquals(Factorial.factorial(19), 121645100408832000L);
	}

	@Test
	public void testCase10() {
		assertEquals(Factorial.factorial(20), 2432902008176640000L);
	}

	@Test
	public void testCase11() {
		assertEquals(Factorial.factorial(21), -1);
	}

	@Test
	public void testCase12() {
		assertEquals(Factorial.factorial(22), -1);
	}

	@Test
	public void testCase13() {
		assertEquals(Factorial.factorial(-1), -1);
	}
}