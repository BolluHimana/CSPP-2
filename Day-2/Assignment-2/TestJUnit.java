/**
 * This is JUnit that tests the monkeyTrouble method in MonkeyTrouble class.
 * This contains 4 testcases.
 * 
 * Please don't run this file.
 * You can add your own test cases to this file by just copy and 
 * paste the last three lines of the code (TestCase4).
 * 
 * @author: Siva Sankar
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJUnit {
   @Test
   public void testCase1() {
      assertEquals(MonkeyTrouble.monkeyTrouble(false, false), true);
   }

   @Test
   public void testCase2() {
      assertEquals(MonkeyTrouble.monkeyTrouble(true, false), false);
   }

   @Test
   public void testCase3() {
      assertEquals(MonkeyTrouble.monkeyTrouble(false, true), false);
   }

   @Test
   public void testCase4() {
      assertEquals(MonkeyTrouble.monkeyTrouble(true, true), true);
   }
}