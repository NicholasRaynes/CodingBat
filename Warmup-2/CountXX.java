/**
* This class includes the declaration, implementation, and testing for
* the countXX method.
*
* @author NicholasRaynes
* @version 0.0.1
* @see https://codingbat.com/prob/p194667
*/
public class CountXX
{
  public static void main(String[] args)
  {
    // Testing
    System.out.printf("Test #1 - countXX('abcxx')\nOutput:%s\n", countXX("abcxx"));
    System.out.printf("Test #2 - countXX('xxx')\nOutput:%s\n", countXX("xxx"));
    System.out.printf("Test #3 - countXX('xxxx')\nOutput:%s\n", countXX("xxxx"));
  }
  
  /**
  * This method counts the number of "xx" in the given string. We'll say that 
  * overlapping is allowed, so "xxx" contains 2 "xx".
  *
  * @param input The string to be scanned through.
  * @return count The amount of times "xx" appears within the given string.
  */
  public static int countXX(String input) 
  {
    int count = 0;

    for (int i = 0; i < input.length() - 1; i++) 
    {
      if (input.substring(i, i+2).equals("xx")) 
      {
        count++;
      }
    }

    return count;
  }
}
