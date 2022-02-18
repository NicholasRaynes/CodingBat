/**
* This class includes the declaration, implementation, and testing for
* the altPairs method.
*
* @author NicholasRaynes
* @version 0.0.1
* @see https://codingbat.com/prob/p121596
*/

public class AltPairs
{
  public static void main(String[] args)
  {
    // Testing
    System.out.printf("Test #1 - altPairs('kitten')\nOutput:%s\n", altPairs("kitten"));
    System.out.printf("Test #2 - altPairs('Chocolate')\nOutput:%s\n", altPairs("Chocolate"));
    System.out.printf("Test #3 - altPairs('CodingHorror')\nOutput:%s\n", altPairs("CodingHorror"));
  }
  
  /**
  * Given a string, return a string made of the chars at indexes 0, 1, 4, 5, 8, 9...
  *
  * @param str The string to be scanned through.
  * @return output A string made up of the characters at the specified indexes.
  */
  public static String altPairs(String str) 
  {
    String output = "";
  
    for (int i=0; i<str.length(); i += 4) 
    {
      int end = i + 2;
    
    if (end > str.length()) 
    {
      end = str.length();
    }
    
    output = output + str.substring(i, end);
    }
  
    return output;
  }
}
