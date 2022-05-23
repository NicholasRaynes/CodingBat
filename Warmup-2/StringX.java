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
