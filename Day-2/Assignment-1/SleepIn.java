/**
 * The parameter weekday is true if it is a weekday, and the parameter vacation is true
 * if we are on vacation. We sleep in if it is not a weekday or we're on vacation.
 * Return true if we sleep in.
 * 
 * Input : sleepIn(false, false)
 * Output : true
 * 
 * Input : sleepIn(true, false)
 * Output : Output : false
 * 
 * Input : sleepIn(false, true)
 * Output : true
 * 
 * @author Siva Sankar
 */

public class SleepIn {

    /**
     * The parameter weekday is true if it is a weekday, and the parameter vacation is true
     * if we are on vacation. We sleep in if it is not a weekday or we're on vacation.
     * Return true if we sleep in.
     * 
     * @param weekday, indicates a weekDay of type boolean
     * @param vacation, indicates true if we are in vacation.
     * 
     * @return true if it is not a weekday and we're on vacation.
     */
    public static boolean sleepIn(boolean weekDay, boolean vacation) {
        //  Your code goes here.
        if(weekDay==false || vacation==true){
            return true;
        }
        else{
            return false;
        }
    }
}