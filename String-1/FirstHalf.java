/**
* This class includes the declaration, implementation, and testing for
* the firstHalf method.
*
* @author NicholasRaynes
* @version 0.0.1
* @see https://codingbat.com/prob/p172267
*/

public class FirstHalf
{
    public static void main(String[] args)
    {
        // Testing
        System.out.println("Test #1 - firstHalf('WooHoo')");
        System.out.printf("Output: %s\n", firstHalf("WooHoo"));
        
        System.out.println("Test #2 - firstHalf('HelloThere')");
        System.out.printf("Output: %s\n", firstHalf("HelloThere"));
        
        System.out.println("Test #3 - firstHalf('abcdef')");
        System.out.printf("Output: %s\n", firstHalf("abcdef"));
    }
    
    /**
    * This method is given a string of even length, and returns the first half.
    *
    * @param str The provided string.
    * @return half A new string consisting of the first half of characters of the provided string.
    */
    public static String firstHalf(String str) 
    {
        String half = "";
  
        half = str.substring(0, str.length() / 2);

        return half;
    }
}
