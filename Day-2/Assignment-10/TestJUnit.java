/**
 * This is JUnit that tests the binaryToDecimal method that is available 
 * in BinaryToDecimal class. This contains 16 testcases.
 * 
 * Please don't run this file.
 * 
 * You can add your own test cases to this file by just copy and paste the last three 
 * lines of the code (TestCase16).
 * 
 * @author: Siva Sankar
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJUnit {
	@Test
	public void testCase1() {
		assertEquals(BinaryToDecimal.binaryToDecimal("1"), 1);
	}

	@Test
	public void testCase2() {
		assertEquals(BinaryToDecimal.binaryToDecimal("0"), 0);
	}

	@Test
	public void testCase3() {
		assertEquals(BinaryToDecimal.binaryToDecimal("10"), 2);
	}

	@Test
	public void testCase4() {
		assertEquals(BinaryToDecimal.binaryToDecimal("101"), 5);
	}

	@Test
	public void testCase5() {
		assertEquals(BinaryToDecimal.binaryToDecimal("00001010"), 10);
	}

	@Test
	public void testCase6() {
		assertEquals(BinaryToDecimal.binaryToDecimal("000000001010"), 10);
	}

	@Test
	public void testCase7() {
		assertEquals(BinaryToDecimal.binaryToDecimal("0011"), 3);
	}

	@Test
	public void testCase8() {
		assertEquals(BinaryToDecimal.binaryToDecimal("101010101"), 341);
	}

	@Test
	public void testCase9() {
		assertEquals(BinaryToDecimal.binaryToDecimal("111111111"), 511);
	}

	@Test
	public void testCase10() {
		assertEquals(BinaryToDecimal.binaryToDecimal("000000001"), 1);
	}

	@Test
	public void testCase11() {
		assertEquals(BinaryToDecimal.binaryToDecimal("11111000011110000"), 127216);
	}

	@Test
	public void testCase12() {
		assertEquals(BinaryToDecimal.binaryToDecimal("10000000000000000"), 65536);
	}

	@Test
	public void testCase13() {
		assertEquals(BinaryToDecimal.binaryToDecimal("11110101010101010"), 125610);
	}

	@Test
	public void testCase14() {
		assertEquals(BinaryToDecimal.binaryToDecimal("1010010110100101110100101"), 21711781);
	}

	@Test
	public void testCase15() {
		assertEquals(BinaryToDecimal.binaryToDecimal("00111010101001011010010110100101"), 983934373);
	}

	@Test
	public void testCase16() {
		assertEquals(BinaryToDecimal.binaryToDecimal("01111010101001011010010111111111"), 2057676287);
	}
}