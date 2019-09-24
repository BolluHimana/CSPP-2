/**
 * This is JUnit that tests the in1020 method that is available in InTenTwenty
 * class. This contains 7 testcases.
 * 
 * Please don't run this file.
 * 
 * You can add your own test cases to this file by just copy and paste the last three 
 * lines of the code (TestCase7).
 * 
 * @author: Siva Sankar
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJUnit {

	@Test
	public void testCase1() {
		assertEquals(InTenTwenty.in1020(12, 99), true);
	}

	@Test
	public void testCase2() {
		assertEquals(InTenTwenty.in1020(21, 12), true);
	}

	@Test
	public void testCase3() {
		assertEquals(InTenTwenty.in1020(8, 99), false);
	}

	@Test
	public void testCase4() {
		assertEquals(InTenTwenty.in1020(99, 10), true);
	}

	@Test
	public void testCase5() {
		assertEquals(InTenTwenty.in1020(20, 20), true);
	}

	@Test
	public void testCase6() {
		assertEquals(InTenTwenty.in1020(21, 21), false);
	}

	@Test
	public void testCase7() {
		assertEquals(InTenTwenty.in1020(9, 9), false);
	}
}