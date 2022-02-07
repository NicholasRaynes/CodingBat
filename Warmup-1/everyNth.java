/**
* This class includes the declaration and implementation
* for the everyNth method.
*
* @author NicholasRaynes
* @version 0.0.1
* @see https://codingbat.com/prob/p196441
*/
public class everyNth
{
  /**
  * Given a non-empty string and an int N, return the string made starting with char 0, 
  * and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. 
  * N is 1 or more.
  *
  * @param weekday Whether or not it is a weekday.
  * @param vacation Whether or not it is a vacation day.
  * @return result The new string made with the char at 0 and every Nth char from the input.
  */
  public String everyNth(String str, int n) 
  {
    String result = "";
  
    for(int i = 0; i < str.length(); i = i + n)
    {
      result += str.charAt(i);
    }
  
    return result;
  }
}
