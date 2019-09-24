/**
 * This is JUnit that tests the loneTeen method that is available in LoneTeen
 * class. This contains 13 testcases.
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
		assertEquals(LoneTeen.loneTeen(13, 99), true);
	}

	@Test
	public void testCase2() {
		assertEquals(LoneTeen.loneTeen(21, 19), true);
	}

	@Test
	public void testCase3() {
		assertEquals(LoneTeen.loneTeen(13, 13), false);
	}

	@Test
	public void testCase4() {
		assertEquals(LoneTeen.loneTeen(14, 20), true);
	}

	@Test
	public void testCase5() {
		assertEquals(LoneTeen.loneTeen(20, 15), true);
	}

	@Test
	public void testCase6() {
		assertEquals(LoneTeen.loneTeen(16, 17), false);
	}

	@Test
	public void testCase7() {
		assertEquals(LoneTeen.loneTeen(16, 9), true);
	}

	@Test
	public void testCase8() {
		assertEquals(LoneTeen.loneTeen(16, 18), false);
	}

	@Test
	public void testCase9() {
		assertEquals(LoneTeen.loneTeen(13, 19), false);
	}

	@Test
	public void testCase10() {
		assertEquals(LoneTeen.loneTeen(13, 20), true);
	}

	@Test
	public void testCase11() {
		assertEquals(LoneTeen.loneTeen(6, 18), true);
	}

	@Test
	public void testCase12() {
		assertEquals(LoneTeen.loneTeen(99, 13), true);
	}

	@Test
	public void testCase13() {
		assertEquals(LoneTeen.loneTeen(99, 99), false);
	}
}