public class CountXX
{
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
