/**
* This class includes the declaration, implementation, and testing for
* the stringX method.
*
* @author NicholasRaynes
* @version 0.0.1
* @see https://codingbat.com/prob/p171260
*/
public class StringX
{
    public static void main(String[] args)
    {
        // Testing
        System.out.printf("Test #1 - stringX('xxHxix')\nOutput:%s\n", stringX("xxHxix"));
        System.out.printf("Test #2 - stringX('abxxxcd')\nOutput:%s\n", stringX("abxxxcd"));
        System.out.printf("Test #3 - stringX('xabxxxcdx')\nOutput:%s\n", stringX("xabxxxcdx"));
    }
    
    /**
    * Given a string, this method returns a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.
    *
    * @param str The string to be scanned through.
    * @return result A new string with the "x" letters removed, except at the beginning or end of the provided string.
    */
    public static String stringX(String str) 
    {
        String result = "";
        
        for (int i = 0; i < str.length(); i++) 
        {
            if (!(i > 0 && i < (str.length() - 1) && str.substring(i, i + 1).equals("x"))) 
            {
                result = result + str.substring(i, i+1);
            }
        }
 
        return result;
    }
}
