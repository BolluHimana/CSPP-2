/**
 * Given a string and a non-negative int n, we'll say that the front
 * of the string is the first 3 chars, or whatever is there if the 
 * string is less than length 3. Return n copies of the front;
 * 
 * Input : frontTimes("Chocolate", 2)
 * Output : ChoCho
 * 
 * Input : frontTimes("Chocolate", 3)
 * Output : ChoChoCho
 * 
 * Input : frontTimes("Abc", 3)
 * Output : AbcAbcAbc
 * 
 * @author: Siva Sankar
 */

public class FrontTimes {

    /**
     * This method returns n copies of the front.
     * @param str, the string to be considered.
     * @param n, the non-negative integer value.
     * @return the n copies of the front string.
     */
    public static String frontTimes(String str, int n) {
        //  Your code goes here....
        String s="";
        String r= "";
        int l=str.length();
        if(l>3){
            for(int i=0;i<3;i++){
                s=s+str.charAt(i);
            }
            for(int j=0; j<n; j++){
                
                r=r+s;
        
           }
           return r;
        }
        else{
             for(int k=1;k<=n;k++){
                 r=r+str;
                }
             return r;
            }
        
    }
}