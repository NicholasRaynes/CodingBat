/**
* This class includes the declaration, implementation, and testing for
* the hasTeen method.
*
* @author NicholasRaynes
* @version 0.0.1
* @see https://codingbat.com/prob/p178986
*/
public class HasTeen
{
    public static void main(String[] args)
    {
        // Testing
        System.out.println("Test #1 - hasTeen(13, 20, 10)");
    	System.out.printf("Output: %b\n", hasTeen(13, 20, 10));
    	
    	System.out.println("Test #2 - hasTeen(20, 19, 10)");
    	System.out.printf("Output: %b\n", hasTeen(20, 19, 10));
    	
    	System.out.println("Test #3 - hasTeen(20, 10, 13)");
    	System.out.printf("Output: %b\n", hasTeen(20, 10, 13));
    }
   
    /**
    * We'll say that a number is "teen" if it is in the range 13.. 19 inclusive. 
    * This method is given 3 int values, and returns true if 1 or more of them are teen.
    *
    * @param a The first integer.
    * @param b The second integer.
    * @param c The second integer.
    * @return Whether or not the 1 or more of the provided integers are considered a teen.
    */
    public static boolean hasTeen(int a, int b, int c) 
    {
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
    }
}
