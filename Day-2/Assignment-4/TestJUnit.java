/**
 * This is JUnit that tests the posNeg method that is available 
 * in PositiveNegative class. This contains 19 testcases.
 * 
 * Please don't run this file.
 * 
 * You can add your own test cases to this file by just copy and paste the last three 
 * lines of the code (TestCase19).
 * 
 * @author: Siva Sankar
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJUnit {

	@Test
	public void testCase1() {
		assertEquals(PositiveNegative.posNeg(1, -1, false), true);
	}

	@Test
	public void testCase2() {
		assertEquals(PositiveNegative.posNeg(-1, 1, false), true);
	}

	@Test
	public void testCase3() {
		assertEquals(PositiveNegative.posNeg(-4, -5, true), true);
	}

	@Test
	public void testCase4() {
		assertEquals(PositiveNegative.posNeg(-4, -5, false), false);
	}

	@Test
	public void testCase5() {
		assertEquals(PositiveNegative.posNeg(-4, 5, false), true);
	}

	@Test
	public void testCase6() {
		assertEquals(PositiveNegative.posNeg(-4, 5, true), false);
	}

	@Test
	public void testCase7() {
		assertEquals(PositiveNegative.posNeg(1, 1, false), false);
	}

	@Test
	public void testCase8() {
		assertEquals(PositiveNegative.posNeg(-1, -1, false), false);
	}

	@Test
	public void testCase9() {
		assertEquals(PositiveNegative.posNeg(1, -1, true), false);
	}

	@Test
	public void testCase10() {
		assertEquals(PositiveNegative.posNeg(-1, 1, true), false);
	}

	@Test
	public void testCase11() {
		assertEquals(PositiveNegative.posNeg(1, 1, true), false);
	}

	@Test
	public void testCase12() {
		assertEquals(PositiveNegative.posNeg(-1, -1, true), true);
	}

	@Test
	public void testCase13() {
		assertEquals(PositiveNegative.posNeg(5, -5, false), true);
	}

	@Test
	public void testCase14() {
		assertEquals(PositiveNegative.posNeg(-6, 6, false), true);
	}

	@Test
	public void testCase15() {
		assertEquals(PositiveNegative.posNeg(-5, -6, false), false);
	}

	@Test
	public void testCase16() {
		assertEquals(PositiveNegative.posNeg(-2, -1, false), false);
	}

	@Test
	public void testCase17() {
		assertEquals(PositiveNegative.posNeg(1, 2, false), false);
	}

	@Test
	public void testCase18() {
		assertEquals(PositiveNegative.posNeg(-5, 6, true), false);
	}

	@Test
	public void testCase19() {
		assertEquals(PositiveNegative.posNeg(-5, -5, true), true);
	}
}