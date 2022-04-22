/**
* This class includes the declaration, implementation, and testing for
* the extraEnd method.
*
* @author NicholasRaynes
* @version 0.0.2
* @see https://codingbat.com/prob/p108853
*/
public class ExtraEnd
{
  public static void main(String[] args)
  {
    // Testing
    System.out.println("Test #1 - extraEnd('Hello')");
    System.out.printf("Output: %s\n", extraEnd("Hello"));
    
    System.out.println("Test #2 - extraEnd('ab')");
    System.out.printf("Output: %s\n", extraEnd("ab"));
    
    System.out.println("Test #3 - extraEnd('Test')");
    System.out.printf("Output: %s\n", extraEnd("Test"));
  }
  
  /**
    * This method is given a string, and returns a new string made of 3 copies of the last 2 
    * chars of the original string. The string length will be at least 2.
    *
    * @param str The provided string.
    * @return A new string made of three copies of the last two chars, of the provided string.
    */
  public static String extraEnd(String str) 
  {
    String lastTwo = "";
  
    if(str.length() >= 2)
    {
      lastTwo = str.substring(str.length() - 2);
    }
  
    lastTwo.toLowerCase();
    
    return lastTwo + lastTwo + lastTwo;
  }
}
