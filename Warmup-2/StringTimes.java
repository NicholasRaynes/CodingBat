/**
* This class includes the declaration, implementation, and testing for
* the stringTimes method.
*
* @author NicholasRaynes
* @version 0.0.1
* @see https://codingbat.com/prob/p142270
*/
public class StringTimes
{
  public static void main(String[] args)
  {
      // Testing
      System.out.printf("Test #1 - stringTimes('Hi', 2)\nOutput: %s\n", stringTimes("Hi", 2));
      System.out.printf("Test #2 - stringTimes('Hi', 3)\nOutput: %s\n", stringTimes("Hi", 3));
      System.out.printf("Test #3 - stringTimes('Hi', 1)\nOutput: %s\n", stringTimes("Hi", 1));
  }
  
  /**
  * Given a string and a non-negative int factor, return a larger string that is factor copies
  * of the original string.
  *
  * @param input The original provided string.
  * @param factor The integer value for how many copies are to be made of the original string.
  * @return output The new string that is factor times the original string in size.
  */
  public static String stringTimes(String input, int factor) 
  {
    String output = "";
  
    for (int i = 0; i < factor; i++) 
    {
      output += input;  
    }
    
    return output;
  }
}
