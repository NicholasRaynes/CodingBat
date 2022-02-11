/**
* This class includes the declaration, implementation, and testing for
* the in3050 method.
*
* @author NicholasRaynes
* @version 0.0.1
* @see https://codingbat.com/prob/p132134
*/
public class In3050
{
  /**
  * Given 2 int values, return true if they are both in the range 30..40 
  * inclusive, or they are both in the range 40..50 inclusive.
  *
  * @param a The first integer.
  * @param b The second integer.
  * @return Whether or not the two numbers are within their respective ranges.
  */
  public boolean in3050(int a, int b) 
  {
    if (a >= 30 && a <= 40 && b >= 30 && b <= 40) 
    {
      return true;
    }
  
    if (a >= 40 && a <= 50 && b >= 40 && b <= 50) 
    {
      return true;
    }
  
    return false;
  }
}
