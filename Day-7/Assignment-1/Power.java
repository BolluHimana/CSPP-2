/**
 * Given "a" an integer or float value, and b as an integer value, 
 * Find a power b.
 *
 * @author Siva Sankar
 */

 public class Power {
    /**
     * This method finds a^b where both a and b are integers.
     * @param  a, the base
     * @param  b, the exponential
     * @return a^b which is a long value.
     */
      
     public static long pow(int a, int b) {
        return (long) Math.pow(a,b);
     }

     /**
     * This method finds a^b where both variable a is a double 
     * and b is an integer.
     * @param  a, the base
     * @param  b, the exponential
     * @return a^b which is a long value.
     */
     public static double pow(float a, int b) {
        return (double)  Math.pow(a,b);
      }
      public static double pow(int a,  float b) {
         return Math.pow(a,b);
      }
      public static double pow(double a, double b) {
         return  Math.pow(a,b);
      }
      
 }