/**
* This class includes the declaration, implementation, and testing for
* the middleThree method.
*
* @author NicholasRaynes
* @version 0.0.1
* @see https://codingbat.com/prob/p115863
*/
public class MiddleThree
{
    public static void main(String[] args)
    {
        // Testing
        System.out.println("Test #1 - middleThree('Candy')");
        System.out.printf("Output: %s\n", middleThree("Candy"));
        
        System.out.println("Test #2 - middleThree('and')");
        System.out.printf("Output: %s\n", middleThree("and"));
        
        System.out.println("Test #3 - middleThree('solving')");
        System.out.printf("Output: %s\n", middleThree("solving"));
    }
    
    /**
    * Given a string of odd length, this method returns the string length three from its middle.
    * (The string length will be at least three.)
    *
    * @param str The provided string.
    * @return A new string made length three from the middle.
    */
    public static String middleThree(String str)
    {
        int len = str.length() / 2;
        	  
        return str.substring(len - 1,len + 2);
    }
}
