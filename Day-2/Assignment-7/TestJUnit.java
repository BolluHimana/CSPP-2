/**
 * This is JUnit that tests the hasTeen method that is available in HasTeen class.
 * This contains 11 testcases.
 * 
 * Please don't run this file.
 * 
 * You can add your own test cases to this file by just copy and paste the last three 
 * lines of the code (TestCase11).
 * 
 * @author: Siva Sankar
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJUnit {
	@Test
	public void testCase1() {
		assertEquals(HasTeen.hasTeen(13, 20, 10), true);
	}

	@Test
	public void testCase2() {
		assertEquals(HasTeen.hasTeen(20, 19, 10), true);
	}

	@Test
	public void testCase3() {
		assertEquals(HasTeen.hasTeen(20, 10, 13), true);
	}

	@Test
	public void testCase4() {
		assertEquals(HasTeen.hasTeen(1, 20, 12), false);
	}

	@Test
	public void testCase5() {
		assertEquals(HasTeen.hasTeen(19, 20, 12), true);
	}

	@Test
	public void testCase6() {
		assertEquals(HasTeen.hasTeen(12, 20, 19), true);
	}

	@Test
	public void testCase7() {
		assertEquals(HasTeen.hasTeen(12, 9, 20), false);
	}

	@Test
	public void testCase8() {
		assertEquals(HasTeen.hasTeen(12, 18, 20), true);
	}

	@Test
	public void testCase9() {
		assertEquals(HasTeen.hasTeen(14, 2, 20), true);
	}

	@Test
	public void testCase10() {
		assertEquals(HasTeen.hasTeen(4, 2, 20), false);
	}

	@Test
	public void testCase11() {
		assertEquals(HasTeen.hasTeen(11, 22, 22), false);
	}

}
