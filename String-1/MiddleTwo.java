/**
* This class includes the declaration, implementation, and testing for
* the middleTwo method.
*
* @author NicholasRaynes
* @version 0.0.1
* @see https://codingbat.com/prob/p137729
*/
public class HelloWorld 
{
    public static void main(String[] args)
    {
        // Testing
        System.out.println("Test #1 - middleTwo('string')");
        System.out.printf("Output: %s\n", middleTwo("string"));
        
        System.out.println("Test #2 - middleTwo('code')");
        System.out.printf("Output: %s\n", middleTwo("code"));
        
        System.out.println("Test #3 - middleTwo('Practice')");
        System.out.printf("Output: %s\n", middleTwo("Practice"));
    }
    
    /**
    * Given a string of even length, this method returns a string made of the middle two chars.
    * The string length will be at least 2.
    *
    * @param str The provided string.
    * @return A new string consisting of the middle two characters.
    */
    public static String middleTwo(String str) 
    {
        int half = str.length() / 2;

        return str.substring(half-1,half+1);
    }
}
