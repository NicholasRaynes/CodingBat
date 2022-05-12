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
    
    public static String middleThree(String str)
    {
        int len = str.length() / 2;
        	  
        return str.substring(len - 1,len + 2);
    }
}
