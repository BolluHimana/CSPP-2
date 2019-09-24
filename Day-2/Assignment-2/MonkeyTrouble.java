/**
 * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each 
 * is smiling. We are in trouble if they are both smiling or if neither of them 
 * is smiling. Return true if we are in trouble.
 * 
 * Input : monkeyTrouble(true, true)
 * Output : true
 * 
 * Input : monkeyTrouble(true, false)
 * Output : false
 * 
 * Input : monkeyTrouble(false, false)
 * Output : true
 * 
 * @author Siva Sankar 
 */
public class MonkeyTrouble {

    /**
     * This method finds whether the monkeys are in trouble or not.
     * 
     * @param aSmile takes a boolean value true if the first monkey is smiling otherwise false.
     * @param bSmile takes a boolean value true if the second monkey is smiling otherwise false.
     * 
     * @return true if we are in trouble and false otherwise.
     */
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        // Your code goes here....
        if (aSmile==true && bSmile==true || aSmile==false && bSmile==false){
            return true;
        }
        else{
            return false;
        }

    }
}