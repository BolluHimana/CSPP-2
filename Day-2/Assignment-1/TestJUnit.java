/**
 * This is JUnit that tests the sleepIn method that is available in SleepIn class.
 * This contains 4 testcases.
 * 
 * Please don't run this file.
 * You can add your own test cases to this file by just copy and paste the last three 
 * lines of the code (TestCase4).
 * 
 * @author: Siva Sankar
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJUnit {

   @Test
   public void testCase1() {
      assertEquals(SleepIn.sleepIn(false, false), true);
   }

   @Test
   public void testCase2() {
      assertEquals(SleepIn.sleepIn(true, false), false);
   }

   @Test
   public void testCase3() {
      assertEquals(SleepIn.sleepIn(false, true), true);
   }

   @Test
   public void testCase4() {
      assertEquals(SleepIn.sleepIn(true, true), true);
   }
}